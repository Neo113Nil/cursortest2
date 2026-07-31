package w0;

import r.s1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class z extends f {

    /* renamed from: e, reason: collision with root package name */
    public final f f7584e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7585f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7586g;

    /* renamed from: h, reason: collision with root package name */
    public p6.c f7587h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(f fVar, p6.c cVar, boolean z3, boolean z7) {
        super(0L, k.f7527h);
        p6.c e8;
        s1 s1Var = m.f7535a;
        this.f7584e = fVar;
        this.f7585f = z3;
        this.f7586g = z7;
        this.f7587h = m.l(cVar, (fVar == null || (e8 = fVar.e()) == null) ? m.f7543j.f7502e : e8, z3);
        this.i = u0.h.b();
    }

    @Override // w0.f
    public final void c() {
        f fVar;
        this.f7518c = true;
        if (!this.f7586g || (fVar = this.f7584e) == null) {
            return;
        }
        fVar.c();
    }

    @Override // w0.f
    public final k d() {
        return v().d();
    }

    @Override // w0.f
    public final p6.c e() {
        return this.f7587h;
    }

    @Override // w0.f
    public final boolean f() {
        return v().f();
    }

    @Override // w0.f
    public final long g() {
        return v().g();
    }

    @Override // w0.f
    public final p6.c i() {
        return null;
    }

    @Override // w0.f
    public final void k() {
        q.l();
        throw null;
    }

    @Override // w0.f
    public final void l() {
        q.l();
        throw null;
    }

    @Override // w0.f
    public final void m() {
        v().m();
    }

    @Override // w0.f
    public final void n(u uVar) {
        v().n(uVar);
    }

    @Override // w0.f
    public final f u(p6.c cVar) {
        p6.c l3 = m.l(cVar, this.f7587h, true);
        return !this.f7585f ? m.h(v().u(null), l3, true) : v().u(l3);
    }

    public final f v() {
        f fVar = this.f7584e;
        return fVar == null ? m.f7543j : fVar;
    }
}
