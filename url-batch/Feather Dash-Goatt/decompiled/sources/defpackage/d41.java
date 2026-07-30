package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class d41 implements s70 {
    public final boolean a;
    public final long b;

    public d41(long j, boolean z) {
        this.a = z;
        this.b = j;
    }

    @Override // defpackage.s70
    public final yq a(gn0 gn0Var) {
        return new jr(gn0Var, this.a, new nq0(8, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d41)) {
            return false;
        }
        d41 d41Var = (d41) obj;
        if (this.a == d41Var.a && bt.a(Float.NaN, Float.NaN)) {
            return hi.c(this.b, d41Var.b);
        }
        return false;
    }

    public final int hashCode() {
        int b = qy0.b(Float.NaN, Boolean.hashCode(this.a) * 31, 961);
        int i = hi.h;
        jk1 jk1Var = kk1.d;
        return Long.hashCode(this.b) + b;
    }
}
