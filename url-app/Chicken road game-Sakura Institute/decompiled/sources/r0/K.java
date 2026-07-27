package r0;

import G.C0223t;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;
import n.AbstractC0864b;
import p0.AbstractC0953N;
import p0.AbstractC0954O;
import p0.C0976l;
import p0.InterfaceC0944E;
import s0.C1166s;

/* loaded from: classes.dex */
public final class K extends AbstractC0954O implements InterfaceC0944E, InterfaceC1060a, U {

    /* renamed from: C, reason: collision with root package name */
    public boolean f9649C;

    /* renamed from: E, reason: collision with root package name */
    public float f9651E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f9652F;

    /* renamed from: G, reason: collision with root package name */
    public Function1 f9653G;

    /* renamed from: I, reason: collision with root package name */
    public float f9655I;

    /* renamed from: J, reason: collision with root package name */
    public final A.f0 f9656J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f9657K;

    /* renamed from: L, reason: collision with root package name */
    public final /* synthetic */ L f9658L;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9659l;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9662o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9663p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9665r;

    /* renamed from: t, reason: collision with root package name */
    public Function1 f9667t;

    /* renamed from: u, reason: collision with root package name */
    public float f9668u;

    /* renamed from: w, reason: collision with root package name */
    public Object f9670w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f9671x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f9672y;

    /* renamed from: m, reason: collision with root package name */
    public int f9660m = Integer.MAX_VALUE;

    /* renamed from: n, reason: collision with root package name */
    public int f9661n = Integer.MAX_VALUE;

    /* renamed from: q, reason: collision with root package name */
    public int f9664q = 3;

    /* renamed from: s, reason: collision with root package name */
    public long f9666s = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9669v = true;

    /* renamed from: z, reason: collision with root package name */
    public final F f9673z = new F(this, 0);

    /* renamed from: A, reason: collision with root package name */
    public final I.d f9648A = new I.d(new K[16]);
    public boolean B = true;

    /* renamed from: D, reason: collision with root package name */
    public final A3.e f9650D = new A3.e(26, this);

    /* renamed from: H, reason: collision with root package name */
    public long f9654H = 0;

    public K(L l4) {
        this.f9658L = l4;
        this.f9656J = new A.f0(l4, 8, this);
    }

    @Override // r0.InterfaceC1060a
    public final void H(A.g0 g0Var) {
        I.d v4 = this.f9658L.f9674a.v();
        int i2 = v4.f3332i;
        if (i2 > 0) {
            Object[] objArr = v4.f3330d;
            int i4 = 0;
            do {
                g0Var.invoke(((E) objArr[i4]).f9584C.f9691r);
                i4++;
            } while (i4 < i2);
        }
    }

    @Override // p0.InterfaceC0944E
    public final int S(int i2) {
        v0();
        return this.f9658L.a().S(i2);
    }

    @Override // r0.InterfaceC1060a
    public final C1078t T() {
        return (C1078t) this.f9658L.f9674a.B.f2909c;
    }

    @Override // r0.InterfaceC1060a
    public final void W() {
        E.T(this.f9658L.f9674a, false, 7);
    }

    @Override // p0.InterfaceC0944E
    public final int X(int i2) {
        v0();
        return this.f9658L.a().X(i2);
    }

    @Override // p0.InterfaceC0944E
    public final int Z(int i2) {
        v0();
        return this.f9658L.a().Z(i2);
    }

    @Override // p0.InterfaceC0944E
    public final AbstractC0954O a(long j4) {
        int i2;
        L l4 = this.f9658L;
        E e4 = l4.f9674a;
        if (e4.f9592K == 3) {
            e4.f();
        }
        E e5 = l4.f9674a;
        if (AbstractC1065f.r(e5)) {
            J j5 = l4.f9692s;
            Intrinsics.c(j5);
            j5.f9636o = 3;
            j5.a(j4);
        }
        E s4 = e5.s();
        if (s4 == null) {
            this.f9664q = 3;
        } else {
            if (this.f9664q != 3 && !e5.f9583A) {
                AbstractC0864b.D("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                throw null;
            }
            L l5 = s4.f9584C;
            int d4 = AbstractC0784j.d(l5.f9676c);
            if (d4 != 0) {
                i2 = 2;
                if (d4 != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(B.d(l5.f9676c)));
                }
            } else {
                i2 = 1;
            }
            this.f9664q = i2;
        }
        y0(j4);
        return this;
    }

