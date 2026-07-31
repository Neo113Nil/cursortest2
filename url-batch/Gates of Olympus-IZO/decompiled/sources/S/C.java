package S;

import I.C0089d;

/* loaded from: classes.dex */
public final class C extends i {

    /* renamed from: e, reason: collision with root package name */
    public final i f3182e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3183f;

    /* renamed from: g, reason: collision with root package name */
    public Y1.c f3184g;

    /* renamed from: h, reason: collision with root package name */
    public final long f3185h;

    public C(i iVar, Y1.c cVar, boolean z3) {
        super(0, n.f3224h);
        Y1.c f3;
        this.f3182e = iVar;
        this.f3183f = z3;
        this.f3184g = q.l(cVar, (iVar == null || (f3 = iVar.f()) == null) ? ((d) q.f3242i.get()).f3194e : f3, false);
        this.f3185h = C0089d.A();
    }

    @Override // S.i
    public final void c() {
        i iVar;
        this.f3210c = true;
        if (!this.f3183f || (iVar = this.f3182e) == null) {
            return;
        }
        iVar.c();
    }

    @Override // S.i
    public final int d() {
        return u().d();
    }

    @Override // S.i
    public final n e() {
        return u().e();
    }

    @Override // S.i
    public final Y1.c f() {
        return this.f3184g;
    }

    @Override // S.i
    public final boolean g() {
        return u().g();
    }

    @Override // S.i
    public final Y1.c i() {
        return null;
    }

    @Override // S.i
    public final void k() {
        u.g();
        throw null;
    }

    @Override // S.i
    public final void l() {
        u.g();
        throw null;
    }

    @Override // S.i
    public final void m() {
        u().m();
    }

    @Override // S.i
    public final void n(x xVar) {
        u().n(xVar);
    }

    @Override // S.i
    public final i t(Y1.c cVar) {
        return q.h(u().t(null), q.l(cVar, this.f3184g, true), true);
    }

    public final i u() {
        i iVar = this.f3182e;
        return iVar == null ? (i) q.f3242i.get() : iVar;
    }
}
