package nl.dionsegijn.konfetti.core.models;

/* loaded from: classes9.dex */
public final class Vector {
    public float x;
    public float y;

    public Vector(float f, float f2) {
        this.x = f;
        this.y = f2;
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
        return "Vector(x=" + this.x + ", y=" + this.y + ")";
    }
}
