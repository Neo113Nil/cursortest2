package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;
import m.C0842o;
import n.AbstractC0864b;
import p0.AbstractC0954O;
import p0.C0976l;
import p0.InterfaceC0944E;
import s0.C1166s;

/* loaded from: classes.dex */
public final class J extends AbstractC0954O implements InterfaceC0944E, InterfaceC1060a, U {
    public Object B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f9631C;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ L f9632D;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9633l;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9637p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9638q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9639r;

    /* renamed from: s, reason: collision with root package name */
    public M0.a f9640s;

    /* renamed from: u, reason: collision with root package name */
    public Function1 f9642u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9643v;

    /* renamed from: z, reason: collision with root package name */
    public boolean f9647z;

    /* renamed from: m, reason: collision with root package name */
    public int f9634m = Integer.MAX_VALUE;

    /* renamed from: n, reason: collision with root package name */
    public int f9635n = Integer.MAX_VALUE;

    /* renamed from: o, reason: collision with root package name */
    public int f9636o = 3;

    /* renamed from: t, reason: collision with root package name */
    public long f9641t = 0;

    /* renamed from: w, reason: collision with root package name */
    public final F f9644w = new F(this, 1);

    /* renamed from: x, reason: collision with root package name */
    public final I.d f9645x = new I.d(new J[16]);

    /* renamed from: y, reason: collision with root package name */
    public boolean f9646y = true;

    /* renamed from: A, reason: collision with root package name */
    public boolean f9630A = true;

    public J(L l4) {
        this.f9632D = l4;
        this.B = l4.f9691r.f9670w;
    }

    @Override // r0.InterfaceC1060a
    public final void H(A.g0 g0Var) {
        I.d v4 = this.f9632D.f9674a.v();
        int i2 = v4.f3332i;
        if (i2 > 0) {
            Object[] objArr = v4.f3330d;
            int i4 = 0;
            do {
                J j4 = ((E) objArr[i4]).f9584C.f9692s;
                Intrinsics.c(j4);
                g0Var.invoke(j4);
                i4++;
            } while (i4 < i2);
        }
    }

    @Override // p0.InterfaceC0944E
    public final int S(int i2) {
        u0();
        P M02 = this.f9632D.a().M0();
        Intrinsics.c(M02);
        return M02.S(i2);
    }

    @Override // r0.InterfaceC1060a
    public final C1078t T() {
        return (C1078t) this.f9632D.f9674a.B.f2909c;
    }

    @Override // r0.InterfaceC1060a
    public final void W() {
        E.R(this.f9632D.f9674a, false, 7);
    }

    @Override // p0.InterfaceC0944E
    public final int X(int i2) {
        u0();
        P M02 = this.f9632D.a().M0();
        Intrinsics.c(M02);
        return M02.X(i2);
    }

