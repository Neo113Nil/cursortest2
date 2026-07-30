package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class nh {
    public final float a;

    public nh(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nh)) {
            return false;
        }
        float f = this.a;
        return (0.0f > f && 0.0f > ((nh) obj).a) || f == ((nh) obj).a;
    }

    public final int hashCode() {
        float f = this.a;
        if (0.0f > f) {
            return -1;
        }
        return Float.hashCode(f) + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "0.0.." + this.a;
    }
}
