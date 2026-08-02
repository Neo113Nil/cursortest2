package nl.dionsegijn.konfetti.core;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import nl.dionsegijn.konfetti.core.models.Shape;

/* loaded from: classes4.dex */
public final class Particle {
    public final int alpha;
    public final int color;
    public final float height;
    public final float rotation;
    public final float scaleX;
    public final Shape shape;
    public final float width;
    public final float x;
    public final float y;

    public Particle(float f, float f2, float f3, float f4, int i, float f5, float f6, Shape shape, int i2) {
        shape.getClass();
        this.x = f;
        this.y = f2;
        this.width = f3;
        this.height = f4;
        this.color = i;
        this.rotation = f5;
        this.scaleX = f6;
        this.shape = shape;
        this.alpha = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Particle)) {
            return false;
        }
        Particle particle = (Particle) obj;
        return Float.compare(this.x, particle.x) == 0 && Float.compare(this.y, particle.y) == 0 && Float.compare(this.width, particle.width) == 0 && Float.compare(this.height, particle.height) == 0 && this.color == particle.color && Float.compare(this.rotation, particle.rotation) == 0 && Float.compare(this.scaleX, particle.scaleX) == 0 && Intrinsics.areEqual(this.shape, particle.shape) && this.alpha == particle.alpha;
    }

    public final int hashCode() {
        return Integer.hashCode(this.alpha) + ((this.shape.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.scaleX, CameraState$Type$EnumUnboxingLocalUtility.m(this.rotation, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.color, CameraState$Type$EnumUnboxingLocalUtility.m(this.height, CameraState$Type$EnumUnboxingLocalUtility.m(this.width, CameraState$Type$EnumUnboxingLocalUtility.m(this.y, Float.hashCode(this.x) * 31, 31), 31), 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Particle(x=", this.x, ", y=", this.y, ", width=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.width, ", height=", this.height, ", color=");
        m.append(this.color);
        m.append(", rotation=");
        m.append(this.rotation);
        m.append(", scaleX=");
        m.append(this.scaleX);
        m.append(", shape=");
        m.append(this.shape);
        m.append(", alpha=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.alpha, ")", m);
    }
}
