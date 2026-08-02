package nl.dionsegijn.konfetti.core.emitter;

import androidx.recyclerview.widget.RecyclerView;
import nl.dionsegijn.konfetti.core.models.Shape;
import nl.dionsegijn.konfetti.core.models.Vector;

/* loaded from: classes9.dex */
public final class Confetti {
    public final Vector acceleration;
    public int alpha;
    public int alphaColor;
    public final int color;
    public boolean drawParticle;
    public float frameRate;
    public final Vector gravity;
    public long lifespan;
    public final Vector location;
    public final float mass;
    public final float pixelDensity;
    public float rotation;
    public final float rotationSpeed2D;
    public final float rotationSpeed3D;
    public float rotationWidth;
    public float scaleX;
    public final Shape shape;
    public final Vector velocity;
    public final float width;

    public Confetti(Vector vector, int i, float f, float f2, Shape shape, Vector vector2, float f3, float f4, float f5) {
        Vector vector3 = new Vector(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
        shape.getClass();
        this.location = vector;
        this.color = i;
        this.width = f;
        this.mass = f2;
        this.shape = shape;
        this.lifespan = 5000L;
        this.acceleration = vector3;
        this.velocity = vector2;
        this.rotationSpeed3D = f3;
        this.rotationSpeed2D = f4;
        this.pixelDensity = f5;
        this.rotationWidth = f;
        this.frameRate = 60.0f;
        this.gravity = new Vector(RecyclerView.DECELERATION_RATE, 0.02f);
        this.alpha = 255;
        this.drawParticle = true;
    }
}
