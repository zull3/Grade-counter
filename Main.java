/* Grade counter. Enter 10 grades and calculate average.
* Import scanner
* Declare variables
* Processing
* Calculations
* Print
*/

import java.util.Scanner; // program uses class Scanner

public class Main {
  public static void main(String[] args) {
    // create Scanner to obtain input from command window
    Scanner input = new Scanner(System.in);

    // initialization phase
    int total = 0; // initialize sum of grades entered by the user
    int gradeCounter = 1; // initialize # of grade to be entered next

    // processing phase uses counter-controlled iteration
    while (gradeCounter <= 10) { // loop 10 times
      System.out.print("Enter grade: "); // prompt
      int grade = input.nextInt(); // input next grade
      total += grade; // add grade to total
      gradeCounter = gradeCounter + 1; // increment counter by 1
    } 

  // termination phase
  int average = total / 10; // integer division yields integer result

  // display total and average of grades
  System.out.printf("%nTotal of all 10 grades is %d%n", total);
  System.out.printf("Class average is %d%n", average);

  }
} 


