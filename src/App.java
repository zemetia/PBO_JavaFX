import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    // launch the application
    public void start(Stage s)
    {
        s.setTitle("Yoel Mountanus Sitorus");

        VBox body = new VBox();

        Button b1 = new Button("Click me");
        Button b2 = new Button("Click you");
        Button b3 = new Button("Click Click");
        HBox div1 = new HBox();

        div1.getChildren().addAll(b1, b2, b3);

        StackPane r = new StackPane();
        r.getChildren().addAll(div1);
        Scene scene = new Scene(r, 200, 200);

        s.setScene(scene);
        s.show();
    }

    public static void main(String args[])
    {
        // launch the application
        launch(args);
    }
}