package q0;

import i.b0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class y extends c {

    /* renamed from: o, reason: collision with root package name */
    public final c f7470o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f7471p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f7472q;

    /* renamed from: r, reason: collision with root package name */
    public q6.c f7473r;

    /* renamed from: s, reason: collision with root package name */
    public q6.c f7474s;

    /* renamed from: t, reason: collision with root package name */
    public final long f7475t;

    public y(c cVar, q6.c cVar2, q6.c cVar3, boolean z8, boolean z9) {
        super(0, l.f7418j, n.l(cVar2, (cVar == null || (r0 = cVar.f()) == null) ? ((b) n.f7434i.get()).f7387e : r0, z8), n.b(cVar3, (cVar == null || (r0 = cVar.i()) == null) ? ((b) n.f7434i.get()).f7388f : r0));
        q6.c i7;
        q6.c f9;
        this.f7470o = cVar;
        this.f7471p = z8;
        this.f7472q = z9;
        this.f7473r = this.f7387e;
        this.f7474s = this.f7388f;
        this.f7475t = g0.d.z();
    }

    @Override // q0.c
    public final void A(b0 b0Var) {
        r.g();
        throw null;
    }

    @Override // q0.c
    public final c B(q6.c cVar, q6.c cVar2) {
        q6.c l8 = n.l(cVar, this.f7473r, true);
        q6.c b9 = n.b(cVar2, this.f7474s);
        return !this.f7471p ? new y(C().B(null, b9), l8, b9, false, true) : C().B(l8, b9);
    }

    public final c C() {
        c cVar = this.f7470o;
        return cVar == null ? (c) n.f7434i.get() : cVar;
    }

    @Override // q0.c, q0.g
    public final void c() {
        c cVar;
        this.f7404c = true;
        if (!this.f7472q || (cVar = this.f7470o) == null) {
            return;
        }
        cVar.c();
    }

    @Override // q0.g
    public final int d() {
        return C().d();
    }

    @Override // q0.g
    public final l e() {
        return C().e();
    }

    @Override // q0.c, q0.g
    public final q6.c f() {
        return this.f7473r;
    }

    @Override // q0.c, q0.g
    public final boolean g() {
        return C().g();
    }

    @Override // q0.c, q0.g
    public final int h() {
        return C().h();
    }

    @Override // q0.c, q0.g
    public final q6.c i() {
        return this.f7474s;
    }

    @Override // q0.c, q0.g
    public final void k() {
        r.g();
        throw null;
    }

    @Override // q0.c, q0.g
    public final void l() {
        r.g();
        throw null;
    }

    @Override // q0.c, q0.g
    public final void m() {
        C().m();
    }

    @Override // q0.c, q0.g
    public final void n(u uVar) {
        C().n(uVar);
    }

    @Override // q0.g
    public final void q(int i7) {
        r.g();
        throw null;
    }

    @Override // q0.g
    public final void r(l lVar) {
        r.g();
        throw null;
    }

    @Override // q0.c, q0.g
    public final void s(int i7) {
        C().s(i7);
    }

    @Override // q0.c, q0.g
    public final g t(q6.c cVar) {
        q6.c l8 = n.l(cVar, this.f7473r, true);
        return !this.f7471p ? n.h(C().t(null), l8, true) : C().t(l8);
    }

    @Override // q0.c
    public final r v() {
        return C().v();
    }

    @Override // q0.c
    public final b0 w() {
        return C().w();
    }

    @Override // q0.c
    /* renamed from: x */
    public final q6.c f() {
        return this.f7473r;
    }
}
