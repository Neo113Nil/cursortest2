package r1;

import java.util.List;
import s1.l2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d0 implements g0.j, h1, j {
    public static final a0 L = new a0("Undefined intrinsics block and it is required");
    public static final z M = new z();
    public static final b2.s N = new b2.s(2);
    public final g0.t A;
    public final l0 B;
    public p1.b0 C;
    public a1 D;
    public boolean E;
    public s0.o F;
    public s0.o G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7719f;

    /* renamed from: g, reason: collision with root package name */
    public int f7720g;

    /* renamed from: h, reason: collision with root package name */
    public d0 f7721h;

    /* renamed from: i, reason: collision with root package name */
    public int f7722i;

    /* renamed from: j, reason: collision with root package name */
    public final q5.g f7723j;

    /* renamed from: k, reason: collision with root package name */
    public i0.d f7724k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7725l;

    /* renamed from: m, reason: collision with root package name */
    public d0 f7726m;

    /* renamed from: n, reason: collision with root package name */
    public g1 f7727n;

    /* renamed from: o, reason: collision with root package name */
    public int f7728o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7729p;

    /* renamed from: q, reason: collision with root package name */
    public y1.i f7730q;

    /* renamed from: r, reason: collision with root package name */
    public final i0.d f7731r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7732s;

    /* renamed from: t, reason: collision with root package name */
    public p1.f0 f7733t;

    /* renamed from: u, reason: collision with root package name */
    public q5.g f7734u;

    /* renamed from: v, reason: collision with root package name */
    public m2.b f7735v;

    /* renamed from: w, reason: collision with root package name */
    public m2.k f7736w;

    /* renamed from: x, reason: collision with root package name */
    public l2 f7737x;

    /* renamed from: y, reason: collision with root package name */
    public g0.x f7738y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7739z;

    public d0(int i7) {
        this(y1.k.f9835a.addAndGet(1), (i7 & 1) == 0);
    }

    public static boolean M(d0 d0Var) {
        j0 j0Var = d0Var.B.f7848r;
        return d0Var.L(j0Var.f7814n ? new m2.a(j0Var.f7066i) : null);
    }

    public static void R(d0 d0Var, boolean z8, int i7) {
        d0 s5;
        if ((i7 & 1) != 0) {
            z8 = false;
        }
        boolean z9 = (i7 & 2) != 0;
        boolean z10 = (i7 & 4) != 0;
        if (d0Var.f7721h == null) {
            a.a.M("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
            throw null;
        }
        g1 g1Var = d0Var.f7727n;
        if (g1Var == null || d0Var.f7729p || d0Var.f7719f) {
            return;
        }
        ((s1.r) g1Var).x(d0Var, true, z8, z9);
        if (z10) {
            i0 i0Var = d0Var.B.f7849s;
            r6.k.c(i0Var);
            l0 l0Var = i0Var.C;
            d0 s8 = l0Var.f7831a.s();
            int i8 = l0Var.f7831a.J;
            if (s8 == null || i8 == 3) {
                return;
            }
            while (s8.J == i8 && (s5 = s8.s()) != null) {
                s8 = s5;
            }
            int d8 = l.h.d(i8);
            if (d8 == 0) {
                if (s8.f7721h != null) {
                    R(s8, z8, 6);
                    return;
                } else {
                    T(s8, z8, 6);
                    return;
                }
            }
            if (d8 != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (s8.f7721h != null) {
                s8.Q(z8);
            } else {
                s8.S(z8);
            }
        }
    }

    public static void T(d0 d0Var, boolean z8, int i7) {
        g1 g1Var;
        d0 s5;
        if ((i7 & 1) != 0) {
            z8 = false;
        }
        boolean z9 = (i7 & 2) != 0;
        boolean z10 = (i7 & 4) != 0;
        if (d0Var.f7729p || d0Var.f7719f || (g1Var = d0Var.f7727n) == null) {
            return;
        }
        ((s1.r) g1Var).x(d0Var, false, z8, z9);
        if (z10) {
            d0 d0Var2 = d0Var.B.f7848r.K.f7831a;
            d0 s8 = d0Var2.s();
            int i8 = d0Var2.J;
            if (s8 == null || i8 == 3) {
                return;
            }
            while (s8.J == i8 && (s5 = s8.s()) != null) {
                s8 = s5;
            }
            int d8 = l.h.d(i8);
            if (d8 == 0) {
                T(s8, z8, 6);
            } else {
                if (d8 != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                s8.S(z8);
            }
        }
    }

    public static void U(d0 d0Var) {
        l0 l0Var = d0Var.B;
        if (c0.f7717a[l.h.d(l0Var.f7833c)] != 1) {
            throw new IllegalStateException("Unexpected state ".concat(a0.m.w(l0Var.f7833c)));
        }
        if (l0Var.f7837g) {
            R(d0Var, true, 6);
            return;
        }
        if (l0Var.f7838h) {
            d0Var.Q(true);
        }
        if (l0Var.f7834d) {
            T(d0Var, true, 6);
        } else if (l0Var.f7835e) {
            d0Var.S(true);
        }
    }

    public final void A() {
        g0.t tVar = this.A;
        a1 a1Var = (a1) tVar.f3893d;
        t tVar2 = (t) tVar.f3892c;
        while (a1Var != tVar2) {
            r6.k.d(a1Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            y yVar = (y) a1Var;
            f1 f1Var = yVar.I;
            if (f1Var != null) {
                f1Var.invalidate();
            }
            a1Var = yVar.f7701r;
        }
        f1 f1Var2 = ((t) tVar.f3892c).I;
        if (f1Var2 != null) {
            f1Var2.invalidate();
        }
    }

    public final void B() {
        if (this.f7721h != null) {
            R(this, false, 7);
        } else {
            T(this, false, 7);
        }
    }

    public final void C() {
        this.f7730q = null;
        ((s1.r) g0.a(this)).z();
    }

    public final void D() {
        d0 d0Var;
        if (this.f7722i > 0) {
            this.f7725l = true;
        }
        if (!this.f7719f || (d0Var = this.f7726m) == null) {
            return;
        }
        d0Var.D();
    }

    public final boolean E() {
        return this.f7727n != null;
    }

    public final boolean F() {
        return this.B.f7848r.f7823w;
    }

    public final Boolean G() {
        i0 i0Var = this.B.f7849s;
        if (i0Var != null) {
            return Boolean.valueOf(i0Var.f7796u);
        }
        return null;
    }

    public final void H() {
        d0 s5;
        if (this.J == 3) {
            g();
        }
        i0 i0Var = this.B.f7849s;
        r6.k.c(i0Var);
        try {
            i0Var.f7786k = true;
            if (!i0Var.f7791p) {
                a.a.M("replace() called on item that was not placed");
                throw null;
            }
            i0Var.B = false;
            boolean z8 = i0Var.f7796u;
            i0Var.u0(i0Var.f7794s, i0Var.f7795t);
            if (z8 && !i0Var.B && (s5 = i0Var.C.f7831a.s()) != null) {
                s5.Q(false);
            }
        } finally {
            i0Var.f7786k = false;
        }
    }

    public final void I(int i7, int i8, int i9) {
        if (i7 == i8) {
            return;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = i7 > i8 ? i7 + i10 : i7;
            int i12 = i7 > i8 ? i8 + i10 : (i8 + i9) - 2;
            q5.g gVar = this.f7723j;
            i0.d dVar = (i0.d) gVar.f7527g;
            androidx.lifecycle.r0 r0Var = (androidx.lifecycle.r0) gVar.f7528h;
            Object o2 = dVar.o(i11);
            r0Var.a();
            ((i0.d) gVar.f7527g).a(i12, (d0) o2);
            r0Var.a();
        }
        K();
        D();
        B();
    }

    public final void J(d0 d0Var) {
        if (d0Var.B.f7844n > 0) {
            this.B.b(r0.f7844n - 1);
        }
        if (this.f7727n != null) {
            d0Var.i();
        }
        d0Var.f7726m = null;
        ((a1) d0Var.A.f3893d).f7702s = null;
        if (d0Var.f7719f) {
            this.f7722i--;
            i0.d dVar = (i0.d) d0Var.f7723j.f7527g;
            int i7 = dVar.f4842h;
            if (i7 > 0) {
                Object[] objArr = dVar.f4840f;
                int i8 = 0;
                do {
                    ((a1) ((d0) objArr[i8]).A.f3893d).f7702s = null;
                    i8++;
                } while (i8 < i7);
            }
        }
        D();
        K();
    }

    public final void K() {
        if (!this.f7719f) {
            this.f7732s = true;
            return;
        }
        d0 s5 = s();
        if (s5 != null) {
            s5.K();
        }
    }

    public final boolean L(m2.a aVar) {
        if (aVar == null) {
            return false;
        }
        if (this.J == 3) {
            f();
        }
        return this.B.f7848r.w0(aVar.f6306a);
    }

    public final void N() {
        q5.g gVar = this.f7723j;
        i0.d dVar = (i0.d) gVar.f7527g;
        i0.d dVar2 = (i0.d) gVar.f7527g;
        int i7 = dVar.f4842h;
        while (true) {
            i7--;
            if (-1 >= i7) {
                dVar2.h();
                ((androidx.lifecycle.r0) gVar.f7528h).a();
                return;
            }
            J((d0) dVar2.f4840f[i7]);
        }
    }

    public final void O(int i7, int i8) {
        if (i8 < 0) {
            a.a.L("count (" + i8 + ") must be greater than 0");
            throw null;
        }
        int i9 = (i8 + i7) - 1;
        if (i7 > i9) {
            return;
        }
        while (true) {
            q5.g gVar = this.f7723j;
            J((d0) ((i0.d) gVar.f7527g).f4840f[i9]);
            Object o2 = ((i0.d) gVar.f7527g).o(i9);
            ((androidx.lifecycle.r0) gVar.f7528h).a();
            if (i9 == i7) {
                return;
            } else {
                i9--;
            }
        }
    }

    public final void P() {
        d0 s5;
        if (this.J == 3) {
            g();
        }
        j0 j0Var = this.B.f7848r;
        j0Var.getClass();
        try {
            j0Var.f7811k = true;
            if (!j0Var.f7815o) {
                a.a.M("replace called on unplaced item");
                throw null;
            }
            boolean z8 = j0Var.f7823w;
            j0Var.v0(j0Var.f7818r, j0Var.f7820t, j0Var.f7819s);
            if (z8 && !j0Var.E && (s5 = j0Var.K.f7831a.s()) != null) {
                s5.S(false);
            }
        } finally {
            j0Var.f7811k = false;
        }
    }

    public final void Q(boolean z8) {
        g1 g1Var;
        if (this.f7719f || (g1Var = this.f7727n) == null) {
            return;
        }
        ((s1.r) g1Var).y(this, true, z8);
    }

    public final void S(boolean z8) {
        g1 g1Var;
        if (this.f7719f || (g1Var = this.f7727n) == null) {
            return;
        }
        ((s1.r) g1Var).y(this, false, z8);
    }

    public final void V() {
        i0.d v5 = v();
        int i7 = v5.f4842h;
        if (i7 > 0) {
            Object[] objArr = v5.f4840f;
            int i8 = 0;
            do {
                d0 d0Var = (d0) objArr[i8];
                int i9 = d0Var.K;
                d0Var.J = i9;
                if (i9 != 3) {
                    d0Var.V();
                }
                i8++;
            } while (i8 < i7);
        }
    }

    public final void W(m2.b bVar) {
        if (r6.k.a(this.f7735v, bVar)) {
            return;
        }
        this.f7735v = bVar;
        B();
        d0 s5 = s();
        if (s5 != null) {
            s5.y();
        }
        A();
        for (s0.n nVar = (s0.n) this.A.f3895f; nVar != null; nVar = nVar.f8109k) {
            if ((nVar.f8106h & 16) != 0) {
                ((l1) nVar).k();
            } else if (nVar instanceof w0.b) {
                ((w0.b) nVar).A0();
            }
        }
    }

    public final void X(d0 d0Var) {
        if (r6.k.a(d0Var, this.f7721h)) {
            return;
        }
        this.f7721h = d0Var;
        if (d0Var != null) {
            l0 l0Var = this.B;
            if (l0Var.f7849s == null) {
                l0Var.f7849s = new i0(l0Var);
            }
            g0.t tVar = this.A;
            a1 a1Var = ((t) tVar.f3892c).f7701r;
            for (a1 a1Var2 = (a1) tVar.f3893d; !r6.k.a(a1Var2, a1Var) && a1Var2 != null; a1Var2 = a1Var2.f7701r) {
                a1Var2.H0();
            }
        }
        B();
    }

    public final void Y(p1.f0 f0Var) {
        if (r6.k.a(this.f7733t, f0Var)) {
            return;
        }
        this.f7733t = f0Var;
        q5.g gVar = this.f7734u;
        if (gVar != null) {
            ((g0.g1) gVar.f7528h).setValue(f0Var);
        }
        B();
    }

    public final void Z(s0.o oVar) {
        if (this.f7719f && this.F != s0.l.f8103a) {
            a.a.L("Modifiers are not supported on virtual LayoutNodes");
            throw null;
        }
        if (this.I) {
            a.a.L("modifier is updated when deactivated");
            throw null;
        }
        if (E()) {
            d(oVar);
        } else {
            this.G = oVar;
        }
    }

    @Override // g0.j
    public final void a() {
        if (!E()) {
            a.a.L("onReuse is only expected on attached node");
            throw null;
        }
        p1.b0 b0Var = this.C;
        if (b0Var != null) {
            b0Var.f(false);
        }
        boolean z8 = this.I;
        g0.t tVar = this.A;
        if (z8) {
            this.I = false;
            C();
        } else {
            s0.n nVar = (o1) tVar.f3894e;
            for (s0.n nVar2 = nVar; nVar2 != null; nVar2 = nVar2.f8108j) {
                if (nVar2.f8116r) {
                    nVar2.v0();
                }
            }
            for (s0.n nVar3 = nVar; nVar3 != null; nVar3 = nVar3.f8108j) {
                if (nVar3.f8116r) {
                    nVar3.x0();
                }
            }
            while (nVar != null) {
                if (nVar.f8116r) {
                    nVar.r0();
                }
                nVar = nVar.f8108j;
            }
        }
        this.f7720g = y1.k.f9835a.addAndGet(1);
        for (s0.n nVar4 = (s0.n) tVar.f3895f; nVar4 != null; nVar4 = nVar4.f8109k) {
            nVar4.q0();
        }
        tVar.i();
        U(this);
    }

    public final void a0() {
        if (this.f7722i <= 0 || !this.f7725l) {
            return;
        }
        int i7 = 0;
        this.f7725l = false;
        i0.d dVar = this.f7724k;
        if (dVar == null) {
            dVar = new i0.d(new d0[16]);
            this.f7724k = dVar;
        }
        dVar.h();
        i0.d dVar2 = (i0.d) this.f7723j.f7527g;
        int i8 = dVar2.f4842h;
        if (i8 > 0) {
            Object[] objArr = dVar2.f4840f;
            do {
                d0 d0Var = (d0) objArr[i7];
                if (d0Var.f7719f) {
                    dVar.c(dVar.f4842h, d0Var.v());
                } else {
                    dVar.b(d0Var);
                }
                i7++;
            } while (i7 < i8);
        }
        l0 l0Var = this.B;
        l0Var.f7848r.A = true;
        i0 i0Var = l0Var.f7849s;
        if (i0Var != null) {
            i0Var.f7799x = true;
        }
    }

    @Override // g0.j
    public final void b() {
        p1.b0 b0Var = this.C;
        if (b0Var != null) {
            b0Var.b();
        }
        g0.t tVar = this.A;
        a1 a1Var = ((t) tVar.f3892c).f7701r;
        for (a1 a1Var2 = (a1) tVar.f3893d; !r6.k.a(a1Var2, a1Var) && a1Var2 != null; a1Var2 = a1Var2.f7701r) {
            a1Var2.f7703t = true;
            a1Var2.G.a();
            if (a1Var2.I != null) {
                a1Var2.h1(null, false);
                a1Var2.f7700q.S(false);
            }
        }
    }

    @Override // g0.j
    public final void c() {
        p1.b0 b0Var = this.C;
        if (b0Var != null) {
            b0Var.f(true);
        }
        this.I = true;
        s0.n nVar = (o1) this.A.f3894e;
        for (s0.n nVar2 = nVar; nVar2 != null; nVar2 = nVar2.f8108j) {
            if (nVar2.f8116r) {
                nVar2.v0();
            }
        }
        for (s0.n nVar3 = nVar; nVar3 != null; nVar3 = nVar3.f8108j) {
            if (nVar3.f8116r) {
                nVar3.x0();
            }
        }
        while (nVar != null) {
            if (nVar.f8116r) {
                nVar.r0();
            }
            nVar = nVar.f8108j;
        }
        if (E()) {
            C();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016e  */
    /* JADX WARN: Type inference failed for: r3v9, types: [s0.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(s0.o oVar) {
        i0.d dVar;
        g0.t tVar;
        i0.d dVar2;
        boolean z8;
        v0 v0Var;
        ?? r32;
        this.F = oVar;
        g0.t tVar2 = this.A;
        t tVar3 = (t) tVar2.f3892c;
        o1 o1Var = (o1) tVar2.f3894e;
        d0 d0Var = (d0) tVar2.f3891b;
        s0.n nVar = (s0.n) tVar2.f3895f;
        s0.n nVar2 = w0.f7910a;
        if (nVar == nVar2) {
            a.a.M("padChain called on already padded chain");
            throw null;
        }
        nVar.f8108j = nVar2;
        nVar2.f8109k = nVar;
        i0.d dVar3 = (i0.d) tVar2.f3896g;
        int i7 = dVar3 != null ? dVar3.f4842h : 0;
        i0.d dVar4 = (i0.d) tVar2.f3897h;
        if (dVar4 == null) {
            dVar4 = new i0.d(new s0.m[16]);
        }
        int i8 = dVar4.f4842h;
        if (i8 < 16) {
            i8 = 16;
        }
        i0.d dVar5 = new i0.d(new s0.o[i8]);
        dVar5.b(oVar);
        c1.a aVar = null;
        while (dVar5.m()) {
            s0.o oVar2 = (s0.o) dVar5.o(dVar5.f4842h - 1);
            if (oVar2 instanceof s0.i) {
                s0.i iVar = (s0.i) oVar2;
                dVar5.b(iVar.f8100b);
                dVar5.b(iVar.f8099a);
            } else if (oVar2 instanceof s0.m) {
                dVar4.b(oVar2);
            } else {
                if (aVar == null) {
                    aVar = new c1.a(27, dVar4);
                }
                oVar2.a(aVar);
                aVar = aVar;
            }
        }
        int i9 = dVar4.f4842h;
        if (i9 == i7) {
            s0.n nVar3 = nVar2.f8109k;
            int i10 = 0;
            while (true) {
                if (nVar3 == null || i10 >= i7) {
                    break;
                }
                if (dVar3 == null) {
                    a.a.N("expected prior modifier list to be non-empty");
                    throw null;
                }
                s0.m mVar = (s0.m) dVar3.f4840f[i10];
                s0.m mVar2 = (s0.m) dVar4.f4840f[i10];
                char c4 = r6.k.a(mVar, mVar2) ? (char) 2 : mVar.getClass() == mVar2.getClass() ? (char) 1 : (char) 0;
                if (c4 == 0) {
                    nVar3 = nVar3.f8108j;
                    break;
                }
                if (c4 == 1) {
                    g0.t.l(mVar, mVar2, nVar3);
                }
                nVar3 = nVar3.f8109k;
                i10++;
            }
            if (i10 < i7) {
                if (dVar3 == null) {
                    a.a.N("expected prior modifier list to be non-empty");
                    throw null;
                }
                if (nVar3 == null) {
                    a.a.N("structuralUpdate requires a non-null tail");
                    throw null;
                }
                boolean z9 = d0Var.G != null;
                s0.n nVar4 = nVar3;
                tVar = tVar2;
                dVar = dVar3;
                dVar2 = dVar4;
                tVar.j(i10, dVar, dVar2, nVar4, !z9);
                dVar3 = dVar;
                z8 = true;
                tVar.f3896g = dVar2;
                if (dVar3 != null) {
                    dVar3.h();
                } else {
                    dVar3 = null;
                }
                tVar.f3897h = dVar3;
                v0Var = w0.f7910a;
                r32 = v0Var.f8109k;
                if (r32 != 0) {
                    o1Var = r32;
                }
                o1Var.f8108j = null;
                v0Var.f8109k = null;
                v0Var.f8107i = -1;
                v0Var.f8111m = null;
                if (o1Var == v0Var) {
                    a.a.M("trimChain did not update the head");
                    throw null;
                }
                tVar.f3895f = o1Var;
                if (z8) {
                    tVar.k();
                }
                this.B.h();
                if (this.f7721h == null && tVar.f(512)) {
                    X(this);
                    return;
                }
                return;
            }
            tVar2 = tVar2;
            tVar = tVar2;
            dVar2 = dVar4;
            z8 = false;
            tVar.f3896g = dVar2;
            if (dVar3 != null) {
            }
            tVar.f3897h = dVar3;
            v0Var = w0.f7910a;
            r32 = v0Var.f8109k;
            if (r32 != 0) {
            }
            o1Var.f8108j = null;
            v0Var.f8109k = null;
            v0Var.f8107i = -1;
            v0Var.f8111m = null;
            if (o1Var == v0Var) {
            }
        } else {
            s0.o oVar3 = d0Var.G;
            if (oVar3 != null && i7 == 0) {
                for (int i11 = 0; i11 < dVar4.f4842h; i11++) {
                    nVar2 = g0.t.b((s0.m) dVar4.f4840f[i11], nVar2);
                }
                int i12 = 0;
                for (s0.n nVar5 = o1Var.f8108j; nVar5 != null && nVar5 != w0.f7910a; nVar5 = nVar5.f8108j) {
                    i12 |= nVar5.f8106h;
                    nVar5.f8107i = i12;
                }
                tVar = tVar2;
                dVar2 = dVar4;
                z8 = true;
                tVar.f3896g = dVar2;
                if (dVar3 != null) {
                }
                tVar.f3897h = dVar3;
                v0Var = w0.f7910a;
                r32 = v0Var.f8109k;
                if (r32 != 0) {
                }
                o1Var.f8108j = null;
                v0Var.f8109k = null;
                v0Var.f8107i = -1;
                v0Var.f8111m = null;
                if (o1Var == v0Var) {
                }
            } else if (i9 != 0) {
                if (dVar3 == null) {
                    dVar3 = new i0.d(new s0.m[16]);
                }
                dVar = dVar3;
                tVar = tVar2;
                dVar2 = dVar4;
                tVar.j(0, dVar, dVar2, nVar2, !(oVar3 != null));
                dVar3 = dVar;
                z8 = true;
                tVar.f3896g = dVar2;
                if (dVar3 != null) {
                }
                tVar.f3897h = dVar3;
                v0Var = w0.f7910a;
                r32 = v0Var.f8109k;
                if (r32 != 0) {
                }
                o1Var.f8108j = null;
                v0Var.f8109k = null;
                v0Var.f8107i = -1;
                v0Var.f8111m = null;
                if (o1Var == v0Var) {
                }
            } else {
                if (dVar3 == null) {
                    a.a.N("expected prior modifier list to be non-empty");
                    throw null;
                }
                s0.n nVar6 = nVar2.f8109k;
                for (int i13 = 0; nVar6 != null && i13 < dVar3.f4842h; i13++) {
                    nVar6 = g0.t.c(nVar6).f8109k;
                }
                d0 s5 = d0Var.s();
                tVar3.f7702s = s5 != null ? (t) s5.A.f3892c : null;
                tVar2.f3893d = tVar3;
                tVar = tVar2;
                dVar2 = dVar4;
                z8 = false;
                tVar.f3896g = dVar2;
                if (dVar3 != null) {
                }
                tVar.f3897h = dVar3;
                v0Var = w0.f7910a;
                r32 = v0Var.f8109k;
                if (r32 != 0) {
                }
                o1Var.f8108j = null;
                v0Var.f8109k = null;
                v0Var.f8107i = -1;
                v0Var.f8111m = null;
                if (o1Var == v0Var) {
                }
            }
        }
    }

    public final void e(g1 g1Var) {
        d0 d0Var;
        if (this.f7727n != null) {
            a.a.M("Cannot attach " + this + " as it already is attached.  Tree: " + h(0));
            throw null;
        }
        d0 d0Var2 = this.f7726m;
        if (d0Var2 != null && !r6.k.a(d0Var2.f7727n, g1Var)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(g1Var);
            sb.append(") than the parent's owner(");
            d0 s5 = s();
            sb.append(s5 != null ? s5.f7727n : null);
            sb.append("). This tree: ");
            sb.append(h(0));
            sb.append(" Parent tree: ");
            d0 d0Var3 = this.f7726m;
            sb.append(d0Var3 != null ? d0Var3.h(0) : null);
            a.a.M(sb.toString());
            throw null;
        }
        d0 s8 = s();
        l0 l0Var = this.B;
        if (s8 == null) {
            l0Var.f7848r.f7823w = true;
            i0 i0Var = l0Var.f7849s;
            if (i0Var != null) {
                i0Var.f7796u = true;
            }
        }
        g0.t tVar = this.A;
        ((a1) tVar.f3893d).f7702s = s8 != null ? (t) s8.A.f3892c : null;
        this.f7727n = g1Var;
        this.f7728o = (s8 != null ? s8.f7728o : -1) + 1;
        s0.o oVar = this.G;
        if (oVar != null) {
            d(oVar);
        }
        this.G = null;
        if (tVar.f(8)) {
            C();
        }
        g1Var.getClass();
        d0 d0Var4 = this.f7726m;
        if (d0Var4 == null || (d0Var = d0Var4.f7721h) == null) {
            d0Var = this.f7721h;
        }
        X(d0Var);
        if (this.f7721h == null && tVar.f(512)) {
            X(this);
        }
        if (!this.I) {
            for (s0.n nVar = (s0.n) tVar.f3895f; nVar != null; nVar = nVar.f8109k) {
                nVar.q0();
            }
        }
        i0.d dVar = (i0.d) this.f7723j.f7527g;
        int i7 = dVar.f4842h;
        if (i7 > 0) {
            Object[] objArr = dVar.f4840f;
            int i8 = 0;
            do {
                ((d0) objArr[i8]).e(g1Var);
                i8++;
            } while (i8 < i7);
        }
        if (!this.I) {
            tVar.i();
        }
        B();
        if (s8 != null) {
            s8.B();
        }
        a1 a1Var = ((t) tVar.f3892c).f7701r;
        for (a1 a1Var2 = (a1) tVar.f3893d; !r6.k.a(a1Var2, a1Var) && a1Var2 != null; a1Var2 = a1Var2.f7701r) {
            a1Var2.h1(a1Var2.f7705v, true);
            f1 f1Var = a1Var2.I;
            if (f1Var != null) {
                f1Var.invalidate();
            }
        }
        l0Var.h();
        if (this.I) {
            return;
        }
        s0.n nVar2 = (s0.n) tVar.f3895f;
        if ((nVar2.f8107i & 7168) != 0) {
            while (nVar2 != null) {
                int i9 = nVar2.f8106h;
                if (((i9 & 4096) != 0) | ((i9 & 1024) != 0) | ((i9 & 2048) != 0)) {
                    b1.a(nVar2);
                }
                nVar2 = nVar2.f8109k;
            }
        }
    }

    public final void f() {
        this.K = this.J;
        this.J = 3;
        i0.d v5 = v();
        int i7 = v5.f4842h;
        if (i7 > 0) {
            Object[] objArr = v5.f4840f;
            int i8 = 0;
            do {
                d0 d0Var = (d0) objArr[i8];
                if (d0Var.J != 3) {
                    d0Var.f();
                }
                i8++;
            } while (i8 < i7);
        }
    }

    public final void g() {
        this.K = this.J;
        this.J = 3;
        i0.d v5 = v();
        int i7 = v5.f4842h;
        if (i7 > 0) {
            Object[] objArr = v5.f4840f;
            int i8 = 0;
            do {
                d0 d0Var = (d0) objArr[i8];
                if (d0Var.J == 2) {
                    d0Var.g();
                }
                i8++;
            } while (i8 < i7);
        }
    }

    public final String h(int i7) {
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < i7; i8++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        i0.d v5 = v();
        int i9 = v5.f4842h;
        if (i9 > 0) {
            Object[] objArr = v5.f4840f;
            int i10 = 0;
            do {
                sb.append(((d0) objArr[i10]).h(i7 + 1));
                i10++;
            } while (i10 < i9);
        }
        String sb2 = sb.toString();
        if (i7 != 0) {
            return sb2;
        }
        String substring = sb2.substring(0, sb2.length() - 1);
        r6.k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final void i() {
        e0 e0Var;
        g1 g1Var = this.f7727n;
        if (g1Var == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            d0 s5 = s();
            sb.append(s5 != null ? s5.h(0) : null);
            a.a.N(sb.toString());
            throw null;
        }
        d0 s8 = s();
        l0 l0Var = this.B;
        if (s8 != null) {
            s8.y();
            s8.B();
            l0Var.f7848r.f7816p = 3;
            i0 i0Var = l0Var.f7849s;
            if (i0Var != null) {
                i0Var.f7789n = 3;
            }
        }
        e0 e0Var2 = l0Var.f7848r.f7825y;
        e0Var2.f7755b = true;
        e0Var2.f7756c = false;
        e0Var2.f7758e = false;
        e0Var2.f7757d = false;
        e0Var2.f7759f = false;
        e0Var2.f7760g = false;
        e0Var2.f7761h = null;
        i0 i0Var2 = l0Var.f7849s;
        if (i0Var2 != null && (e0Var = i0Var2.f7797v) != null) {
            e0Var.f7755b = true;
            e0Var.f7756c = false;
            e0Var.f7758e = false;
            e0Var.f7757d = false;
            e0Var.f7759f = false;
            e0Var.f7760g = false;
            e0Var.f7761h = null;
        }
        g0.t tVar = this.A;
        boolean f9 = tVar.f(8);
        s0.n nVar = (o1) tVar.f3894e;
        if (f9) {
            C();
        }
        for (s0.n nVar2 = nVar; nVar2 != null; nVar2 = nVar2.f8108j) {
            if (nVar2.f8116r) {
                nVar2.x0();
            }
        }
        this.f7729p = true;
        i0.d dVar = (i0.d) this.f7723j.f7527g;
        int i7 = dVar.f4842h;
        if (i7 > 0) {
            Object[] objArr = dVar.f4840f;
            int i8 = 0;
            do {
                ((d0) objArr[i8]).i();
                i8++;
            } while (i8 < i7);
        }
        this.f7729p = false;
        while (nVar != null) {
            if (nVar.f8116r) {
                nVar.r0();
            }
            nVar = nVar.f8108j;
        }
        s1.r rVar = (s1.r) g1Var;
        r0 r0Var = rVar.L;
        q5.g gVar = r0Var.f7892b;
        ((q5.g) gVar.f7527g).o(this);
        ((q5.g) gVar.f7528h).o(this);
        ((i0.d) r0Var.f7895e.f7527g).n(this);
        rVar.D = true;
        this.f7727n = null;
        X(null);
        this.f7728o = 0;
        j0 j0Var = l0Var.f7848r;
        j0Var.f7813m = Integer.MAX_VALUE;
        j0Var.f7812l = Integer.MAX_VALUE;
        j0Var.f7823w = false;
        i0 i0Var3 = l0Var.f7849s;
        if (i0Var3 != null) {
            i0Var3.f7788m = Integer.MAX_VALUE;
            i0Var3.f7787l = Integer.MAX_VALUE;
            i0Var3.f7796u = false;
        }
    }

    public final void j(z0.r rVar, c1.c cVar) {
        ((a1) this.A.f3893d).E0(rVar, cVar);
    }

    public final void k() {
        if (this.f7721h != null) {
            R(this, false, 5);
        } else {
            T(this, false, 5);
        }
        j0 j0Var = this.B.f7848r;
        m2.a aVar = j0Var.f7814n ? new m2.a(j0Var.f7066i) : null;
        if (aVar != null) {
            g1 g1Var = this.f7727n;
            if (g1Var != null) {
                ((s1.r) g1Var).r(this, aVar.f6306a);
                return;
            }
            return;
        }
        g1 g1Var2 = this.f7727n;
        if (g1Var2 != null) {
            ((s1.r) g1Var2).q(true);
        }
    }

    public final List l() {
        i0 i0Var = this.B.f7849s;
        r6.k.c(i0Var);
        i0.d dVar = i0Var.f7798w;
        l0 l0Var = i0Var.C;
        l0Var.f7831a.n();
        if (!i0Var.f7799x) {
            return dVar.g();
        }
        d0 d0Var = l0Var.f7831a;
        i0.d v5 = d0Var.v();
        int i7 = v5.f4842h;
        if (i7 > 0) {
            Object[] objArr = v5.f4840f;
            int i8 = 0;
            do {
                d0 d0Var2 = (d0) objArr[i8];
                if (dVar.f4842h <= i8) {
                    i0 i0Var2 = d0Var2.B.f7849s;
                    r6.k.c(i0Var2);
                    dVar.b(i0Var2);
                } else {
                    i0 i0Var3 = d0Var2.B.f7849s;
                    r6.k.c(i0Var3);
                    Object[] objArr2 = dVar.f4840f;
                    Object obj = objArr2[i8];
                    objArr2[i8] = i0Var3;
                }
                i8++;
            } while (i8 < i7);
        }
        dVar.p(((i0.a) d0Var.n()).f4834f.f4842h, dVar.f4842h);
        i0Var.f7799x = false;
        return dVar.g();
    }

    public final List m() {
        return this.B.f7848r.p0();
    }

    public final List n() {
        return v().g();
    }

    public final y1.i o() {
        if (!E() || this.I) {
            return null;
        }
        if (!this.A.f(8) || this.f7730q != null) {
            return this.f7730q;
        }
        r6.v vVar = new r6.v();
        vVar.f7968f = new y1.i();
        i1 snapshotObserver = ((s1.r) g0.a(this)).getSnapshotObserver();
        snapshotObserver.a(this, snapshotObserver.f7805d, new a0.b1(this, 5, vVar));
        y1.i iVar = (y1.i) vVar.f7968f;
        this.f7730q = iVar;
        return iVar;
    }

    public final List p() {
        return ((i0.d) this.f7723j.f7527g).g();
    }

    public final int q() {
        int i7;
        i0 i0Var = this.B.f7849s;
        if (i0Var == null || (i7 = i0Var.f7789n) == 0) {
            return 3;
        }
        return i7;
    }

    public final q5.g r() {
        q5.g gVar = this.f7734u;
        if (gVar != null) {
            return gVar;
        }
        q5.g gVar2 = new q5.g(this, this.f7733t);
        this.f7734u = gVar2;
        return gVar2;
    }

    public final d0 s() {
        d0 d0Var = this.f7726m;
        while (d0Var != null && d0Var.f7719f) {
            d0Var = d0Var.f7726m;
        }
        return d0Var;
    }

    public final int t() {
        return this.B.f7848r.f7813m;
    }

    public final String toString() {
        return s1.j0.z(this) + " children: " + ((i0.a) n()).f4834f.f4842h + " measurePolicy: " + this.f7733t;
    }

    public final i0.d u() {
        boolean z8 = this.f7732s;
        i0.d dVar = this.f7731r;
        if (z8) {
            dVar.h();
            dVar.c(dVar.f4842h, v());
            dVar.q(N);
            this.f7732s = false;
        }
        return dVar;
    }

    public final i0.d v() {
        a0();
        if (this.f7722i == 0) {
            return (i0.d) this.f7723j.f7527g;
        }
        i0.d dVar = this.f7724k;
        r6.k.c(dVar);
        return dVar;
    }

    public final void w(long j8, r rVar, boolean z8, boolean z9) {
        g0.t tVar = this.A;
        a1 a1Var = (a1) tVar.f3893d;
        z0.n0 n0Var = a1.J;
        ((a1) tVar.f3893d).Q0(a1.M, a1Var.J0(j8), rVar, z8, z9);
    }

    public final void x(int i7, d0 d0Var) {
        if (d0Var.f7726m != null) {
            StringBuilder sb = new StringBuilder("Cannot insert ");
            sb.append(d0Var);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(h(0));
            sb.append(" Other tree: ");
            d0 d0Var2 = d0Var.f7726m;
            sb.append(d0Var2 != null ? d0Var2.h(0) : null);
            a.a.M(sb.toString());
            throw null;
        }
        if (d0Var.f7727n != null) {
            a.a.M("Cannot insert " + d0Var + " because it already has an owner. This tree: " + h(0) + " Other tree: " + d0Var.h(0));
            throw null;
        }
        d0Var.f7726m = this;
        q5.g gVar = this.f7723j;
        ((i0.d) gVar.f7527g).a(i7, d0Var);
        ((androidx.lifecycle.r0) gVar.f7528h).a();
        K();
        if (d0Var.f7719f) {
            this.f7722i++;
        }
        D();
        g1 g1Var = this.f7727n;
        if (g1Var != null) {
            d0Var.e(g1Var);
        }
        if (d0Var.B.f7844n > 0) {
            l0 l0Var = this.B;
            l0Var.b(l0Var.f7844n + 1);
        }
    }

    public final void y() {
        if (this.E) {
            g0.t tVar = this.A;
            a1 a1Var = (t) tVar.f3892c;
            a1 a1Var2 = ((a1) tVar.f3893d).f7702s;
            this.D = null;
            while (true) {
                if (r6.k.a(a1Var, a1Var2)) {
                    break;
                }
                if ((a1Var != null ? a1Var.I : null) != null) {
                    this.D = a1Var;
                    break;
                }
                a1Var = a1Var != null ? a1Var.f7702s : null;
            }
        }
        a1 a1Var3 = this.D;
        if (a1Var3 != null && a1Var3.I == null) {
            a.a.N("layer was not set");
            throw null;
        }
        if (a1Var3 != null) {
            a1Var3.S0();
            return;
        }
        d0 s5 = s();
        if (s5 != null) {
            s5.y();
        }
    }

    @Override // r1.h1
    public final boolean z() {
        return E();
    }

    public d0(int i7, boolean z8) {
        this.f7719f = z8;
        this.f7720g = i7;
        this.f7723j = new q5.g(new i0.d(new d0[16]), 5, new androidx.lifecycle.r0(26, this));
        this.f7731r = new i0.d(new d0[16]);
        this.f7732s = true;
        this.f7733t = L;
        this.f7735v = g0.f7771a;
        this.f7736w = m2.k.f6322f;
        this.f7737x = M;
        g0.x.f3957b.getClass();
        this.f7738y = g0.w.f3955b;
        this.J = 3;
        this.K = 3;
        this.A = new g0.t(this);
        this.B = new l0(this);
        this.E = true;
        this.F = s0.l.f8103a;
    }
}
