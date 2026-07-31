package m0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d2 implements a7.u, a2 {

    /* renamed from: g, reason: collision with root package name */
    public static final g f4896g = new g();

    /* renamed from: d, reason: collision with root package name */
    public final g6.h f4897d;

    /* renamed from: e, reason: collision with root package name */
    public final d2 f4898e = this;

    /* renamed from: f, reason: collision with root package name */
    public volatile g6.h f4899f;

    public d2(g6.h hVar) {
        this.f4897d = hVar;
    }

    public final void a() {
        synchronized (this.f4898e) {
            try {
                g6.h hVar = this.f4899f;
                if (hVar == null) {
                    this.f4899f = f4896g;
                } else {
                    j0 j0Var = new j0(0);
                    a7.s0 s0Var = (a7.s0) hVar.l(a7.r.f297e);
                    if (s0Var != null) {
                        s0Var.a(j0Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // m0.a2
    public final void f() {
        a();
    }

    @Override // a7.u
    public final g6.h h() {
        g6.h hVar;
        g6.h hVar2 = this.f4899f;
        if (hVar2 == null || hVar2 == f4896g) {
            x0.b bVar = (x0.b) this.f4897d.l(x0.b.f8316e);
            g6.h c2Var = bVar != null ? new c2(bVar, this) : g6.i.f3046d;
            synchronized (this.f4898e) {
                try {
                    g6.h hVar3 = this.f4899f;
                    if (hVar3 == null) {
                        g6.h hVar4 = this.f4897d;
                        hVar = hVar4.c(new a7.u0((a7.s0) hVar4.l(a7.r.f297e))).c(g6.i.f3046d).c(c2Var);
                    } else if (hVar3 == f4896g) {
                        g6.h hVar5 = this.f4897d;
                        a7.u0 u0Var = new a7.u0((a7.s0) hVar5.l(a7.r.f297e));
                        u0Var.B(new j0(0));
                        hVar = hVar5.c(u0Var).c(g6.i.f3046d).c(c2Var);
                    } else {
                        hVar = hVar3;
                    }
                    this.f4899f = hVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
            hVar2 = hVar;
        }
        q6.i.b(hVar2);
        return hVar2;
    }

    @Override // m0.a2
    public final void i() {
        a();
    }

    @Override // m0.a2
    public final void e() {
    }
}
