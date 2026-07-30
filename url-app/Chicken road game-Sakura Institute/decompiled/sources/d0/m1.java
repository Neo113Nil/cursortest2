package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f2169a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2170b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2171c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2172d;

    public m1(long j8, long j9, long j10, long j11) {
        this.f2169a = j8;
        this.f2170b = j9;
        this.f2171c = j10;
        this.f2172d = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return z0.u.c(this.f2169a, m1Var.f2169a) && z0.u.c(this.f2170b, m1Var.f2170b) && z0.u.c(this.f2171c, m1Var.f2171c) && z0.u.c(this.f2172d, m1Var.f2172d);
    }

    public final int hashCode() {
        int i7 = z0.u.f10058h;
        return Long.hashCode(this.f2172d) + a0.m.d(a0.m.d(Long.hashCode(this.f2169a) * 31, 31, this.f2170b), 31, this.f2171c);
    }
}
