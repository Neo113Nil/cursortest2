package m;

/* renamed from: m.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0634t {

    /* renamed from: a, reason: collision with root package name */
    public double f6878a;

    /* renamed from: b, reason: collision with root package name */
    public double f6879b;

    public C0634t(double d3, double d4) {
        this.f6878a = d3;
        this.f6879b = d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0634t)) {
            return false;
        }
        C0634t c0634t = (C0634t) obj;
        return Double.compare(this.f6878a, c0634t.f6878a) == 0 && Double.compare(this.f6879b, c0634t.f6879b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f6879b) + (Double.hashCode(this.f6878a) * 31);
    }

    public final String toString() {
        return "ComplexDouble(_real=" + this.f6878a + ", _imaginary=" + this.f6879b + ')';
    }
}
