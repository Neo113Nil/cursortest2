package androidx.graphics.shapes;

import androidx.annotation.FloatRange;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class CornerRounding {
    public static final Companion Companion;
    public static final CornerRounding Unrounded;
    private final float radius;
    private final float smoothing;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    static {
        o oVar = null;
        Companion = new Companion(oVar);
        float f8 = 0.0f;
        Unrounded = new CornerRounding(f8, f8, 3, oVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CornerRounding() {
        this(r2, r2, 3, null);
        float f8 = 0.0f;
    }

    public final float getRadius() {
        return this.radius;
    }

    public final float getSmoothing() {
        return this.smoothing;
    }

    public CornerRounding(@FloatRange(from = 0.0d) float f8, @FloatRange(from = 0.0d, to = 1.0d) float f9) {
        this.radius = f8;
        this.smoothing = f9;
    }

    public /* synthetic */ CornerRounding(float f8, float f9, int i8, o oVar) {
        this((i8 & 1) != 0 ? 0.0f : f8, (i8 & 2) != 0 ? 0.0f : f9);
    }
}
