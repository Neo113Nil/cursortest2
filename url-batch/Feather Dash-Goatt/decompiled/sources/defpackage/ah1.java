package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ah1 {
    public static final ah1 c = new ah1(1.0f, 0.0f);
    public final float a;
    public final float b;

    public ah1(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah1)) {
            return false;
        }
        ah1 ah1Var = (ah1) obj;
        return this.a == ah1Var.a && this.b == ah1Var.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.a);
        sb.append(", skewX=");
        return qy0.l(sb, this.b, ')');
    }
}
