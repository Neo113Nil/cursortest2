package r1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i0 extends p1.n0 implements p1.e0, a, t0 {
    public Object A;
    public boolean B;
    public final /* synthetic */ l0 C;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7786k;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7790o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7791p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7792q;

    /* renamed from: r, reason: collision with root package name */
    public m2.a f7793r;

    /* renamed from: t, reason: collision with root package name */
    public q6.c f7795t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7796u;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7800y;

    /* renamed from: l, reason: collision with root package name */
    public int f7787l = Integer.MAX_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f7788m = Integer.MAX_VALUE;

    /* renamed from: n, reason: collision with root package name */
    public int f7789n = 3;

    /* renamed from: s, reason: collision with root package name */
    public long f7794s = 0;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f7797v = new e0(this, 1);

    /* renamed from: w, reason: collision with root package name */
    public final i0.d f7798w = new i0.d(new i0[16]);

    /* renamed from: x, reason: collision with root package name */
    public boolean f7799x = true;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7801z = true;

    public i0(l0 l0Var) {
        this.C = l0Var;
        this.A = l0Var.f7848r.f7822v;
    }

    @Override // r1.a
    public final a A() {
        l0 l0Var;
        d0 s5 = this.C.f7831a.s();
        if (s5 == null || (l0Var = s5.B) == null) {
            return null;
        }
        return l0Var.f7849s;
    }

    @Override // r1.a
    public final void E() {
        i0.d v5;
        int i7;
        this.f7800y = true;
        e0 e0Var = this.f7797v;
        e0Var.h();
        l0 l0Var = this.C;
        boolean z8 = l0Var.f7838h;
        d0 d0Var = l0Var.f7831a;
        if (z8 && (i7 = (v5 = d0Var.v()).f4842h) > 0) {
            Object[] objArr = v5.f4840f;
            int i8 = 0;
            do {
                d0 d0Var2 = (d0) objArr[i8];
                l0 l0Var2 = d0Var2.B;
                if (l0Var2.f7837g && d0Var2.q() == 1) {
                    i0 i0Var = l0Var2.f7849s;
                    r6.k.c(i0Var);
                    i0 i0Var2 = l0Var2.f7849s;
                    m2.a aVar = i0Var2 != null ? i0Var2.f7793r : null;
                    r6.k.c(aVar);
                    if (i0Var.v0(aVar.f6306a)) {
                        d0.R(d0Var, false, 7);
                    }
                }
                i8++;
            } while (i8 < i7);
        }
        s sVar = l().P;
        r6.k.c(sVar);
        if (l0Var.f7839i || (!this.f7790o && !sVar.f7865m && l0Var.f7838h)) {
            l0Var.f7838h = false;
            int i9 = l0Var.f7833c;
            l0Var.f7833c = 4;
            g1 a3 = g0.a(d0Var);
            l0Var.g(false);
            i1 snapshotObserver = ((s1.r) a3).getSnapshotObserver();
            m.h hVar = new m.h(this, sVar, l0Var, 3);
            snapshotObserver.getClass();
            if (d0Var.f7721h != null) {
                snapshotObserver.a(d0Var, snapshotObserver.f7809h, hVar);
            } else {
                snapshotObserver.a(d0Var, snapshotObserver.f7806e, hVar);
            }
            l0Var.f7833c = i9;
            if (l0Var.f7845o && sVar.f7865m) {
                requestLayout();
            }
            l0Var.f7839i = false;
        }
        if (e0Var.f7757d) {
            e0Var.f7758e = true;
        }
        if (e0Var.f7755b && e0Var.e()) {
            e0Var.g();
        }
        this.f7800y = false;
    }

    @Override // r1.a
    public final boolean I() {
        return this.f7796u;
    }

    @Override // r1.t0
    public final void S(boolean z8) {
        p0 K0;
        l0 l0Var = this.C;
        p0 K02 = l0Var.a().K0();
        if (Boolean.valueOf(z8).equals(K02 != null ? Boolean.valueOf(K02.f7863k) : null) || (K0 = l0Var.a().K0()) == null) {
            return;
        }
        K0.f7863k = z8;
    }

    @Override // p1.e0
    public final int a0(int i7) {
        s0();
        p0 K0 = this.C.a().K0();
        r6.k.c(K0);
        return K0.a0(i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r1 != null ? r1.B.f7833c : 0) == 4) goto L14;
     */
    @Override // p1.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p1.n0 b(long j8) {
        l0 l0Var = this.C;
        d0 d0Var = l0Var.f7831a;
        d0 d0Var2 = l0Var.f7831a;
        d0 s5 = d0Var.s();
        int i7 = 2;
        if ((s5 != null ? s5.B.f7833c : 0) != 2) {
            d0 s8 = d0Var2.s();
        }
        l0Var.f7832b = false;
        d0 s9 = d0Var2.s();
        if (s9 != null) {
            l0 l0Var2 = s9.B;
            if (this.f7789n != 3 && !d0Var2.f7739z) {
                a.a.M("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                throw null;
            }
            int d8 = l.h.d(l0Var2.f7833c);
            if (d8 == 0 || d8 == 1) {
                i7 = 1;
            } else if (d8 != 2 && d8 != 3) {
                throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(a0.m.w(l0Var2.f7833c)));
            }
            this.f7789n = i7;
        } else {
            this.f7789n = 3;
        }
        if (d0Var2.J == 3) {
            d0Var2.f();
        }
        v0(j8);
        return this;
    }

    @Override // r1.a
    public final void b0() {
        d0.R(this.C.f7831a, false, 7);
    }

    @Override // p1.e0
    public final int c(int i7) {
        s0();
        p0 K0 = this.C.a().K0();
        r6.k.c(K0);
        return K0.c(i7);
    }

    @Override // p1.e0
    public final int d0(int i7) {
        s0();
        p0 K0 = this.C.a().K0();
        r6.k.c(K0);
        return K0.d0(i7);
    }

    @Override // p1.e0
    public final int e0(int i7) {
        s0();
        p0 K0 = this.C.a().K0();
        r6.k.c(K0);
        return K0.e0(i7);
    }

    @Override // p1.n0
    public final int f0(p1.l lVar) {
        l0 l0Var = this.C;
        d0 s5 = l0Var.f7831a.s();
        int i7 = s5 != null ? s5.B.f7833c : 0;
        e0 e0Var = this.f7797v;
        if (i7 == 2) {
            e0Var.f7756c = true;
        } else {
            d0 s8 = l0Var.f7831a.s();
            if ((s8 != null ? s8.B.f7833c : 0) == 4) {
                e0Var.f7757d = true;
            }
        }
        this.f7790o = true;
        p0 K0 = l0Var.a().K0();
        r6.k.c(K0);
        int f02 = K0.f0(lVar);
        this.f7790o = false;
        return f02;
    }

    @Override // p1.n0, p1.e0
    public final Object g() {
        return this.A;
    }

    @Override // r1.a
    public final void j(c1.a aVar) {
        i0.d v5 = this.C.f7831a.v();
        int i7 = v5.f4842h;
        if (i7 > 0) {
            Object[] objArr = v5.f4840f;
            int i8 = 0;
            do {
                i0 i0Var = ((d0) objArr[i8]).B.f7849s;
                r6.k.c(i0Var);
                aVar.f(i0Var);
                i8++;
            } while (i8 < i7);
        }
    }

    @Override // p1.n0
    public final void j0(long j8, float f9, q6.c cVar) {
        u0(j8, cVar);
    }

    @Override // r1.a
    public final t l() {
        return (t) this.C.f7831a.A.f3892c;
    }

    @Override // r1.a
    public final e0 o() {
        return this.f7797v;
    }

    public final void p0() {
        boolean z8 = this.f7796u;
        this.f7796u = true;
        l0 l0Var = this.C;
        if (!z8 && l0Var.f7837g) {
            d0.R(l0Var.f7831a, true, 6);
        }
        i0.d v5 = l0Var.f7831a.v();
        int i7 = v5.f4842h;
        if (i7 > 0) {
            Object[] objArr = v5.f4840f;
            int i8 = 0;
            do {
                d0 d0Var = (d0) objArr[i8];
                i0 i0Var = d0Var.B.f7849s;
                if (i0Var == null) {
                    throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                }
                if (i0Var.f7788m != Integer.MAX_VALUE) {
                    i0Var.p0();
                    d0.U(d0Var);
                }
                i8++;
            } while (i8 < i7);
        }
    }

    public final void q0() {
        if (this.f7796u) {
            int i7 = 0;
            this.f7796u = false;
            i0.d v5 = this.C.f7831a.v();
            int i8 = v5.f4842h;
            if (i8 > 0) {
                Object[] objArr = v5.f4840f;
                do {
                    i0 i0Var = ((d0) objArr[i7]).B.f7849s;
                    r6.k.c(i0Var);
                    i0Var.q0();
                    i7++;
                } while (i7 < i8);
            }
        }
    }

    public final void r0() {
        i0.d v5;
        int i7;
        l0 l0Var = this.C;
        if (l0Var.f7847q <= 0 || (i7 = (v5 = l0Var.f7831a.v()).f4842h) <= 0) {
            return;
        }
        Object[] objArr = v5.f4840f;
        int i8 = 0;
        do {
            d0 d0Var = (d0) objArr[i8];
            l0 l0Var2 = d0Var.B;
            if ((l0Var2.f7845o || l0Var2.f7846p) && !l0Var2.f7838h) {
                d0Var.Q(false);
            }
            i0 i0Var = l0Var2.f7849s;
            if (i0Var != null) {
                i0Var.r0();
            }
            i8++;
        } while (i8 < i7);
    }

    @Override // r1.a
    public final void requestLayout() {
        this.C.f7831a.Q(false);
    }

    public final void s0() {
        int i7;
        l0 l0Var = this.C;
        d0.R(l0Var.f7831a, false, 7);
        d0 d0Var = l0Var.f7831a;
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

    public final void t0() {
        l0 l0Var;
        int i7;
        this.B = true;
        d0 s5 = this.C.f7831a.s();
        if (!this.f7796u) {
            p0();
            if (this.f7786k && s5 != null) {
                s5.Q(false);
            }
        }
        if (s5 == null) {
            this.f7788m = 0;
        } else if (!this.f7786k && ((i7 = (l0Var = s5.B).f7833c) == 3 || i7 == 4)) {
            if (this.f7788m != Integer.MAX_VALUE) {
                a.a.M("Place was called on a node which was placed already");
                throw null;
            }
            int i8 = l0Var.f7840j;
            this.f7788m = i8;
            l0Var.f7840j = i8 + 1;
        }
        E();
    }

    public final void u0(long j8, q6.c cVar) {
        l0 l0Var = this.C;
        d0 d0Var = l0Var.f7831a;
        d0 d0Var2 = l0Var.f7831a;
        if (d0Var.I) {
            a.a.L("place is called on a deactivated node");
            throw null;
        }
        l0Var.f7833c = 4;
        this.f7791p = true;
        this.B = false;
        if (!m2.h.a(j8, this.f7794s)) {
            if (l0Var.f7846p || l0Var.f7845o) {
                l0Var.f7838h = true;
            }
            r0();
        }
        g1 a3 = g0.a(d0Var2);
        if (l0Var.f7838h || !this.f7796u) {
            l0Var.f(false);
            this.f7797v.f7760g = false;
            i1 snapshotObserver = ((s1.r) a3).getSnapshotObserver();
            h0 h0Var = new h0(l0Var, a3, j8);
            snapshotObserver.getClass();
            if (d0Var2.f7721h != null) {
                snapshotObserver.a(d0Var2, snapshotObserver.f7808g, h0Var);
            } else {
                snapshotObserver.a(d0Var2, snapshotObserver.f7807f, h0Var);
            }
        } else {
            p0 K0 = l0Var.a().K0();
            r6.k.c(K0);
            K0.C0(m2.h.c(j8, K0.f7067j));
            t0();
        }
        this.f7794s = j8;
        this.f7795t = cVar;
        l0Var.f7833c = 5;
    }

    public final boolean v0(long j8) {
        l0 l0Var = this.C;
        d0 d0Var = l0Var.f7831a;
        d0 d0Var2 = l0Var.f7831a;
        if (d0Var.I) {
            a.a.L("measure is called on a deactivated node");
            throw null;
        }
        d0 s5 = d0Var.s();
        d0Var2.f7739z = d0Var2.f7739z || (s5 != null && s5.f7739z);
        if (!d0Var2.B.f7837g) {
            m2.a aVar = this.f7793r;
            if (aVar == null ? false : m2.a.b(aVar.f6306a, j8)) {
                g1 g1Var = d0Var2.f7727n;
                if (g1Var != null) {
                    ((s1.r) g1Var).L.f(d0Var2, true);
                }
                d0Var2.V();
                return false;
            }
        }
        this.f7793r = new m2.a(j8);
        o0(j8);
        this.f7797v.f7759f = false;
        i0.d v5 = d0Var2.v();
        int i7 = v5.f4842h;
        if (i7 > 0) {
            Object[] objArr = v5.f4840f;
            int i8 = 0;
            do {
                i0 i0Var = ((d0) objArr[i8]).B.f7849s;
                r6.k.c(i0Var);
                i0Var.f7797v.f7756c = false;
                i8++;
            } while (i8 < i7);
        }
        long G = this.f7792q ? this.f7065h : j1.c.G(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f7792q = true;
        p0 K0 = l0Var.a().K0();
        if (!(K0 != null)) {
            a.a.M("Lookahead result from lookaheadRemeasure cannot be null");
            throw null;
        }
        l0Var.f7833c = 2;
        l0Var.f7837g = false;
        i1 snapshotObserver = ((s1.r) g0.a(d0Var2)).getSnapshotObserver();
        k0 k0Var = new k0(l0Var, j8);
        snapshotObserver.getClass();
        if (d0Var2.f7721h != null) {
            snapshotObserver.a(d0Var2, snapshotObserver.f7803b, k0Var);
        } else {
            snapshotObserver.a(d0Var2, snapshotObserver.f7804c, k0Var);
        }
        l0Var.f7838h = true;
        l0Var.f7839i = true;
        if (f.p(d0Var2)) {
            l0Var.f7835e = true;
            l0Var.f7836f = true;
        } else {
            l0Var.f7834d = true;
        }
        l0Var.f7833c = 5;
        m0(j1.c.G(K0.f7063f, K0.f7064g));
        return (((int) (G >> 32)) == K0.f7063f && ((int) (4294967295L & G)) == K0.f7064g) ? false : true;
    }
}
