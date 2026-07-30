package a1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final double f280a;

    /* renamed from: b, reason: collision with root package name */
    public final double f281b;

    /* renamed from: c, reason: collision with root package name */
    public final double f282c;

    /* renamed from: d, reason: collision with root package name */
    public final double f283d;

    /* renamed from: e, reason: collision with root package name */
    public final double f284e;

    /* renamed from: f, reason: collision with root package name */
    public final double f285f;

    /* renamed from: g, reason: collision with root package name */
    public final double f286g;

    public /* synthetic */ r(double d8, double d9, double d10, double d11, double d12) {
        this(d8, d9, d10, d11, d12, 0.0d, 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Double.compare(this.f280a, rVar.f280a) == 0 && Double.compare(this.f281b, rVar.f281b) == 0 && Double.compare(this.f282c, rVar.f282c) == 0 && Double.compare(this.f283d, rVar.f283d) == 0 && Double.compare(this.f284e, rVar.f284e) == 0 && Double.compare(this.f285f, rVar.f285f) == 0 && Double.compare(this.f286g, rVar.f286g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f286g) + ((Double.hashCode(this.f285f) + ((Double.hashCode(this.f284e) + ((Double.hashCode(this.f283d) + ((Double.hashCode(this.f282c) + ((Double.hashCode(this.f281b) + (Double.hashCode(this.f280a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f280a + ", a=" + this.f281b + ", b=" + this.f282c + ", c=" + this.f283d + ", d=" + this.f284e + ", e=" + this.f285f + ", f=" + this.f286g + ')';
    }

    public r(double d8, double d9, double d10, double d11, double d12, double d13, double d14) {
        this.f280a = d8;
        this.f281b = d9;
        this.f282c = d10;
        this.f283d = d11;
        this.f284e = d12;
        this.f285f = d13;
        this.f286g = d14;
        if (Double.isNaN(d9) || Double.isNaN(d10) || Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d8)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d12 < 0.0d || d12 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d12);
        }
        if (d12 == 0.0d && (d9 == 0.0d || d8 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d12 >= 1.0d && d11 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d9 == 0.0d || d8 == 0.0d) && d11 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d11 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d9 < 0.0d || d8 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}