    @Override // p0.InterfaceC0944E
    public final int b(int i2) {
        v0();
        return this.f9658L.a().b(i2);
    }

    @Override // r0.InterfaceC1060a
    public final InterfaceC1060a d() {
        L l4;
        E s4 = this.f9658L.f9674a.s();
        if (s4 == null || (l4 = s4.f9584C) == null) {
            return null;
        }
        return l4.f9691r;
    }

    @Override // p0.AbstractC0954O
    public final int e0(C0976l c0976l) {
        L l4 = this.f9658L;
        E s4 = l4.f9674a.s();
        int i2 = s4 != null ? s4.f9584C.f9676c : 0;
        F f4 = this.f9673z;
        if (i2 == 1) {
            f4.f9616c = true;
        } else {
            E s5 = l4.f9674a.s();
            if ((s5 != null ? s5.f9584C.f9676c : 0) == 3) {
                f4.f9617d = true;
            }
        }
        this.f9665r = true;
        int e02 = l4.a().e0(c0976l);
        this.f9665r = false;
        return e02;
    }

    @Override // r0.InterfaceC1060a
    public final void f() {
        I.d v4;
        int i2;
        this.f9649C = true;
        F f4 = this.f9673z;
        f4.h();
        L l4 = this.f9658L;
        boolean z4 = l4.f9678e;
        E e4 = l4.f9674a;
        if (z4 && (i2 = (v4 = e4.v()).f3332i) > 0) {
            Object[] objArr = v4.f3330d;
            int i4 = 0;
            do {
                E e5 = (E) objArr[i4];
                L l5 = e5.f9584C;
                if (l5.f9677d && l5.f9691r.f9664q == 1 && E.L(e5)) {
                    E.T(e4, false, 7);
                }
                i4++;
            } while (i4 < i2);
        }
        if (l4.f9679f || (!this.f9665r && !T().f9703n && l4.f9678e)) {
            l4.f9678e = false;
            int i5 = l4.f9676c;
            l4.f9676c = 3;
            l4.e(false);
            i0 snapshotObserver = ((C1166s) H.a(e4)).getSnapshotObserver();
            snapshotObserver.a(e4, snapshotObserver.f9811e, this.f9650D);
            l4.f9676c = i5;
            if (T().f9703n && l4.f9685l) {
                requestLayout();
            }
            l4.f9679f = false;
        }
        if (f4.f9617d) {
            f4.f9618e = true;
        }
        if (f4.f9615b && f4.e()) {
            f4.g();
        }
        this.f9649C = false;
    }

    @Override // p0.AbstractC0954O
    public final int f0() {
        return this.f9658L.a().f0();
    }

    @Override // r0.InterfaceC1060a
    public final boolean g() {
        return this.f9671x;
    }

    @Override // p0.AbstractC0954O
    public final int g0() {
        return this.f9658L.a().g0();
    }

    @Override // r0.InterfaceC1060a
    public final F k() {
        return this.f9673z;
    }

    @Override // p0.AbstractC0954O
    public final void n0(long j4, float f4, Function1 function1) {
        AbstractC0953N placementScope;
        this.f9672y = true;
        boolean a4 = M0.h.a(j4, this.f9666s);
        L l4 = this.f9658L;
        if (!a4 || this.f9657K) {
            if (l4.f9686m || l4.f9685l || this.f9657K) {
                l4.f9678e = true;
                this.f9657K = false;
            }
            u0();
        }
        if (AbstractC1065f.r(l4.f9674a)) {
            a0 a0Var = l4.a().f9764t;
            E e4 = l4.f9674a;
            if (a0Var == null || (placementScope = a0Var.f9704o) == null) {
                placementScope = ((C1166s) H.a(e4)).getPlacementScope();
            }
            J j5 = l4.f9692s;
            Intrinsics.c(j5);
            E s4 = e4.s();
            if (s4 != null) {
                s4.f9584C.f9683j = 0;
            }
            j5.f9635n = Integer.MAX_VALUE;
            AbstractC0953N.d(placementScope, j5, (int) (j4 >> 32), (int) (4294967295L & j4));
        }
        J j6 = l4.f9692s;
        if (j6 == null || j6.f9638q) {
            x0(j4, f4, function1);
        } else {
            AbstractC0864b.D("Error: Placement happened before lookahead.");
            throw null;
        }
    }

    @Override // p0.AbstractC0954O, p0.InterfaceC0944E
    public final Object r() {
        return this.f9670w;
    }

