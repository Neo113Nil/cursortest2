package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f2466a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2467b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2468c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2469d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2470e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2471f;

    /* renamed from: g, reason: collision with root package name */
    public final long f2472g;

    public v1(long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        this.f2466a = j8;
        this.f2467b = j9;
        this.f2468c = j10;
        this.f2469d = j11;
        this.f2470e = j12;
        this.f2471f = j13;
        this.f2472g = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return z0.u.c(this.f2466a, v1Var.f2466a) && z0.u.c(this.f2469d, v1Var.f2469d) && z0.u.c(this.f2467b, v1Var.f2467b) && z0.u.c(this.f2470e, v1Var.f2470e) && z0.u.c(this.f2468c, v1Var.f2468c) && z0.u.c(this.f2471f, v1Var.f2471f) && z0.u.c(this.f2472g, v1Var.f2472g);
    }

    public final int hashCode() {
        int i7 = z0.u.f10058h;
        return Long.hashCode(this.f2472g) + a0.m.d(a0.m.d(a0.m.d(a0.m.d(a0.m.d(Long.hashCode(this.f2466a) * 31, 31, this.f2469d), 31, this.f2467b), 31, this.f2470e), 31, this.f2468c), 31, this.f2471f);
    }
}
