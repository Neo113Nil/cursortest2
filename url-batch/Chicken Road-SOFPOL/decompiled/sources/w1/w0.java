package w1;

import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class w0 extends u1.l0 implements u1.d0, a, y0 {
    public boolean C;
    public float G;
    public boolean H;
    public p6.c I;
    public float K;
    public boolean M;
    public final j0 i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7800j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7803m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7804n;

    /* renamed from: q, reason: collision with root package name */
    public p6.c f7807q;

    /* renamed from: r, reason: collision with root package name */
    public float f7808r;

    /* renamed from: t, reason: collision with root package name */
    public Object f7810t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7811u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7812v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7813w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f7814x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7815y;

    /* renamed from: k, reason: collision with root package name */
    public int f7801k = Integer.MAX_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f7802l = Integer.MAX_VALUE;

    /* renamed from: o, reason: collision with root package name */
    public d0 f7805o = d0.f7612f;

    /* renamed from: p, reason: collision with root package name */
    public long f7806p = 0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7809s = true;

    /* renamed from: z, reason: collision with root package name */
    public final g0 f7816z = new g0(this, 0);
    public final o0.e A = new o0.e(new w0[16]);
    public boolean B = true;
    public long D = r2.b.b(0, 0, 15);
    public final v0 E = new v0(this, 1);
    public final v0 F = new v0(this, 0);
    public long J = 0;
    public final v0 L = new v0(this, 2);

    public w0(j0 j0Var) {
        this.i = j0Var;
    }

    @Override // w1.a
    public final boolean A() {
        return this.f7811u;
    }

    @Override // w1.a
    public final void N() {
        f0.U(this.i.f7686a, false, 7);
    }

    @Override // w1.a
    public final void P(b1.e eVar) {
        o0.e x7 = this.i.f7686a.x();
        Object[] objArr = x7.f5578d;
        int i = x7.f5580f;
        for (int i8 = 0; i8 < i; i8++) {
            eVar.i(((f0) objArr[i8]).G.f7700p);
        }
    }

    @Override // u1.l0
    public final int Q() {
        return this.i.a().Q();
    }

    @Override // u1.l0
    public final int S() {
        return this.i.a().S();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x002d, B:10:0x0031, B:14:0x004d, B:16:0x0055, B:18:0x0063, B:20:0x006e, B:21:0x0072, B:22:0x0059, B:23:0x003d, B:25:0x0043, B:27:0x0047, B:28:0x0049, B:29:0x0086, B:31:0x008a, B:35:0x0092, B:36:0x0097, B:41:0x001a, B:43:0x001e, B:45:0x0022, B:47:0x002a, B:48:0x0026), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x002d, B:10:0x0031, B:14:0x004d, B:16:0x0055, B:18:0x0063, B:20:0x006e, B:21:0x0072, B:22:0x0059, B:23:0x003d, B:25:0x0043, B:27:0x0047, B:28:0x0049, B:29:0x0086, B:31:0x008a, B:35:0x0092, B:36:0x0097, B:41:0x001a, B:43:0x001e, B:45:0x0022, B:47:0x002a, B:48:0x0026), top: B:2:0x0007 }] */
    @Override // u1.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(long j7, float f6, p6.c cVar) {
        s0 s0Var;
        s0 s0Var2;
        boolean z3;
        u1.k0 placementScope;
        j0 j0Var = this.i;
        f0 f0Var = j0Var.f7686a;
        f0 f0Var2 = j0Var.f7686a;
        boolean z7 = true;
        try {
            this.f7812v = true;
            if (r2.i.a(j7, this.f7806p)) {
                if (this.M) {
                }
                s0Var = j0Var.f7701q;
                if (s0Var != null) {
                    j0 j0Var2 = s0Var.i;
                    if (f.q(j0Var2.f7686a)) {
                        z3 = true;
                    } else {
                        if (s0Var.f7771s == p0.f7750f && !j0Var2.f7687b) {
                            j0Var2.f7688c = true;
                        }
                        z3 = j0Var2.f7688c;
                    }
                    if (z3) {
                        d1 d1Var = j0Var.a().f7616t;
                        if (d1Var == null || (placementScope = d1Var.f7731o) == null) {
                            placementScope = ((x1.t) i0.a(f0Var2)).getPlacementScope();
                        }
                        s0 s0Var3 = j0Var.f7701q;
                        q6.i.b(s0Var3);
                        f0 s5 = f0Var2.s();
                        if (s5 != null) {
                            s5.G.f7693h = 0;
                        }
                        s0Var3.f7764l = Integer.MAX_VALUE;
                        u1.k0.g(placementScope, s0Var3, (int) (j7 >> 32), (int) (4294967295L & j7));
                    }
                }
                s0Var2 = j0Var.f7701q;
                if (s0Var2 != null || s0Var2.f7766n) {
                    z7 = false;
                }
                if (z7) {
                    t1.a.b("Error: Placement happened before lookahead.");
                }
                j0(j7, f6, cVar);
            }
            if (j0Var.f7695k || j0Var.f7694j || this.M) {
                this.f7814x = true;
                this.M = false;
            }
            g0();
            s0Var = j0Var.f7701q;
            if (s0Var != null) {
            }
            s0Var2 = j0Var.f7701q;
            if (s0Var2 != null) {
            }
            z7 = false;
            if (z7) {
            }
            j0(j7, f6, cVar);
        } catch (Throwable th) {
            f0Var.X(th);
            throw null;
        }
    }

    public final List Z() {
        j0 j0Var = this.i;
        j0Var.f7686a.d0();
        boolean z3 = this.B;
        o0.e eVar = this.A;
        if (!z3) {
            return eVar.f();
        }
        f0 f0Var = j0Var.f7686a;
        o0.e x7 = f0Var.x();
        Object[] objArr = x7.f5578d;
        int i = x7.f5580f;
        for (int i8 = 0; i8 < i; i8++) {
            f0 f0Var2 = (f0) objArr[i8];
            if (eVar.f5580f <= i8) {
                eVar.b(f0Var2.G.f7700p);
            } else {
                w0 w0Var = f0Var2.G.f7700p;
                Object[] objArr2 = eVar.f5578d;
                Object obj = objArr2[i8];
                objArr2[i8] = w0Var;
            }
        }
        eVar.l(((o0.b) f0Var.m()).f5572d.f5580f, eVar.f5580f);
        this.B = false;
        return eVar.f();
    }

    @Override // w1.a
    public final g0 a() {
        return this.f7816z;
    }

    public final void b0() {
        boolean z3 = this.f7811u;
        this.f7811u = true;
        f0 f0Var = this.i.f7686a;
        b1 b1Var = f0Var.F;
        if (!z3) {
            b1Var.f7597c.R0();
            if (f0Var.p()) {
                f0.U(f0Var, true, 6);
            } else if (f0Var.G.f7690e) {
                f0.S(f0Var, true, 6);
            }
        }
        d1 d1Var = b1Var.f7597c.f7615s;
        for (d1 d1Var2 = b1Var.f7598d; !q6.i.a(d1Var2, d1Var) && d1Var2 != null; d1Var2 = d1Var2.f7615s) {
            if (d1Var2.K) {
                d1Var2.L0();
            }
        }
        o0.e x7 = f0Var.x();
        Object[] objArr = x7.f5578d;
        int i = x7.f5580f;
        for (int i8 = 0; i8 < i; i8++) {
            f0 f0Var2 = (f0) objArr[i8];
            if (f0Var2.t() != Integer.MAX_VALUE) {
                f0Var2.G.f7700p.b0();
                f0.V(f0Var2);
            }
        }
    }

    @Override // u1.d0
    public final u1.l0 e(long j7) {
        d0 d0Var;
        j0 j0Var = this.i;
        f0 f0Var = j0Var.f7686a;
        d0 d0Var2 = f0Var.C;
        d0 d0Var3 = d0.f7612f;
        if (d0Var2 == d0Var3) {
            f0Var.e();
        }
        if (f.q(j0Var.f7686a)) {
            s0 s0Var = j0Var.f7701q;
            q6.i.b(s0Var);
            s0Var.f7765m = d0Var3;
            s0Var.e(j7);
        }
        f0 f0Var2 = j0Var.f7686a;
        f0 s5 = f0Var2.s();
        if (s5 != null) {
            j0 j0Var2 = s5.G;
            if (this.f7805o != d0Var3 && !f0Var2.E) {
                t1.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ordinal = j0Var2.f7689d.ordinal();
            if (ordinal == 0) {
                d0Var = d0.f7610d;
            } else {
                if (ordinal != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + j0Var2.f7689d);
                }
                d0Var = d0.f7611e;
            }
            this.f7805o = d0Var;
        } else {
            this.f7805o = d0Var3;
        }
        k0(j7);
        return this;
    }

    public final void f0() {
        if (this.f7811u) {
            this.f7811u = false;
            j0 j0Var = this.i;
            b1 b1Var = j0Var.f7686a.F;
            d1 d1Var = b1Var.f7597c.f7615s;
            for (d1 d1Var2 = b1Var.f7598d; !q6.i.a(d1Var2, d1Var) && d1Var2 != null; d1Var2 = d1Var2.f7615s) {
                y0.l G0 = d1Var2.G0(e1.g(1048576));
                if (G0 != null && (G0.f8706d.f8709g & 1048576) != 0) {
                    boolean g3 = e1.g(1048576);
                    y0.l E0 = d1Var2.E0();
                    if (g3 || (E0 = E0.f8710h) != null) {
                        for (y0.l G02 = d1Var2.G0(g3); G02 != null && (G02.f8709g & 1048576) != 0; G02 = G02.i) {
                            if ((G02.f8708f & 1048576) != 0) {
                                y0.l lVar = G02;
                                o0.e eVar = null;
                                while (lVar != null) {
                                    if ((lVar.f8708f & 1048576) != 0 && (lVar instanceof l)) {
                                        int i = 0;
                                        for (y0.l lVar2 = ((l) lVar).f7707s; lVar2 != null; lVar2 = lVar2.i) {
                                            if ((lVar2.f8708f & 1048576) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    lVar = lVar2;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new o0.e(new y0.l[16]);
                                                    }
                                                    if (lVar != null) {
                                                        eVar.b(lVar);
                                                        lVar = null;
                                                    }
                                                    eVar.b(lVar2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    lVar = f.f(eVar);
                                }
                            }
                            if (G02 != E0) {
                            }
                        }
                    }
                }
                d1Var2.X0();
            }
            o0.e x7 = j0Var.f7686a.x();
            Object[] objArr = x7.f5578d;
            int i8 = x7.f5580f;
            for (int i9 = 0; i9 < i8; i9++) {
                ((f0) objArr[i9]).G.f7700p.f0();
            }
        }
    }

    @Override // u1.l0, u1.d0
    public final Object g() {
        return this.f7810t;
    }

    public final void g0() {
        j0 j0Var = this.i;
        if (j0Var.f7696l > 0) {
            o0.e x7 = j0Var.f7686a.x();
            Object[] objArr = x7.f5578d;
            int i = x7.f5580f;
            for (int i8 = 0; i8 < i; i8++) {
                f0 f0Var = (f0) objArr[i8];
                j0 j0Var2 = f0Var.G;
                boolean z3 = j0Var2.f7694j;
                w0 w0Var = j0Var2.f7700p;
                if ((z3 || j0Var2.f7695k) && !w0Var.f7814x) {
                    f0Var.T(false);
                }
                w0Var.g0();
            }
        }
    }

    public final void h0() {
        this.H = true;
        j0 j0Var = this.i;
        f0 s5 = j0Var.f7686a.s();
        float f6 = m().D;
        f0 f0Var = j0Var.f7686a;
        b1 b1Var = f0Var.F;
        d1 d1Var = b1Var.f7598d;
        r rVar = b1Var.f7597c;
        while (d1Var != rVar) {
            q6.i.c(d1Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            x xVar = (x) d1Var;
            f6 += xVar.D;
            d1Var = xVar.f7615s;
        }
        if (f6 != this.G) {
            this.G = f6;
            if (s5 != null) {
                s5.N();
            }
            if (s5 != null) {
                s5.A();
            }
        }
        if (this.f7811u) {
            f0Var.F.f7597c.R0();
        } else {
            if (s5 != null) {
                s5.A();
            }
            b0();
            if (this.f7800j && s5 != null) {
                s5.T(false);
            }
        }
        if (s5 != null) {
            j0 j0Var2 = s5.G;
            if (!this.f7800j && j0Var2.f7689d == b0.f7592f) {
                if (this.f7802l != Integer.MAX_VALUE) {
                    t1.a.b("Place was called on a node which was placed already");
                }
                int i = j0Var2.i;
                this.f7802l = i;
                j0Var2.i = i + 1;
            }
        } else {
            this.f7802l = 0;
        }
        q();
    }

    public final void i0(long j7) {
        j0 j0Var = this.i;
        b0 b0Var = j0Var.f7689d;
        f0 f0Var = j0Var.f7686a;
        b0 b0Var2 = b0.f7594h;
        if (b0Var != b0Var2) {
            t1.a.b("layout state is not idle before measure starts");
        }
        this.D = j7;
        b0 b0Var3 = b0.f7590d;
        j0Var.f7689d = b0Var3;
        this.f7813w = false;
        m1 snapshotObserver = ((x1.t) i0.a(f0Var)).getSnapshotObserver();
        snapshotObserver.a(f0Var, snapshotObserver.f7720c, this.E);
        if (j0Var.f7689d == b0Var3) {
            this.f7814x = true;
            this.f7815y = true;
            j0Var.f7689d = b0Var2;
        }
    }

    public final void j0(long j7, float f6, p6.c cVar) {
        j0 j0Var = this.i;
        f0 f0Var = j0Var.f7686a;
        f0 f0Var2 = j0Var.f7686a;
        if (f0Var.O) {
            t1.a.a("place is called on a deactivated node");
        }
        j0Var.f7689d = b0.f7592f;
        this.f7806p = j7;
        this.f7808r = f6;
        this.f7807q = cVar;
        this.H = false;
        k1 a8 = i0.a(f0Var2);
        if (this.f7814x || !this.f7811u) {
            this.f7816z.f7669e = false;
            j0Var.f(false);
            this.I = cVar;
            this.J = j7;
            this.K = f6;
            m1 snapshotObserver = ((x1.t) a8).getSnapshotObserver();
            snapshotObserver.a(f0Var2, snapshotObserver.f7723f, this.L);
        } else {
            d1 a9 = j0Var.a();
            a9.V0(r2.i.c(j7, a9.f7234h), f6, cVar);
            h0();
        }
        j0Var.f7689d = b0.f7594h;
        this.f7804n = true;
    }

    @Override // w1.y0
    public final void k(boolean z3) {
        j0 j0Var = this.i;
        if (z3 != j0Var.a().f7728l) {
            j0Var.a().f7728l = z3;
            this.M = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[Catch: all -> 0x0010, LOOP:0: B:22:0x0052->B:23:0x0054, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0045, B:23:0x0054, B:25:0x0064, B:27:0x007e, B:29:0x0088, B:33:0x0094), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k0(long j7) {
        boolean z3;
        int i;
        int i8;
        long j8;
        j0 j0Var = this.i;
        f0 f0Var = j0Var.f7686a;
        f0 f0Var2 = j0Var.f7686a;
        try {
            if (f0Var.O) {
                t1.a.a("measure is called on a deactivated node");
            }
            k1 a8 = i0.a(f0Var2);
            f0 s5 = f0Var2.s();
            boolean z7 = true;
            if (!f0Var2.E && (s5 == null || !s5.E)) {
                z3 = false;
                f0Var2.E = z3;
                if (!f0Var2.p() && r2.a.b(this.f7233g, j7)) {
                    ((x1.t) a8).k(f0Var2, false);
                    f0Var2.W();
                    return false;
                }
                this.f7816z.f7668d = false;
                o0.e x7 = f0Var2.x();
                Object[] objArr = x7.f5578d;
                i = x7.f5580f;
                for (i8 = 0; i8 < i; i8++) {
                    ((f0) objArr[i8]).G.f7700p.f7816z.getClass();
                }
                this.f7803m = true;
                j8 = j0Var.a().f7232f;
                X(j7);
                i0(j7);
                if (r2.k.a(j0Var.a().f7232f, j8) && j0Var.a().f7230d == this.f7230d && j0Var.a().f7231e == this.f7231e) {
                    z7 = false;
                }
                W((j0Var.a().f7231e & 4294967295L) | (j0Var.a().f7230d << 32));
                return z7;
            }
            z3 = true;
            f0Var2.E = z3;
            if (!f0Var2.p()) {
                ((x1.t) a8).k(f0Var2, false);
                f0Var2.W();
                return false;
            }
            this.f7816z.f7668d = false;
            o0.e x72 = f0Var2.x();
            Object[] objArr2 = x72.f5578d;
            i = x72.f5580f;
            while (i8 < i) {
            }
            this.f7803m = true;
            j8 = j0Var.a().f7232f;
            X(j7);
            i0(j7);
            if (r2.k.a(j0Var.a().f7232f, j8)) {
                z7 = false;
            }
            W((j0Var.a().f7231e & 4294967295L) | (j0Var.a().f7230d << 32));
            return z7;
        } catch (Throwable th) {
            f0Var.X(th);
            throw null;
        }
    }

    @Override // w1.a
    public final r m() {
        return this.i.f7686a.F.f7597c;
    }

    @Override // w1.a
    public final a o() {
        j0 j0Var;
        f0 s5 = this.i.f7686a.s();
        if (s5 == null || (j0Var = s5.G) == null) {
            return null;
        }
        return j0Var.f7700p;
    }

    @Override // w1.a
    public final void q() {
        boolean z3;
        this.C = true;
        g0 g0Var = this.f7816z;
        g0Var.h();
        boolean z7 = this.f7814x;
        j0 j0Var = this.i;
        if (z7) {
            o0.e x7 = j0Var.f7686a.x();
            Object[] objArr = x7.f5578d;
            int i = x7.f5580f;
            for (int i8 = 0; i8 < i; i8++) {
                f0 f0Var = (f0) objArr[i8];
                boolean p7 = f0Var.p();
                j0 j0Var2 = f0Var.G;
                if (p7 && f0Var.q() == d0.f7610d) {
                    w0 w0Var = j0Var2.f7700p;
                    r2.a aVar = w0Var.f7803m ? new r2.a(w0Var.f7233g) : null;
                    if (aVar != null) {
                        if (f0Var.C == d0.f7612f) {
                            f0Var.e();
                        }
                        z3 = j0Var2.f7700p.k0(aVar.f6514a);
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        f0.U(j0Var.f7686a, false, 7);
                    }
                }
            }
        }
        if (this.f7815y || (!m().f7730n && this.f7814x)) {
            this.f7814x = false;
            b0 b0Var = j0Var.f7689d;
            j0Var.f7689d = b0.f7592f;
            j0Var.g(false);
            f0 f0Var2 = j0Var.f7686a;
            m1 snapshotObserver = ((x1.t) i0.a(f0Var2)).getSnapshotObserver();
            snapshotObserver.a(f0Var2, snapshotObserver.f7722e, this.F);
            j0Var.f7689d = b0Var;
            if (m().f7730n && j0Var.f7694j) {
                requestLayout();
            }
            this.f7815y = false;
        }
        if (g0Var.f7666b && g0Var.e()) {
            g0Var.g();
        }
        this.C = false;
    }

    @Override // w1.a
    public final void requestLayout() {
        this.i.f7686a.T(false);
    }
}
