package q0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z extends g {

    /* renamed from: e, reason: collision with root package name */
    public final g f7476e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7477f;

    /* renamed from: g, reason: collision with root package name */
    public q6.c f7478g;

    /* renamed from: h, reason: collision with root package name */
    public final long f7479h;

    public z(g gVar, q6.c cVar, boolean z8) {
        super(0, l.f7418j);
        q6.c f9;
        this.f7476e = gVar;
        this.f7477f = z8;
        this.f7478g = n.l(cVar, (gVar == null || (f9 = gVar.f()) == null) ? ((b) n.f7434i.get()).f7387e : f9, false);
        this.f7479h = g0.d.z();
    }

    @Override // q0.g
    public final void c() {
        g gVar;
        this.f7404c = true;
        if (!this.f7477f || (gVar = this.f7476e) == null) {
            return;
        }
        gVar.c();
    }

    @Override // q0.g
    public final int d() {
        return u().d();
    }

    @Override // q0.g
    public final l e() {
        return u().e();
    }

    @Override // q0.g
    public final q6.c f() {
        return this.f7478g;
    }

    @Override // q0.g
    public final boolean g() {
        return u().g();
    }

    @Override // q0.g
    public final q6.c i() {
        return null;
    }

    @Override // q0.g
    public final void k() {
        r.g();
        throw null;
    }

    @Override // q0.g
    public final void l() {
        r.g();
        throw null;
    }

    @Override // q0.g
    public final void m() {
        u().m();
    }

    @Override // q0.g
    public final void n(u uVar) {
        u().n(uVar);
    }

    @Override // q0.g
    public final g t(q6.c cVar) {
        return n.h(u().t(null), n.l(cVar, this.f7478g, true), true);
    }

    public final g u() {
        g gVar = this.f7476e;
        return gVar == null ? (g) n.f7434i.get() : gVar;
    }
}
