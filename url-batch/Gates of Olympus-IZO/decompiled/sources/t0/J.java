package t0;

import H2.AbstractC0080b;
import I.C0120t;
import I.C0125v0;
import e2.AbstractC0381e;
import java.util.List;
import m.AbstractC0600j;
import r0.C0837j;
import u0.C0997t;

/* loaded from: classes.dex */
public final class J extends r0.H implements r0.z, InterfaceC0893a, U {
    public float B;
    public boolean C;
    public Y1.c D;

    /* renamed from: F, reason: collision with root package name */
    public float f7774F;

    /* renamed from: G, reason: collision with root package name */
    public final C0125v0 f7775G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f7776H;

    /* renamed from: I, reason: collision with root package name */
    public final /* synthetic */ L f7777I;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7778i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7781l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7782m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7784o;

    /* renamed from: q, reason: collision with root package name */
    public Y1.c f7785q;

    /* renamed from: r, reason: collision with root package name */
    public float f7786r;

    /* renamed from: t, reason: collision with root package name */
    public Object f7788t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7789u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7790v;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7794z;

    /* renamed from: j, reason: collision with root package name */
    public int f7779j = Integer.MAX_VALUE;

    /* renamed from: k, reason: collision with root package name */
    public int f7780k = Integer.MAX_VALUE;

    /* renamed from: n, reason: collision with root package name */
    public int f7783n = 3;
    public long p = 0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7787s = true;

    /* renamed from: w, reason: collision with root package name */
    public final E f7791w = new E(this, 0);

    /* renamed from: x, reason: collision with root package name */
    public final K.d f7792x = new K.d(new J[16]);

    /* renamed from: y, reason: collision with root package name */
    public boolean f7793y = true;

    /* renamed from: A, reason: collision with root package name */
    public final r1.r f7772A = new r1.r(3, this);

    /* renamed from: E, reason: collision with root package name */
    public long f7773E = 0;

    public J(L l3) {
        this.f7777I = l3;
        this.f7775G = new C0125v0(l3, 9, this);
    }

    @Override // t0.InterfaceC0893a
    public final C0911t A() {
        return (C0911t) this.f7777I.f7797a.f7735x.f2353c;
    }

    @Override // t0.InterfaceC0893a
    public final void E() {
        D.R(this.f7777I.f7797a, false, 7);
    }

    @Override // t0.InterfaceC0893a
    public final void K(t.x xVar) {
        K.d t3 = this.f7777I.f7797a.t();
        int i3 = t3.f2642f;
        if (i3 > 0) {
            Object[] objArr = t3.f2640d;
            int i4 = 0;
            do {
                xVar.j(((D) objArr[i4]).f7736y.f7813r);
                i4++;
            } while (i4 < i3);
        }
    }

    @Override // r0.H
    public final int L(C0837j c0837j) {
        L l3 = this.f7777I;
        D q2 = l3.f7797a.q();
        int i3 = q2 != null ? q2.f7736y.f7799c : 0;
        E e3 = this.f7791w;
        if (i3 == 1) {
            e3.f7740c = true;
        } else {
            D q3 = l3.f7797a.q();
            if ((q3 != null ? q3.f7736y.f7799c : 0) == 3) {
                e3.f7741d = true;
            }
        }
        this.f7784o = true;
        int L2 = l3.a().L(c0837j);
        this.f7784o = false;
        return L2;
    }

