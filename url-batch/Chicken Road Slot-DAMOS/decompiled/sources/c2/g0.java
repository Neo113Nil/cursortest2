package c2;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import n0.n2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g0 implements n0.i, p1, g {

    /* renamed from: e0, reason: collision with root package name */
    public static final b0 f1542e0 = new b0();

    /* renamed from: f0, reason: collision with root package name */
    public static final a0 f1543f0 = new a0();

    /* renamed from: g0, reason: collision with root package name */
    public static final y f1544g0 = new y(0);
    public g0 A;
    public d2.v B;
    public a3.e0 C;
    public int D;
    public boolean E;
    public boolean F;
    public j2.j G;
    public boolean H;
    public final o0.e I;
    public boolean J;
    public a2.g0 K;
    public x2.c L;
    public x2.l M;
    public d2.c2 N;
    public n0.t O;
    public e0 P;
    public e0 Q;
    public boolean R;
    public final b1 S;
    public final k0 T;
    public a2.c0 U;
    public i1 V;
    public boolean W;
    public d1.l X;
    public d1.l Y;
    public a3.f Z;

    /* renamed from: a0, reason: collision with root package name */
    public a3.g f1545a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f1546b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f1547c0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1548d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f1549d0;

    /* renamed from: e, reason: collision with root package name */
    public int f1550e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1551i;

    /* renamed from: r, reason: collision with root package name */
    public long f1552r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1553s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1554t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1555u;

    /* renamed from: v, reason: collision with root package name */
    public g0 f1556v;

    /* renamed from: w, reason: collision with root package name */
    public int f1557w;

    /* renamed from: x, reason: collision with root package name */
    public final c6.l f1558x;

    /* renamed from: y, reason: collision with root package name */
    public o0.e f1559y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1560z;

    public g0(int i3, boolean z10) {
        this.f1548d = z10;
        this.f1550e = i3;
        this.f1552r = 9223372034707292159L;
        this.f1553s = true;
        this.f1554t = true;
        this.f1558x = new c6.l(2, new o0.e(new g0[16]), new a2.a0(3, this));
        this.I = new o0.e(new g0[16]);
        this.J = true;
        this.K = f1542e0;
        this.L = j0.f1590a;
        this.M = x2.l.f10330d;
        this.N = f1543f0;
        n0.t.f6815o.getClass();
        this.O = n0.s.f6808b;
        e0 e0Var = e0.f1530i;
        this.P = e0Var;
        this.Q = e0Var;
        this.S = new b1(this);
        this.T = new k0(this);
        this.W = true;
        this.X = d1.i.f3304a;
    }

    public static boolean L(g0 g0Var) {
        w0 w0Var = g0Var.T.f1606p;
        x2.a aVar = w0Var.f1691x ? new x2.a(w0Var.f134r) : null;
        if (aVar == null) {
            g0Var.getClass();
            return false;
        }
        if (g0Var.P == e0.f1530i) {
            g0Var.c();
        }
        return g0Var.T.f1606p.h0(aVar.f10316a);
    }

    public static void P(g0 g0Var, boolean z10, int i3) {
        g0 s3;
        if ((i3 & 1) != 0) {
            z10 = false;
        }
        boolean z11 = (i3 & 4) != 0;
        if (g0Var.f1556v == null) {
            z1.a.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        d2.v vVar = g0Var.B;
        if (vVar == null || g0Var.E || g0Var.f1548d) {
            return;
        }
        vVar.A(g0Var, true, z10);
        if (z11) {
            s0 s0Var = g0Var.T.f1607q;
            s0Var.getClass();
            k0 k0Var = s0Var.f1661t;
            g0 s10 = k0Var.f1593a.s();
            e0 e0Var = k0Var.f1593a.P;
            if (s10 == null || e0Var == e0.f1530i) {
                return;
            }
            while (s10.P == e0Var && (s3 = s10.s()) != null) {
                s10 = s3;
            }
            int ordinal = e0Var.ordinal();
            if (ordinal == 0) {
                if (s10.f1556v != null) {
                    P(s10, z10, 6);
                    return;
                } else {
                    R(s10, z10, 6);
                    return;
                }
            }
            if (ordinal != 1) {
                kotlin.collections.i0.l("Intrinsics isn't used by the parent");
            } else if (s10.f1556v != null) {
                s10.O(z10);
            } else {
                s10.Q(z10);
            }
        }
    }

    public static void R(g0 g0Var, boolean z10, int i3) {
        d2.v vVar;
        g0 s3;
        if ((i3 & 1) != 0) {
            z10 = false;
        }
        boolean z11 = (i3 & 4) != 0;
        if (g0Var.E || g0Var.f1548d || (vVar = g0Var.B) == null) {
            return;
        }
        vVar.A(g0Var, false, z10);
        if (z11) {
            k0 k0Var = g0Var.T.f1606p.f1687t;
            g0 s10 = k0Var.f1593a.s();
            e0 e0Var = k0Var.f1593a.P;
            if (s10 == null || e0Var == e0.f1530i) {
                return;
            }
            while (s10.P == e0Var && (s3 = s10.s()) != null) {
                s10 = s3;
            }
            int ordinal = e0Var.ordinal();
            if (ordinal == 0) {
                R(s10, z10, 6);
            } else if (ordinal == 1) {
                s10.Q(z10);
            } else {
                kotlin.collections.i0.l("Intrinsics isn't used by the parent");
            }
        }
    }

    public static void S(g0 g0Var) {
        int i3 = f0.f1538a[g0Var.T.f1596d.ordinal()];
        k0 k0Var = g0Var.T;
        if (i3 != 1) {
            te.a1.i(k0Var.f1596d, "Unexpected state ");
            return;
        }
        if (k0Var.f1597e) {
            P(g0Var, true, 6);
            return;
        }
        if (k0Var.f1598f) {
            g0Var.O(true);
        }
        if (g0Var.p()) {
            R(g0Var, true, 6);
        } else if (g0Var.n()) {
            g0Var.Q(true);
        }
    }

    private final String j(g0 g0Var) {
        StringBuilder sb2 = new StringBuilder("Cannot insert ");
        sb2.append(g0Var);
        sb2.append(" because it already has a parent or an owner. This tree: ");
        sb2.append(e(0));
        sb2.append(" Other tree: ");
        g0 g0Var2 = g0Var.A;
        sb2.append(g0Var2 != null ? g0Var2.e(0) : null);
        return sb2.toString();
    }

    public final void A() {
        b1 b1Var = this.S;
        i1 i1Var = (i1) b1Var.f1494e;
        q qVar = (q) b1Var.f1493d;
        while (i1Var != qVar) {
            i1Var.getClass();
            x xVar = (x) i1Var;
            o1 o1Var = xVar.Y;
            if (o1Var != null) {
                ((d2.i1) o1Var).c();
            }
            i1Var = xVar.C;
        }
        o1 o1Var2 = ((q) b1Var.f1493d).Y;
        if (o1Var2 != null) {
            ((d2.i1) o1Var2).c();
        }
    }

    public final void B() {
        if (this.f1548d) {
            g0 s3 = s();
            if (s3 != null) {
                s3.B();
                return;
            }
            return;
        }
        if (this.f1556v != null) {
            P(this, false, 7);
        } else {
            R(this, false, 7);
        }
    }

    public final void C() {
        if (this.H) {
            return;
        }
        if (((a1) this.S.f1492c).f3310t != null || this.Y != null) {
            this.F = true;
            return;
        }
        j2.j jVar = this.G;
        this.H = true;
        wd.b0 b0Var = new wd.b0();
        b0Var.f10141d = new j2.j();
        q1 snapshotObserver = j0.a(this).getSnapshotObserver();
        a3.a0 a0Var = new a3.a0(this, b0Var);
        snapshotObserver.f1645a.c(this, snapshotObserver.f1648d, a0Var);
        this.H = false;
        this.G = (j2.j) b0Var.f10141d;
        this.F = false;
        d2.v a9 = j0.a(this);
        a9.getSemanticsOwner().b(this, jVar);
        a9.C();
    }

    public final void D() {
        g0 g0Var;
        if (this.f1557w > 0) {
            this.f1560z = true;
        }
        if (!this.f1548d || (g0Var = this.A) == null) {
            return;
        }
        g0Var.D();
    }

    public final boolean E() {
        return this.B != null;
    }

    public final boolean F() {
        return this.T.f1606p.F;
    }

    public final Boolean G() {
        s0 s0Var = this.T.f1607q;
        if (s0Var != null) {
            return Boolean.valueOf(s0Var.D != q0.f1643i);
        }
        return null;
    }

    public final void H(int i3, int i10, int i11) {
        if (i3 == i10) {
            return;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i3 > i10 ? i3 + i12 : i3;
            int i14 = i3 > i10 ? i10 + i12 : (i10 + i11) - 2;
            c6.l lVar = this.f1558x;
            o0.e eVar = (o0.e) lVar.f1829e;
            a2.a0 a0Var = (a2.a0) lVar.f1830i;
            Object l10 = eVar.l(i13);
            a0Var.invoke();
            ((o0.e) lVar.f1829e).a(i14, (g0) l10);
            a0Var.invoke();
        }
        K();
        D();
        B();
    }

    public final void I(g0 g0Var) {
        if (g0Var.T.f1602l > 0) {
            this.T.d(r0.f1602l - 1);
        }
        if (this.B != null) {
            g0Var.f();
        }
        g0Var.A = null;
        if (g0Var.f1547c0 > 0) {
            W(this.f1547c0 - 1);
        }
        ((i1) g0Var.S.f1494e).D = null;
        if (g0Var.f1548d) {
            this.f1557w--;
            o0.e eVar = (o0.e) g0Var.f1558x.f1829e;
            Object[] objArr = eVar.f7317d;
            int i3 = eVar.f7319i;
            for (int i10 = 0; i10 < i3; i10++) {
                ((i1) ((g0) objArr[i10]).S.f1494e).D = null;
            }
        }
        D();
        K();
    }

    public final void J(i1 i1Var) {
        d2.v vVar = this.B;
        k2.b rectManager = vVar != null ? vVar.getRectManager() : null;
        k0 k0Var = this.T;
        int i3 = 0;
        boolean z10 = k0Var.f1596d != c0.f1509s || p() || n();
        if (this.f1555u && rectManager != null) {
            if (i1Var == ((i1) this.S.f1494e)) {
                this.f1554t = true;
                if (!z10) {
                    rectManager.f(this);
                }
            } else {
                this.f1553s = true;
                o0.e w6 = w();
                Object[] objArr = w6.f7317d;
                int i10 = w6.f7319i;
                for (int i11 = 0; i11 < i10; i11++) {
                    g0 g0Var = (g0) objArr[i11];
                    g0Var.f1554t = true;
                    if (!z10) {
                        rectManager.f(g0Var);
                    }
                }
                if (this.f1555u) {
                    rectManager.f5365e = true;
                    b1.c0 c0Var = rectManager.f5362b;
                    int i12 = this.f1550e & 33554431;
                    long[] jArr = (long[]) c0Var.f954b;
                    int i13 = c0Var.f953a;
                    while (true) {
                        if (i3 >= jArr.length - 2 || i3 >= i13) {
                            break;
                        }
                        int i14 = i3 + 2;
                        long j = jArr[i14];
                        if ((((int) j) & 33554431) == i12) {
                            jArr[i14] = (((j >> 63) & 1) << 60) | j;
                            break;
                        }
                        i3 += 3;
                    }
                }
                rectManager.i();
            }
        }
        k0Var.f1606p.i0();
    }

    public final void K() {
        if (!this.f1548d) {
            this.J = true;
            return;
        }
        g0 s3 = s();
        if (s3 != null) {
            s3.K();
        }
    }

    public final void M() {
        c6.l lVar = this.f1558x;
        int i3 = ((o0.e) lVar.f1829e).f7319i;
        while (true) {
            i3--;
            o0.e eVar = (o0.e) lVar.f1829e;
            if (-1 >= i3) {
                eVar.g();
                ((a2.a0) lVar.f1830i).invoke();
                return;
            }
            I((g0) eVar.f7317d[i3]);
        }
    }

    public final void N(int i3, int i10) {
        if (i10 < 0) {
            z1.a.a("count (" + i10 + ") must be greater than 0");
        }
        int i11 = (i10 + i3) - 1;
        if (i3 > i11) {
            return;
        }
        while (true) {
            c6.l lVar = this.f1558x;
            I((g0) ((o0.e) lVar.f1829e).f7317d[i11]);
            Object l10 = ((o0.e) lVar.f1829e).l(i11);
            ((a2.a0) lVar.f1830i).invoke();
            if (i11 == i3) {
                return;
            } else {
                i11--;
            }
        }
    }

    public final void O(boolean z10) {
        d2.v vVar;
        if (this.f1548d || (vVar = this.B) == null) {
            return;
        }
        vVar.B(this, true, z10);
    }

    public final void Q(boolean z10) {
        d2.v vVar;
        if (this.f1548d || (vVar = this.B) == null) {
            return;
        }
        vVar.B(this, false, z10);
    }

    public final void T() {
        o0.e w6 = w();
        Object[] objArr = w6.f7317d;
        int i3 = w6.f7319i;
        for (int i10 = 0; i10 < i3; i10++) {
            g0 g0Var = (g0) objArr[i10];
            e0 e0Var = g0Var.Q;
            g0Var.P = e0Var;
            if (e0Var != e0.f1530i) {
                g0Var.T();
            }
        }
    }

    public final void U(Throwable th) {
        n0.t tVar = this.O;
        n2 n2Var = c1.g.f1483a;
        x0.h hVar = (x0.h) tVar;
        hVar.getClass();
        c1.e eVar = (c1.e) n0.h.s(hVar, n2Var);
        if (eVar == null) {
            throw th;
        }
        g8.b.N(th, new a4.a(1, (c1.f) eVar, this));
        throw th;
    }

    public final void V(x2.c cVar) {
        if (Intrinsics.a(this.L, cVar)) {
            return;
        }
        this.L = cVar;
        B();
        g0 s3 = s();
        if (s3 != null) {
            s3.z();
        } else {
            d2.v vVar = this.B;
            if (vVar != null) {
                vVar.invalidate();
            }
        }
        A();
        for (d1.k kVar = (d1.k) this.S.g; kVar != null; kVar = kVar.f3310t) {
            kVar.a();
        }
    }

    public final void W(int i3) {
        g0 s3;
        g0 s10;
        int i10 = this.f1547c0;
        if (i10 != i3) {
            if (i3 > 0 && i10 == 0 && (s10 = s()) != null) {
                s10.W(s10.f1547c0 + 1);
            }
            if (i3 == 0 && this.f1547c0 > 0 && (s3 = s()) != null) {
                s3.W(s3.f1547c0 - 1);
            }
            this.f1547c0 = i3;
        }
    }

    public final void X(g0 g0Var) {
        if (Intrinsics.a(g0Var, this.f1556v)) {
            return;
        }
        this.f1556v = g0Var;
        k0 k0Var = this.T;
        if (g0Var != null) {
            if (k0Var.f1607q == null) {
                k0Var.f1607q = new s0(k0Var);
            }
            b1 b1Var = this.S;
            i1 i1Var = ((q) b1Var.f1493d).C;
            for (i1 i1Var2 = (i1) b1Var.f1494e; !Intrinsics.a(i1Var2, i1Var) && i1Var2 != null; i1Var2 = i1Var2.C) {
                i1Var2.y0();
            }
        } else {
            k0Var.f1607q = null;
            k0Var.f1598f = false;
            k0Var.f1597e = false;
        }
        B();
    }

    public final void Y(a2.g0 g0Var) {
        if (Intrinsics.a(this.K, g0Var)) {
            return;
        }
        this.K = g0Var;
        B();
    }

    public final void Z(d1.l lVar) {
        if (this.f1548d && this.X != d1.i.f3304a) {
            z1.a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.f1549d0) {
            z1.a.a("modifier is updated when deactivated");
        }
        if (!E()) {
            this.Y = lVar;
            return;
        }
        a(lVar);
        if (this.F) {
            C();
        }
    }

    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v3, types: [c2.i1, d1.k] */
    public final void a(d1.l lVar) {
        ?? r72;
        o0.e eVar;
        b1 b1Var;
        a1 a1Var;
        o0.e eVar2;
        boolean z10;
        boolean z11;
        boolean z12;
        b1 b1Var2;
        boolean z13;
        a3.e eVar3;
        b1 b1Var3 = this.S;
        boolean d10 = b1Var3.d(16);
        d1.k kVar = (z1) b1Var3.f1495f;
        boolean d11 = b1Var3.d(1024);
        this.X = lVar;
        q qVar = (q) b1Var3.f1493d;
        g0 g0Var = (g0) b1Var3.f1491b;
        d1.k kVar2 = (d1.k) b1Var3.g;
        a1 a1Var2 = (a1) b1Var3.f1492c;
        if (kVar2 == a1Var2) {
            z1.a.b("padChain called on already padded chain");
        }
        d1.k kVar3 = (d1.k) b1Var3.g;
        kVar3.f3309s = a1Var2;
        a1Var2.f3310t = kVar3;
        o0.e eVar4 = (o0.e) b1Var3.f1496h;
        int i3 = eVar4 != null ? eVar4.f7319i : 0;
        o0.e eVar5 = (o0.e) b1Var3.f1497i;
        if (eVar5 == null) {
            eVar5 = new o0.e(new d1.j[16]);
        }
        o0.e eVar6 = (o0.e) b1Var3.j;
        eVar6.b(lVar);
        a3.e eVar7 = null;
        while (true) {
            int i10 = eVar6.f7319i;
            if (i10 == 0) {
                break;
            }
            d1.l lVar2 = (d1.l) eVar6.l(i10 - 1);
            if (lVar2 instanceof d1.f) {
                d1.f fVar = (d1.f) lVar2;
                eVar6.b(fVar.f3300b);
                eVar6.b(fVar.f3299a);
            } else if (lVar2 instanceof d1.j) {
                eVar5.b(lVar2);
            } else {
                if (eVar7 == null) {
                    eVar3 = new a3.e(3, eVar5);
                    eVar7 = eVar3;
                } else {
                    eVar3 = eVar7;
                }
                lVar2.a(eVar3);
            }
        }
        int i11 = eVar5.f7319i;
        if (i11 == i3) {
            d1.k kVar4 = a1Var2.f3310t;
            b1 b1Var4 = b1Var3;
            int i12 = 0;
            while (kVar4 != null && i12 < i3) {
                if (eVar4 == null) {
                    throw v4.a.h("expected prior modifier list to be non-empty");
                }
                d1.j jVar = (d1.j) eVar4.f7317d[i12];
                d1.j jVar2 = (d1.j) eVar5.f7317d[i12];
                if (Intrinsics.a(jVar, jVar2)) {
                    b1Var2 = b1Var4;
                    z13 = 2;
                } else {
                    b1Var2 = b1Var4;
                    z13 = jVar.getClass() == jVar2.getClass();
                }
                if (!z13) {
                    kVar4 = kVar4.f3309s;
                    break;
                }
                if (z13) {
                    b1.h(jVar, jVar2, kVar4);
                }
                kVar4 = kVar4.f3310t;
                i12++;
                b1Var4 = b1Var2;
            }
            b1Var2 = b1Var4;
            if (i12 >= i3) {
                b1Var3 = b1Var2;
                z11 = false;
                b1Var = b1Var3;
                eVar = eVar4;
                a1Var = a1Var2;
                eVar2 = eVar5;
                z10 = false;
                r72 = z11;
            } else {
                if (eVar4 == null) {
                    throw v4.a.h("expected prior modifier list to be non-empty");
                }
                if (kVar4 == null) {
                    throw v4.a.h("structuralUpdate requires a non-null tail");
                }
                boolean z14 = g0Var.Y != null;
                eVar = eVar4;
                eVar2 = eVar5;
                z12 = false;
                d1.k kVar5 = kVar4;
                b1Var = b1Var2;
                b1Var.f(i12, eVar, eVar2, kVar5, !z14);
                a1Var = a1Var2;
                z10 = true;
                r72 = z12;
            }
        } else {
            r72 = 0;
            z12 = false;
            z11 = false;
            d1.l lVar3 = g0Var.Y;
            if (lVar3 != null && i3 == 0) {
                d1.k kVar6 = a1Var2;
                for (int i13 = 0; i13 < eVar5.f7319i; i13++) {
                    kVar6 = b1.b((d1.j) eVar5.f7317d[i13], kVar6);
                }
                int i14 = 0;
                for (d1.k kVar7 = kVar.f3309s; kVar7 != null && kVar7 != a1Var2; kVar7 = kVar7.f3309s) {
                    i14 |= kVar7.f3307i;
                    kVar7.f3308r = i14;
                }
                b1Var = b1Var3;
                eVar = eVar4;
                a1Var = a1Var2;
                eVar2 = eVar5;
                z10 = true;
                r72 = z12;
            } else if (i11 != 0) {
                if (eVar4 == null) {
                    eVar4 = new o0.e(new d1.j[16]);
                }
                eVar = eVar4;
                b1Var = b1Var3;
                a1Var = a1Var2;
                eVar2 = eVar5;
                b1Var.f(0, eVar, eVar2, a1Var, !(lVar3 != null));
                z10 = true;
            } else {
                if (eVar4 == null) {
                    throw v4.a.h("expected prior modifier list to be non-empty");
                }
                d1.k kVar8 = a1Var2.f3310t;
                for (int i15 = 0; kVar8 != null && i15 < eVar4.f7319i; i15++) {
                    kVar8 = b1.c(kVar8).f3310t;
                }
                g0 s3 = g0Var.s();
                qVar.D = s3 != null ? (q) s3.S.f1493d : null;
                b1Var3.f1494e = qVar;
                b1Var = b1Var3;
                eVar = eVar4;
                a1Var = a1Var2;
                eVar2 = eVar5;
                z10 = false;
                r72 = z11;
            }
        }
        b1Var.f1496h = eVar2;
        if (eVar != null) {
            eVar.g();
        } else {
            eVar = r72;
        }
        b1Var.f1497i = eVar;
        d1.k kVar9 = a1Var.f3310t;
        if (kVar9 != null) {
            kVar = kVar9;
        }
        kVar.f3309s = r72;
        a1Var.f3310t = r72;
        a1Var.f3308r = -1;
        a1Var.f3312v = r72;
        if (kVar == a1Var) {
            z1.a.b("trimChain did not update the head");
        }
        b1Var.g = kVar;
        if (z10) {
            b1Var.g();
        }
        boolean d12 = b1Var.d(16);
        boolean d13 = b1Var.d(1024);
        this.T.j();
        if (this.f1556v == null && b1Var.d(512)) {
            X(this);
        }
        if (d10 == d12 && d11 == d13) {
            return;
        }
        k2.b rectManager = j0.a(this).getRectManager();
        rectManager.getClass();
        if (E()) {
            b1.c0 c0Var = rectManager.f5362b;
            int i16 = this.f1550e & 33554431;
            long[] jArr = (long[]) c0Var.f954b;
            int i17 = c0Var.f953a;
            for (int i18 = 0; i18 < jArr.length - 2 && i18 < i17; i18 += 3) {
                int i19 = i18 + 2;
                long j = jArr[i19];
                if ((((int) j) & 33554431) == i16) {
                    jArr[i19] = ((d12 ? 1L : 0L) * 4611686018427387904L) | ((-6917529027641081857L) & j) | ((d13 ? 1L : 0L) * 2305843009213693952L);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [d1.k] */
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
    public final void a0(d2.c2 c2Var) {
        if (Intrinsics.a(this.N, c2Var)) {
            return;
        }
        this.N = c2Var;
        d1.k kVar = (d1.k) this.S.g;
        if ((kVar.f3308r & 16) != 0) {
            while (kVar != null) {
                if ((kVar.f3307i & 16) != 0) {
                    j jVar = kVar;
                    ?? r32 = 0;
                    while (jVar != 0) {
                        if (jVar instanceof t1) {
                            ((t1) jVar).m();
                        } else if ((jVar.f3307i & 16) != 0 && (jVar instanceof j)) {
                            d1.k kVar2 = jVar.D;
                            int i3 = 0;
                            jVar = jVar;
                            r32 = r32;
                            while (kVar2 != null) {
                                if ((kVar2.f3307i & 16) != 0) {
                                    i3++;
                                    r32 = r32;
                                    if (i3 == 1) {
                                        jVar = kVar2;
                                    } else {
                                        if (r32 == 0) {
                                            r32 = new o0.e(new d1.k[16]);
                                        }
                                        if (jVar != 0) {
                                            r32.b(jVar);
                                            jVar = 0;
                                        }
                                        r32.b(kVar2);
                                    }
                                }
                                kVar2 = kVar2.f3310t;
                                jVar = jVar;
                                r32 = r32;
                            }
                            if (i3 == 1) {
                            }
                        }
                        jVar = k.e(r32);
                    }
                }
                if ((kVar.f3308r & 16) == 0) {
                    return;
                } else {
                    kVar = kVar.f3310t;
                }
            }
        }
    }

    public final void b(d2.v vVar) {
        g0 g0Var;
        e1.b bVar;
        j2.j u2;
        if (this.B != null) {
            z1.a.b("Cannot attach " + this + " as it already is attached.  Tree: " + e(0));
        }
        g0 g0Var2 = this.A;
        if (g0Var2 != null && !Intrinsics.a(g0Var2.B, vVar)) {
            StringBuilder sb2 = new StringBuilder("Attaching to a different owner(");
            sb2.append(vVar);
            sb2.append(") than the parent's owner(");
            g0 s3 = s();
            sb2.append(s3 != null ? s3.B : null);
            sb2.append("). This tree: ");
            sb2.append(e(0));
            sb2.append(" Parent tree: ");
            g0 g0Var3 = this.A;
            sb2.append(g0Var3 != null ? g0Var3.e(0) : null);
            z1.a.b(sb2.toString());
        }
        g0 s10 = s();
        k0 k0Var = this.T;
        if (s10 == null) {
            k0Var.f1606p.F = true;
            vVar.getRectManager().f(this);
            s0 s0Var = k0Var.f1607q;
            if (s0Var != null) {
                s0Var.D = q0.f1641d;
            }
        }
        b1 b1Var = this.S;
        ((i1) b1Var.f1494e).D = s10 != null ? (q) s10.S.f1493d : null;
        this.B = vVar;
        this.D = (s10 != null ? s10.D : -1) + 1;
        d1.l lVar = this.Y;
        if (lVar != null) {
            a(lVar);
        }
        this.Y = null;
        vVar.getLayoutNodes().h(this.f1550e, this);
        g0 g0Var4 = this.A;
        if (g0Var4 == null || (g0Var = g0Var4.f1556v) == null) {
            g0Var = this.f1556v;
        }
        X(g0Var);
        if (this.f1556v == null && b1Var.d(512)) {
            X(this);
        }
        if (!this.f1549d0) {
            for (d1.k kVar = (d1.k) b1Var.g; kVar != null; kVar = kVar.f3310t) {
                kVar.y();
            }
        }
        o0.e eVar = (o0.e) this.f1558x.f1829e;
        Object[] objArr = eVar.f7317d;
        int i3 = eVar.f7319i;
        for (int i10 = 0; i10 < i3; i10++) {
            ((g0) objArr[i10]).b(vVar);
        }
        if (!this.f1549d0) {
            b1Var.e();
        }
        B();
        if (s10 != null) {
            s10.B();
        }
        a3.f fVar = this.Z;
        if (fVar != null) {
            fVar.invoke(vVar);
        }
        k0Var.j();
        if (!this.f1549d0 && b1Var.d(8)) {
            C();
        }
        vVar.getClass();
        if (!d2.v.j() || (bVar = vVar.f3553d0) == null || (u2 = u()) == null || !u2.f4975d.b(j2.q.f5007q)) {
            return;
        }
        bVar.f3777u.a(this.f1550e);
        bVar.f3771d.q(bVar.f3773i, this.f1550e, true);
    }

    public final void b0() {
        if (this.f1557w <= 0 || !this.f1560z) {
            return;
        }
        this.f1560z = false;
        o0.e eVar = this.f1559y;
        if (eVar == null) {
            eVar = new o0.e(new g0[16]);
            this.f1559y = eVar;
        }
        eVar.g();
        o0.e eVar2 = (o0.e) this.f1558x.f1829e;
        Object[] objArr = eVar2.f7317d;
        int i3 = eVar2.f7319i;
        for (int i10 = 0; i10 < i3; i10++) {
            g0 g0Var = (g0) objArr[i10];
            if (g0Var.f1548d) {
                eVar.d(eVar.f7319i, g0Var.w());
            } else {
                eVar.b(g0Var);
            }
        }
        k0 k0Var = this.T;
        k0Var.f1606p.M = true;
        s0 s0Var = k0Var.f1607q;
        if (s0Var != null) {
            s0Var.G = true;
        }
    }

    public final void c() {
        this.Q = this.P;
        this.P = e0.f1530i;
        o0.e w6 = w();
        Object[] objArr = w6.f7317d;
        int i3 = w6.f7319i;
        for (int i10 = 0; i10 < i3; i10++) {
            g0 g0Var = (g0) objArr[i10];
            if (g0Var.P != e0.f1530i) {
                g0Var.c();
            }
        }
    }

    public final void d() {
        this.Q = this.P;
        this.P = e0.f1530i;
        o0.e w6 = w();
        Object[] objArr = w6.f7317d;
        int i3 = w6.f7319i;
        for (int i10 = 0; i10 < i3; i10++) {
            g0 g0Var = (g0) objArr[i10];
            if (g0Var.P == e0.f1529e) {
                g0Var.d();
            }
        }
    }

    public final String e(int i3) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < i3; i10++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        o0.e w6 = w();
        Object[] objArr = w6.f7317d;
        int i11 = w6.f7319i;
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append(((g0) objArr[i12]).e(i3 + 1));
        }
        String sb3 = sb2.toString();
        return i3 == 0 ? sb3.substring(0, sb3.length() - 1) : sb3;
    }

    public final void f() {
        e1.b bVar;
        h0 h0Var;
        d2.v vVar = this.B;
        if (vVar == null) {
            StringBuilder sb2 = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            g0 s3 = s();
            sb2.append(s3 != null ? s3.e(0) : null);
            z1.a.c(sb2.toString());
            throw new hd.d();
        }
        g0 s10 = s();
        k0 k0Var = this.T;
        if (s10 != null) {
            s10.z();
            s10.B();
            w0 w0Var = k0Var.f1606p;
            e0 e0Var = e0.f1530i;
            w0Var.f1693z = e0Var;
            s0 s0Var = k0Var.f1607q;
            if (s0Var != null) {
                s0Var.f1665x = e0Var;
            }
        }
        h0 h0Var2 = k0Var.f1606p.K;
        h0Var2.f1571b = true;
        h0Var2.f1572c = false;
        h0Var2.f1573d = false;
        h0Var2.f1574e = false;
        h0Var2.f1575f = null;
        s0 s0Var2 = k0Var.f1607q;
        if (s0Var2 != null && (h0Var = s0Var2.E) != null) {
            h0Var.f1571b = true;
            h0Var.f1572c = false;
            h0Var.f1573d = false;
            h0Var.f1574e = false;
            h0Var.f1575f = null;
        }
        b1 b1Var = this.S;
        d1.k kVar = (z1) b1Var.f1495f;
        i1 i1Var = ((q) b1Var.f1493d).C;
        for (i1 i1Var2 = (i1) b1Var.f1494e; !Intrinsics.a(i1Var2, i1Var) && i1Var2 != null; i1Var2 = i1Var2.C) {
            i1Var2.V0();
            if (i1Var2.B.F()) {
                i1Var2.Q0();
            }
        }
        a3.g gVar = this.f1545a0;
        if (gVar != null) {
            gVar.invoke(vVar);
        }
        for (d1.k kVar2 = kVar; kVar2 != null; kVar2 = kVar2.f3309s) {
            if (kVar2.B) {
                kVar2.F();
            }
        }
        this.E = true;
        o0.e eVar = (o0.e) this.f1558x.f1829e;
        Object[] objArr = eVar.f7317d;
        int i3 = eVar.f7319i;
        for (int i10 = 0; i10 < i3; i10++) {
            ((g0) objArr[i10]).f();
        }
        this.E = false;
        while (kVar != null) {
            if (kVar.B) {
                kVar.z();
            }
            kVar = kVar.f3309s;
        }
        vVar.getLayoutNodes().g(this.f1550e);
        u0 u0Var = vVar.f3563m0;
        a1.n nVar = u0Var.f1678b;
        ((d9.c) nVar.f41i).s(this);
        ((d9.c) nVar.f40e).s(this);
        ((d9.c) nVar.f42r).s(this);
        ((o0.e) u0Var.f1681e.f1868d).k(this);
        vVar.f3555e0 = true;
        if (d2.v.j() && (bVar = vVar.f3553d0) != null && bVar.f3777u.e(this.f1550e)) {
            bVar.f3771d.q(bVar.f3773i, this.f1550e, false);
        }
        vVar.getRectManager().g(this);
        this.B = null;
        X(null);
        this.D = 0;
        w0 w0Var2 = k0Var.f1606p;
        w0Var2.f1690w = Integer.MAX_VALUE;
        w0Var2.f1689v = Integer.MAX_VALUE;
        w0Var2.F = false;
        s0 s0Var3 = k0Var.f1607q;
        if (s0Var3 != null) {
            s0Var3.f1664w = Integer.MAX_VALUE;
            s0Var3.f1663v = Integer.MAX_VALUE;
            s0Var3.D = q0.f1643i;
        }
        if (b1Var.d(8)) {
            j2.j jVar = this.G;
            this.G = null;
            this.F = false;
            vVar.getSemanticsOwner().b(this, jVar);
            vVar.C();
        }
    }

    @Override // n0.i
    public final void g() {
        a3.e0 e0Var = this.C;
        if (e0Var != null) {
            e0Var.g();
        }
        a2.c0 c0Var = this.U;
        if (c0Var != null) {
            c0Var.g();
        }
        b1 b1Var = this.S;
        i1 i1Var = ((q) b1Var.f1493d).C;
        for (i1 i1Var2 = (i1) b1Var.f1494e; !Intrinsics.a(i1Var2, i1Var) && i1Var2 != null; i1Var2 = i1Var2.C) {
            i1Var2.P0();
        }
    }

    @Override // n0.i
    public final void h() {
        e1.b bVar;
        a3.e0 e0Var = this.C;
        if (e0Var != null) {
            e0Var.h();
        }
        a2.c0 c0Var = this.U;
        if (c0Var != null) {
            c0Var.d(true);
        }
        this.f1549d0 = true;
        d1.k kVar = (z1) this.S.f1495f;
        for (d1.k kVar2 = kVar; kVar2 != null; kVar2 = kVar2.f3309s) {
            if (kVar2.B) {
                kVar2.D();
            }
        }
        for (d1.k kVar3 = kVar; kVar3 != null; kVar3 = kVar3.f3309s) {
            if (kVar3.B) {
                kVar3.F();
            }
        }
        while (kVar != null) {
            if (kVar.B) {
                kVar.z();
            }
            kVar = kVar.f3309s;
        }
        if (E()) {
            this.G = null;
            this.F = false;
        }
        d2.v vVar = this.B;
        if (vVar == null || !d2.v.j() || (bVar = vVar.f3553d0) == null || !bVar.f3777u.e(this.f1550e)) {
            return;
        }
        bVar.f3771d.q(bVar.f3773i, this.f1550e, false);
    }

    public final void i(k1.n nVar, n1.b bVar) {
        try {
            ((i1) this.S.f1494e).w0(nVar, bVar);
        } catch (Throwable th) {
            U(th);
            throw null;
        }
    }

    public final List k() {
        s0 s0Var = this.T.f1607q;
        s0Var.getClass();
        o0.e eVar = s0Var.F;
        k0 k0Var = s0Var.f1661t;
        k0Var.f1593a.l();
        if (!s0Var.G) {
            return eVar.f();
        }
        g0 g0Var = k0Var.f1593a;
        o0.e w6 = g0Var.w();
        Object[] objArr = w6.f7317d;
        int i3 = w6.f7319i;
        for (int i10 = 0; i10 < i3; i10++) {
            g0 g0Var2 = (g0) objArr[i10];
            if (eVar.f7319i <= i10) {
                s0 s0Var2 = g0Var2.T.f1607q;
                s0Var2.getClass();
                eVar.b(s0Var2);
            } else {
                s0 s0Var3 = g0Var2.T.f1607q;
                s0Var3.getClass();
                Object[] objArr2 = eVar.f7317d;
                Object obj = objArr2[i10];
                objArr2[i10] = s0Var3;
            }
        }
        eVar.m(((o0.b) g0Var.l()).f7311d.f7319i, eVar.f7319i);
        s0Var.G = false;
        return eVar.f();
    }

    public final List l() {
        return w().f();
    }

    public final List m() {
        return ((o0.e) this.f1558x.f1829e).f();
    }

    public final boolean n() {
        return this.T.f1606p.I;
    }

    @Override // c2.p1
    public final boolean o() {
        return E();
    }

    public final boolean p() {
        return this.T.f1606p.H;
    }

    public final e0 q() {
        return this.T.f1606p.f1693z;
    }

    public final e0 r() {
        e0 e0Var;
        s0 s0Var = this.T.f1607q;
        return (s0Var == null || (e0Var = s0Var.f1665x) == null) ? e0.f1530i : e0Var;
    }

    public final g0 s() {
        g0 g0Var = this.A;
        while (g0Var != null && g0Var.f1548d) {
            g0Var = g0Var.A;
        }
        return g0Var;
    }

    public final int t() {
        return this.T.f1606p.f1690w;
    }

    public final String toString() {
        return d2.h0.t(this) + " children: " + ((o0.b) l()).f7311d.f7319i + " measurePolicy: " + this.K + " deactivated: " + this.f1549d0;
    }

    public final j2.j u() {
        if (E() && !this.f1549d0 && this.S.d(8)) {
            return this.G;
        }
        return null;
    }

    public final o0.e v() {
        boolean z10 = this.J;
        o0.e eVar = this.I;
        if (z10) {
            eVar.g();
            eVar.d(eVar.f7319i, w());
            Arrays.sort(eVar.f7317d, 0, eVar.f7319i, f1544g0);
            this.J = false;
        }
        return eVar;
    }

    public final o0.e w() {
        b0();
        if (this.f1557w == 0) {
            return (o0.e) this.f1558x.f1829e;
        }
        o0.e eVar = this.f1559y;
        eVar.getClass();
        return eVar;
    }

    public final void x(long j, o oVar, int i3, boolean z10) {
        b1 b1Var = this.S;
        i1 i1Var = (i1) b1Var.f1494e;
        k1.d0 d0Var = i1.Z;
        ((i1) b1Var.f1494e).I0(i1.f1588b0, i1Var.A0(j), oVar, i3, z10);
    }

    public final void y(int i3, g0 g0Var) {
        if (g0Var.A != null && g0Var.B != null) {
            z1.a.b(j(g0Var));
        }
        g0Var.A = this;
        c6.l lVar = this.f1558x;
        ((o0.e) lVar.f1829e).a(i3, g0Var);
        ((a2.a0) lVar.f1830i).invoke();
        K();
        if (g0Var.f1548d) {
            this.f1557w++;
        }
        D();
        d2.v vVar = this.B;
        if (vVar != null) {
            g0Var.b(vVar);
        }
        if (g0Var.T.f1602l > 0) {
            k0 k0Var = this.T;
            k0Var.d(k0Var.f1602l + 1);
        }
        if (g0Var.f1547c0 > 0) {
            W(this.f1547c0 + 1);
        }
    }

    public final void z() {
        if (this.W) {
            b1 b1Var = this.S;
            i1 i1Var = (q) b1Var.f1493d;
            i1 i1Var2 = ((i1) b1Var.f1494e).D;
            this.V = null;
            while (true) {
                if (Intrinsics.a(i1Var, i1Var2)) {
                    break;
                }
                if ((i1Var != null ? i1Var.Y : null) != null) {
                    this.V = i1Var;
                    break;
                }
                i1Var = i1Var != null ? i1Var.D : null;
            }
            this.W = false;
        }
        i1 i1Var3 = this.V;
        if (i1Var3 != null && i1Var3.Y == null) {
            throw v4.a.h("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
        }
        if (i1Var3 != null) {
            i1Var3.K0();
            return;
        }
        g0 s3 = s();
        if (s3 != null) {
            s3.z();
            return;
        }
        d2.v vVar = this.B;
        if (vVar != null) {
            vVar.invalidate();
        }
    }

    public g0(int i3) {
        this(j2.k.f4979a.addAndGet(1), (i3 & 1) == 0);
    }
}
