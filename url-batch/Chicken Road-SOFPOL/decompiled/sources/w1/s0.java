package w1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class s0 extends u1.l0 implements u1.d0, a, y0 {
    public final j0 i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7762j;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7766n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7767o;

    /* renamed from: p, reason: collision with root package name */
    public r2.a f7768p;

    /* renamed from: r, reason: collision with root package name */
    public p6.c f7770r;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7775w;

    /* renamed from: y, reason: collision with root package name */
    public Object f7777y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7778z;

    /* renamed from: k, reason: collision with root package name */
    public int f7763k = Integer.MAX_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f7764l = Integer.MAX_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public d0 f7765m = d0.f7612f;

    /* renamed from: q, reason: collision with root package name */
    public long f7769q = 0;

    /* renamed from: s, reason: collision with root package name */
    public p0 f7771s = p0.f7750f;

    /* renamed from: t, reason: collision with root package name */
    public final g0 f7772t = new g0(this, 1);

    /* renamed from: u, reason: collision with root package name */
    public final o0.e f7773u = new o0.e(new s0[16]);

    /* renamed from: v, reason: collision with root package name */
    public boolean f7774v = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f7776x = true;

    public s0(j0 j0Var) {
        this.i = j0Var;
        this.f7777y = j0Var.f7700p.f7810t;
    }

    @Override // w1.a
    public final boolean A() {
        return this.f7771s != p0.f7750f;
    }

    @Override // w1.a
    public final void N() {
        f0.S(this.i.f7686a, false, 7);
    }

    @Override // w1.a
    public final void P(b1.e eVar) {
        o0.e x7 = this.i.f7686a.x();
        Object[] objArr = x7.f5578d;
        int i = x7.f5580f;
        for (int i8 = 0; i8 < i; i8++) {
            s0 s0Var = ((f0) objArr[i8]).G.f7701q;
            q6.i.b(s0Var);
            eVar.i(s0Var);
        }
    }

    @Override // u1.l0
    public final void U(long j7, float f6, p6.c cVar) {
        h0(j7, cVar);
    }

    public final void Z(boolean z3) {
        j0 j0Var = this.i;
        if (z3 && j0Var.f7688c) {
            return;
        }
        if (z3 || j0Var.f7688c) {
            this.f7771s = p0.f7750f;
            o0.e x7 = j0Var.f7686a.x();
            Object[] objArr = x7.f5578d;
            int i = x7.f5580f;
            for (int i8 = 0; i8 < i; i8++) {
                s0 s0Var = ((f0) objArr[i8]).G.f7701q;
                q6.i.b(s0Var);
                s0Var.Z(true);
            }
        }
    }

    @Override // w1.a
    public final g0 a() {
        return this.f7772t;
    }

    public final void b0() {
        p0 p0Var = this.f7771s;
        j0 j0Var = this.i;
        boolean z3 = j0Var.f7688c;
        f0 f0Var = j0Var.f7686a;
        p0 p0Var2 = p0.f7748d;
        if (z3) {
            this.f7771s = p0.f7749e;
        } else {
            this.f7771s = p0Var2;
        }
        if (p0Var != p0Var2 && j0Var.f7690e) {
            f0.S(f0Var, true, 6);
        }
        o0.e x7 = f0Var.x();
        Object[] objArr = x7.f5578d;
        int i = x7.f5580f;
        for (int i8 = 0; i8 < i; i8++) {
            f0 f0Var2 = (f0) objArr[i8];
            s0 s0Var = f0Var2.G.f7701q;
            if (s0Var == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (s0Var.f7764l != Integer.MAX_VALUE) {
                s0Var.b0();
                f0.V(f0Var2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r1 != null ? r1.G.f7689d : null) == w1.b0.f7593g) goto L13;
     */
    @Override // u1.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u1.l0 e(long j7) {
        d0 d0Var;
        j0 j0Var = this.i;
        f0 s5 = j0Var.f7686a.s();
        if ((s5 != null ? s5.G.f7689d : null) != b0.f7591e) {
            f0 s7 = j0Var.f7686a.s();
        }
        j0Var.f7687b = false;
        f0 f0Var = j0Var.f7686a;
        f0 s8 = f0Var.s();
        if (s8 != null) {
            j0 j0Var2 = s8.G;
            if (this.f7765m != d0.f7612f && !f0Var.E) {
                t1.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ordinal = j0Var2.f7689d.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                d0Var = d0.f7610d;
            } else {
                if (ordinal != 2 && ordinal != 3) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + j0Var2.f7689d);
                }
                d0Var = d0.f7611e;
            }
            this.f7765m = d0Var;
        } else {
            this.f7765m = d0.f7612f;
        }
        f0 f0Var2 = j0Var.f7686a;
        if (f0Var2.C == d0.f7612f) {
            f0Var2.e();
        }
        i0(j7);
        return this;
    }

    public final void f0() {
        j0 j0Var = this.i;
        if (j0Var.f7699o > 0) {
            o0.e x7 = j0Var.f7686a.x();
            Object[] objArr = x7.f5578d;
            int i = x7.f5580f;
            for (int i8 = 0; i8 < i; i8++) {
                f0 f0Var = (f0) objArr[i8];
                j0 j0Var2 = f0Var.G;
                if ((j0Var2.f7697m || j0Var2.f7698n) && !j0Var2.f7691f) {
                    f0Var.R(false);
                }
                s0 s0Var = j0Var2.f7701q;
                if (s0Var != null) {
                    s0Var.f0();
                }
            }
        }
    }

    @Override // u1.l0, u1.d0
    public final Object g() {
        return this.f7777y;
    }

    public final void g0() {
        b0 b0Var;
        this.f7778z = true;
        j0 j0Var = this.i;
        f0 s5 = j0Var.f7686a.s();
        p0 p0Var = this.f7771s;
        if ((p0Var != p0.f7748d && !j0Var.f7688c) || (p0Var != p0.f7749e && j0Var.f7688c)) {
            b0();
            if (this.f7762j && s5 != null) {
                s5.R(false);
            }
        }
        if (s5 != null) {
            j0 j0Var2 = s5.G;
            if (!this.f7762j && ((b0Var = j0Var2.f7689d) == b0.f7592f || b0Var == b0.f7593g)) {
                if (this.f7764l != Integer.MAX_VALUE) {
                    t1.a.b("Place was called on a node which was placed already");
                }
                int i = j0Var2.f7693h;
                this.f7764l = i;
                j0Var2.f7693h = i + 1;
            }
        } else {
            this.f7764l = 0;
        }
        q();
    }

    public final void h0(long j7, p6.c cVar) {
        j0 j0Var = this.i;
        f0 f0Var = j0Var.f7686a;
        f0 f0Var2 = j0Var.f7686a;
        try {
            f0 s5 = f0Var.s();
            b0 b0Var = s5 != null ? s5.G.f7689d : null;
            b0 b0Var2 = b0.f7593g;
            if (b0Var == b0Var2) {
                j0Var.f7688c = false;
            }
            if (f0Var2.O) {
                t1.a.a("place is called on a deactivated node");
            }
            j0Var.f7689d = b0Var2;
            this.f7766n = true;
            this.f7778z = false;
            if (!r2.i.a(j7, this.f7769q)) {
                if (j0Var.f7698n || j0Var.f7697m) {
                    j0Var.f7691f = true;
                }
                f0();
            }
            k1 a8 = i0.a(f0Var2);
            if (j0Var.f7691f || !A()) {
                j0Var.h(false);
                this.f7772t.f7669e = false;
                m1 snapshotObserver = ((x1.t) a8).getSnapshotObserver();
                r0 r0Var = new r0(this, a8, j7);
                snapshotObserver.getClass();
                if (f0Var2.f7644j != null) {
                    snapshotObserver.a(f0Var2, snapshotObserver.f7724g, r0Var);
                } else {
                    snapshotObserver.a(f0Var2, snapshotObserver.f7723f, r0Var);
                }
            } else {
                o0 C0 = j0Var.a().C0();
                q6.i.b(C0);
                C0.v0(r2.i.c(j7, C0.f7234h));
                g0();
            }
            this.f7769q = j7;
            this.f7770r = cVar;
            j0Var.f7689d = b0.f7594h;
        } catch (Throwable th) {
            f0Var.X(th);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0077, B:33:0x0082, B:34:0x008c, B:38:0x009d, B:39:0x00a2, B:41:0x00b8, B:46:0x0085), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064 A[Catch: all -> 0x0010, LOOP:0: B:28:0x0062->B:29:0x0064, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0077, B:33:0x0082, B:34:0x008c, B:38:0x009d, B:39:0x00a2, B:41:0x00b8, B:46:0x0085), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0077, B:33:0x0082, B:34:0x008c, B:38:0x009d, B:39:0x00a2, B:41:0x00b8, B:46:0x0085), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0077, B:33:0x0082, B:34:0x008c, B:38:0x009d, B:39:0x00a2, B:41:0x00b8, B:46:0x0085), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0077, B:33:0x0082, B:34:0x008c, B:38:0x009d, B:39:0x00a2, B:41:0x00b8, B:46:0x0085), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i0(long j7) {
        boolean z3;
        int i;
        int i8;
        long j8;
        o0 C0;
        j0 j0Var = this.i;
        f0 f0Var = j0Var.f7686a;
        f0 f0Var2 = j0Var.f7686a;
        try {
            if (f0Var.O) {
                t1.a.a("measure is called on a deactivated node");
            }
            f0 s5 = f0Var2.s();
            if (!f0Var2.E && (s5 == null || !s5.E)) {
                z3 = false;
                f0Var2.E = z3;
                if (!f0Var2.G.f7690e) {
                    r2.a aVar = this.f7768p;
                    if (aVar == null ? false : r2.a.b(aVar.f6514a, j7)) {
                        k1 k1Var = f0Var2.f7650p;
                        if (k1Var != null) {
                            ((x1.t) k1Var).k(f0Var2, true);
                        }
                        f0Var2.W();
                        return false;
                    }
                }
                this.f7768p = new r2.a(j7);
                X(j7);
                this.f7772t.f7668d = false;
                o0.e x7 = f0Var2.x();
                Object[] objArr = x7.f5578d;
                i = x7.f5580f;
                for (i8 = 0; i8 < i; i8++) {
                    s0 s0Var = ((f0) objArr[i8]).G.f7701q;
                    q6.i.b(s0Var);
                    s0Var.f7772t.getClass();
                }
                if (this.f7767o) {
                    long j9 = Integer.MIN_VALUE;
                    j8 = (j9 & 4294967295L) | (j9 << 32);
                } else {
                    j8 = this.f7232f;
                }
                this.f7767o = true;
                C0 = j0Var.a().C0();
                if (!(C0 == null)) {
                    t1.a.b("Lookahead result from lookaheadRemeasure cannot be null");
                }
                j0Var.c(j7);
                W((C0.f7231e & 4294967295L) | (C0.f7230d << 32));
                return ((int) (j8 >> 32)) == C0.f7230d || ((int) (j8 & 4294967295L)) != C0.f7231e;
            }
            z3 = true;
            f0Var2.E = z3;
            if (!f0Var2.G.f7690e) {
            }
            this.f7768p = new r2.a(j7);
            X(j7);
            this.f7772t.f7668d = false;
            o0.e x72 = f0Var2.x();
            Object[] objArr2 = x72.f5578d;
            i = x72.f5580f;
            while (i8 < i) {
            }
            if (this.f7767o) {
            }
            this.f7767o = true;
            C0 = j0Var.a().C0();
            if (!(C0 == null)) {
            }
            j0Var.c(j7);
            W((C0.f7231e & 4294967295L) | (C0.f7230d << 32));
            if (((int) (j8 >> 32)) == C0.f7230d) {
            }
        } catch (Throwable th) {
            f0Var.X(th);
            throw null;
        }
    }

    @Override // w1.y0
    public final void k(boolean z3) {
        o0 C0;
        j0 j0Var = this.i;
        o0 C02 = j0Var.a().C0();
        if (Boolean.valueOf(z3).equals(C02 != null ? Boolean.valueOf(C02.f7728l) : null) || (C0 = j0Var.a().C0()) == null) {
            return;
        }
        C0.f7728l = z3;
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
        return j0Var.f7701q;
    }

    @Override // w1.a
    public final void q() {
        this.f7775w = true;
        g0 g0Var = this.f7772t;
        g0Var.h();
        j0 j0Var = this.i;
        boolean z3 = j0Var.f7691f;
        f0 f0Var = j0Var.f7686a;
        if (z3) {
            o0.e x7 = f0Var.x();
            Object[] objArr = x7.f5578d;
            int i = x7.f5580f;
            for (int i8 = 0; i8 < i; i8++) {
                f0 f0Var2 = (f0) objArr[i8];
                j0 j0Var2 = f0Var2.G;
                if (j0Var2.f7690e && f0Var2.r() == d0.f7610d) {
                    s0 s0Var = j0Var2.f7701q;
                    q6.i.b(s0Var);
                    s0 s0Var2 = j0Var2.f7701q;
                    r2.a aVar = s0Var2 != null ? s0Var2.f7768p : null;
                    q6.i.b(aVar);
                    if (s0Var.i0(aVar.f6514a)) {
                        f0.S(f0Var, false, 7);
                    }
                }
            }
        }
        q qVar = m().R;
        q6.i.b(qVar);
        if (j0Var.f7692g || (!qVar.f7730n && j0Var.f7691f)) {
            j0Var.f7691f = false;
            b0 b0Var = j0Var.f7689d;
            j0Var.f7689d = b0.f7593g;
            k1 a8 = i0.a(f0Var);
            j0Var.i(false);
            m1 snapshotObserver = ((x1.t) a8).getSnapshotObserver();
            a2.b bVar = new a2.b(5, this, qVar);
            snapshotObserver.getClass();
            if (f0Var.f7644j != null) {
                snapshotObserver.a(f0Var, snapshotObserver.f7725h, bVar);
            } else {
                snapshotObserver.a(f0Var, snapshotObserver.f7722e, bVar);
            }
            j0Var.f7689d = b0Var;
            if (j0Var.f7697m && qVar.f7730n) {
                requestLayout();
            }
            j0Var.f7692g = false;
        }
        if (g0Var.f7666b && g0Var.e()) {
            g0Var.g();
        }
        this.f7775w = false;
    }

    @Override // w1.a
    public final void requestLayout() {
        this.i.f7686a.R(false);
    }
}
