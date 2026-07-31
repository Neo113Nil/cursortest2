package w1;

import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class y1 implements m0.c {

    /* renamed from: d, reason: collision with root package name */
    public final Object f7822d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f7823e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public Object f7824f;

    public y1(f0 f0Var) {
        this.f7822d = f0Var;
        this.f7824f = f0Var;
    }

    public final void a() {
        this.f7823e.clear();
        this.f7824f = this.f7822d;
        ((f0) this.f7822d).O();
    }

    @Override // m0.c
    public final void b(int i, Object obj) {
        ((f0) this.f7824f).z(i, (f0) obj);
    }

    @Override // m0.c
    public final void d(Object obj) {
        this.f7823e.add(this.f7824f);
        this.f7824f = obj;
    }

    @Override // m0.c
    public final void e() {
        z0.b bVar;
        f0 f0Var = (f0) this.f7824f;
        b1 b1Var = f0Var.F;
        if (!f0Var.G()) {
            t1.a.a("onReuse is only expected on attached node");
        }
        u1.a0 a0Var = f0Var.H;
        if (a0Var != null) {
            a0Var.f(false);
        }
        f0Var.f7655u = false;
        if (f0Var.O) {
            f0Var.O = false;
        } else {
            y0.l lVar = f0Var.F.f7599e;
            for (y0.l lVar2 = lVar; lVar2 != null; lVar2 = lVar2.f8710h) {
                if (lVar2.f8718q) {
                    lVar2.m0();
                }
            }
            for (y0.l lVar3 = lVar; lVar3 != null; lVar3 = lVar3.f8710h) {
                if (lVar3.f8718q) {
                    lVar3.o0();
                }
            }
            while (lVar != null) {
                if (lVar.f8718q) {
                    lVar.i0();
                }
                lVar = lVar.f8710h;
            }
        }
        int i = f0Var.f7640e;
        f0Var.f7640e = d2.l.f2154a.addAndGet(1);
        k1 k1Var = f0Var.f7650p;
        if (k1Var != null) {
            x1.t tVar = (x1.t) k1Var;
            tVar.getLayoutNodes().f(i);
            tVar.getLayoutNodes().g(f0Var.f7640e, f0Var);
        }
        for (y0.l lVar4 = b1Var.f7600f; lVar4 != null; lVar4 = lVar4.i) {
            lVar4.h0();
        }
        b1Var.e();
        if (b1Var.d(8)) {
            f0Var.E();
        }
        f0.V(f0Var);
        k1 k1Var2 = f0Var.f7650p;
        if (k1Var2 != null) {
            x1.t tVar2 = (x1.t) k1Var2;
            if (x1.t.g() && (bVar = tVar2.H) != null) {
                x1.t tVar3 = bVar.f9104c;
                q3.k kVar = bVar.f9102a;
                o.y yVar = bVar.f9108g;
                if (yVar.e(i)) {
                    kVar.n(tVar3, i, false);
                }
                d2.j u7 = f0Var.u();
                if (u7 != null && u7.f2150d.b(d2.s.f2203q)) {
                    yVar.a(f0Var.f7640e);
                    kVar.n(tVar3, f0Var.f7640e, true);
                }
            }
            tVar2.getRectManager().g(f0Var, true);
        }
    }

    @Override // m0.c
    public final /* bridge */ /* synthetic */ void f(int i, Object obj) {
    }

    @Override // m0.c
    public final void g() {
        k1 k1Var = ((f0) this.f7822d).f7650p;
        if (k1Var != null) {
            ((x1.t) k1Var).v();
        }
    }

    @Override // m0.c
    public final void h(int i, int i8, int i9) {
        ((f0) this.f7824f).K(i, i8, i9);
    }

    @Override // m0.c
    public final Object i() {
        return this.f7824f;
    }

    @Override // m0.c
    public final void j(int i, int i8) {
        ((f0) this.f7824f).P(i, i8);
    }

    @Override // m0.c
    public final void n() {
        this.f7824f = this.f7823e.remove(r0.size() - 1);
    }
}