    @Override // r0.H
    public final void Q(long j3, float f3, Y1.c cVar) {
        r0.G placementScope;
        this.f7790v = true;
        boolean a3 = M0.g.a(j3, this.p);
        L l3 = this.f7777I;
        if (!a3 || this.f7776H) {
            if (l3.f7809m || l3.f7808l || this.f7776H) {
                l3.f7801e = true;
                this.f7776H = false;
            }
            e0();
        }
        if (AbstractC0898f.p(l3.f7797a)) {
            a0 a0Var = l3.a().f7878q;
            D d3 = l3.f7797a;
            if (a0Var == null || (placementScope = a0Var.f7826l) == null) {
                placementScope = ((C0997t) G.a(d3)).getPlacementScope();
            }
            I i3 = l3.f7814s;
            Z1.i.c(i3);
            D q2 = d3.q();
            if (q2 != null) {
                q2.f7736y.f7806j = 0;
            }
            i3.f7757k = Integer.MAX_VALUE;
            r0.G.d(placementScope, i3, (int) (j3 >> 32), (int) (4294967295L & j3));
        }
        I i4 = l3.f7814s;
        if (i4 == null || i4.f7760n) {
            j0(j3, f3, cVar);
        } else {
            AbstractC0381e.N("Error: Placement happened before lookahead.");
            throw null;
        }
    }

    public final List W() {
        L l3 = this.f7777I;
        l3.f7797a.X();
        boolean z3 = this.f7793y;
        K.d dVar = this.f7792x;
        if (!z3) {
            return dVar.g();
        }
        D d3 = l3.f7797a;
        K.d t3 = d3.t();
        int i3 = t3.f2642f;
        if (i3 > 0) {
            Object[] objArr = t3.f2640d;
            int i4 = 0;
            do {
                D d4 = (D) objArr[i4];
                if (dVar.f2642f <= i4) {
                    dVar.b(d4.f7736y.f7813r);
                } else {
                    J j3 = d4.f7736y.f7813r;
                    Object[] objArr2 = dVar.f2640d;
                    Object obj = objArr2[i4];
                    objArr2[i4] = j3;
                }
                i4++;
            } while (i4 < i3);
        }
        dVar.p(((K.a) d3.m()).f2634d.f2642f, dVar.f2642f);
        this.f7793y = false;
        return dVar.g();
    }

    @Override // r0.z
    public final r0.H b(long j3) {
        int i3;
        L l3 = this.f7777I;
        D d3 = l3.f7797a;
        if (d3.f7714G == 3) {
            d3.f();
        }
        D d4 = l3.f7797a;
        if (AbstractC0898f.p(d4)) {
            I i4 = l3.f7814s;
            Z1.i.c(i4);
            i4.f7758l = 3;
            i4.b(j3);
        }
        D q2 = d4.q();
        if (q2 == null) {
            this.f7783n = 3;
        } else {
            if (this.f7783n != 3 && !d4.f7734w) {
                AbstractC0381e.N("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                throw null;
            }
            L l4 = q2.f7736y;
            int a3 = AbstractC0600j.a(l4.f7799c);
            if (a3 != 0) {
                i3 = 2;
                if (a3 != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(AbstractC0080b.v(l4.f7799c)));
                }
            } else {
                i3 = 1;
            }
            this.f7783n = i3;
        }
        k0(j3);
        return this;
    }

    public final void b0() {
        boolean z3 = this.f7789u;
        this.f7789u = true;
        D d3 = this.f7777I.f7797a;
        if (!z3) {
            L l3 = d3.f7736y;
            if (l3.f7800d) {
                D.R(d3, true, 6);
            } else if (l3.f7803g) {
                D.P(d3, true, 6);
            }
        }
        C0120t c0120t = d3.f7735x;
        a0 a0Var = ((C0911t) c0120t.f2353c).p;
        for (a0 a0Var2 = (a0) c0120t.f2354d; !Z1.i.a(a0Var2, a0Var) && a0Var2 != null; a0Var2 = a0Var2.p) {
            if (a0Var2.f7875F) {
                a0Var2.H0();
            }
        }
        K.d t3 = d3.t();
        int i3 = t3.f2642f;
        if (i3 > 0) {
            Object[] objArr = t3.f2640d;
            int i4 = 0;
            do {
                D d4 = (D) objArr[i4];
                if (d4.r() != Integer.MAX_VALUE) {
                    d4.f7736y.f7813r.b0();
                    D.S(d4);
                }
                i4++;
            } while (i4 < i3);
        }
    }

    @Override // t0.InterfaceC0893a
    public final InterfaceC0893a d() {
        L l3;
        D q2 = this.f7777I.f7797a.q();
        if (q2 == null || (l3 = q2.f7736y) == null) {
            return null;
        }
        return l3.f7813r;
    }

