package S;

import I.C0089d;
import j.C0475A;

/* loaded from: classes.dex */
public final class B extends e {

    /* renamed from: o, reason: collision with root package name */
    public final e f3177o;
    public final boolean p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f3178q;

    /* renamed from: r, reason: collision with root package name */
    public Y1.c f3179r;

    /* renamed from: s, reason: collision with root package name */
    public Y1.c f3180s;

    /* renamed from: t, reason: collision with root package name */
    public final long f3181t;

    public B(e eVar, Y1.c cVar, Y1.c cVar2, boolean z3, boolean z4) {
        super(0, n.f3224h, q.l(cVar, (eVar == null || (r1 = eVar.f()) == null) ? ((d) q.f3242i.get()).f3194e : r1, z3), q.b(cVar2, (eVar == null || (r1 = eVar.i()) == null) ? ((d) q.f3242i.get()).f3195f : r1));
        Y1.c i3;
        Y1.c f3;
        this.f3177o = eVar;
        this.p = z3;
        this.f3178q = z4;
        this.f3179r = this.f3194e;
        this.f3180s = this.f3195f;
        this.f3181t = C0089d.A();
    }

    @Override // S.e
    public final void A(C0475A c0475a) {
        u.g();
        throw null;
    }

    @Override // S.e
    public final e B(Y1.c cVar, Y1.c cVar2) {
        Y1.c l3 = q.l(cVar, this.f3179r, true);
        Y1.c b2 = q.b(cVar2, this.f3180s);
        return !this.p ? new B(C().B(null, b2), l3, b2, false, true) : C().B(l3, b2);
    }

    public final e C() {
        e eVar = this.f3177o;
        return eVar == null ? (e) q.f3242i.get() : eVar;
    }

    @Override // S.e, S.i
    public final void c() {
        e eVar;
        this.f3210c = true;
        if (!this.f3178q || (eVar = this.f3177o) == null) {
            return;
        }
        eVar.c();
    }

    @Override // S.i
    public final int d() {
        return C().d();
    }

    @Override // S.i
    public final n e() {
        return C().e();
    }

    @Override // S.e, S.i
    public final Y1.c f() {
        return this.f3179r;
    }

    @Override // S.e, S.i
    public final boolean g() {
        return C().g();
    }

    @Override // S.e, S.i
    public final int h() {
        return C().h();
    }

    @Override // S.e, S.i
    public final Y1.c i() {
        return this.f3180s;
    }

    @Override // S.e, S.i
    public final void k() {
        u.g();
        throw null;
    }

    @Override // S.e, S.i
    public final void l() {
        u.g();
        throw null;
    }

    @Override // S.e, S.i
    public final void m() {
        C().m();
    }

    @Override // S.e, S.i
    public final void n(x xVar) {
        C().n(xVar);
    }

    @Override // S.i
    public final void q(int i3) {
        u.g();
        throw null;
    }

    @Override // S.i
    public final void r(n nVar) {
        u.g();
        throw null;
    }

    @Override // S.e, S.i
    public final void s(int i3) {
        C().s(i3);
    }

    @Override // S.e, S.i
    public final i t(Y1.c cVar) {
        Y1.c l3 = q.l(cVar, this.f3179r, true);
        return !this.p ? q.h(C().t(null), l3, true) : C().t(l3);
    }

    @Override // S.e
    public final u v() {
        return C().v();
    }

    @Override // S.e
    public final C0475A w() {
        return C().w();
    }

    @Override // S.e
    /* renamed from: x */
    public final Y1.c f() {
        return this.f3179r;
    }
}
