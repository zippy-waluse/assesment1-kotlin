fun main() {
  list("Barnie bakes brown bagels and buns")
//    var array = array(array = [])
    sphere(3.14159)

}
//
//Write and invoke a function that given the string “Barnie bakes brown bagels
//and buns” prints out a list of all the other words and characters making up the
//string excluding all possible occurrences of the letter b.

fun list(name:String){
    println(name)


}





//Write and invoke one function that takes in an array of integers and returns
//these 3 values: sum, count and average of all the elements.

fun array(array: Array<Int>): Any {
    var sum = array.sumOf { 1.1 }
    var average = array.average()
    var count = array.count()
    return sum
    return average
    return count
}

//The volume of a sphere is calculated using the formula below
//V = 4/3 π r3
//Write and invoke a function that is capable of accurately calculating the
//volume of any sphere given its radius. Use 3.14159 as πd invoke a function that is capable of accurately calculating the
//volume of any sphere given its radius. Use 3.14159 as π

fun  sphere(vol:Double){
    var radius = 3.4 / 3
    println(radius)
}