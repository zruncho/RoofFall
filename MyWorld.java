import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class that creates a new world: MyWorld
 * 
 * @Java MOOC team, UC3M
 * @1.0
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(800, 600, 1); 
        setBackground("roof-tile-design-600x395.jpg");
        populateWorld();
    }
    
    public void populateWorld(){
        addObject(new Car(), 400, 300);
        addObject(new Car(), 450, 300);
    }
}
