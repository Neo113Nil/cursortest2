package c0;

/* renamed from: c0.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0372r {

    /* renamed from: a, reason: collision with root package name */
    public final double f5536a;

    /* renamed from: b, reason: collision with root package name */
    public final double f5537b;

    /* renamed from: c, reason: collision with root package name */
    public final double f5538c;

    /* renamed from: d, reason: collision with root package name */
    public final double f5539d;

    /* renamed from: e, reason: collision with root package name */
    public final double f5540e;

    /* renamed from: f, reason: collision with root package name */
    public final double f5541f;

    /* renamed from: g, reason: collision with root package name */
    public final double f5542g;

    public /* synthetic */ C0372r(double d3, double d4, double d5, double d6, double d7) {
        this(d3, d4, d5, d6, d7, 0.0d, 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0372r)) {
            return false;
        }
        C0372r c0372r = (C0372r) obj;
        return Double.compare(this.f5536a, c0372r.f5536a) == 0 && Double.compare(this.f5537b, c0372r.f5537b) == 0 && Double.compare(this.f5538c, c0372r.f5538c) == 0 && Double.compare(this.f5539d, c0372r.f5539d) == 0 && Double.compare(this.f5540e, c0372r.f5540e) == 0 && Double.compare(this.f5541f, c0372r.f5541f) == 0 && Double.compare(this.f5542g, c0372r.f5542g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f5542g) + ((Double.hashCode(this.f5541f) + ((Double.hashCode(this.f5540e) + ((Double.hashCode(this.f5539d) + ((Double.hashCode(this.f5538c) + ((Double.hashCode(this.f5537b) + (Double.hashCode(this.f5536a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f5536a + ", a=" + this.f5537b + ", b=" + this.f5538c + ", c=" + this.f5539d + ", d=" + this.f5540e + ", e=" + this.f5541f + ", f=" + this.f5542g + ')';
    }

    public C0372r(double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.f5536a = d3;
        this.f5537b = d4;
        this.f5538c = d5;
        this.f5539d = d6;
        this.f5540e = d7;
        this.f5541f = d8;
        this.f5542g = d9;
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
