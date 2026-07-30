package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jx {
    public double a;
    public double b;

    public jx(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx)) {
            return false;
        }
        jx jxVar = (jx) obj;
        return Double.compare(this.a, jxVar.a) == 0 && Double.compare(this.b, jxVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ComplexDouble(_real=" + this.a + ", _imaginary=" + this.b + ')';
    }
}
