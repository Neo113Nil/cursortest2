package m0;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class t0 implements a2, a7.s {

    /* renamed from: d, reason: collision with root package name */
    public final g6.h f5114d;

    /* renamed from: e, reason: collision with root package name */
    public final p6.e f5115e;

    /* renamed from: f, reason: collision with root package name */
    public final f7.c f5116f;

    /* renamed from: g, reason: collision with root package name */
    public a7.h1 f5117g;

    public t0(g6.h hVar, p6.e eVar) {
        this.f5114d = hVar;
        this.f5115e = eVar;
        this.f5116f = a7.x.a(hVar.c(hVar.l(x0.b.f8316e) != null ? this : g6.i.f3046d));
    }

    @Override // g6.h
    public final g6.h c(g6.h hVar) {
        return a.a.v(this, hVar);
    }

    @Override // m0.a2
    public final void e() {
        a7.h1 h1Var = this.f5117g;
        if (h1Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            h1Var.a(cancellationException);
        }
        this.f5117g = a7.x.n(this.f5116f, null, this.f5115e, 3);
    }

    @Override // m0.a2
    public final void f() {
        a7.h1 h1Var = this.f5117g;
        if (h1Var != null) {
            h1Var.C(new j0(1));
        }
        this.f5117g = null;
    }

    @Override // g6.h
    public final Object g(Object obj, p6.e eVar) {
        return eVar.g(obj, this);
    }

    @Override // g6.f
    public final g6.g getKey() {
        return a7.r.f296d;
    }

    @Override // m0.a2
    public final void i() {
        a7.h1 h1Var = this.f5117g;
        if (h1Var != null) {
            h1Var.C(new j0(1));
        }
        this.f5117g = null;
    }

    @Override // g6.h
    public final g6.f l(g6.g gVar) {
        return a.a.j(this, gVar);
    }

    @Override // a7.s
    public final void n(g6.h hVar, Throwable th) {
        x0.b bVar = (x0.b) hVar.l(x0.b.f8316e);
        if (bVar != null) {
            r2.o.t0(th, new a0.z0(10, bVar, this));
        }
        a7.s sVar = (a7.s) this.f5114d.l(a7.r.f296d);
        if (sVar == null) {
            throw th;
        }
        sVar.n(hVar, th);
    }

    @Override // g6.h
    public final g6.h v(g6.g gVar) {
        return a.a.s(this, gVar);
    }
}
