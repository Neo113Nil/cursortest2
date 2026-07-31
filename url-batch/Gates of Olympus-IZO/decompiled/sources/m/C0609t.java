package m;

/* renamed from: m.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0609t {

    /* renamed from: a, reason: collision with root package name */
    public double f5853a;

    /* renamed from: b, reason: collision with root package name */
    public double f5854b;

    public C0609t(double d3, double d4) {
        this.f5853a = d3;
        this.f5854b = d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0609t)) {
            return false;
        }
        C0609t c0609t = (C0609t) obj;
        return Double.compare(this.f5853a, c0609t.f5853a) == 0 && Double.compare(this.f5854b, c0609t.f5854b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f5854b) + (Double.hashCode(this.f5853a) * 31);
    }

    public final String toString() {
        return "ComplexDouble(_real=" + this.f5853a + ", _imaginary=" + this.f5854b + ')';
    }
}
