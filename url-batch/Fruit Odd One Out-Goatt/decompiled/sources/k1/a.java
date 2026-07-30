package k1;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract class a extends q0 implements v0.d, r {

    /* renamed from: d, reason: collision with root package name */
    public final v0.h f661d;

    public a(v0.h hVar, boolean z2) {
        super(z2);
        A((q0) hVar.j(q.f713c));
        this.f661d = hVar.h(this);
    }

    @Override // k1.q0
    public final void F(Object obj) {
        if (!(obj instanceof j)) {
            L(obj);
        } else {
            j jVar = (j) obj;
            K(jVar.f689a, j.f688b.get(jVar) != 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M(int i2, a aVar, c1.p pVar) {
        int a2 = o.d.a(i2);
        t0.g gVar = t0.g.f1178a;
        if (a2 == 0) {
            try {
                p1.a.g(gVar, a.a.m(((x0.b) pVar).e(aVar, this)));
                return;
            } finally {
                f(new t0.c(th));
            }
        }
        if (a2 != 1) {
            if (a2 == 2) {
                a.a.m(((x0.b) pVar).e(aVar, this)).f(gVar);
                return;
            }
            if (a2 != 3) {
                throw new c0.c();
            }
            try {
                v0.h hVar = this.f661d;
                Object k2 = p1.a.k(hVar, null);
                try {
                    d1.n.a(2, pVar);
                    Object g2 = pVar.g(aVar, this);
                    if (g2 != w0.a.f1227b) {
                        f(g2);
                    }
                } finally {
                    p1.a.f(hVar, k2);
                }
            } catch (Throwable th) {
            }
        }
    }

    @Override // v0.d
    public final v0.h d() {
        return this.f661d;
    }

    @Override // k1.r
    public final v0.h e() {
        return this.f661d;
    }

    @Override // v0.d
    public final void f(Object obj) {
        Throwable a2 = t0.d.a(obj);
        if (a2 != null) {
            obj = new j(a2, false);
        }
        Object C = C(obj);
        if (C == t.f720d) {
            return;
        }
        m(C);
    }

    @Override // k1.q0
    public final String q() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // k1.q0
    public final void z(c0.c cVar) {
        t.c(this.f661d, cVar);
    }

    public void L(Object obj) {
    }

    public void K(Throwable th, boolean z2) {
    }
}
