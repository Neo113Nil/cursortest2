package l;

/* renamed from: l.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0794u {

    /* renamed from: a, reason: collision with root package name */
    public double f7842a;

    /* renamed from: b, reason: collision with root package name */
    public double f7843b;

    public C0794u(double d4, double d5) {
        this.f7842a = d4;
        this.f7843b = d5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0794u)) {
            return false;
        }
        C0794u c0794u = (C0794u) obj;
        return Double.compare(this.f7842a, c0794u.f7842a) == 0 && Double.compare(this.f7843b, c0794u.f7843b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f7843b) + (Double.hashCode(this.f7842a) * 31);
    }

    public final String toString() {
        return "ComplexDouble(_real=" + this.f7842a + ", _imaginary=" + this.f7843b + ')';
    }
}
