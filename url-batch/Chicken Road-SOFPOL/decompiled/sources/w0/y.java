package w0;

import o.k0;
import r.s1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class y extends b {

    /* renamed from: o, reason: collision with root package name */
    public final b f7578o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f7579p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f7580q;

    /* renamed from: r, reason: collision with root package name */
    public p6.c f7581r;

    /* renamed from: s, reason: collision with root package name */
    public p6.c f7582s;

    /* renamed from: t, reason: collision with root package name */
    public final long f7583t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y(b bVar, p6.c cVar, p6.c cVar2, boolean z3, boolean z7) {
        super(0L, k.f7527h, m.l(cVar, (bVar == null || (r0 = bVar.e()) == null) ? m.f7543j.f7502e : r0, z3), m.b(cVar2, (bVar == null || (r9 = bVar.i()) == null) ? m.f7543j.f7503f : r9));
        p6.c i;
        p6.c e8;
        s1 s1Var = m.f7535a;
        this.f7578o = bVar;
        this.f7579p = z3;
        this.f7580q = z7;
        this.f7581r = this.f7502e;
        this.f7582s = this.f7503f;
        this.f7583t = u0.h.b();
    }

    @Override // w0.b
    public final void B(k0 k0Var) {
        q.l();
        throw null;
    }

    @Override // w0.b
    public final b C(p6.c cVar, p6.c cVar2) {
        p6.c l3 = m.l(cVar, this.f7581r, true);
        p6.c b8 = m.b(cVar2, this.f7582s);
        return !this.f7579p ? new y(D().C(null, b8), l3, b8, false, true) : D().C(l3, b8);
    }

    public final b D() {
        b bVar = this.f7578o;
        return bVar == null ? m.f7543j : bVar;
    }

    @Override // w0.b, w0.f
    public final void c() {
        b bVar;
        this.f7518c = true;
        if (!this.f7580q || (bVar = this.f7578o) == null) {
            return;
        }
        bVar.c();
    }

    @Override // w0.f
    public final k d() {
        return D().d();
    }

    @Override // w0.b, w0.f
    public final p6.c e() {
        return this.f7581r;
    }

    @Override // w0.b, w0.f
    public final boolean f() {
        return D().f();
    }

    @Override // w0.f
    public final long g() {
        return D().g();
    }

    @Override // w0.b, w0.f
    public final int h() {
        return D().h();
    }

    @Override // w0.b, w0.f
    public final p6.c i() {
        return this.f7582s;
    }

    @Override // w0.b, w0.f
    public final void k() {
        q.l();
        throw null;
    }

    @Override // w0.b, w0.f
    public final void l() {
        q.l();
        throw null;
    }

    @Override // w0.b, w0.f
    public final void m() {
        D().m();
    }

    @Override // w0.b, w0.f
    public final void n(u uVar) {
        D().n(uVar);
    }

    @Override // w0.f
    public final void r(k kVar) {
        q.l();
        throw null;
    }

    @Override // w0.f
    public final void s(long j7) {
        q.l();
        throw null;
    }

    @Override // w0.b, w0.f
    public final void t(int i) {
        D().t(i);
    }

    @Override // w0.b, w0.f
    public final f u(p6.c cVar) {
        p6.c l3 = m.l(cVar, this.f7581r, true);
        return !this.f7579p ? m.h(D().u(null), l3, true) : D().u(l3);
    }

    @Override // w0.b
    public final q w() {
        return D().w();
    }

    @Override // w0.b
    public final k0 x() {
        return D().x();
    }

    @Override // w0.b
    /* renamed from: y */
    public final p6.c e() {
        return this.f7581r;
    }
}