    @Override // p0.InterfaceC0944E
    public final int Z(int i2) {
        u0();
        P M02 = this.f9632D.a().M0();
        Intrinsics.c(M02);
        return M02.Z(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r1 != null ? r1.f9584C.f9676c : 0) == 4) goto L14;
     */
    @Override // p0.InterfaceC0944E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0954O a(long j4) {
        L l4 = this.f9632D;
        E s4 = l4.f9674a.s();
        int i2 = s4 != null ? s4.f9584C.f9676c : 0;
        int i4 = 2;
        E e4 = l4.f9674a;
        if (i2 != 2) {
            E s5 = e4.s();
        }
        l4.f9675b = false;
        E s6 = e4.s();
        if (s6 == null) {
            this.f9636o = 3;
        } else {
            if (this.f9636o != 3 && !e4.f9583A) {
                AbstractC0864b.D("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                throw null;
            }
            L l5 = s6.f9584C;
            int d4 = AbstractC0784j.d(l5.f9676c);
            if (d4 == 0 || d4 == 1) {
                i4 = 1;
            } else if (d4 != 2 && d4 != 3) {
                throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(B.d(l5.f9676c)));
            }
            this.f9636o = i4;
        }
        if (e4.f9592K == 3) {
            e4.f();
        }
        x0(j4);
        return this;
    }

    @Override // p0.InterfaceC0944E
    public final int b(int i2) {
        u0();
        P M02 = this.f9632D.a().M0();
        Intrinsics.c(M02);
        return M02.b(i2);
    }

    @Override // r0.InterfaceC1060a
    public final InterfaceC1060a d() {
        L l4;
        E s4 = this.f9632D.f9674a.s();
        if (s4 == null || (l4 = s4.f9584C) == null) {
            return null;
        }
        return l4.f9692s;
    }

    @Override // p0.AbstractC0954O
    public final int e0(C0976l c0976l) {
        L l4 = this.f9632D;
        E s4 = l4.f9674a.s();
        int i2 = s4 != null ? s4.f9584C.f9676c : 0;
        F f4 = this.f9644w;
        if (i2 == 2) {
            f4.f9616c = true;
        } else {
            E s5 = l4.f9674a.s();
            if ((s5 != null ? s5.f9584C.f9676c : 0) == 4) {
                f4.f9617d = true;
            }
        }
        this.f9637p = true;
        P M02 = l4.a().M0();
        Intrinsics.c(M02);
        int e02 = M02.e0(c0976l);
        this.f9637p = false;
        return e02;
    }

    @Override // r0.InterfaceC1060a
    public final void f() {
        I.d v4;
        int i2;
        this.f9647z = true;
        F f4 = this.f9644w;
        f4.h();
        L l4 = this.f9632D;
        boolean z4 = l4.f9681h;
        E e4 = l4.f9674a;
        if (z4 && (i2 = (v4 = e4.v()).f3332i) > 0) {
            Object[] objArr = v4.f3330d;
            int i4 = 0;
            do {
                E e5 = (E) objArr[i4];
                if (e5.f9584C.f9680g && e5.q() == 1) {
                    L l5 = e5.f9584C;
                    J j4 = l5.f9692s;
                    Intrinsics.c(j4);
                    J j5 = l5.f9692s;
                    M0.a aVar = j5 != null ? j5.f9640s : null;
                    Intrinsics.c(aVar);
                    if (j4.x0(aVar.f3539a)) {
                        E.R(e4, false, 7);
                    }
                }
                i4++;
            } while (i4 < i2);
        }
        C1077s c1077s = T().f9842Q;
        Intrinsics.c(c1077s);
        if (l4.f9682i || (!this.f9637p && !c1077s.f9703n && l4.f9681h)) {
            l4.f9681h = false;
            int i5 = l4.f9676c;
            l4.f9676c = 4;
            g0 a4 = H.a(e4);
            l4.g(false);
            i0 snapshotObserver = ((C1166s) a4).getSnapshotObserver();
            C0842o c0842o = new C0842o(this, c1077s, l4, 5);
            snapshotObserver.getClass();
            if (e4.f9596i != null) {
                snapshotObserver.a(e4, snapshotObserver.f9814h, c0842o);
            } else {
                snapshotObserver.a(e4, snapshotObserver.f9811e, c0842o);
            }
            l4.f9676c = i5;
            if (l4.f9688o && c1077s.f9703n) {
                requestLayout();
            }
            l4.f9682i = false;
        }
        if (f4.f9617d) {
            f4.f9618e = true;
        }
        if (f4.f9615b && f4.e()) {
            f4.g();
        }
        this.f9647z = false;
    }

    @Override // p0.AbstractC0954O
    public final int f0() {
        P M02 = this.f9632D.a().M0();
        Intrinsics.c(M02);
        return M02.f0();
    }

    @Override // r0.InterfaceC1060a
    public final boolean g() {
        return this.f9643v;
    }

    @Override // p0.AbstractC0954O
    public final int g0() {
        P M02 = this.f9632D.a().M0();
        Intrinsics.c(M02);
        return M02.g0();
    }

    @Override // r0.InterfaceC1060a
    public final F k() {
        return this.f9644w;
    }

    @Override // p0.AbstractC0954O
    public final void n0(long j4, float f4, Function1 function1) {
        w0(j4, function1);
    }

    @Override // p0.AbstractC0954O, p0.InterfaceC0944E
    public final Object r() {
        return this.B;
    }

    public final void r0() {
        boolean z4 = this.f9643v;
        this.f9643v = true;
        L l4 = this.f9632D;
        if (!z4 && l4.f9680g) {
            E.R(l4.f9674a, true, 6);
        }
        I.d v4 = l4.f9674a.v();
        int i2 = v4.f3332i;
        if (i2 > 0) {
            Object[] objArr = v4.f3330d;
            int i4 = 0;
            do {
                E e4 = (E) objArr[i4];
                if (e4.t() != Integer.MAX_VALUE) {
                    J j4 = e4.f9584C.f9692s;
                    Intrinsics.c(j4);
                    j4.r0();
                    E.U(e4);
                }
                i4++;
            } while (i4 < i2);
        }
    }

    @Override // r0.InterfaceC1060a
    public final void requestLayout() {
        this.f9632D.f9674a.Q(false);
    }

    public final void s0() {
        if (this.f9643v) {
            int i2 = 0;
            this.f9643v = false;
            I.d v4 = this.f9632D.f9674a.v();
            int i4 = v4.f3332i;
            if (i4 > 0) {
                Object[] objArr = v4.f3330d;
                do {
                    J j4 = ((E) objArr[i2]).f9584C.f9692s;
                    Intrinsics.c(j4);
                    j4.s0();
                    i2++;
                } while (i2 < i4);
            }
        }
    }

    public final void t0() {
        I.d v4;
        int i2;
        L l4 = this.f9632D;
        if (l4.f9690q <= 0 || (i2 = (v4 = l4.f9674a.v()).f3332i) <= 0) {
            return;
        }
        Object[] objArr = v4.f3330d;
        int i4 = 0;
        do {
            E e4 = (E) objArr[i4];
            L l5 = e4.f9584C;
            if ((l5.f9688o || l5.f9689p) && !l5.f9681h) {
                e4.Q(false);
            }
            J j4 = l5.f9692s;
            if (j4 != null) {
                j4.t0();
            }
            i4++;
        } while (i4 < i2);
    }

    public final void u0() {
        int i2;
        L l4 = this.f9632D;
        E.R(l4.f9674a, false, 7);
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

    public final void v0() {
        L l4;
        int i2;
        this.f9631C = true;
        E s4 = this.f9632D.f9674a.s();
        if (!this.f9643v) {
            r0();
            if (this.f9633l && s4 != null) {
                s4.Q(false);
            }
        }
        if (s4 == null) {
            this.f9635n = 0;
        } else if (!this.f9633l && ((i2 = (l4 = s4.f9584C).f9676c) == 3 || i2 == 4)) {
            if (this.f9635n != Integer.MAX_VALUE) {
                AbstractC0864b.D("Place was called on a node which was placed already");
                throw null;
            }
            int i4 = l4.f9683j;
            this.f9635n = i4;
            l4.f9683j = i4 + 1;
        }
        f();
    }

    public final void w0(long j4, Function1 function1) {
        L l4 = this.f9632D;
        if (l4.f9674a.f9591J) {
            AbstractC0864b.C("place is called on a deactivated node");
            throw null;
        }
        l4.f9676c = 4;
        this.f9638q = true;
        this.f9631C = false;
        if (!M0.h.a(j4, this.f9641t)) {
            if (l4.f9689p || l4.f9688o) {
                l4.f9681h = true;
            }
            t0();
        }
        E e4 = l4.f9674a;
        g0 a4 = H.a(e4);
        if (l4.f9681h || !this.f9643v) {
            l4.f(false);
            this.f9644w.f9620g = false;
            i0 snapshotObserver = ((C1166s) a4).getSnapshotObserver();
            I i2 = new I(l4, a4, j4);
            snapshotObserver.getClass();
            if (e4.f9596i != null) {
                snapshotObserver.a(e4, snapshotObserver.f9813g, i2);
            } else {
                snapshotObserver.a(e4, snapshotObserver.f9812f, i2);
            }
        } else {
            P M02 = l4.a().M0();
            Intrinsics.c(M02);
            M02.E0(M0.h.c(j4, M02.f9009k));
            v0();
        }
        this.f9641t = j4;
        this.f9642u = function1;
        l4.f9676c = 5;
    }

    public final boolean x0(long j4) {
        int i2 = 1;
        L l4 = this.f9632D;
        E e4 = l4.f9674a;
        if (e4.f9591J) {
            AbstractC0864b.C("measure is called on a deactivated node");
            throw null;
        }
        E s4 = e4.s();
        E e5 = l4.f9674a;
        e5.f9583A = e5.f9583A || (s4 != null && s4.f9583A);
        if (!e5.f9584C.f9680g) {
            M0.a aVar = this.f9640s;
            if (aVar == null ? false : M0.a.c(aVar.f3539a, j4)) {
                C1166s c1166s = e5.f9602o;
                if (c1166s != null) {
                    c1166s.f10330M.f(e5, true);
                }
                e5.V();
                return false;
            }
        }
        this.f9640s = new M0.a(j4);
        q0(j4);
        this.f9644w.f9619f = false;
        I.d v4 = e5.v();
        int i4 = v4.f3332i;
        if (i4 > 0) {
            Object[] objArr = v4.f3330d;
            int i5 = 0;
            do {
                J j5 = ((E) objArr[i5]).f9584C.f9692s;
                Intrinsics.c(j5);
                j5.f9644w.f9616c = false;
                Unit unit = Unit.f7487a;
                i5++;
            } while (i5 < i4);
        }
        long c4 = this.f9639r ? this.f9007i : u3.d.c(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f9639r = true;
        P M02 = l4.a().M0();
        if (!(M02 != null)) {
            AbstractC0864b.D("Lookahead result from lookaheadRemeasure cannot be null");
            throw null;
        }
        l4.f9676c = 2;
        l4.f9680g = false;
        i0 snapshotObserver = ((C1166s) H.a(e5)).getSnapshotObserver();
        I0.d dVar = new I0.d(i2, j4, l4);
        snapshotObserver.getClass();
        if (e5.f9596i != null) {
            snapshotObserver.a(e5, snapshotObserver.f9808b, dVar);
        } else {
            snapshotObserver.a(e5, snapshotObserver.f9809c, dVar);
        }
        l4.f9681h = true;
        l4.f9682i = true;
        if (AbstractC1065f.r(e5)) {
            l4.f9678e = true;
            l4.f9679f = true;
        } else {
            l4.f9677d = true;
        }
        l4.f9676c = 5;
        p0(u3.d.c(M02.f9005d, M02.f9006e));
        return (((int) (c4 >> 32)) == M02.f9005d && ((int) (4294967295L & c4)) == M02.f9006e) ? false : true;
    }

    @Override // r0.U
    public final void z(boolean z4) {
        P M02;
        L l4 = this.f9632D;
        P M03 = l4.a().M0();
        if (Boolean.valueOf(z4).equals(M03 != null ? Boolean.valueOf(M03.f9701l) : null) || (M02 = l4.a().M0()) == null) {
            return;
        }
        M02.f9701l = z4;
    }
}
