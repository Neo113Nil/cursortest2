package nl.dionsegijn.konfetti.core.models;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public final class Size {
    public final float mass;
    public final int sizeInDp;

    static {
        new Size(4.0f, 6, 4);
        new Size(RecyclerView.DECELERATION_RATE, 8, 6);
        new Size(6.0f, 10, 4);
    }

    public Size(float f, int i, int i2) {
        f = (i2 & 2) != 0 ? 5.0f : f;
        this.sizeInDp = i;
        this.mass = f;
        if (f != RecyclerView.DECELERATION_RATE) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(f, "mass=", " must be != 0"));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return this.sizeInDp == size.sizeInDp && Float.compare(this.mass, size.mass) == 0 && Float.compare(0.2f, 0.2f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(0.2f) + CameraState$Type$EnumUnboxingLocalUtility.m(this.mass, Integer.hashCode(this.sizeInDp) * 31, 31);
    }

    public final String toString() {
        return "Size(sizeInDp=" + this.sizeInDp + ", mass=" + this.mass + ", massVariance=0.2)";
    }
}
