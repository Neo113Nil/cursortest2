package w1;

import java.util.List;
import m0.u2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f0 implements m0.j, l1, i {
    public static final a0 P = new a0();
    public static final z Q = new z();
    public static final a0.a R = new a0.a(5);
    public x1.u1 A;
    public m0.a0 B;
    public d0 C;
    public d0 D;
    public boolean E;
    public final b1 F;
    public final j0 G;
    public u1.a0 H;
    public d1 I;
    public boolean J;
    public y0.m K;
    public y0.m L;
    public boolean M;
    public int N;
    public boolean O;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7639d;

    /* renamed from: e, reason: collision with root package name */
    public int f7640e;

    /* renamed from: f, reason: collision with root package name */
    public long f7641f;

    /* renamed from: g, reason: collision with root package name */
    public long f7642g;

    /* renamed from: h, reason: collision with root package name */
    public long f7643h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public f0 f7644j;

    /* renamed from: k, reason: collision with root package name */
    public int f7645k;

    /* renamed from: l, reason: collision with root package name */
    public final a0.a0 f7646l;

    /* renamed from: m, reason: collision with root package name */
    public o0.e f7647m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7648n;

    /* renamed from: o, reason: collision with root package name */
    public f0 f7649o;

    /* renamed from: p, reason: collision with root package name */
    public k1 f7650p;

    /* renamed from: q, reason: collision with root package name */
    public int f7651q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7652r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7653s;

    /* renamed from: t, reason: collision with root package name */
    public d2.j f7654t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7655u;

    /* renamed from: v, reason: collision with root package name */
    public final o0.e f7656v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7657w;

    /* renamed from: x, reason: collision with root package name */
    public u1.e0 f7658x;

    /* renamed from: y, reason: collision with root package name */
    public r2.c f7659y;

    /* renamed from: z, reason: collision with root package name */
    public r2.l f7660z;

    public f0(int i) {
        this(d2.l.f2154a.addAndGet(1), (i & 1) == 0);
    }

    public static void S(f0 f0Var, boolean z3, int i) {
        f0 s5;
        if ((i & 1) != 0) {
            z3 = false;
        }
        boolean z7 = (i & 2) != 0;
        boolean z8 = (i & 4) != 0;
        if (f0Var.f7644j == null) {
            t1.a.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        k1 k1Var = f0Var.f7650p;
        if (k1Var == null || f0Var.f7652r || f0Var.f7639d) {
            return;
        }
        ((x1.t) k1Var).x(f0Var, true, z3, z7);
        if (z8) {
            s0 s0Var = f0Var.G.f7701q;
            q6.i.b(s0Var);
            j0 j0Var = s0Var.i;
            f0 s7 = j0Var.f7686a.s();
            d0 d0Var = j0Var.f7686a.C;
            if (s7 == null || d0Var == d0.f7612f) {
                return;
            }
            while (s7.C == d0Var && (s5 = s7.s()) != null) {
                s7 = s5;
            }
            int ordinal = d0Var.ordinal();
            if (ordinal == 0) {
                if (s7.f7644j != null) {
                    S(s7, z3, 6);
                    return;
                } else {
                    U(s7, z3, 6);
                    return;
                }
            }
            if (ordinal != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (s7.f7644j != null) {
                s7.R(z3);
            } else {
                s7.T(z3);
            }
        }
    }

    public static void U(f0 f0Var, boolean z3, int i) {
        k1 k1Var;
        f0 s5;
        if ((i & 1) != 0) {
            z3 = false;
        }
        boolean z7 = (i & 2) != 0;
        boolean z8 = (i & 4) != 0;
        if (f0Var.f7652r || f0Var.f7639d || (k1Var = f0Var.f7650p) == null) {
            return;
        }
        ((x1.t) k1Var).x(f0Var, false, z3, z7);
        if (z8) {
            j0 j0Var = f0Var.G.f7700p.i;
            f0 s7 = j0Var.f7686a.s();
            d0 d0Var = j0Var.f7686a.C;
            if (s7 == null || d0Var == d0.f7612f) {
                return;
            }
            while (s7.C == d0Var && (s5 = s7.s()) != null) {
                s7 = s5;
            }
            int ordinal = d0Var.ordinal();
            if (ordinal == 0) {
                U(s7, z3, 6);
            } else {
                if (ordinal != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                s7.T(z3);
            }
        }
    }

    public static void V(f0 f0Var) {
        j0 j0Var = f0Var.G;
        if (e0.f7635a[j0Var.f7689d.ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + j0Var.f7689d);
        }
        if (j0Var.f7690e) {
            S(f0Var, true, 6);
            return;
        }
        if (j0Var.f7691f) {
            f0Var.R(true);
        }
        if (f0Var.p()) {
            U(f0Var, true, 6);
        } else if (f0Var.o()) {
            f0Var.T(true);
        }
    }

    private final String j(f0 f0Var) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(f0Var);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(g(0));
        sb.append(" Other tree: ");
        f0 f0Var2 = f0Var.f7649o;
        sb.append(f0Var2 != null ? f0Var2.g(0) : null);
        return sb.toString();
    }

    public final void A() {
        if (this.J) {
            b1 b1Var = this.F;
            d1 d1Var = b1Var.f7597c;
            d1 d1Var2 = b1Var.f7598d.f7616t;
            this.I = null;
            while (true) {
                if (q6.i.a(d1Var, d1Var2)) {
                    break;
                }
                if ((d1Var != null ? d1Var.L : null) != null) {
                    this.I = d1Var;
                    break;
                }
                d1Var = d1Var != null ? d1Var.f7616t : null;
            }
        }
        d1 d1Var3 = this.I;
        if (d1Var3 != null && d1Var3.L == null) {
            throw a0.q.f("layer was not set");
        }
        if (d1Var3 != null) {
            d1Var3.L0();
            return;
        }
        f0 s5 = s();
        if (s5 != null) {
            s5.A();
        }
    }

    public final void B() {
        b1 b1Var = this.F;
        d1 d1Var = b1Var.f7598d;
        r rVar = b1Var.f7597c;
        while (d1Var != rVar) {
            q6.i.c(d1Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            x xVar = (x) d1Var;
            j1 j1Var = xVar.L;
            if (j1Var != null) {
                j1Var.invalidate();
            }
            d1Var = xVar.f7615s;
        }
        j1 j1Var2 = b1Var.f7597c.L;
        if (j1Var2 != null) {
            j1Var2.invalidate();
        }
    }

    public final void C() {
        if (this.f7639d) {
            f0 s5 = s();
            if (s5 != null) {
                s5.C();
                return;
            }
            return;
        }
        if (this.f7644j != null) {
            S(this, false, 7);
        } else {
            U(this, false, 7);
        }
    }

    public final void D() {
        if (r2.i.a(this.f7641f, 9223372034707292159L)) {
            return;
        }
        this.f7641f = 9223372034707292159L;
        o0.e x7 = x();
        Object[] objArr = x7.f5578d;
        int i = x7.f5580f;
        for (int i8 = 0; i8 < i; i8++) {
            ((f0) objArr[i8]).D();
        }
    }

    public final void E() {
        if (this.f7655u) {
            return;
        }
        if (this.F.f7596b.i != null || this.L != null) {
            this.f7653s = true;
            return;
        }
        d2.j jVar = this.f7654t;
        this.f7655u = true;
        q6.s sVar = new q6.s();
        sVar.f6205d = new d2.j();
        m1 snapshotObserver = ((x1.t) i0.a(this)).getSnapshotObserver();
        snapshotObserver.a(this, snapshotObserver.f7721d, new a2.b(4, this, sVar));
        this.f7655u = false;
        this.f7654t = (d2.j) sVar.f6205d;
        this.f7653s = false;
        x1.t tVar = (x1.t) i0.a(this);
        tVar.getSemanticsOwner().b(this, jVar);
        tVar.z();
    }

    public final void F() {
        f0 f0Var;
        if (this.f7645k > 0) {
            this.f7648n = true;
        }
        if (!this.f7639d || (f0Var = this.f7649o) == null) {
            return;
        }
        f0Var.F();
    }

    public final boolean G() {
        return this.f7650p != null;
    }

    public final boolean H() {
        return this.G.f7700p.f7811u;
    }

    public final Boolean I() {
        s0 s0Var = this.G.f7701q;
        if (s0Var != null) {
            return Boolean.valueOf(s0Var.A());
        }
        return null;
    }

    public final void J() {
        f0 s5;
        if (this.C == d0.f7612f) {
            f();
        }
        s0 s0Var = this.G.f7701q;
        q6.i.b(s0Var);
        try {
            s0Var.f7762j = true;
            if (!s0Var.f7766n) {
                t1.a.b("replace() called on item that was not placed");
            }
            s0Var.f7778z = false;
            boolean A = s0Var.A();
            s0Var.h0(s0Var.f7769q, s0Var.f7770r);
            if (A && !s0Var.f7778z && (s5 = s0Var.i.f7686a.s()) != null) {
                s5.R(false);
            }
            s0Var.f7762j = false;
        } catch (Throwable th) {
            s0Var.f7762j = false;
            throw th;
        }
    }

    public final void K(int i, int i8, int i9) {
        if (i == i8) {
            return;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = i > i8 ? i + i10 : i;
            int i12 = i > i8 ? i8 + i10 : (i8 + i9) - 2;
            a0.a0 a0Var = this.f7646l;
            o0.e eVar = (o0.e) a0Var.f11e;
            d1.o oVar = (d1.o) a0Var.f12f;
            Object k3 = eVar.k(i11);
            oVar.b();
            ((o0.e) a0Var.f11e).a(i12, (f0) k3);
            oVar.b();
        }
        N();
        F();
        C();
    }

    public final void L(f0 f0Var) {
        if (f0Var.G.f7696l > 0) {
            this.G.d(r0.f7696l - 1);
        }
        if (this.f7650p != null) {
            f0Var.h();
        }
        f0Var.f7649o = null;
        if (f0Var.N > 0) {
            Z(this.N - 1);
        }
        f0Var.F.f7598d.f7616t = null;
        if (f0Var.f7639d) {
            this.f7645k--;
            o0.e eVar = (o0.e) f0Var.f7646l.f11e;
            Object[] objArr = eVar.f5578d;
            int i = eVar.f5580f;
            for (int i8 = 0; i8 < i; i8++) {
                ((f0) objArr[i8]).F.f7598d.f7616t = null;
            }
        }
        F();
        N();
    }

    public final void M() {
        this.i = true;
        o0.e x7 = x();
        Object[] objArr = x7.f5578d;
        int i = x7.f5580f;
        for (int i8 = 0; i8 < i; i8++) {
            ((f0) objArr[i8]).D();
        }
    }

    public final void N() {
        if (!this.f7639d) {
            this.f7657w = true;
            return;
        }
        f0 s5 = s();
        if (s5 != null) {
            s5.N();
        }
    }

    public final void O() {
        a0.a0 a0Var = this.f7646l;
        o0.e eVar = (o0.e) a0Var.f11e;
        o0.e eVar2 = (o0.e) a0Var.f11e;
        int i = eVar.f5580f;
        while (true) {
            i--;
            if (-1 >= i) {
                eVar2.g();
                ((d1.o) a0Var.f12f).b();
                return;
            }
            L((f0) eVar2.f5578d[i]);
        }
    }

    public final void P(int i, int i8) {
        if (i8 < 0) {
            t1.a.a("count (" + i8 + ") must be greater than 0");
        }
        int i9 = (i8 + i) - 1;
        if (i > i9) {
            return;
        }
        while (true) {
            a0.a0 a0Var = this.f7646l;
            L((f0) ((o0.e) a0Var.f11e).f5578d[i9]);
            Object k3 = ((o0.e) a0Var.f11e).k(i9);
            ((d1.o) a0Var.f12f).b();
            if (i9 == i) {
                return;
            } else {
                i9--;
            }
        }
    }

    public final void Q() {
        f0 s5;
        if (this.C == d0.f7612f) {
            f();
        }
        w0 w0Var = this.G.f7700p;
        j0 j0Var = w0Var.i;
        try {
            w0Var.f7800j = true;
            if (!w0Var.f7804n) {
                t1.a.b("replace called on unplaced item");
            }
            boolean z3 = w0Var.f7811u;
            w0Var.j0(w0Var.f7806p, w0Var.f7808r, w0Var.f7807q);
            if (z3 && !w0Var.H && (s5 = j0Var.f7686a.s()) != null) {
                s5.T(false);
            }
        } finally {
        }
    }

    public final void R(boolean z3) {
        k1 k1Var;
        if (this.f7639d || (k1Var = this.f7650p) == null) {
            return;
        }
        ((x1.t) k1Var).y(this, true, z3);
    }

    public final void T(boolean z3) {
        k1 k1Var;
        if (this.f7639d || (k1Var = this.f7650p) == null) {
            return;
        }
        ((x1.t) k1Var).y(this, false, z3);
    }

    public final void W() {
        o0.e x7 = x();
        Object[] objArr = x7.f5578d;
        int i = x7.f5580f;
        for (int i8 = 0; i8 < i; i8++) {
            f0 f0Var = (f0) objArr[i8];
            d0 d0Var = f0Var.D;
            f0Var.C = d0Var;
            if (d0Var != d0.f7612f) {
                f0Var.W();
            }
        }
    }

    public final void X(Throwable th) {
        m0.a0 a0Var = this.B;
        u2 u2Var = x0.c.f8318a;
        u0.g gVar = (u0.g) a0Var;
        gVar.getClass();
        x0.b bVar = (x0.b) m0.b.r(gVar, u2Var);
        if (bVar == null) {
            throw th;
        }
        r2.o.t0(th, new a0.z0(10, bVar, this));
        throw th;
    }

    public final void Y(r2.c cVar) {
        if (q6.i.a(this.f7659y, cVar)) {
            return;
        }
        this.f7659y = cVar;
        C();
        f0 s5 = s();
        if (s5 != null) {
            s5.A();
        }
        B();
        for (y0.l lVar = this.F.f7600f; lVar != null; lVar = lVar.i) {
            lVar.a();
        }
    }

    public final void Z(int i) {
        f0 s5;
        f0 s7;
        int i8 = this.N;
        if (i8 != i) {
            if (i > 0 && i8 == 0 && (s7 = s()) != null) {
                s7.Z(s7.N + 1);
            }
            if (i == 0 && this.N > 0 && (s5 = s()) != null) {
                s5.Z(s5.N - 1);
            }
            this.N = i;
        }
    }

    @Override // m0.j
    public final void a() {
        u1.a0 a0Var = this.H;
        if (a0Var != null) {
            a0Var.a();
        }
        b1 b1Var = this.F;
        d1 d1Var = b1Var.f7597c.f7615s;
        for (d1 d1Var2 = b1Var.f7598d; !q6.i.a(d1Var2, d1Var) && d1Var2 != null; d1Var2 = d1Var2.f7615s) {
            d1Var2.S0();
        }
    }

    public final void a0(f0 f0Var) {
        if (q6.i.a(f0Var, this.f7644j)) {
            return;
        }
        this.f7644j = f0Var;
        j0 j0Var = this.G;
        if (f0Var != null) {
            if (j0Var.f7701q == null) {
                j0Var.f7701q = new s0(j0Var);
            }
            b1 b1Var = this.F;
            d1 d1Var = b1Var.f7597c.f7615s;
            for (d1 d1Var2 = b1Var.f7598d; !q6.i.a(d1Var2, d1Var) && d1Var2 != null; d1Var2 = d1Var2.f7615s) {
                d1Var2.z0();
            }
        } else {
            j0Var.f7701q = null;
            j0Var.f7691f = false;
            j0Var.f7690e = false;
        }
        C();
    }

    @Override // m0.j
    public final void b() {
        z0.b bVar;
        u1.a0 a0Var = this.H;
        if (a0Var != null) {
            a0Var.f(true);
        }
        this.O = true;
        y0.l lVar = this.F.f7599e;
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
        if (G()) {
            this.f7654t = null;
            this.f7653s = false;
        }
        k1 k1Var = this.f7650p;
        if (k1Var != null) {
            x1.t tVar = (x1.t) k1Var;
            tVar.getRectManager().j(this);
            if (x1.t.g() && (bVar = tVar.H) != null && bVar.f9108g.e(this.f7640e)) {
                bVar.f9102a.n(bVar.f9104c, this.f7640e, false);
            }
        }
    }

    public final void b0(y0.m mVar) {
        if (this.f7639d && this.K != y0.j.f8705a) {
            t1.a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.O) {
            t1.a.a("modifier is updated when deactivated");
        }
        if (!G()) {
            this.L = mVar;
            return;
        }
        c(mVar);
        if (this.f7653s) {
            E();
        }
    }

    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v3, types: [w1.d1, y0.l] */
    public final void c(y0.m mVar) {
        ?? r7;
        b1 b1Var;
        a1 a1Var;
        o0.e eVar;
        boolean z3;
        boolean z7;
        boolean z8;
        o0.e eVar2;
        boolean z9;
        b1.e eVar3;
        b1 b1Var2 = this.F;
        boolean d8 = b1Var2.d(16);
        y0.l lVar = b1Var2.f7599e;
        boolean d9 = b1Var2.d(1024);
        this.K = mVar;
        r rVar = b1Var2.f7597c;
        f0 f0Var = b1Var2.f7595a;
        y0.l lVar2 = b1Var2.f7600f;
        a1 a1Var2 = b1Var2.f7596b;
        if (lVar2 == a1Var2) {
            t1.a.b("padChain called on already padded chain");
        }
        y0.l lVar3 = b1Var2.f7600f;
        lVar3.f8710h = a1Var2;
        a1Var2.i = lVar3;
        o0.e eVar4 = b1Var2.f7601g;
        int i = eVar4 != null ? eVar4.f5580f : 0;
        o0.e eVar5 = b1Var2.f7602h;
        if (eVar5 == null) {
            eVar5 = new o0.e(new y0.k[16]);
        }
        o0.e eVar6 = b1Var2.i;
        eVar6.b(mVar);
        b1.e eVar7 = null;
        while (true) {
            int i8 = eVar6.f5580f;
            if (i8 == 0) {
                break;
            }
            y0.m mVar2 = (y0.m) eVar6.k(i8 - 1);
            if (mVar2 instanceof y0.g) {
                y0.g gVar = (y0.g) mVar2;
                eVar6.b(gVar.f8702b);
                eVar6.b(gVar.f8701a);
            } else if (mVar2 instanceof y0.k) {
                eVar5.b(mVar2);
            } else {
                if (eVar7 == null) {
                    eVar3 = new b1.e(13, eVar5);
                    eVar7 = eVar3;
                } else {
                    eVar3 = eVar7;
                }
                mVar2.a(eVar3);
            }
        }
        int i9 = eVar5.f5580f;
        if (i9 == i) {
            y0.l lVar4 = a1Var2.i;
            int i10 = 0;
            while (lVar4 != null && i10 < i) {
                if (eVar4 == null) {
                    throw a0.q.f("expected prior modifier list to be non-empty");
                }
                y0.k kVar = (y0.k) eVar4.f5578d[i10];
                y0.k kVar2 = (y0.k) eVar5.f5578d[i10];
                if (q6.i.a(kVar, kVar2)) {
                    eVar2 = eVar4;
                    z9 = 2;
                } else {
                    eVar2 = eVar4;
                    z9 = kVar.getClass() == kVar2.getClass();
                }
                if (!z9) {
                    lVar4 = lVar4.f8710h;
                    break;
                }
                if (z9) {
                    b1.h(kVar, kVar2, lVar4);
                }
                lVar4 = lVar4.i;
                i10++;
                eVar4 = eVar2;
            }
            eVar2 = eVar4;
            if (i10 >= i) {
                b1Var2 = b1Var2;
                eVar4 = eVar2;
                z7 = false;
                b1Var = b1Var2;
                a1Var = a1Var2;
                eVar = eVar5;
                z3 = false;
                r7 = z7;
            } else {
                if (eVar2 == null) {
                    throw a0.q.f("expected prior modifier list to be non-empty");
                }
                if (lVar4 == null) {
                    throw a0.q.f("structuralUpdate requires a non-null tail");
                }
                boolean z10 = f0Var.L != null;
                y0.l lVar5 = lVar4;
                b1Var = b1Var2;
                eVar = eVar5;
                eVar4 = eVar2;
                z8 = false;
                b1Var.f(i10, eVar4, eVar, lVar5, !z10);
                a1Var = a1Var2;
                z3 = true;
                r7 = z8;
            }
        } else {
            r7 = 0;
            z8 = false;
            z7 = false;
            y0.m mVar3 = f0Var.L;
            if (mVar3 != null && i == 0) {
                y0.l lVar6 = a1Var2;
                for (int i11 = 0; i11 < eVar5.f5580f; i11++) {
                    lVar6 = b1.b((y0.k) eVar5.f5578d[i11], lVar6);
                }
                int i12 = 0;
                for (y0.l lVar7 = lVar.f8710h; lVar7 != null && lVar7 != a1Var2; lVar7 = lVar7.f8710h) {
                    i12 |= lVar7.f8708f;
                    lVar7.f8709g = i12;
                }
                b1Var = b1Var2;
                a1Var = a1Var2;
                eVar = eVar5;
                z3 = true;
                r7 = z8;
            } else if (i9 != 0) {
                if (eVar4 == null) {
                    eVar4 = new o0.e(new y0.k[16]);
                }
                b1Var = b1Var2;
                a1Var = a1Var2;
                eVar = eVar5;
                b1Var.f(0, eVar4, eVar, a1Var, !(mVar3 != null));
                z3 = true;
            } else {
                if (eVar4 == null) {
                    throw a0.q.f("expected prior modifier list to be non-empty");
                }
                y0.l lVar8 = a1Var2.i;
                for (int i13 = 0; lVar8 != null && i13 < eVar4.f5580f; i13++) {
                    lVar8 = b1.c(lVar8).i;
                }
                f0 s5 = f0Var.s();
                rVar.f7616t = s5 != null ? s5.F.f7597c : null;
                b1Var2.f7598d = rVar;
                b1Var = b1Var2;
                a1Var = a1Var2;
                eVar = eVar5;
                z3 = false;
                r7 = z7;
            }
        }
        b1Var.f7601g = eVar;
        if (eVar4 != null) {
            eVar4.g();
        } else {
            eVar4 = r7;
        }
        b1Var.f7602h = eVar4;
        y0.l lVar9 = a1Var.i;
        if (lVar9 != null) {
            lVar = lVar9;
        }
        lVar.f8710h = r7;
        a1Var.i = r7;
        a1Var.f8709g = -1;
        a1Var.f8712k = r7;
        if (lVar == a1Var) {
            t1.a.b("trimChain did not update the head");
        }
        b1Var.f7600f = lVar;
        if (z3) {
            b1Var.g();
        }
        boolean d10 = b1Var.d(16);
        boolean d11 = b1Var.d(1024);
        this.G.j();
        if (this.f7644j == null && b1Var.d(512)) {
            a0(this);
        }
        if (d8 == d10 && d9 == d11) {
            return;
        }
        e2.a rectManager = ((x1.t) i0.a(this)).getRectManager();
        rectManager.getClass();
        if (G()) {
            a0.b1 b1Var3 = rectManager.f2470a;
            int i14 = this.f7640e & 67108863;
            long[] jArr = (long[]) b1Var3.f23b;
            int i15 = b1Var3.f22a;
            for (int i16 = 0; i16 < jArr.length - 2 && i16 < i15; i16 += 3) {
                int i17 = i16 + 2;
                long j7 = jArr[i17];
                if ((((int) j7) & 67108863) == i14) {
                    jArr[i17] = ((d10 ? 1L : 0L) * Long.MIN_VALUE) | (4611686018427387903L & j7) | ((d11 ? 1L : 0L) * 4611686018427387904L);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void c0(x1.u1 u1Var) {
        if (q6.i.a(this.A, u1Var)) {
            return;
        }
        this.A = u1Var;
        y0.l lVar = this.F.f7600f;
        if ((lVar.f8709g & 16) != 0) {
            while (lVar != null) {
                if ((lVar.f8708f & 16) != 0) {
                    l lVar2 = lVar;
                    ?? r32 = 0;
                    while (lVar2 != 0) {
                        if (lVar2 instanceof p1) {
                            ((p1) lVar2).Q();
                        } else if ((lVar2.f8708f & 16) != 0 && (lVar2 instanceof l)) {
                            y0.l lVar3 = lVar2.f7707s;
                            int i = 0;
                            lVar2 = lVar2;
                            r32 = r32;
                            while (lVar3 != null) {
                                if ((lVar3.f8708f & 16) != 0) {
                                    i++;
                                    r32 = r32;
                                    if (i == 1) {
                                        lVar2 = lVar3;
                                    } else {
                                        if (r32 == 0) {
                                            r32 = new o0.e(new y0.l[16]);
                                        }
                                        if (lVar2 != 0) {
                                            r32.b(lVar2);
                                            lVar2 = 0;
                                        }
                                        r32.b(lVar3);
                                    }
                                }
                                lVar3 = lVar3.i;
                                lVar2 = lVar2;
                                r32 = r32;
                            }
                            if (i == 1) {
                            }
                        }
                        lVar2 = f.f(r32);
                    }
                }
                if ((lVar.f8709g & 16) == 0) {
                    return;
                } else {
                    lVar = lVar.i;
                }
            }
        }
    }

    public final void d(k1 k1Var) {
        f0 f0Var;
        z0.b bVar;
        d2.j u7;
        if (this.f7650p != null) {
            t1.a.b("Cannot attach " + this + " as it already is attached.  Tree: " + g(0));
        }
        f0 f0Var2 = this.f7649o;
        if (f0Var2 != null && !q6.i.a(f0Var2.f7650p, k1Var)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(k1Var);
            sb.append(") than the parent's owner(");
            f0 s5 = s();
            sb.append(s5 != null ? s5.f7650p : null);
            sb.append("). This tree: ");
            sb.append(g(0));
            sb.append(" Parent tree: ");
            f0 f0Var3 = this.f7649o;
            sb.append(f0Var3 != null ? f0Var3.g(0) : null);
            t1.a.b(sb.toString());
        }
        f0 s7 = s();
        j0 j0Var = this.G;
        if (s7 == null) {
            j0Var.f7700p.f7811u = true;
            s0 s0Var = j0Var.f7701q;
            if (s0Var != null) {
                s0Var.f7771s = p0.f7748d;
            }
        }
        b1 b1Var = this.F;
        b1Var.f7598d.f7616t = s7 != null ? s7.F.f7597c : null;
        this.f7650p = k1Var;
        this.f7651q = (s7 != null ? s7.f7651q : -1) + 1;
        y0.m mVar = this.L;
        if (mVar != null) {
            c(mVar);
        }
        this.L = null;
        x1.t tVar = (x1.t) k1Var;
        tVar.getLayoutNodes().g(this.f7640e, this);
        f0 f0Var4 = this.f7649o;
        if (f0Var4 == null || (f0Var = f0Var4.f7644j) == null) {
            f0Var = this.f7644j;
        }
        a0(f0Var);
        if (this.f7644j == null && b1Var.d(512)) {
            a0(this);
        }
        if (!this.O) {
            for (y0.l lVar = b1Var.f7600f; lVar != null; lVar = lVar.i) {
                lVar.h0();
            }
        }
        o0.e eVar = (o0.e) this.f7646l.f11e;
        Object[] objArr = eVar.f5578d;
        int i = eVar.f5580f;
        for (int i8 = 0; i8 < i; i8++) {
            ((f0) objArr[i8]).d(k1Var);
        }
        if (!this.O) {
            b1Var.e();
        }
        C();
        if (s7 != null) {
            s7.C();
        }
        j0Var.j();
        if (!this.O && b1Var.d(8)) {
            E();
        }
        tVar.getClass();
        if (!x1.t.g() || (bVar = tVar.H) == null || (u7 = u()) == null || !u7.f2150d.b(d2.s.f2203q)) {
            return;
        }
        bVar.f9108g.a(this.f7640e);
        bVar.f9102a.n(bVar.f9104c, this.f7640e, true);
    }

    public final void d0() {
        if (this.f7645k <= 0 || !this.f7648n) {
            return;
        }
        this.f7648n = false;
        o0.e eVar = this.f7647m;
        if (eVar == null) {
            eVar = new o0.e(new f0[16]);
            this.f7647m = eVar;
        }
        eVar.g();
        o0.e eVar2 = (o0.e) this.f7646l.f11e;
        Object[] objArr = eVar2.f5578d;
        int i = eVar2.f5580f;
        for (int i8 = 0; i8 < i; i8++) {
            f0 f0Var = (f0) objArr[i8];
            if (f0Var.f7639d) {
                eVar.d(eVar.f5580f, f0Var.x());
            } else {
                eVar.b(f0Var);
            }
        }
        j0 j0Var = this.G;
        j0Var.f7700p.B = true;
        s0 s0Var = j0Var.f7701q;
        if (s0Var != null) {
            s0Var.f7774v = true;
        }
    }

    public final void e() {
        this.D = this.C;
        this.C = d0.f7612f;
        o0.e x7 = x();
        Object[] objArr = x7.f5578d;
        int i = x7.f5580f;
        for (int i8 = 0; i8 < i; i8++) {
            f0 f0Var = (f0) objArr[i8];
            if (f0Var.C != d0.f7612f) {
                f0Var.e();
            }
        }
    }

    public final void f() {
        this.D = this.C;
        this.C = d0.f7612f;
        o0.e x7 = x();
        Object[] objArr = x7.f5578d;
        int i = x7.f5580f;
        for (int i8 = 0; i8 < i; i8++) {
            f0 f0Var = (f0) objArr[i8];
            if (f0Var.C == d0.f7611e) {
                f0Var.f();
            }
        }
    }

    public final String g(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < i; i8++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        o0.e x7 = x();
        Object[] objArr = x7.f5578d;
        int i9 = x7.f5580f;
        for (int i10 = 0; i10 < i9; i10++) {
            sb.append(((f0) objArr[i10]).g(i + 1));
        }
        String sb2 = sb.toString();
        if (i != 0) {
            return sb2;
        }
        String substring = sb2.substring(0, sb2.length() - 1);
        q6.i.d(substring, "substring(...)");
        return substring;
    }

    public final void h() {
        z0.b bVar;
        g0 g0Var;
        k1 k1Var = this.f7650p;
        if (k1Var == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            f0 s5 = s();
            sb.append(s5 != null ? s5.g(0) : null);
            t1.a.c(sb.toString());
            throw new a5.c();
        }
        f0 s7 = s();
        j0 j0Var = this.G;
        if (s7 != null) {
            s7.A();
            s7.C();
            w0 w0Var = j0Var.f7700p;
            d0 d0Var = d0.f7612f;
            w0Var.f7805o = d0Var;
            s0 s0Var = j0Var.f7701q;
            if (s0Var != null) {
                s0Var.f7765m = d0Var;
            }
        }
        g0 g0Var2 = j0Var.f7700p.f7816z;
        g0Var2.f7666b = true;
        g0Var2.f7667c = false;
        g0Var2.f7668d = false;
        g0Var2.f7669e = false;
        g0Var2.f7670f = null;
        s0 s0Var2 = j0Var.f7701q;
        if (s0Var2 != null && (g0Var = s0Var2.f7772t) != null) {
            g0Var.f7666b = true;
            g0Var.f7667c = false;
            g0Var.f7668d = false;
            g0Var.f7669e = false;
            g0Var.f7670f = null;
        }
        b1 b1Var = this.F;
        y0.l lVar = b1Var.f7599e;
        d1 d1Var = b1Var.f7597c.f7615s;
        for (d1 d1Var2 = b1Var.f7598d; !q6.i.a(d1Var2, d1Var) && d1Var2 != null; d1Var2 = d1Var2.f7615s) {
            d1Var2.X0();
        }
        for (y0.l lVar2 = lVar; lVar2 != null; lVar2 = lVar2.f8710h) {
            if (lVar2.f8718q) {
                lVar2.o0();
            }
        }
        this.f7652r = true;
        o0.e eVar = (o0.e) this.f7646l.f11e;
        Object[] objArr = eVar.f5578d;
        int i = eVar.f5580f;
        for (int i8 = 0; i8 < i; i8++) {
            ((f0) objArr[i8]).h();
        }
        this.f7652r = false;
        while (lVar != null) {
            if (lVar.f8718q) {
                lVar.i0();
            }
            lVar = lVar.f8710h;
        }
        x1.t tVar = (x1.t) k1Var;
        tVar.getLayoutNodes().f(this.f7640e);
        u0 u0Var = tVar.Q;
        a0.g1 g1Var = u0Var.f7787b;
        ((q3.k) g1Var.f84b).q(this);
        ((q3.k) g1Var.f85c).q(this);
        ((q3.k) g1Var.f86d).q(this);
        ((o0.e) u0Var.f7790e.f11e).j(this);
        tVar.I = true;
        tVar.getRectManager().j(this);
        if (x1.t.g() && (bVar = tVar.H) != null && bVar.f9108g.e(this.f7640e)) {
            bVar.f9102a.n(bVar.f9104c, this.f7640e, false);
        }
        this.f7650p = null;
        this.f7641f = 9223372034707292159L;
        a0(null);
        this.f7651q = 0;
        w0 w0Var2 = j0Var.f7700p;
        w0Var2.f7802l = Integer.MAX_VALUE;
        w0Var2.f7801k = Integer.MAX_VALUE;
        w0Var2.f7811u = false;
        s0 s0Var3 = j0Var.f7701q;
        if (s0Var3 != null) {
            s0Var3.f7764l = Integer.MAX_VALUE;
            s0Var3.f7763k = Integer.MAX_VALUE;
            s0Var3.f7771s = p0.f7750f;
        }
        if (b1Var.d(8)) {
            d2.j jVar = this.f7654t;
            this.f7654t = null;
            this.f7653s = false;
            tVar.getSemanticsOwner().b(this, jVar);
            tVar.z();
        }
    }

    public final void i(f1.q qVar, i1.b bVar) {
        try {
            this.F.f7598d.x0(qVar, bVar);
        } catch (Throwable th) {
            X(th);
            throw null;
        }
    }

    public final void k() {
        if (this.f7644j != null) {
            S(this, false, 5);
        } else {
            U(this, false, 5);
        }
        w0 w0Var = this.G.f7700p;
        r2.a aVar = w0Var.f7803m ? new r2.a(w0Var.f7233g) : null;
        if (aVar != null) {
            k1 k1Var = this.f7650p;
            if (k1Var != null) {
                ((x1.t) k1Var).t(this, aVar.f6514a);
                return;
            }
            return;
        }
        k1 k1Var2 = this.f7650p;
        if (k1Var2 != null) {
            ((x1.t) k1Var2).s(true);
        }
    }

    public final List l() {
        s0 s0Var = this.G.f7701q;
        q6.i.b(s0Var);
        o0.e eVar = s0Var.f7773u;
        j0 j0Var = s0Var.i;
        j0Var.f7686a.m();
        if (!s0Var.f7774v) {
            return eVar.f();
        }
        f0 f0Var = j0Var.f7686a;
        o0.e x7 = f0Var.x();
        Object[] objArr = x7.f5578d;
        int i = x7.f5580f;
        for (int i8 = 0; i8 < i; i8++) {
            f0 f0Var2 = (f0) objArr[i8];
            if (eVar.f5580f <= i8) {
                s0 s0Var2 = f0Var2.G.f7701q;
                q6.i.b(s0Var2);
                eVar.b(s0Var2);
            } else {
                s0 s0Var3 = f0Var2.G.f7701q;
                q6.i.b(s0Var3);
                Object[] objArr2 = eVar.f5578d;
                Object obj = objArr2[i8];
                objArr2[i8] = s0Var3;
            }
        }
        eVar.l(((o0.b) f0Var.m()).f5572d.f5580f, eVar.f5580f);
        s0Var.f7774v = false;
        return eVar.f();
    }

    public final List m() {
        return x().f();
    }

    public final List n() {
        return ((o0.e) this.f7646l.f11e).f();
    }

    public final boolean o() {
        return this.G.f7700p.f7814x;
    }

    public final boolean p() {
        return this.G.f7700p.f7813w;
    }

    public final d0 q() {
        return this.G.f7700p.f7805o;
    }

    public final d0 r() {
        d0 d0Var;
        s0 s0Var = this.G.f7701q;
        return (s0Var == null || (d0Var = s0Var.f7765m) == null) ? d0.f7612f : d0Var;
    }

    public final f0 s() {
        f0 f0Var = this.f7649o;
        while (f0Var != null && f0Var.f7639d) {
            f0Var = f0Var.f7649o;
        }
        return f0Var;
    }

    public final int t() {
        return this.G.f7700p.f7802l;
    }

    public final String toString() {
        return x1.g0.s(this) + " children: " + ((o0.b) m()).f5572d.f5580f + " measurePolicy: " + this.f7658x + " deactivated: " + this.O;
    }

    public final d2.j u() {
        if (G() && !this.O && this.F.d(8)) {
            return this.f7654t;
        }
        return null;
    }

    @Override // w1.l1
    public final boolean v() {
        return G();
    }

    public final o0.e w() {
        boolean z3 = this.f7657w;
        o0.e eVar = this.f7656v;
        if (z3) {
            eVar.g();
            eVar.d(eVar.f5580f, x());
            d6.l.Q(eVar.f5578d, R, 0, eVar.f5580f);
            this.f7657w = false;
        }
        return eVar;
    }

    public final o0.e x() {
        d0();
        if (this.f7645k == 0) {
            return (o0.e) this.f7646l.f11e;
        }
        o0.e eVar = this.f7647m;
        q6.i.b(eVar);
        return eVar;
    }

    public final void y(long j7, p pVar, int i, boolean z3) {
        b1 b1Var = this.F;
        d1 d1Var = b1Var.f7598d;
        f1.g0 g0Var = d1.M;
        b1Var.f7598d.J0(d1.O, d1Var.B0(j7), pVar, i, z3);
    }

    public final void z(int i, f0 f0Var) {
        if (f0Var.f7649o != null && f0Var.f7650p != null) {
            t1.a.b(j(f0Var));
        }
        f0Var.f7649o = this;
        a0.a0 a0Var = this.f7646l;
        ((o0.e) a0Var.f11e).a(i, f0Var);
        ((d1.o) a0Var.f12f).b();
        N();
        if (f0Var.f7639d) {
            this.f7645k++;
        }
        F();
        k1 k1Var = this.f7650p;
        if (k1Var != null) {
            f0Var.d(k1Var);
        }
        if (f0Var.G.f7696l > 0) {
            j0 j0Var = this.G;
            j0Var.d(j0Var.f7696l + 1);
        }
        if (f0Var.N > 0) {
            Z(this.N + 1);
        }
    }

    public f0(int i, boolean z3) {
        this.f7639d = z3;
        this.f7640e = i;
        this.f7641f = 9223372034707292159L;
        this.f7642g = 0L;
        this.f7643h = 9223372034707292159L;
        this.i = true;
        this.f7646l = new a0.a0(22, new o0.e(new f0[16]), new d1.o(11, this));
        this.f7656v = new o0.e(new f0[16]);
        this.f7657w = true;
        this.f7658x = P;
        this.f7659y = i0.f7685a;
        this.f7660z = r2.l.f6529d;
        this.A = Q;
        m0.a0.f4875b.getClass();
        this.B = m0.z.f5212b;
        d0 d0Var = d0.f7612f;
        this.C = d0Var;
        this.D = d0Var;
        this.F = new b1(this);
        this.G = new j0(this);
        this.J = true;
        this.K = y0.j.f8705a;
    }
}
