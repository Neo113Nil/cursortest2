package r1;

import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j0 extends p1.n0 implements p1.e0, a, t0 {
    public boolean B;
    public float D;
    public boolean E;
    public q6.c F;
    public float H;
    public final a0.b1 I;
    public boolean J;
    public final /* synthetic */ l0 K;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7811k;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7814n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7815o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7817q;

    /* renamed from: s, reason: collision with root package name */
    public q6.c f7819s;

    /* renamed from: t, reason: collision with root package name */
    public float f7820t;

    /* renamed from: v, reason: collision with root package name */
    public Object f7822v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7823w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f7824x;

    /* renamed from: l, reason: collision with root package name */
    public int f7812l = Integer.MAX_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f7813m = Integer.MAX_VALUE;

    /* renamed from: p, reason: collision with root package name */
    public int f7816p = 3;

    /* renamed from: r, reason: collision with root package name */
    public long f7818r = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7821u = true;

    /* renamed from: y, reason: collision with root package name */
    public final e0 f7825y = new e0(this, 0);

    /* renamed from: z, reason: collision with root package name */
    public final i0.d f7826z = new i0.d(new j0[16]);
    public boolean A = true;
    public final androidx.lifecycle.r0 C = new androidx.lifecycle.r0(27, this);
    public long G = 0;

    public j0(l0 l0Var) {
        this.K = l0Var;
        this.I = new a0.b1(l0Var, 6, this);
    }

    @Override // r1.a
    public final a A() {
        l0 l0Var;
        d0 s5 = this.K.f7831a.s();
        if (s5 == null || (l0Var = s5.B) == null) {
            return null;
        }
        return l0Var.f7848r;
    }

    @Override // r1.a
    public final void E() {
        i0.d v5;
        int i7;
        this.B = true;
        e0 e0Var = this.f7825y;
        e0Var.h();
        l0 l0Var = this.K;
        d0 d0Var = l0Var.f7831a;
        if (l0Var.f7835e && (i7 = (v5 = d0Var.v()).f4842h) > 0) {
            Object[] objArr = v5.f4840f;
            int i8 = 0;
            do {
                d0 d0Var2 = (d0) objArr[i8];
                l0 l0Var2 = d0Var2.B;
                if (l0Var2.f7834d && l0Var2.f7848r.f7816p == 1 && d0.M(d0Var2)) {
                    d0.T(d0Var, false, 7);
                }
                i8++;
            } while (i8 < i7);
        }
        if (l0Var.f7836f || (!this.f7817q && !l().f7865m && l0Var.f7835e)) {
            l0Var.f7835e = false;
            int i9 = l0Var.f7833c;
            l0Var.f7833c = 3;
            l0Var.e(false);
            i1 snapshotObserver = ((s1.r) g0.a(d0Var)).getSnapshotObserver();
            snapshotObserver.a(d0Var, snapshotObserver.f7806e, this.C);
            l0Var.f7833c = i9;
            if (l().f7865m && l0Var.f7842l) {
                requestLayout();
            }
            l0Var.f7836f = false;
        }
        if (e0Var.f7757d) {
            e0Var.f7758e = true;
        }
        if (e0Var.f7755b && e0Var.e()) {
            e0Var.g();
        }
        this.B = false;
    }

    @Override // r1.a
    public final boolean I() {
        return this.f7823w;
    }

    @Override // r1.t0
    public final void S(boolean z8) {
        l0 l0Var = this.K;
        boolean z9 = l0Var.a().f7863k;
        if (z8 != z9) {
            l0Var.a().f7863k = z9;
            this.J = true;
        }
    }

    @Override // p1.e0
    public final int a0(int i7) {
        t0();
        return this.K.a().a0(i7);
    }

    @Override // p1.e0
    public final p1.n0 b(long j8) {
        int i7;
        l0 l0Var = this.K;
        d0 d0Var = l0Var.f7831a;
        if (d0Var.J == 3) {
            d0Var.f();
        }
        if (f.p(d0Var)) {
            i0 i0Var = l0Var.f7849s;
            r6.k.c(i0Var);
            i0Var.f7789n = 3;
            i0Var.b(j8);
        }
        d0 s5 = d0Var.s();
        if (s5 != null) {
            l0 l0Var2 = s5.B;
            if (this.f7816p != 3 && !d0Var.f7739z) {
                a.a.M("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                throw null;
            }
            int d8 = l.h.d(l0Var2.f7833c);
            if (d8 != 0) {
                i7 = 2;
                if (d8 != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(a0.m.w(l0Var2.f7833c)));
                }
            } else {
                i7 = 1;
            }
            this.f7816p = i7;
        } else {
            this.f7816p = 3;
        }
        w0(j8);
        return this;
    }

    @Override // r1.a
    public final void b0() {
        d0.T(this.K.f7831a, false, 7);
    }

    @Override // p1.e0
    public final int c(int i7) {
        t0();
        return this.K.a().c(i7);
    }

    @Override // p1.e0
    public final int d0(int i7) {
        t0();
        return this.K.a().d0(i7);
    }

    @Override // p1.e0
    public final int e0(int i7) {
        t0();
        return this.K.a().e0(i7);
    }

    @Override // p1.n0
    public final int f0(p1.l lVar) {
        l0 l0Var = this.K;
        d0 d0Var = l0Var.f7831a;
        d0 s5 = d0Var.s();
        int i7 = s5 != null ? s5.B.f7833c : 0;
        e0 e0Var = this.f7825y;
        if (i7 == 1) {
            e0Var.f7756c = true;
        } else {
            d0 s8 = d0Var.s();
            if ((s8 != null ? s8.B.f7833c : 0) == 3) {
                e0Var.f7757d = true;
            }
        }
        this.f7817q = true;
        int f02 = l0Var.a().f0(lVar);
        this.f7817q = false;
        return f02;
    }

    @Override // p1.n0, p1.e0
    public final Object g() {
        return this.f7822v;
    }

    @Override // r1.a
    public final void j(c1.a aVar) {
        i0.d v5 = this.K.f7831a.v();
        int i7 = v5.f4842h;
        if (i7 > 0) {
            Object[] objArr = v5.f4840f;
            int i8 = 0;
            do {
                aVar.f(((d0) objArr[i8]).B.f7848r);
                i8++;
            } while (i8 < i7);
        }
    }

    @Override // p1.n0
    public final void j0(long j8, float f9, q6.c cVar) {
        p1.m0 placementScope;
        l0 l0Var = this.K;
        d0 d0Var = l0Var.f7831a;
        this.f7824x = true;
        if (!m2.h.a(j8, this.f7818r) || this.J) {
            if (l0Var.f7843m || l0Var.f7842l || this.J) {
                l0Var.f7835e = true;
                this.J = false;
            }
            s0();
        }
        if (f.p(d0Var)) {
            a1 a1Var = l0Var.a().f7702s;
            if (a1Var == null || (placementScope = a1Var.f7866n) == null) {
                placementScope = ((s1.r) g0.a(d0Var)).getPlacementScope();
            }
            i0 i0Var = l0Var.f7849s;
            r6.k.c(i0Var);
            d0 s5 = d0Var.s();
            if (s5 != null) {
                s5.B.f7840j = 0;
            }
            i0Var.f7788m = Integer.MAX_VALUE;
            p1.m0.d(placementScope, i0Var, (int) (j8 >> 32), (int) (4294967295L & j8));
        }
        i0 i0Var2 = l0Var.f7849s;
        if (i0Var2 == null || i0Var2.f7791p) {
            v0(j8, f9, cVar);
        } else {
            a.a.M("Error: Placement happened before lookahead.");
            throw null;
        }
    }

    @Override // r1.a
    public final t l() {
        return (t) this.K.f7831a.A.f3892c;
    }

    @Override // r1.a
    public final e0 o() {
        return this.f7825y;
    }

    public final List p0() {
        d0 d0Var = this.K.f7831a;
        d0Var.a0();
        boolean z8 = this.A;
        i0.d dVar = this.f7826z;
        if (!z8) {
            return dVar.g();
        }
        i0.d v5 = d0Var.v();
        int i7 = v5.f4842h;
        if (i7 > 0) {
            Object[] objArr = v5.f4840f;
            int i8 = 0;
            do {
                d0 d0Var2 = (d0) objArr[i8];
                if (dVar.f4842h <= i8) {
                    dVar.b(d0Var2.B.f7848r);
                } else {
                    j0 j0Var = d0Var2.B.f7848r;
                    Object[] objArr2 = dVar.f4840f;
                    Object obj = objArr2[i8];
                    objArr2[i8] = j0Var;
                }
                i8++;
            } while (i8 < i7);
        }
        dVar.p(((i0.a) d0Var.n()).f4834f.f4842h, dVar.f4842h);
        this.A = false;
        return dVar.g();
    }

    public final void q0() {
        boolean z8 = this.f7823w;
        this.f7823w = true;
        d0 d0Var = this.K.f7831a;
        if (!z8) {
            l0 l0Var = d0Var.B;
            if (l0Var.f7834d) {
                d0.T(d0Var, true, 6);
            } else if (l0Var.f7837g) {
                d0.R(d0Var, true, 6);
            }
        }
        g0.t tVar = d0Var.A;
        a1 a1Var = ((t) tVar.f3892c).f7701r;
        for (a1 a1Var2 = (a1) tVar.f3893d; !r6.k.a(a1Var2, a1Var) && a1Var2 != null; a1Var2 = a1Var2.f7701r) {
            if (a1Var2.H) {
                a1Var2.S0();
            }
        }
        i0.d v5 = d0Var.v();
        int i7 = v5.f4842h;
        if (i7 > 0) {
            Object[] objArr = v5.f4840f;
            int i8 = 0;
            do {
                d0 d0Var2 = (d0) objArr[i8];
                if (d0Var2.t() != Integer.MAX_VALUE) {
                    d0Var2.B.f7848r.q0();
                    d0.U(d0Var2);
                }
                i8++;
            } while (i8 < i7);
        }
    }

    public final void r0() {
        d0 d0Var = this.K.f7831a;
        if (this.f7823w) {
            int i7 = 0;
            this.f7823w = false;
            g0.t tVar = d0Var.A;
            a1 a1Var = ((t) tVar.f3892c).f7701r;
            for (a1 a1Var2 = (a1) tVar.f3893d; !r6.k.a(a1Var2, a1Var) && a1Var2 != null; a1Var2 = a1Var2.f7701r) {
                if (a1Var2.I != null) {
                    a1Var2.h1(null, false);
                    a1Var2.f7700q.S(false);
                }
            }
            i0.d v5 = d0Var.v();
            int i8 = v5.f4842h;
            if (i8 > 0) {
                Object[] objArr = v5.f4840f;
                do {
                    ((d0) objArr[i7]).B.f7848r.r0();
                    i7++;
                } while (i7 < i8);
            }
        }
    }

    @Override // r1.a
    public final void requestLayout() {
        this.K.f7831a.S(false);
    }

    public final void s0() {
        i0.d v5;
        int i7;
        l0 l0Var = this.K;
        if (l0Var.f7844n <= 0 || (i7 = (v5 = l0Var.f7831a.v()).f4842h) <= 0) {
            return;
        }
        Object[] objArr = v5.f4840f;
        int i8 = 0;
        do {
            d0 d0Var = (d0) objArr[i8];
            l0 l0Var2 = d0Var.B;
            if ((l0Var2.f7842l || l0Var2.f7843m) && !l0Var2.f7835e) {
                d0Var.S(false);
            }
            l0Var2.f7848r.s0();
            i8++;
        } while (i8 < i7);
    }

    public final void t0() {
        int i7;
        d0 d0Var = this.K.f7831a;
        d0.T(d0Var, false, 7);
        d0 s5 = d0Var.s();
        if (s5 == null || d0Var.J != 3) {
            return;
        }
        int d8 = l.h.d(s5.B.f7833c);
        if (d8 != 0) {
            i7 = 2;
            if (d8 != 2) {
                i7 = s5.J;
            }
        } else {
            i7 = 1;
        }
        d0Var.J = i7;
    }

    public final void u0() {
        this.E = true;
        d0 d0Var = this.K.f7831a;
        d0 s5 = d0Var.s();
        float f9 = l().C;
        g0.t tVar = d0Var.A;
        a1 a1Var = (a1) tVar.f3893d;
        t tVar2 = (t) tVar.f3892c;
        while (a1Var != tVar2) {
            r6.k.d(a1Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            y yVar = (y) a1Var;
            f9 += yVar.C;
            a1Var = yVar.f7701r;
        }
        if (f9 != this.D) {
            this.D = f9;
            if (s5 != null) {
                s5.K();
            }
            if (s5 != null) {
                s5.y();
            }
        }
        if (!this.f7823w) {
            if (s5 != null) {
                s5.y();
            }
            q0();
            if (this.f7811k && s5 != null) {
                s5.S(false);
            }
        }
        if (s5 == null) {
            this.f7813m = 0;
        } else if (!this.f7811k) {
            l0 l0Var = s5.B;
            if (l0Var.f7833c == 3) {
                if (this.f7813m != Integer.MAX_VALUE) {
                    a.a.M("Place was called on a node which was placed already");
                    throw null;
                }
                int i7 = l0Var.f7841k;
                this.f7813m = i7;
                l0Var.f7841k = i7 + 1;
            }
        }
        E();
    }

    public final void v0(long j8, float f9, q6.c cVar) {
        l0 l0Var = this.K;
        d0 d0Var = l0Var.f7831a;
        if (d0Var.I) {
            a.a.L("place is called on a deactivated node");
            throw null;
        }
        l0Var.f7833c = 3;
        this.f7818r = j8;
        this.f7820t = f9;
        this.f7819s = cVar;
        this.f7815o = true;
        this.E = false;
        g1 a3 = g0.a(d0Var);
        if (l0Var.f7835e || !this.f7823w) {
            this.f7825y.f7760g = false;
            l0Var.d(false);
            this.F = cVar;
            this.G = j8;
            this.H = f9;
            i1 snapshotObserver = ((s1.r) a3).getSnapshotObserver();
            snapshotObserver.a(d0Var, snapshotObserver.f7807f, this.I);
        } else {
            a1 a9 = l0Var.a();
            a9.Z0(m2.h.c(j8, a9.f7067j), f9, cVar);
            u0();
        }
        l0Var.f7833c = 5;
    }

    public final boolean w0(long j8) {
        l0 l0Var = this.K;
        d0 d0Var = l0Var.f7831a;
        if (d0Var.I) {
            a.a.L("measure is called on a deactivated node");
            throw null;
        }
        g1 a3 = g0.a(d0Var);
        d0 s5 = d0Var.s();
        boolean z8 = true;
        d0Var.f7739z = d0Var.f7739z || (s5 != null && s5.f7739z);
        if (!d0Var.B.f7834d && m2.a.b(this.f7066i, j8)) {
            ((s1.r) a3).L.f(d0Var, false);
            d0Var.V();
            return false;
        }
        this.f7825y.f7759f = false;
        i0.d v5 = d0Var.v();
        int i7 = v5.f4842h;
        if (i7 > 0) {
            Object[] objArr = v5.f4840f;
            int i8 = 0;
            do {
                ((d0) objArr[i8]).B.f7848r.f7825y.f7756c = false;
                i8++;
            } while (i8 < i7);
        }
        this.f7814n = true;
        long j9 = l0Var.a().f7065h;
        o0(j8);
        if (l0Var.f7833c != 5) {
            a.a.M("layout state is not idle before measure starts");
            throw null;
        }
        l0Var.f7833c = 1;
        l0Var.f7834d = false;
        l0Var.f7850t = j8;
        i1 snapshotObserver = ((s1.r) g0.a(d0Var)).getSnapshotObserver();
        snapshotObserver.a(d0Var, snapshotObserver.f7804c, l0Var.f7851u);
        if (l0Var.f7833c == 1) {
            l0Var.f7835e = true;
            l0Var.f7836f = true;
            l0Var.f7833c = 5;
        }
        if (m2.j.a(l0Var.a().f7065h, j9) && l0Var.a().f7063f == this.f7063f && l0Var.a().f7064g == this.f7064g) {
            z8 = false;
        }
        m0(j1.c.G(l0Var.a().f7063f, l0Var.a().f7064g));
        return z8;
    }
}
