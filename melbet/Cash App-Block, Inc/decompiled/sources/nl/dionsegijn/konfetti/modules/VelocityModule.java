package nl.dionsegijn.konfetti.modules;

import java.util.Random;

/* loaded from: classes6.dex */
public final class VelocityModule {
    public Double maxAngle;
    public Float maxSpeed;
    public double minAngle;
    public float minSpeed;
    public final Random random;

    public VelocityModule(Random random) {
        this.random = random;
    }
}
