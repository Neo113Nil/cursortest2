package p1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k0 extends s0.n implements r1.v {

    /* renamed from: s, reason: collision with root package name */
    public q6.c f7055s;

    /* renamed from: t, reason: collision with root package name */
    public long f7056t;

    @Override // s0.n
    public final boolean p0() {
        return true;
    }

    @Override // r1.v
    public final void u(long j8) {
        if (m2.j.a(this.f7056t, j8)) {
            return;
        }
        this.f7055s.f(new m2.j(j8));
        this.f7056t = j8;
    }
}
