package nl.dionsegijn.konfetti.models;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;

/* loaded from: classes9.dex */
public final class Vector {
    public float x;
    public float y;

    public Vector(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    public final void addScaled(Vector vector, float f) {
        vector.getClass();
        this.x = (vector.x * f) + this.x;
        this.y = (vector.y * f) + this.y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vector)) {
            return false;
        }
        Vector vector = (Vector) obj;
        return Float.compare(this.x, vector.x) == 0 && Float.compare(this.y, vector.y) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.y) + (Float.hashCode(this.x) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vector(x=");
        sb.append(this.x);
        sb.append(", y=");
        return Recorder$$ExternalSyntheticOutline1.m(this.y, ")", sb);
    }
}