    public final void d0() {
        if (this.f7789u) {
            int i3 = 0;
            this.f7789u = false;
            L l3 = this.f7777I;
            C0120t c0120t = l3.f7797a.f7735x;
            a0 a0Var = ((C0911t) c0120t.f2353c).p;
            for (a0 a0Var2 = (a0) c0120t.f2354d; !Z1.i.a(a0Var2, a0Var) && a0Var2 != null; a0Var2 = a0Var2.p) {
                if (a0Var2.f7876G != null) {
                    a0Var2.U0(null, false);
                    a0Var2.f7877o.Q(false);
                }
            }
            K.d t3 = l3.f7797a.t();
            int i4 = t3.f2642f;
            if (i4 > 0) {
                Object[] objArr = t3.f2640d;
                do {
                    ((D) objArr[i3]).f7736y.f7813r.d0();
                    i3++;
                } while (i3 < i4);
            }
        }
    }

    @Override // t0.InterfaceC0893a
    public final void e() {
        K.d t3;
        int i3;
        this.f7794z = true;
        E e3 = this.f7791w;
        e3.h();
        L l3 = this.f7777I;
        boolean z3 = l3.f7801e;
        D d3 = l3.f7797a;
        if (z3 && (i3 = (t3 = d3.t()).f2642f) > 0) {
            Object[] objArr = t3.f2640d;
            int i4 = 0;
            do {
                D d4 = (D) objArr[i4];
                L l4 = d4.f7736y;
                if (l4.f7800d && l4.f7813r.f7783n == 1 && D.K(d4)) {
                    D.R(d3, false, 7);
                }
                i4++;
            } while (i4 < i3);
        }
        if (l3.f7802f || (!this.f7784o && !A().f7825k && l3.f7801e)) {
            l3.f7801e = false;
            int i5 = l3.f7799c;
            l3.f7799c = 3;
            l3.e(false);
            i0 snapshotObserver = ((C0997t) G.a(d3)).getSnapshotObserver();
            snapshotObserver.a(d3, snapshotObserver.f7929e, this.f7772A);
            l3.f7799c = i5;
            if (A().f7825k && l3.f7808l) {
                requestLayout();
            }
            l3.f7802f = false;
        }
        if (e3.f7741d) {
            e3.f7742e = true;
        }
        if (e3.f7739b && e3.e()) {
            e3.g();
        }
        this.f7794z = false;
    }

    public final void e0() {
        K.d t3;
        int i3;
        L l3 = this.f7777I;
        if (l3.f7810n <= 0 || (i3 = (t3 = l3.f7797a.t()).f2642f) <= 0) {
            return;
        }
        Object[] objArr = t3.f2640d;
        int i4 = 0;
        do {
            D d3 = (D) objArr[i4];
            L l4 = d3.f7736y;
            if ((l4.f7808l || l4.f7809m) && !l4.f7801e) {
                d3.Q(false);
            }
            l4.f7813r.e0();
            i4++;
        } while (i4 < i3);
    }

