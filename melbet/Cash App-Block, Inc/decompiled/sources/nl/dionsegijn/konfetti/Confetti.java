package nl.dionsegijn.konfetti;

import android.content.res.Resources;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.random.Random;
import nl.dionsegijn.konfetti.models.Shape;
import nl.dionsegijn.konfetti.models.Size;
import nl.dionsegijn.konfetti.models.Vector;

/* loaded from: classes9.dex */
public final class Confetti {
    public final Vector acceleration;
    public int alpha;
    public final int color;
    public final float density;
    public final boolean fadeOut;
    public long lifespan;
    public final Vector location;
    public final float mass;
    public final Paint paint;
    public float rotation;
    public final float rotationSpeed;
    public float rotationWidth;
    public final Shape shape;
    public final float speedF;
    public final Vector velocity;
    public final float width;

    public Confetti(Vector vector, int i, Size size, Shape shape, long j, boolean z, Vector vector2, float f) {
        Vector vector3 = new Vector(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
        size.getClass();
        shape.getClass();
        this.location = vector;
        this.color = i;
        this.shape = shape;
        this.lifespan = j;
        this.fadeOut = z;
        this.acceleration = vector3;
        this.velocity = vector2;
        Resources system = Resources.getSystem();
        system.getClass();
        float f2 = system.getDisplayMetrics().density;
        this.density = f2;
        this.mass = 5.0f;
        float f3 = size.sizeInDp;
        Resources system2 = Resources.getSystem();
        system2.getClass();
        float f4 = f3 * system2.getDisplayMetrics().density;
        this.width = f4;
        Paint paint = new Paint();
        this.paint = paint;
        this.rotationWidth = f4;
        this.speedF = 60.0f;
        this.alpha = 255;
        float f5 = f2 * 0.29f;
        Random.Default.getClass();
        this.rotationSpeed = ((Random.defaultRandom.nextFloat() * 3.0f * f5) + f5) * f;
        paint.setColor(i);
    }
}
