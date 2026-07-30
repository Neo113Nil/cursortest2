package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qv2 {
    public static final qv2 c = new qv2(1.0f, 0.0f);
    public final float a;
    public final float b;

    public qv2(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv2)) {
            return false;
        }
        qv2 qv2Var = (qv2) obj;
        return this.a == qv2Var.a && this.b == qv2Var.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.a);
        sb.append(", skewX=");
        return q40.n(sb, this.b, ')');
    }
}