    public final List r0() {
        L l4 = this.f9658L;
        l4.f9674a.a0();
        boolean z4 = this.B;
        I.d dVar = this.f9648A;
        if (!z4) {
            return dVar.f();
        }
        E e4 = l4.f9674a;
        I.d v4 = e4.v();
        int i2 = v4.f3332i;
        if (i2 > 0) {
            Object[] objArr = v4.f3330d;
            int i4 = 0;
            do {
                E e5 = (E) objArr[i4];
                if (dVar.f3332i <= i4) {
                    dVar.b(e5.f9584C.f9691r);
                } else {
                    K k4 = e5.f9584C.f9691r;
                    Object[] objArr2 = dVar.f3330d;
                    Object obj = objArr2[i4];
                    objArr2[i4] = k4;
                }
                i4++;
            } while (i4 < i2);
        }
        dVar.o(((I.a) e4.n()).f3324d.f3332i, dVar.f3332i);
        this.B = false;
        return dVar.f();
    }

    @Override // r0.InterfaceC1060a
    public final void requestLayout() {
        this.f9658L.f9674a.S(false);
    }

    public final void s0() {
        boolean z4 = this.f9671x;
        this.f9671x = true;
        E e4 = this.f9658L.f9674a;
        if (!z4) {
            L l4 = e4.f9584C;
            if (l4.f9677d) {
                E.T(e4, true, 6);
            } else if (l4.f9680g) {
                E.R(e4, true, 6);
            }
        }
        C0223t c0223t = e4.B;
        a0 a0Var = ((C1078t) c0223t.f2909c).f9763s;
        for (a0 a0Var2 = (a0) c0223t.f2910d; !Intrinsics.a(a0Var2, a0Var) && a0Var2 != null; a0Var2 = a0Var2.f9763s) {
            if (a0Var2.f9760I) {
                a0Var2.U0();
            }
        }
        I.d v4 = e4.v();
        int i2 = v4.f3332i;
        if (i2 > 0) {
            Object[] objArr = v4.f3330d;
            int i4 = 0;
            do {
                E e5 = (E) objArr[i4];
                if (e5.t() != Integer.MAX_VALUE) {
                    e5.f9584C.f9691r.s0();
                    E.U(e5);
                }
                i4++;
            } while (i4 < i2);
        }
    }

    public final void t0() {
        if (this.f9671x) {
            int i2 = 0;
            this.f9671x = false;
            L l4 = this.f9658L;
            C0223t c0223t = l4.f9674a.B;
            a0 a0Var = ((C1078t) c0223t.f2909c).f9763s;
            for (a0 a0Var2 = (a0) c0223t.f2910d; !Intrinsics.a(a0Var2, a0Var) && a0Var2 != null; a0Var2 = a0Var2.f9763s) {
                if (a0Var2.f9761J != null) {
                    a0Var2.j1(null, false);
                    a0Var2.f9762r.S(false);
                }
            }
            I.d v4 = l4.f9674a.v();
            int i4 = v4.f3332i;
            if (i4 > 0) {
                Object[] objArr = v4.f3330d;
                do {
                    ((E) objArr[i2]).f9584C.f9691r.t0();
                    i2++;
                } while (i2 < i4);
            }
        }
    }

    public final void u0() {
        I.d v4;
        int i2;
        L l4 = this.f9658L;
        if (l4.f9687n <= 0 || (i2 = (v4 = l4.f9674a.v()).f3332i) <= 0) {
            return;
        }
        Object[] objArr = v4.f3330d;
        int i4 = 0;
        do {
            E e4 = (E) objArr[i4];
            L l5 = e4.f9584C;
            if ((l5.f9685l || l5.f9686m) && !l5.f9678e) {
                e4.S(false);
            }
            l5.f9691r.u0();
            i4++;
        } while (i4 < i2);
    }

    public final void v0() {
        int i2;
        L l4 = this.f9658L;
        E.T(l4.f9674a, false, 7);
        E e4 = l4.f9674a;
        E s4 = e4.s();
        if (s4 == null || e4.f9592K != 3) {
            return;
        }
        int d4 = AbstractC0784j.d(s4.f9584C.f9676c);
        if (d4 != 0) {
            i2 = 2;
            if (d4 != 2) {
                i2 = s4.f9592K;
            }
        } else {
            i2 = 1;
        }
        e4.f9592K = i2;
    }

