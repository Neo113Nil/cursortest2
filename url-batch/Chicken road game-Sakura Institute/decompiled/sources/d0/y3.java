package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class y3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f2540a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2541b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2542c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2543d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2544e;

    public y3(long j8, long j9, long j10, long j11, long j12) {
        this.f2540a = j8;
        this.f2541b = j9;
        this.f2542c = j10;
        this.f2543d = j11;
        this.f2544e = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) obj;
        return z0.u.c(this.f2540a, y3Var.f2540a) && z0.u.c(this.f2541b, y3Var.f2541b) && z0.u.c(this.f2542c, y3Var.f2542c) && z0.u.c(this.f2543d, y3Var.f2543d) && z0.u.c(this.f2544e, y3Var.f2544e);
    }

    public final int hashCode() {
        int i7 = z0.u.f10058h;
        return Long.hashCode(this.f2544e) + a0.m.d(a0.m.d(a0.m.d(Long.hashCode(this.f2540a) * 31, 31, this.f2541b), 31, this.f2542c), 31, this.f2543d);
    }
}
