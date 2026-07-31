package g1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final double f2885a;

    /* renamed from: b, reason: collision with root package name */
    public final double f2886b;

    /* renamed from: c, reason: collision with root package name */
    public final double f2887c;

    /* renamed from: d, reason: collision with root package name */
    public final double f2888d;

    /* renamed from: e, reason: collision with root package name */
    public final double f2889e;

    /* renamed from: f, reason: collision with root package name */
    public final double f2890f;

    /* renamed from: g, reason: collision with root package name */
    public final double f2891g;

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
        return Double.compare(this.f2885a, rVar.f2885a) == 0 && Double.compare(this.f2886b, rVar.f2886b) == 0 && Double.compare(this.f2887c, rVar.f2887c) == 0 && Double.compare(this.f2888d, rVar.f2888d) == 0 && Double.compare(this.f2889e, rVar.f2889e) == 0 && Double.compare(this.f2890f, rVar.f2890f) == 0 && Double.compare(this.f2891g, rVar.f2891g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f2891g) + ((Double.hashCode(this.f2890f) + ((Double.hashCode(this.f2889e) + ((Double.hashCode(this.f2888d) + ((Double.hashCode(this.f2887c) + ((Double.hashCode(this.f2886b) + (Double.hashCode(this.f2885a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f2885a + ", a=" + this.f2886b + ", b=" + this.f2887c + ", c=" + this.f2888d + ", d=" + this.f2889e + ", e=" + this.f2890f + ", f=" + this.f2891g + ')';
    }

    public r(double d8, double d9, double d10, double d11, double d12, double d13, double d14) {
        this.f2885a = d8;
        this.f2886b = d9;
        this.f2887c = d10;
        this.f2888d = d11;
        this.f2889e = d12;
        this.f2890f = d13;
        this.f2891g = d14;
        if (Double.isNaN(d9) || Double.isNaN(d10) || Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d8)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d8 == -2.0d || d8 == -3.0d) {
            return;
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