    public final void f0() {
        this.C = true;
        L l3 = this.f7777I;
        D q2 = l3.f7797a.q();
        float f3 = A().f7873A;
        C0120t c0120t = l3.f7797a.f7735x;
        a0 a0Var = (a0) c0120t.f2354d;
        while (a0Var != ((C0911t) c0120t.f2353c)) {
            Z1.i.d(a0Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            C0916y c0916y = (C0916y) a0Var;
            f3 += c0916y.f7873A;
            a0Var = c0916y.p;
        }
        if (f3 != this.B) {
            this.B = f3;
            if (q2 != null) {
                q2.I();
            }
            if (q2 != null) {
                q2.w();
            }
        }
        if (!this.f7789u) {
            if (q2 != null) {
                q2.w();
            }
            b0();
            if (this.f7778i && q2 != null) {
                q2.Q(false);
            }
        }
        if (q2 == null) {
            this.f7780k = 0;
        } else if (!this.f7778i) {
            L l4 = q2.f7736y;
            if (l4.f7799c == 3) {
                if (this.f7780k != Integer.MAX_VALUE) {
                    AbstractC0381e.N("Place was called on a node which was placed already");
                    throw null;
                }
                int i3 = l4.f7807k;
                this.f7780k = i3;
                l4.f7807k = i3 + 1;
            }
        }
        e();
    }

    @Override // t0.InterfaceC0893a
    public final boolean h() {
        return this.f7789u;
    }

    @Override // t0.InterfaceC0893a
    public final E i() {
        return this.f7791w;
    }

    public final void j0(long j3, float f3, Y1.c cVar) {
        L l3 = this.f7777I;
        D d3 = l3.f7797a;
        if (d3.f7713F) {
            AbstractC0381e.M("place is called on a deactivated node");
            throw null;
        }
        l3.f7799c = 3;
        this.p = j3;
        this.f7786r = f3;
        this.f7785q = cVar;
        this.f7782m = true;
        this.C = false;
        g0 a3 = G.a(d3);
        if (l3.f7801e || !this.f7789u) {
            this.f7791w.f7744g = false;
            l3.d(false);
            this.D = cVar;
            this.f7773E = j3;
            this.f7774F = f3;
            i0 snapshotObserver = ((C0997t) a3).getSnapshotObserver();
            snapshotObserver.a(l3.f7797a, snapshotObserver.f7930f, this.f7775G);
        } else {
            a0 a4 = l3.a();
            a4.P0(M0.g.c(j3, a4.f7118h), f3, cVar);
            f0();
        }
        l3.f7799c = 5;
    }

    public final boolean k0(long j3) {
        L l3 = this.f7777I;
        D d3 = l3.f7797a;
        if (d3.f7713F) {
            AbstractC0381e.M("measure is called on a deactivated node");
            throw null;
        }
        g0 a3 = G.a(d3);
        D d4 = l3.f7797a;
        D q2 = d4.q();
        boolean z3 = true;
        d4.f7734w = d4.f7734w || (q2 != null && q2.f7734w);
        if (!d4.f7736y.f7800d && M0.a.b(this.f7117g, j3)) {
            ((C0997t) a3).f8416J.f(d4, false);
            d4.T();
            return false;
        }
        this.f7791w.f7743f = false;
        K.d t3 = d4.t();
        int i3 = t3.f2642f;
        if (i3 > 0) {
            Object[] objArr = t3.f2640d;
            int i4 = 0;
            do {
                ((D) objArr[i4]).f7736y.f7813r.f7791w.f7740c = false;
                i4++;
            } while (i4 < i3);
        }
        this.f7781l = true;
        long j4 = l3.a().f7116f;
        U(j3);
        if (l3.f7799c != 5) {
            AbstractC0381e.N("layout state is not idle before measure starts");
            throw null;
        }
        l3.f7799c = 1;
        l3.f7800d = false;
        l3.f7815t = j3;
        i0 snapshotObserver = ((C0997t) G.a(d4)).getSnapshotObserver();
        snapshotObserver.a(d4, snapshotObserver.f7927c, l3.f7816u);
        if (l3.f7799c == 1) {
            l3.f7801e = true;
            l3.f7802f = true;
            l3.f7799c = 5;
        }
        if (M0.i.a(l3.a().f7116f, j4) && l3.a().f7114d == this.f7114d && l3.a().f7115e == this.f7115e) {
            z3 = false;
        }
        T(I2.l.e(l3.a().f7114d, l3.a().f7115e));
        return z3;
    }

    @Override // r0.H, r0.z
    public final Object r() {
        return this.f7788t;
    }

    @Override // t0.InterfaceC0893a
    public final void requestLayout() {
        this.f7777I.f7797a.Q(false);
    }

    @Override // t0.U
    public final void v(boolean z3) {
        L l3 = this.f7777I;
        boolean z4 = l3.a().f7823i;
        if (z3 != z4) {
            l3.a().f7823i = z4;
            this.f7776H = true;
        }
    }
}
