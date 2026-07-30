package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class q63 {
    public final float a;
    public final float b;

    public q63(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final float[] a() {
        float f = this.a;
        float f2 = this.b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q63)) {
            return false;
        }
        q63 q63Var = (q63) obj;
        return Float.compare(this.a, q63Var.a) == 0 && Float.compare(this.b, q63Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.a);
        sb.append(", y=");
        return q40.n(sb, this.b, ')');
    }
}
