package c0;

/* renamed from: c0.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0315r {

    /* renamed from: a, reason: collision with root package name */
    public final double f4409a;

    /* renamed from: b, reason: collision with root package name */
    public final double f4410b;

    /* renamed from: c, reason: collision with root package name */
    public final double f4411c;

    /* renamed from: d, reason: collision with root package name */
    public final double f4412d;

    /* renamed from: e, reason: collision with root package name */
    public final double f4413e;

    /* renamed from: f, reason: collision with root package name */
    public final double f4414f;

    /* renamed from: g, reason: collision with root package name */
    public final double f4415g;

    public /* synthetic */ C0315r(double d3, double d4, double d5, double d6, double d7) {
        this(d3, d4, d5, d6, d7, 0.0d, 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0315r)) {
            return false;
        }
        C0315r c0315r = (C0315r) obj;
        return Double.compare(this.f4409a, c0315r.f4409a) == 0 && Double.compare(this.f4410b, c0315r.f4410b) == 0 && Double.compare(this.f4411c, c0315r.f4411c) == 0 && Double.compare(this.f4412d, c0315r.f4412d) == 0 && Double.compare(this.f4413e, c0315r.f4413e) == 0 && Double.compare(this.f4414f, c0315r.f4414f) == 0 && Double.compare(this.f4415g, c0315r.f4415g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f4415g) + ((Double.hashCode(this.f4414f) + ((Double.hashCode(this.f4413e) + ((Double.hashCode(this.f4412d) + ((Double.hashCode(this.f4411c) + ((Double.hashCode(this.f4410b) + (Double.hashCode(this.f4409a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f4409a + ", a=" + this.f4410b + ", b=" + this.f4411c + ", c=" + this.f4412d + ", d=" + this.f4413e + ", e=" + this.f4414f + ", f=" + this.f4415g + ')';
    }

    public C0315r(double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.f4409a = d3;
        this.f4410b = d4;
        this.f4411c = d5;
        this.f4412d = d6;
        this.f4413e = d7;
        this.f4414f = d8;
        this.f4415g = d9;
        if (Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d8) || Double.isNaN(d9) || Double.isNaN(d3)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d7 < 0.0d || d7 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d7);
        }
        if (d7 == 0.0d && (d4 == 0.0d || d3 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d7 >= 1.0d && d6 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d4 == 0.0d || d3 == 0.0d) && d6 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d6 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d4 < 0.0d || d3 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}
