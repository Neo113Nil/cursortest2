package m;

import android.view.View;
import r1.n1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n0 extends s0.n implements r1.p, r1.o, n1, r1.c1 {
    public m2.j B;
    public e7.e C;

    /* renamed from: s, reason: collision with root package name */
    public a0.c1 f6211s;

    /* renamed from: t, reason: collision with root package name */
    public a0.d1 f6212t;

    /* renamed from: u, reason: collision with root package name */
    public y0 f6213u;

    /* renamed from: v, reason: collision with root package name */
    public View f6214v;

    /* renamed from: w, reason: collision with root package name */
    public m2.b f6215w;

    /* renamed from: x, reason: collision with root package name */
    public x0 f6216x;

    /* renamed from: z, reason: collision with root package name */
    public g0.e0 f6218z;

    /* renamed from: y, reason: collision with root package name */
    public final g0.g1 f6217y = g0.d.J(null, g0.t0.f3900h);
    public long A = 9205357640488583168L;

    public n0(a0.c1 c1Var, a0.d1 d1Var, y0 y0Var) {
        this.f6211s = c1Var;
        this.f6212t = d1Var;
        this.f6213u = y0Var;
    }

    public final long A0() {
        if (this.f6218z == null) {
            this.f6218z = g0.d.C(new m0(this, 0));
        }
        g0.e0 e0Var = this.f6218z;
        if (e0Var != null) {
            return ((y0.c) e0Var.getValue()).f9778a;
        }
        return 9205357640488583168L;
    }

    public final void B0() {
        x0 x0Var = this.f6216x;
        if (x0Var != null) {
            ((z0) x0Var).b();
        }
        View view = this.f6214v;
        if (view == null) {
            view = r1.f.v(this);
        }
        this.f6214v = view;
        m2.b bVar = this.f6215w;
        if (bVar == null) {
            bVar = r1.f.t(this).f7735v;
        }
        this.f6215w = bVar;
        this.f6216x = this.f6213u.b(view, bVar);
        D0();
    }

    public final void C0() {
        m2.b bVar = this.f6215w;
        if (bVar == null) {
            bVar = r1.f.t(this).f7735v;
            this.f6215w = bVar;
        }
        long j8 = ((y0.c) this.f6211s.f(bVar)).f9778a;
        if (!u3.r.h(j8) || !u3.r.h(A0())) {
            this.A = 9205357640488583168L;
            x0 x0Var = this.f6216x;
            if (x0Var != null) {
                ((z0) x0Var).b();
                return;
            }
            return;
        }
        this.A = y0.c.h(A0(), j8);
        if (this.f6216x == null) {
            B0();
        }
        x0 x0Var2 = this.f6216x;
        if (x0Var2 != null) {
            x0Var2.a(this.A, 9205357640488583168L);
        }
        D0();
    }

    public final void D0() {
        m2.b bVar;
        x0 x0Var = this.f6216x;
        if (x0Var == null || (bVar = this.f6215w) == null) {
            return;
        }
        z0 z0Var = (z0) x0Var;
        long c4 = z0Var.c();
        m2.j jVar = this.B;
        if (jVar != null && c4 == jVar.f6321a) {
            return;
        }
        this.f6212t.f(new m2.g(bVar.x(j1.c.o0(z0Var.c()))));
        this.B = new m2.j(z0Var.c());
    }

    @Override // r1.c1
    public final void I() {
        r1.f.q(this, new m0(this, 2));
    }

    @Override // r1.n1
    public final void S(y1.i iVar) {
        iVar.m(o0.f6223a, new m0(this, 1));
    }

    @Override // r1.p
    public final void V(r1.a1 a1Var) {
        this.f6217y.setValue(a1Var);
    }

    @Override // r1.o
    public final void c(r1.f0 f0Var) {
        f0Var.b();
        e7.e eVar = this.C;
        if (eVar != null) {
            eVar.e(d6.z.f2639a);
        }
    }

    @Override // s0.n
    public final void s0() {
        I();
        this.C = j1.c.C(0, 7, null);
        c7.a0.p(o0(), null, null, new f4.c(this, null, 7), 3);
    }

    @Override // s0.n
    public final void t0() {
        x0 x0Var = this.f6216x;
        if (x0Var != null) {
            ((z0) x0Var).b();
        }
        this.f6216x = null;
    }
}
