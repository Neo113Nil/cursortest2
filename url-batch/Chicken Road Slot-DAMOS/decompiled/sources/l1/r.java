package l1;

import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final double f5818a;

    /* renamed from: b, reason: collision with root package name */
    public final double f5819b;

    /* renamed from: c, reason: collision with root package name */
    public final double f5820c;

    /* renamed from: d, reason: collision with root package name */
    public final double f5821d;

    /* renamed from: e, reason: collision with root package name */
    public final double f5822e;

    /* renamed from: f, reason: collision with root package name */
    public final double f5823f;
    public final double g;

    public r(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f5818a = d10;
        this.f5819b = d11;
        this.f5820c = d12;
        this.f5821d = d13;
        this.f5822e = d14;
        this.f5823f = d15;
        this.g = d16;
        if (Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d10)) {
            a1.e("Parameters cannot be NaN");
            throw null;
        }
        if (d10 == -2.0d || d10 == -3.0d) {
            return;
        }
        if (d14 < 0.0d || d14 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d14);
        }
        if (d14 == 0.0d && (d11 == 0.0d || d10 == 0.0d)) {
            a1.e("Parameter a or g is zero, the transfer function is constant");
            throw null;
        }
        if (d14 >= 1.0d && d13 == 0.0d) {
            a1.e("Parameter c is zero, the transfer function is constant");
            throw null;
        }
        if ((d11 == 0.0d || d10 == 0.0d) && d13 == 0.0d) {
            a1.e("Parameter a or g is zero, and c is zero, the transfer function is constant");
            throw null;
        }
        if (d13 < 0.0d) {
            a1.e("The transfer function must be increasing");
            throw null;
        }
        if (d11 < 0.0d || d10 < 0.0d) {
            a1.e("The transfer function must be positive or increasing");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Double.compare(this.f5818a, rVar.f5818a) == 0 && Double.compare(this.f5819b, rVar.f5819b) == 0 && Double.compare(this.f5820c, rVar.f5820c) == 0 && Double.compare(this.f5821d, rVar.f5821d) == 0 && Double.compare(this.f5822e, rVar.f5822e) == 0 && Double.compare(this.f5823f, rVar.f5823f) == 0 && Double.compare(this.g, rVar.g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.g) + ((Double.hashCode(this.f5823f) + ((Double.hashCode(this.f5822e) + ((Double.hashCode(this.f5821d) + ((Double.hashCode(this.f5820c) + ((Double.hashCode(this.f5819b) + (Double.hashCode(this.f5818a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f5818a + ", a=" + this.f5819b + ", b=" + this.f5820c + ", c=" + this.f5821d + ", d=" + this.f5822e + ", e=" + this.f5823f + ", f=" + this.g + ')';
    }

    public /* synthetic */ r(double d10, double d11, double d12, double d13, double d14) {
        this(d10, d11, d12, d13, d14, 0.0d, 0.0d);
    }
}
