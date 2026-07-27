package a0;

/* renamed from: a0.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0363r {

    /* renamed from: a, reason: collision with root package name */
    public final double f4823a;

    /* renamed from: b, reason: collision with root package name */
    public final double f4824b;

    /* renamed from: c, reason: collision with root package name */
    public final double f4825c;

    /* renamed from: d, reason: collision with root package name */
    public final double f4826d;

    /* renamed from: e, reason: collision with root package name */
    public final double f4827e;

    /* renamed from: f, reason: collision with root package name */
    public final double f4828f;

    /* renamed from: g, reason: collision with root package name */
    public final double f4829g;

    public /* synthetic */ C0363r(double d4, double d5, double d6, double d7, double d8) {
        this(d4, d5, d6, d7, d8, 0.0d, 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0363r)) {
            return false;
        }
        C0363r c0363r = (C0363r) obj;
        return Double.compare(this.f4823a, c0363r.f4823a) == 0 && Double.compare(this.f4824b, c0363r.f4824b) == 0 && Double.compare(this.f4825c, c0363r.f4825c) == 0 && Double.compare(this.f4826d, c0363r.f4826d) == 0 && Double.compare(this.f4827e, c0363r.f4827e) == 0 && Double.compare(this.f4828f, c0363r.f4828f) == 0 && Double.compare(this.f4829g, c0363r.f4829g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f4829g) + ((Double.hashCode(this.f4828f) + ((Double.hashCode(this.f4827e) + ((Double.hashCode(this.f4826d) + ((Double.hashCode(this.f4825c) + ((Double.hashCode(this.f4824b) + (Double.hashCode(this.f4823a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f4823a + ", a=" + this.f4824b + ", b=" + this.f4825c + ", c=" + this.f4826d + ", d=" + this.f4827e + ", e=" + this.f4828f + ", f=" + this.f4829g + ')';
    }

    public C0363r(double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        this.f4823a = d4;
        this.f4824b = d5;
        this.f4825c = d6;
        this.f4826d = d7;
        this.f4827e = d8;
        this.f4828f = d9;
        this.f4829g = d10;
        if (Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d8) || Double.isNaN(d9) || Double.isNaN(d10) || Double.isNaN(d4)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d8 < 0.0d || d8 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d8);
        }
        if (d8 == 0.0d && (d5 == 0.0d || d4 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d8 >= 1.0d && d7 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d5 == 0.0d || d4 == 0.0d) && d7 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d7 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d5 < 0.0d || d4 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}
