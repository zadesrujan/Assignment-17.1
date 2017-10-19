package serial;
//here we cretaed package as serial which that organizes a set of related classes and interfaces.
import java.io.Serializable;

public class Employee implements Serializable {

	public String firstName;
	   //String is a sequence a characters.
	   //firstName is String
	   public String lastName;
	 //lastName is String
	   private static final long serialVersionUID = 5462223600l;
	   //a private member is only accessible within the same class as it is declared
	   //static is used for memory management
	   //final is used in several different contexts to define an entity that can only be assigned once
	   //long is used to store 64 bit integer.
	   //serialVersionUID is a static final field.We can assign any number of our choice to it. 
	   //This is must in serialization
	}