    public final void w0() {
        this.f9652F = true;
        L l4 = this.f9658L;
        E s4 = l4.f9674a.s();
        float f4 = T().f9755D;
        C0223t c0223t = l4.f9674a.B;
        a0 a0Var = (a0) c0223t.f2910d;
        while (a0Var != ((C1078t) c0223t.f2909c)) {
            Intrinsics.d(a0Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            C1083y c1083y = (C1083y) a0Var;
            f4 += c1083y.f9755D;
            a0Var = c1083y.f9763s;
        }
        if (f4 != this.f9651E) {
            this.f9651E = f4;
            if (s4 != null) {
                s4.J();
            }
            if (s4 != null) {
                s4.y();
            }
        }
        if (!this.f9671x) {
            if (s4 != null) {
                s4.y();
            }
            s0();
            if (this.f9659l && s4 != null) {
                s4.S(false);
            }
        }
        if (s4 == null) {
            this.f9661n = 0;
        } else if (!this.f9659l) {
            L l5 = s4.f9584C;
            if (l5.f9676c == 3) {
                if (this.f9661n != Integer.MAX_VALUE) {
                    AbstractC0864b.D("Place was called on a node which was placed already");
                    throw null;
                }
                int i2 = l5.f9684k;
                this.f9661n = i2;
                l5.f9684k = i2 + 1;
            }
        }
        f();
    }

    public final void x0(long j4, float f4, Function1 function1) {
        L l4 = this.f9658L;
        E e4 = l4.f9674a;
        if (e4.f9591J) {
            AbstractC0864b.C("place is called on a deactivated node");
            throw null;
        }
        l4.f9676c = 3;
        this.f9666s = j4;
        this.f9668u = f4;
        this.f9667t = function1;
        this.f9663p = true;
        this.f9652F = false;
        g0 a4 = H.a(e4);
        if (l4.f9678e || !this.f9671x) {
            this.f9673z.f9620g = false;
            l4.d(false);
            this.f9653G = function1;
            this.f9654H = j4;
            this.f9655I = f4;
            i0 snapshotObserver = ((C1166s) a4).getSnapshotObserver();
            snapshotObserver.a(l4.f9674a, snapshotObserver.f9812f, this.f9656J);
        } else {
            a0 a5 = l4.a();
            a5.b1(M0.h.c(j4, a5.f9009k), f4, function1);
            w0();
        }
        l4.f9676c = 5;
    }

    public final boolean y0(long j4) {
        boolean z4 = true;
        L l4 = this.f9658L;
        E e4 = l4.f9674a;
        if (e4.f9591J) {
            AbstractC0864b.C("measure is called on a deactivated node");
            throw null;
        }
        g0 a4 = H.a(e4);
        E e5 = l4.f9674a;
        E s4 = e5.s();
        e5.f9583A = e5.f9583A || (s4 != null && s4.f9583A);
        if (!e5.f9584C.f9677d && M0.a.c(this.f9008j, j4)) {
            ((C1166s) a4).f10330M.f(e5, false);
            e5.V();
            return false;
        }
        this.f9673z.f9619f = false;
        I.d v4 = e5.v();
        int i2 = v4.f3332i;
        if (i2 > 0) {
            Object[] objArr = v4.f3330d;
            int i4 = 0;
            do {
                ((E) objArr[i4]).f9584C.f9691r.f9673z.f9616c = false;
                Unit unit = Unit.f7487a;
                i4++;
            } while (i4 < i2);
        }
        this.f9662o = true;
        long j5 = l4.a().f9007i;
        q0(j4);
        if (l4.f9676c != 5) {
            AbstractC0864b.D("layout state is not idle before measure starts");
            throw null;
        }
        l4.f9676c = 1;
        l4.f9677d = false;
        l4.f9693t = j4;
        i0 snapshotObserver = ((C1166s) H.a(e5)).getSnapshotObserver();
        snapshotObserver.a(e5, snapshotObserver.f9809c, l4.f9694u);
        if (l4.f9676c == 1) {
            l4.f9678e = true;
            l4.f9679f = true;
            l4.f9676c = 5;
        }
        if (M0.j.a(l4.a().f9007i, j5) && l4.a().f9005d == this.f9005d && l4.a().f9006e == this.f9006e) {
            z4 = false;
        }
        p0(u3.d.c(l4.a().f9005d, l4.a().f9006e));
        return z4;
    }

    @Override // r0.U
    public final void z(boolean z4) {
        L l4 = this.f9658L;
        boolean z5 = l4.a().f9701l;
        if (z4 != z5) {
            l4.a().f9701l = z5;
            this.f9657K = true;
        }
    }
}
