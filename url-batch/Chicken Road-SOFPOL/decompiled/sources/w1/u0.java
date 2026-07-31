package w1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f7786a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7788c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7789d;
    public r2.a i;

    /* renamed from: b, reason: collision with root package name */
    public final a0.g1 f7787b = new a0.g1(12);

    /* renamed from: e, reason: collision with root package name */
    public final a0.a0 f7790e = new a0.a0(23);

    /* renamed from: f, reason: collision with root package name */
    public final o0.e f7791f = new o0.e(new f0[16]);

    /* renamed from: g, reason: collision with root package name */
    public final long f7792g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final o0.e f7793h = new o0.e(new t0[16]);

    public u0(f0 f0Var) {
        this.f7786a = f0Var;
    }

    public static boolean b(f0 f0Var, r2.a aVar) {
        boolean i02;
        f0 f0Var2 = f0Var.f7644j;
        j0 j0Var = f0Var.G;
        if (f0Var2 == null) {
            return false;
        }
        if (aVar != null) {
            if (f0Var2 != null) {
                s0 s0Var = j0Var.f7701q;
                q6.i.b(s0Var);
                i02 = s0Var.i0(aVar.f6514a);
            }
            i02 = false;
        } else {
            s0 s0Var2 = j0Var.f7701q;
            r2.a aVar2 = s0Var2 != null ? s0Var2.f7768p : null;
            if (aVar2 != null && f0Var2 != null) {
                q6.i.b(s0Var2);
                i02 = s0Var2.i0(aVar2.f6514a);
            }
            i02 = false;
        }
        f0 s5 = f0Var.s();
        if (i02 && s5 != null) {
            if (s5.f7644j == null) {
                f0.U(s5, false, 3);
                return i02;
            }
            if (f0Var.r() == d0.f7610d) {
                f0.S(s5, false, 3);
                return i02;
            }
            if (f0Var.r() == d0.f7611e) {
                s5.R(false);
            }
        }
        return i02;
    }

    public static boolean c(f0 f0Var, r2.a aVar) {
        boolean z3;
        if (aVar != null) {
            if (f0Var.C == d0.f7612f) {
                f0Var.e();
            }
            z3 = f0Var.G.f7700p.k0(aVar.f6514a);
        } else {
            w0 w0Var = f0Var.G.f7700p;
            r2.a aVar2 = w0Var.f7803m ? new r2.a(w0Var.f7233g) : null;
            if (aVar2 != null) {
                if (f0Var.C == d0.f7612f) {
                    f0Var.e();
                }
                z3 = f0Var.G.f7700p.k0(aVar2.f6514a);
            } else {
                f0Var.getClass();
                z3 = false;
            }
        }
        f0 s5 = f0Var.s();
        if (z3 && s5 != null) {
            if (f0Var.q() == d0.f7610d) {
                f0.U(s5, false, 3);
                return z3;
            }
            if (f0Var.q() == d0.f7611e) {
                s5.T(false);
            }
        }
        return z3;
    }

    public static boolean h(f0 f0Var) {
        s0 s0Var;
        g0 g0Var;
        if (f0Var.G.f7690e) {
            return (f0Var.r() == d0.f7612f && ((s0Var = f0Var.G.f7701q) == null || (g0Var = s0Var.f7772t) == null || !g0Var.e())) ? false : true;
        }
        return false;
    }

    public static boolean i(f0 f0Var) {
        if (!f0Var.p()) {
            return false;
        }
        do {
            if (f0Var.q() == d0.f7612f && !f0Var.G.f7700p.f7816z.e()) {
                f0 s5 = f0Var.s();
                if ((s5 != null ? s5.G.f7689d : null) != b0.f7590d) {
                    return false;
                }
            }
            f0Var = f0Var.s();
            if (f0Var == null) {
                return false;
            }
        } while (!f0Var.H());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r4 < r2) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z3) {
        Object[] objArr;
        a0.a0 a0Var = this.f7790e;
        if (z3) {
            o0.e eVar = (o0.e) a0Var.f11e;
            f0 f0Var = this.f7786a;
            if (f0Var.N > 0) {
                eVar.g();
                eVar.b(f0Var);
                f0Var.M = true;
            }
        }
        o0.e eVar2 = (o0.e) a0Var.f11e;
        int i = eVar2.f5580f;
        if (i != 0) {
            d6.l.Q(eVar2.f5578d, h1.f7682b, 0, i);
            int i8 = eVar2.f5580f;
            f0[] f0VarArr = (f0[]) a0Var.f12f;
            if (f0VarArr != null) {
                int length = f0VarArr.length;
                objArr = f0VarArr;
            }
            objArr = new f0[Math.max(16, i8)];
            a0Var.f12f = null;
            for (int i9 = 0; i9 < i8; i9++) {
                objArr[i9] = eVar2.f5578d[i9];
            }
            eVar2.g();
            for (int i10 = i8 - 1; -1 < i10; i10--) {
                f0 f0Var2 = objArr[i10];
                q6.i.b(f0Var2);
                if (f0Var2.M) {
                    a0.a0.l(f0Var2);
                }
                objArr[i10] = 0;
            }
            a0Var.f12f = objArr;
        }
    }

    public final void d() {
        o0.e eVar = this.f7793h;
        int i = eVar.f5580f;
        if (i != 0) {
            Object[] objArr = eVar.f5578d;
            for (int i8 = 0; i8 < i; i8++) {
                t0 t0Var = (t0) objArr[i8];
                f0 f0Var = t0Var.f7783a;
                boolean z3 = t0Var.f7785c;
                f0 f0Var2 = t0Var.f7783a;
                if (f0Var.G()) {
                    if (t0Var.f7784b) {
                        f0.S(f0Var2, z3, 2);
                    } else {
                        f0.U(f0Var2, z3, 2);
                    }
                }
            }
            eVar.g();
        }
    }

    public final void e(f0 f0Var) {
        o0.e x7 = f0Var.x();
        Object[] objArr = x7.f5578d;
        int i = x7.f5580f;
        for (int i8 = 0; i8 < i; i8++) {
            f0 f0Var2 = (f0) objArr[i8];
            if (q6.i.a(f0Var2.I(), Boolean.TRUE) && !f0Var2.O) {
                if (this.f7787b.h(f0Var2)) {
                    f0Var2.J();
                }
                e(f0Var2);
            }
        }
    }

    public final void f(f0 f0Var, boolean z3) {
        if (!this.f7788c) {
            t1.a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z3 ? f0Var.G.f7690e : f0Var.p()) {
            t1.a.a("node not yet measured");
        }
        g(f0Var, z3);
    }

    public final void g(f0 f0Var, boolean z3) {
        s0 s0Var;
        g0 g0Var;
        o0.e x7 = f0Var.x();
        Object[] objArr = x7.f5578d;
        int i = x7.f5580f;
        for (int i8 = 0; i8 < i; i8++) {
            f0 f0Var2 = (f0) objArr[i8];
            d0 d0Var = d0.f7610d;
            if ((!z3 && (f0Var2.q() == d0Var || f0Var2.G.f7700p.f7816z.e())) || (z3 && (f0Var2.r() == d0Var || ((s0Var = f0Var2.G.f7701q) != null && (g0Var = s0Var.f7772t) != null && g0Var.e())))) {
                boolean q4 = f.q(f0Var2);
                j0 j0Var = f0Var2.G;
                if (q4 && !z3) {
                    if (j0Var.f7690e && this.f7787b.h(f0Var2)) {
                        m(f0Var2, true, false);
                    } else {
                        f(f0Var2, true);
                    }
                }
                if (z3 ? j0Var.f7690e : f0Var2.p()) {
                    m(f0Var2, z3, false);
                }
                if (!(z3 ? j0Var.f7690e : f0Var2.p())) {
                    g(f0Var2, z3);
                }
            }
        }
        if (z3 ? f0Var.G.f7690e : f0Var.p()) {
            m(f0Var, z3, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2, types: [y0.l] */
    public final boolean j(x1.r rVar) {
        boolean z3;
        y0.l lVar;
        y0.l lVar2;
        boolean z7;
        f0 f0Var;
        boolean z8;
        a0.g1 g1Var = this.f7787b;
        f0 f0Var2 = this.f7786a;
        if (!f0Var2.G()) {
            t1.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!f0Var2.H()) {
            t1.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f7788c) {
            t1.a.a("performMeasureAndLayout called during measure layout");
        }
        int i = 0;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        if (this.i != null) {
            this.f7788c = true;
            this.f7789d = true;
            try {
                boolean A = g1Var.A();
                q3.k kVar = (q3.k) g1Var.f84b;
                if (A) {
                    z3 = false;
                    while (true) {
                        q3.k kVar2 = (q3.k) g1Var.f86d;
                        q3.k kVar3 = (q3.k) g1Var.f85c;
                        if (!((t1) kVar.f6119e).isEmpty()) {
                            f0Var = (f0) ((t1) kVar.f6119e).first();
                            kVar.q(f0Var);
                            z8 = f0Var.f7644j != null;
                            z7 = false;
                        } else if (!((t1) kVar3.f6119e).isEmpty()) {
                            f0Var = (f0) ((t1) kVar3.f6119e).first();
                            kVar3.q(f0Var);
                            z8 = f0Var.f7644j != null;
                            z7 = true;
                        } else {
                            if (((t1) kVar2.f6119e).isEmpty()) {
                                break;
                            }
                            f0 f0Var3 = (f0) ((t1) kVar2.f6119e).first();
                            kVar2.q(f0Var3);
                            z7 = true;
                            f0Var = f0Var3;
                            z8 = false;
                        }
                        boolean m7 = m(f0Var, z8, z7);
                        if (!z7) {
                            if (f0Var.G.f7691f) {
                                g1Var.f(f0Var, s.f7758e);
                            }
                            if (f0Var.o()) {
                                g1Var.f(f0Var, s.f7760g);
                            }
                        }
                        if (f0Var == f0Var2 && m7) {
                            z3 = true;
                        }
                    }
                    if (rVar != null) {
                        rVar.b();
                    }
                } else {
                    z3 = false;
                }
            } finally {
            }
        } else {
            z3 = false;
        }
        o0.e eVar = this.f7791f;
        Object[] objArr = eVar.f5578d;
        int i8 = eVar.f5580f;
        int i9 = 0;
        while (i9 < i8) {
            b1 b1Var = ((f0) objArr[i9]).F;
            r rVar2 = b1Var.f7597c;
            boolean g3 = e1.g(128);
            if (g3) {
                lVar = rVar2.Q;
            } else {
                lVar = rVar2.Q.f8710h;
                if (lVar == null) {
                    i9++;
                    i = 0;
                }
            }
            f1.g0 g0Var = d1.M;
            y0.l G0 = rVar2.G0(g3);
            while (G0 != null && (G0.f8709g & 128) != 0) {
                if ((G0.f8708f & 128) != 0) {
                    l lVar3 = G0;
                    o0.e eVar2 = null;
                    while (lVar3 != 0) {
                        if (lVar3 instanceof u) {
                            ((u) lVar3).P(b1Var.f7597c);
                        } else if ((lVar3.f8708f & 128) != 0 && (lVar3 instanceof l)) {
                            y0.l lVar4 = lVar3.f7707s;
                            lVar2 = lVar3;
                            eVar2 = eVar2;
                            while (lVar4 != null) {
                                if ((lVar4.f8708f & 128) != 0) {
                                    i++;
                                    eVar2 = eVar2;
                                    if (i == 1) {
                                        lVar2 = lVar4;
                                    } else {
                                        if (eVar2 == null) {
                                            eVar2 = new o0.e(new y0.l[16]);
                                        }
                                        if (lVar2 != null) {
                                            eVar2.b(lVar2);
                                            lVar2 = null;
                                        }
                                        eVar2.b(lVar4);
                                    }
                                }
                                lVar4 = lVar4.i;
                                lVar2 = lVar2;
                                eVar2 = eVar2;
                            }
                            if (i == 1) {
                                i = 0;
                                lVar3 = lVar2;
                                eVar2 = eVar2;
                            }
                        }
                        lVar2 = f.f(eVar2);
                        i = 0;
                        lVar3 = lVar2;
                        eVar2 = eVar2;
                    }
                }
                if (G0 != lVar) {
                    G0 = G0.i;
                    i = 0;
                }
            }
            i9++;
            i = 0;
        }
        eVar.g();
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[Catch: all -> 0x006a, TryCatch #1 {all -> 0x006a, blocks: (B:21:0x0043, B:23:0x0065, B:26:0x007b, B:28:0x0084, B:29:0x0087, B:32:0x0095, B:34:0x009d, B:35:0x00a2, B:37:0x00aa, B:38:0x00ad, B:40:0x00b3, B:42:0x00b9, B:44:0x00c5, B:45:0x00ce, B:48:0x006c, B:50:0x0078), top: B:20:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d A[Catch: all -> 0x006a, TryCatch #1 {all -> 0x006a, blocks: (B:21:0x0043, B:23:0x0065, B:26:0x007b, B:28:0x0084, B:29:0x0087, B:32:0x0095, B:34:0x009d, B:35:0x00a2, B:37:0x00aa, B:38:0x00ad, B:40:0x00b3, B:42:0x00b9, B:44:0x00c5, B:45:0x00ce, B:48:0x006c, B:50:0x0078), top: B:20:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2 A[Catch: all -> 0x006a, TryCatch #1 {all -> 0x006a, blocks: (B:21:0x0043, B:23:0x0065, B:26:0x007b, B:28:0x0084, B:29:0x0087, B:32:0x0095, B:34:0x009d, B:35:0x00a2, B:37:0x00aa, B:38:0x00ad, B:40:0x00b3, B:42:0x00b9, B:44:0x00c5, B:45:0x00ce, B:48:0x006c, B:50:0x0078), top: B:20:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5 A[Catch: all -> 0x006a, TryCatch #1 {all -> 0x006a, blocks: (B:21:0x0043, B:23:0x0065, B:26:0x007b, B:28:0x0084, B:29:0x0087, B:32:0x0095, B:34:0x009d, B:35:0x00a2, B:37:0x00aa, B:38:0x00ad, B:40:0x00b3, B:42:0x00b9, B:44:0x00c5, B:45:0x00ce, B:48:0x006c, B:50:0x0078), top: B:20:0x0043 }] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, w1.f0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(f0 f0Var, long j7) {
        y0.l lVar;
        y0.l lVar2;
        boolean k02;
        boolean z3 = f0Var.O;
        j0 j0Var = f0Var.G;
        if (z3) {
            return;
        }
        f0 f0Var2 = this.f7786a;
        if (f0Var.equals(f0Var2)) {
            t1.a.a("measureAndLayout called on root");
        }
        if (!f0Var2.G()) {
            t1.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!f0Var2.H()) {
            t1.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f7788c) {
            t1.a.a("performMeasureAndLayout called during measure layout");
        }
        boolean z7 = false;
        if (this.i != null) {
            this.f7788c = true;
            this.f7789d = false;
            try {
                a0.g1 g1Var = this.f7787b;
                ((q3.k) g1Var.f84b).q(f0Var);
                ((q3.k) g1Var.f85c).q(f0Var);
                ((q3.k) g1Var.f86d).q(f0Var);
                if (!b(f0Var, new r2.a(j7))) {
                    if (j0Var.f7691f) {
                    }
                    e(f0Var);
                    if (f0Var.C == d0.f7612f) {
                        f0Var.e();
                    }
                    k02 = j0Var.f7700p.k0(j7);
                    f0 s5 = f0Var.s();
                    if (k02 && s5 != null) {
                        if (f0Var.q() != d0.f7610d) {
                            f0.U(s5, false, 3);
                        } else if (f0Var.q() == d0.f7611e) {
                            s5.T(false);
                        }
                    }
                    if (f0Var.o() && f0Var.H()) {
                        f0Var.Q();
                        a0.a0 a0Var = this.f7790e;
                        a0Var.getClass();
                        if (f0Var.N > 0) {
                            ((o0.e) a0Var.f11e).b(f0Var);
                            f0Var.M = true;
                        }
                    }
                    d();
                }
                if (q6.i.a(f0Var.I(), Boolean.TRUE)) {
                    f0Var.J();
                }
                e(f0Var);
                if (f0Var.C == d0.f7612f) {
                }
                k02 = j0Var.f7700p.k0(j7);
                f0 s52 = f0Var.s();
                if (k02) {
                    if (f0Var.q() != d0.f7610d) {
                    }
                }
                if (f0Var.o()) {
                    f0Var.Q();
                    a0.a0 a0Var2 = this.f7790e;
                    a0Var2.getClass();
                    if (f0Var.N > 0) {
                    }
                }
                d();
            } finally {
            }
        }
        o0.e eVar = this.f7791f;
        Object[] objArr = eVar.f5578d;
        int i = eVar.f5580f;
        int i8 = 0;
        while (i8 < i) {
            b1 b1Var = ((f0) objArr[i8]).F;
            r rVar = b1Var.f7597c;
            boolean g3 = e1.g(128);
            if (g3) {
                lVar = rVar.Q;
            } else {
                lVar = rVar.Q.f8710h;
                if (lVar == null) {
                    i8++;
                    z7 = false;
                }
            }
            f1.g0 g0Var = d1.M;
            y0.l G0 = rVar.G0(g3);
            while (G0 != null && (G0.f8709g & 128) != 0) {
                if ((G0.f8708f & 128) != 0) {
                    l lVar3 = G0;
                    o0.e eVar2 = null;
                    while (lVar3 != 0) {
                        if (lVar3 instanceof u) {
                            ((u) lVar3).P(b1Var.f7597c);
                        } else if ((lVar3.f8708f & 128) != 0 && (lVar3 instanceof l)) {
                            y0.l lVar4 = lVar3.f7707s;
                            ?? r15 = z7;
                            lVar2 = lVar3;
                            eVar2 = eVar2;
                            while (lVar4 != null) {
                                if ((lVar4.f8708f & 128) != 0) {
                                    r15++;
                                    eVar2 = eVar2;
                                    if (r15 == 1) {
                                        lVar2 = lVar4;
                                    } else {
                                        if (eVar2 == null) {
                                            eVar2 = new o0.e(new y0.l[16]);
                                        }
                                        if (lVar2 != null) {
                                            eVar2.b(lVar2);
                                            lVar2 = null;
                                        }
                                        eVar2.b(lVar4);
                                    }
                                }
                                lVar4 = lVar4.i;
                                lVar2 = lVar2;
                                eVar2 = eVar2;
                                r15 = r15;
                            }
                            if (r15 == 1) {
                                z7 = false;
                                lVar3 = lVar2;
                                eVar2 = eVar2;
                            }
                        }
                        lVar2 = f.f(eVar2);
                        z7 = false;
                        lVar3 = lVar2;
                        eVar2 = eVar2;
                    }
                }
                if (G0 != lVar) {
                    G0 = G0.i;
                    z7 = false;
                }
            }
            i8++;
            z7 = false;
        }
        eVar.g();
    }

    public final void l() {
        a0.g1 g1Var = this.f7787b;
        if (g1Var.A()) {
            f0 f0Var = this.f7786a;
            if (!f0Var.G()) {
                t1.a.a("performMeasureAndLayout called with unattached root");
            }
            if (!f0Var.H()) {
                t1.a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f7788c) {
                t1.a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.i != null) {
                this.f7788c = true;
                this.f7789d = false;
                try {
                    if (!((t1) ((q3.k) g1Var.f86d).f6119e).isEmpty() && !((t1) ((q3.k) g1Var.f84b).f6119e).isEmpty()) {
                        if (f0Var.f7644j != null) {
                            o(f0Var, true);
                        } else {
                            n(f0Var);
                        }
                    }
                    o(f0Var, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.f7788c = false;
                        this.f7789d = false;
                    }
                }
            }
        }
    }

    public final boolean m(f0 f0Var, boolean z3, boolean z7) {
        r2.a aVar;
        boolean z8;
        u1.k0 placementScope;
        r rVar;
        f0 s5;
        s0 s0Var;
        g0 g0Var;
        boolean z9 = f0Var.O;
        j0 j0Var = f0Var.G;
        if (z9 || (!f0Var.H() && !j0Var.f7700p.f7812v && !i(f0Var) && !q6.i.a(f0Var.I(), Boolean.TRUE) && !h(f0Var) && !j0Var.f7700p.f7816z.e() && ((s0Var = j0Var.f7701q) == null || (g0Var = s0Var.f7772t) == null || !g0Var.e()))) {
            return false;
        }
        f0 f0Var2 = this.f7786a;
        if (f0Var == f0Var2) {
            aVar = this.i;
            q6.i.b(aVar);
        } else {
            aVar = null;
        }
        if (z3) {
            z8 = j0Var.f7690e ? b(f0Var, aVar) : false;
            if (z7 && ((z8 || j0Var.f7691f) && q6.i.a(f0Var.I(), Boolean.TRUE))) {
                f0Var.J();
            }
        } else {
            boolean c8 = f0Var.p() ? c(f0Var, aVar) : false;
            if (z7 && f0Var.o() && (f0Var == f0Var2 || ((s5 = f0Var.s()) != null && s5.H() && j0Var.f7700p.f7812v))) {
                if (f0Var == f0Var2) {
                    if (f0Var.C == d0.f7612f) {
                        f0Var.f();
                    }
                    f0 s7 = f0Var.s();
                    if (s7 == null || (rVar = s7.F.f7597c) == null || (placementScope = rVar.f7731o) == null) {
                        placementScope = ((x1.t) i0.a(f0Var)).getPlacementScope();
                    }
                    u1.k0.k(placementScope, j0Var.f7700p, 0, 0);
                } else {
                    f0Var.Q();
                }
                a0.a0 a0Var = this.f7790e;
                a0Var.getClass();
                if (f0Var.N > 0) {
                    ((o0.e) a0Var.f11e).b(f0Var);
                    f0Var.M = true;
                }
                ((x1.t) i0.a(f0Var)).getRectManager().e(f0Var);
            }
            z8 = c8;
        }
        d();
        return z8;
    }

    public final void n(f0 f0Var) {
        o0.e x7 = f0Var.x();
        Object[] objArr = x7.f5578d;
        int i = x7.f5580f;
        for (int i8 = 0; i8 < i; i8++) {
            f0 f0Var2 = (f0) objArr[i8];
            if (f0Var2.q() == d0.f7610d || f0Var2.G.f7700p.f7816z.e()) {
                if (f.q(f0Var2)) {
                    o(f0Var2, true);
                } else {
                    n(f0Var2);
                }
            }
        }
    }

    public final void o(f0 f0Var, boolean z3) {
        r2.a aVar;
        if (f0Var.O) {
            return;
        }
        if (f0Var == this.f7786a) {
            aVar = this.i;
            q6.i.b(aVar);
        } else {
            aVar = null;
        }
        if (z3) {
            b(f0Var, aVar);
        } else {
            c(f0Var, aVar);
        }
    }

    public final boolean p(f0 f0Var, boolean z3) {
        int ordinal = f0Var.G.f7689d.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2 || ordinal == 3) {
                this.f7793h.b(new t0(f0Var, false, z3));
            } else {
                if (ordinal != 4) {
                    throw new a5.c();
                }
                if (!f0Var.p() || z3) {
                    f0Var.G.f7700p.f7813w = true;
                    if (!f0Var.O && (f0Var.H() || i(f0Var))) {
                        f0 s5 = f0Var.s();
                        if (s5 == null || !s5.p()) {
                            this.f7787b.f(f0Var, s.f7759f);
                        }
                        if (!this.f7789d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void q(long j7) {
        r2.a aVar = this.i;
        if (aVar == null ? false : r2.a.b(aVar.f6514a, j7)) {
            return;
        }
        if (this.f7788c) {
            t1.a.a("updateRootConstraints called while measuring");
        }
        this.i = new r2.a(j7);
        f0 f0Var = this.f7786a;
        f0 f0Var2 = f0Var.f7644j;
        j0 j0Var = f0Var.G;
        if (f0Var2 != null) {
            j0Var.f7690e = true;
        }
        j0Var.f7700p.f7813w = true;
        this.f7787b.f(f0Var, f0Var2 != null ? s.f7757d : s.f7759f);
    }
}
