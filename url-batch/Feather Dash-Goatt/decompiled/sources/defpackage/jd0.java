package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class jd0 implements mk, fu0, yk {
    public static final i41 V = new i41(1);
    public static final ed0 W = new ed0();
    public static final f6 X = new f6(4);
    public boolean A;
    public vk0 B;
    public nr C;
    public vc0 D;
    public on1 E;
    public wl F;
    public hd0 G;
    public hd0 H;
    public boolean I;
    public final l7 J;
    public final nd0 K;
    public xd0 L;
    public qp0 M;
    public boolean N;
    public am0 O;
    public am0 P;
    public w6 Q;
    public x6 R;
    public boolean S;
    public int T;
    public boolean U;
    public final boolean d;
    public int e;
    public boolean g;
    public long h;
    public long i;
    public long j;
    public boolean k;
    public boolean l;
    public jd0 m;
    public int n;
    public final yw o;
    public eo0 p;
    public boolean q;
    public jd0 r;
    public eu0 s;
    public pn1 t;
    public int u;
    public boolean v;
    public boolean w;
    public h81 x;
    public boolean y;
    public final eo0 z;

    public jd0(int i, boolean z) {
        this.d = z;
        this.e = i;
        this.h = 9223372034707292159L;
        this.i = 0L;
        this.j = 9223372034707292159L;
        this.k = true;
        this.o = new yw(new eo0(new jd0[16]), 20, new ce(4, this));
        this.z = new eo0(new jd0[16]);
        this.A = true;
        this.B = V;
        this.C = md0.a;
        this.D = vc0.d;
        this.E = W;
        wl.c.getClass();
        this.F = vl.b;
        hd0 hd0Var = hd0.g;
        this.G = hd0Var;
        this.H = hd0Var;
        this.J = new l7(this);
        this.K = new nd0(this);
        this.N = true;
        this.O = xl0.a;
    }

    public static void R(jd0 jd0Var, boolean z, int i) {
        jd0 s;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (jd0Var.m == null) {
            o80.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        eu0 eu0Var = jd0Var.s;
        if (eu0Var == null || jd0Var.v || jd0Var.d) {
            return;
        }
        ((d4) eu0Var).y(jd0Var, true, z, z2);
        if (z3) {
            kj0 kj0Var = jd0Var.K.q;
            kj0Var.getClass();
            nd0 nd0Var = kj0Var.j;
            jd0 s2 = nd0Var.a.s();
            hd0 hd0Var = nd0Var.a.G;
            if (s2 == null || hd0Var == hd0.g) {
                return;
            }
            while (s2.G == hd0Var && (s = s2.s()) != null) {
                s2 = s;
            }
            int ordinal = hd0Var.ordinal();
            if (ordinal == 0) {
                if (s2.m != null) {
                    R(s2, z, 6);
                    return;
                } else {
                    T(s2, z, 6);
                    return;
                }
            }
            if (ordinal != 1) {
                dd0.j("Intrinsics isn't used by the parent");
            } else if (s2.m != null) {
                s2.Q(z);
            } else {
                s2.S(z);
            }
        }
    }

    public static void T(jd0 jd0Var, boolean z, int i) {
        eu0 eu0Var;
        jd0 s;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (jd0Var.v || jd0Var.d || (eu0Var = jd0Var.s) == null) {
            return;
        }
        ((d4) eu0Var).y(jd0Var, false, z, z2);
        if (z3) {
            nd0 nd0Var = jd0Var.K.p.j;
            jd0 s2 = nd0Var.a.s();
            hd0 hd0Var = nd0Var.a.G;
            if (s2 == null || hd0Var == hd0.g) {
                return;
            }
            while (s2.G == hd0Var && (s = s2.s()) != null) {
                s2 = s;
            }
            int ordinal = hd0Var.ordinal();
            if (ordinal == 0) {
                T(s2, z, 6);
            } else if (ordinal == 1) {
                s2.S(z);
            } else {
                dd0.j("Intrinsics isn't used by the parent");
            }
        }
    }

    public static void U(jd0 jd0Var) {
        int i = id0.a[jd0Var.K.d.ordinal()];
        nd0 nd0Var = jd0Var.K;
        if (i != 1) {
            dd0.d(nd0Var.d, "Unexpected state ");
            return;
        }
        if (nd0Var.e) {
            R(jd0Var, true, 6);
            return;
        }
        if (nd0Var.f) {
            jd0Var.Q(true);
        }
        if (jd0Var.p()) {
            T(jd0Var, true, 6);
        } else if (jd0Var.o()) {
            jd0Var.S(true);
        }
    }

    private final String j(jd0 jd0Var) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(jd0Var);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(g(0));
        sb.append(" Other tree: ");
        jd0 jd0Var2 = jd0Var.r;
        sb.append(jd0Var2 != null ? jd0Var2.g(0) : null);
        return sb.toString();
    }

    public final void A() {
        if (this.N) {
            l7 l7Var = this.J;
            qp0 qp0Var = (v80) l7Var.d;
            qp0 qp0Var2 = ((qp0) l7Var.e).u;
            this.M = null;
            while (true) {
                if (Intrinsics.a(qp0Var, qp0Var2)) {
                    break;
                }
                if ((qp0Var != null ? qp0Var.P : null) != null) {
                    this.M = qp0Var;
                    break;
                }
                qp0Var = qp0Var != null ? qp0Var.u : null;
            }
        }
        qp0 qp0Var3 = this.M;
        if (qp0Var3 != null && qp0Var3.P == null) {
            throw qy0.g("layer was not set");
        }
        if (qp0Var3 != null) {
            qp0Var3.Q0();
            return;
        }
        jd0 s = s();
        if (s != null) {
            s.A();
        }
    }

    public final void B() {
        l7 l7Var = this.J;
        qp0 qp0Var = (qp0) l7Var.e;
        v80 v80Var = (v80) l7Var.d;
        while (qp0Var != v80Var) {
            qp0Var.getClass();
            cd0 cd0Var = (cd0) qp0Var;
            du0 du0Var = cd0Var.P;
            if (du0Var != null) {
                ((n50) du0Var).c();
            }
            qp0Var = cd0Var.t;
        }
        du0 du0Var2 = ((v80) l7Var.d).P;
        if (du0Var2 != null) {
            ((n50) du0Var2).c();
        }
    }

    public final void C() {
        if (this.d) {
            jd0 s = s();
            if (s != null) {
                s.C();
                return;
            }
            return;
        }
        if (this.m != null) {
            R(this, false, 7);
        } else {
            T(this, false, 7);
        }
    }

    public final void D() {
        if (this.y) {
            return;
        }
        if (((lp0) this.J.c).j != null || this.P != null) {
            this.w = true;
            return;
        }
        h81 h81Var = this.x;
        this.y = true;
        z11 z11Var = new z11();
        z11Var.d = new h81();
        gu0 snapshotObserver = ((d4) md0.a(this)).getSnapshotObserver();
        w3 w3Var = new w3(this, 7, z11Var);
        snapshotObserver.a.b(this, snapshotObserver.d, w3Var);
        this.y = false;
        this.x = (h81) z11Var.d;
        this.w = false;
        d4 d4Var = (d4) md0.a(this);
        d4Var.getSemanticsOwner().b(this, h81Var);
        d4Var.A();
    }

    public final void E() {
        jd0 jd0Var;
        if (this.n > 0) {
            this.q = true;
        }
        if (!this.d || (jd0Var = this.r) == null) {
            return;
        }
        jd0Var.E();
    }

    public final boolean F() {
        return this.s != null;
    }

    public final boolean G() {
        return this.K.p.v;
    }

    public final Boolean H() {
        kj0 kj0Var = this.K.q;
        if (kj0Var != null) {
            return Boolean.valueOf(kj0Var.t != ij0.g);
        }
        return null;
    }

    public final void I() {
        jd0 s;
        if (this.G == hd0.g) {
            f();
        }
        kj0 kj0Var = this.K.q;
        kj0Var.getClass();
        boolean z = true;
        try {
            kj0Var.k = true;
            if (!kj0Var.o) {
                o80.b("replace() called on item that was not placed");
            }
            kj0Var.E = false;
            if (kj0Var.t == ij0.g) {
                z = false;
            }
            kj0Var.n0(kj0Var.r, kj0Var.s);
            if (z && !kj0Var.E && (s = kj0Var.j.a.s()) != null) {
                s.Q(false);
            }
            kj0Var.k = false;
        } catch (Throwable th) {
            kj0Var.k = false;
            throw th;
        }
    }

    public final void J(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            yw ywVar = this.o;
            eo0 eo0Var = (eo0) ywVar.e;
            ce ceVar = (ce) ywVar.g;
            Object k = eo0Var.k(i5);
            ceVar.invoke();
            ((eo0) ywVar.e).a(i6, (jd0) k);
            ceVar.invoke();
        }
        M();
        E();
        C();
    }

    public final void K(jd0 jd0Var) {
        if (jd0Var.K.l > 0) {
            this.K.d(r0.l - 1);
        }
        if (this.s != null) {
            jd0Var.h();
        }
        jd0Var.r = null;
        if (jd0Var.T > 0) {
            Y(this.T - 1);
        }
        ((qp0) jd0Var.J.e).u = null;
        if (jd0Var.d) {
            this.n--;
            eo0 eo0Var = (eo0) jd0Var.o.e;
            Object[] objArr = eo0Var.d;
            int i = eo0Var.g;
            for (int i2 = 0; i2 < i; i2++) {
                ((qp0) ((jd0) objArr[i2]).J.e).u = null;
            }
        }
        E();
        M();
    }

    public final void L() {
        u11 rectManager;
        this.k = true;
        eu0 eu0Var = this.s;
        if (eu0Var == null || (rectManager = ((d4) eu0Var).getRectManager()) == null) {
            return;
        }
        rectManager.e(this);
    }

    public final void M() {
        if (!this.d) {
            this.A = true;
            return;
        }
        jd0 s = s();
        if (s != null) {
            s.M();
        }
    }

    public final void N() {
        yw ywVar = this.o;
        int i = ((eo0) ywVar.e).g;
        while (true) {
            i--;
            eo0 eo0Var = (eo0) ywVar.e;
            if (-1 >= i) {
                eo0Var.g();
                ((ce) ywVar.g).invoke();
                return;
            }
            K((jd0) eo0Var.d[i]);
        }
    }

    public final void O(int i, int i2) {
        if (i2 < 0) {
            o80.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            yw ywVar = this.o;
            K((jd0) ((eo0) ywVar.e).d[i3]);
            Object k = ((eo0) ywVar.e).k(i3);
            ((ce) ywVar.g).invoke();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final void P() {
        jd0 s;
        if (this.G == hd0.g) {
            f();
        }
        uk0 uk0Var = this.K.p;
        nd0 nd0Var = uk0Var.j;
        try {
            uk0Var.k = true;
            if (!uk0Var.o) {
                o80.b("replace called on unplaced item");
            }
            boolean z = uk0Var.v;
            uk0Var.n0(uk0Var.q, uk0Var.s, uk0Var.r);
            if (z && !uk0Var.I && (s = nd0Var.a.s()) != null) {
                s.S(false);
            }
        } finally {
        }
    }

    public final void Q(boolean z) {
        eu0 eu0Var;
        if (this.d || (eu0Var = this.s) == null) {
            return;
        }
        ((d4) eu0Var).z(this, true, z);
    }

    public final void S(boolean z) {
        eu0 eu0Var;
        if (this.d || (eu0Var = this.s) == null) {
            return;
        }
        ((d4) eu0Var).z(this, false, z);
    }

    public final void V() {
        eo0 x = x();
        Object[] objArr = x.d;
        int i = x.g;
        for (int i2 = 0; i2 < i; i2++) {
            jd0 jd0Var = (jd0) objArr[i2];
            hd0 hd0Var = jd0Var.H;
            jd0Var.G = hd0Var;
            if (hd0Var != hd0.g) {
                jd0Var.V();
            }
        }
    }

    public final void W(Throwable th) {
        wl wlVar = this.F;
        ke1 ke1Var = sl.a;
        kw0 kw0Var = (kw0) wlVar;
        kw0Var.getClass();
        ql qlVar = (ql) m90.I(kw0Var, ke1Var);
        if (qlVar == null) {
            throw th;
        }
        yr1.e0(th, new vc((rl) qlVar, 1, this));
        throw th;
    }

    public final void X(nr nrVar) {
        if (Intrinsics.a(this.C, nrVar)) {
            return;
        }
        this.C = nrVar;
        C();
        jd0 s = s();
        if (s != null) {
            s.A();
        }
        B();
        for (zl0 zl0Var = (zl0) this.J.g; zl0Var != null; zl0Var = zl0Var.j) {
            zl0Var.a();
        }
    }

    public final void Y(int i) {
        jd0 s;
        jd0 s2;
        int i2 = this.T;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (s2 = s()) != null) {
                s2.Y(s2.T + 1);
            }
            if (i == 0 && this.T > 0 && (s = s()) != null) {
                s.Y(s.T - 1);
            }
            this.T = i;
        }
    }

    public final void Z(jd0 jd0Var) {
        if (Intrinsics.a(jd0Var, this.m)) {
            return;
        }
        this.m = jd0Var;
        nd0 nd0Var = this.K;
        if (jd0Var != null) {
            if (nd0Var.q == null) {
                nd0Var.q = new kj0(nd0Var);
            }
            l7 l7Var = this.J;
            qp0 qp0Var = ((v80) l7Var.d).t;
            for (qp0 qp0Var2 = (qp0) l7Var.e; !Intrinsics.a(qp0Var2, qp0Var) && qp0Var2 != null; qp0Var2 = qp0Var2.t) {
                qp0Var2.E0();
            }
        } else {
            nd0Var.q = null;
            nd0Var.f = false;
            nd0Var.e = false;
        }
        C();
    }

    @Override // defpackage.mk
    public final void a() {
        pn1 pn1Var = this.t;
        if (pn1Var != null) {
            pn1Var.a();
        }
        xd0 xd0Var = this.L;
        if (xd0Var != null) {
            xd0Var.a();
        }
        l7 l7Var = this.J;
        qp0 qp0Var = ((v80) l7Var.d).t;
        for (qp0 qp0Var2 = (qp0) l7Var.e; !Intrinsics.a(qp0Var2, qp0Var) && qp0Var2 != null; qp0Var2 = qp0Var2.t) {
            qp0Var2.V0();
        }
    }

    public final void a0(vk0 vk0Var) {
        if (Intrinsics.a(this.B, vk0Var)) {
            return;
        }
        this.B = vk0Var;
        C();
    }

    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v3, types: [qp0, zl0] */
    public final void b(am0 am0Var) {
        ?? r7;
        eo0 eo0Var;
        l7 l7Var;
        lp0 lp0Var;
        eo0 eo0Var2;
        boolean z;
        boolean z2;
        boolean z3;
        l7 l7Var2;
        boolean z4;
        a3 a3Var;
        l7 l7Var3 = this.J;
        int i = 16;
        boolean g = l7Var3.g(16);
        zl0 zl0Var = (ig1) l7Var3.f;
        boolean g2 = l7Var3.g(1024);
        this.O = am0Var;
        v80 v80Var = (v80) l7Var3.d;
        jd0 jd0Var = (jd0) l7Var3.b;
        zl0 zl0Var2 = (zl0) l7Var3.g;
        lp0 lp0Var2 = (lp0) l7Var3.c;
        if (zl0Var2 == lp0Var2) {
            o80.b("padChain called on already padded chain");
        }
        zl0 zl0Var3 = (zl0) l7Var3.g;
        zl0Var3.i = lp0Var2;
        lp0Var2.j = zl0Var3;
        eo0 eo0Var3 = (eo0) l7Var3.h;
        int i2 = eo0Var3 != null ? eo0Var3.g : 0;
        eo0 eo0Var4 = (eo0) l7Var3.i;
        if (eo0Var4 == null) {
            eo0Var4 = new eo0(new yl0[16]);
        }
        eo0 eo0Var5 = (eo0) l7Var3.j;
        eo0Var5.b(am0Var);
        a3 a3Var2 = null;
        while (true) {
            int i3 = eo0Var5.g;
            if (i3 == 0) {
                break;
            }
            am0 am0Var2 = (am0) eo0Var5.k(i3 - 1);
            if (am0Var2 instanceof aj) {
                aj ajVar = (aj) am0Var2;
                eo0Var5.b(ajVar.b);
                eo0Var5.b(ajVar.a);
            } else if (am0Var2 instanceof yl0) {
                eo0Var4.b(am0Var2);
            } else {
                if (a3Var2 == null) {
                    a3Var = new a3(i, eo0Var4);
                    a3Var2 = a3Var;
                } else {
                    a3Var = a3Var2;
                }
                am0Var2.a(a3Var);
            }
        }
        int i4 = eo0Var4.g;
        if (i4 == i2) {
            zl0 zl0Var4 = lp0Var2.j;
            l7 l7Var4 = l7Var3;
            int i5 = 0;
            while (zl0Var4 != null && i5 < i2) {
                if (eo0Var3 == null) {
                    throw qy0.g("expected prior modifier list to be non-empty");
                }
                yl0 yl0Var = (yl0) eo0Var3.d[i5];
                yl0 yl0Var2 = (yl0) eo0Var4.d[i5];
                if (Intrinsics.a(yl0Var, yl0Var2)) {
                    l7Var2 = l7Var4;
                    z4 = 2;
                } else {
                    l7Var2 = l7Var4;
                    z4 = yl0Var.getClass() == yl0Var2.getClass();
                }
                if (!z4) {
                    zl0Var4 = zl0Var4.i;
                    break;
                }
                if (z4) {
                    l7.k(yl0Var, yl0Var2, zl0Var4);
                }
                zl0Var4 = zl0Var4.j;
                i5++;
                l7Var4 = l7Var2;
            }
            l7Var2 = l7Var4;
            if (i5 >= i2) {
                l7Var3 = l7Var2;
                z2 = false;
                l7Var = l7Var3;
                eo0Var = eo0Var3;
                lp0Var = lp0Var2;
                eo0Var2 = eo0Var4;
                z = false;
                r7 = z2;
            } else {
                if (eo0Var3 == null) {
                    throw qy0.g("expected prior modifier list to be non-empty");
                }
                if (zl0Var4 == null) {
                    throw qy0.g("structuralUpdate requires a non-null tail");
                }
                boolean z5 = jd0Var.P != null;
                eo0Var = eo0Var3;
                eo0Var2 = eo0Var4;
                z3 = false;
                zl0 zl0Var5 = zl0Var4;
                l7Var = l7Var2;
                l7Var.i(i5, eo0Var, eo0Var2, zl0Var5, !z5);
                lp0Var = lp0Var2;
                z = true;
                r7 = z3;
            }
        } else {
            r7 = 0;
            z3 = false;
            z2 = false;
            am0 am0Var3 = jd0Var.P;
            if (am0Var3 != null && i2 == 0) {
                zl0 zl0Var6 = lp0Var2;
                for (int i6 = 0; i6 < eo0Var4.g; i6++) {
                    zl0Var6 = l7.d((yl0) eo0Var4.d[i6], zl0Var6);
                }
                int i7 = 0;
                for (zl0 zl0Var7 = zl0Var.i; zl0Var7 != null && zl0Var7 != lp0Var2; zl0Var7 = zl0Var7.i) {
                    i7 |= zl0Var7.g;
                    zl0Var7.h = i7;
                }
                l7Var = l7Var3;
                eo0Var = eo0Var3;
                lp0Var = lp0Var2;
                eo0Var2 = eo0Var4;
                z = true;
                r7 = z3;
            } else if (i4 != 0) {
                if (eo0Var3 == null) {
                    eo0Var3 = new eo0(new yl0[16]);
                }
                eo0Var = eo0Var3;
                l7Var = l7Var3;
                lp0Var = lp0Var2;
                eo0Var2 = eo0Var4;
                l7Var.i(0, eo0Var, eo0Var2, lp0Var, !(am0Var3 != null));
                z = true;
            } else {
                if (eo0Var3 == null) {
                    throw qy0.g("expected prior modifier list to be non-empty");
                }
                zl0 zl0Var8 = lp0Var2.j;
                for (int i8 = 0; zl0Var8 != null && i8 < eo0Var3.g; i8++) {
                    zl0Var8 = l7.e(zl0Var8).j;
                }
                jd0 s = jd0Var.s();
                v80Var.u = s != null ? (v80) s.J.d : null;
                l7Var3.e = v80Var;
                l7Var = l7Var3;
                eo0Var = eo0Var3;
                lp0Var = lp0Var2;
                eo0Var2 = eo0Var4;
                z = false;
                r7 = z2;
            }
        }
        l7Var.h = eo0Var2;
        if (eo0Var != null) {
            eo0Var.g();
        } else {
            eo0Var = r7;
        }
        l7Var.i = eo0Var;
        zl0 zl0Var9 = lp0Var.j;
        if (zl0Var9 != null) {
            zl0Var = zl0Var9;
        }
        zl0Var.i = r7;
        lp0Var.j = r7;
        lp0Var.h = -1;
        lp0Var.l = r7;
        if (zl0Var == lp0Var) {
            o80.b("trimChain did not update the head");
        }
        l7Var.g = zl0Var;
        if (z) {
            l7Var.j();
        }
        boolean g3 = l7Var.g(16);
        boolean g4 = l7Var.g(1024);
        this.K.j();
        if (this.m == null && l7Var.g(512)) {
            Z(this);
        }
        if (g == g3 && g2 == g4) {
            return;
        }
        u11 rectManager = ((d4) md0.a(this)).getRectManager();
        rectManager.getClass();
        if (F()) {
            u5 u5Var = rectManager.a;
            int i9 = this.e & 33554431;
            long[] jArr = (long[]) u5Var.b;
            int i10 = u5Var.a;
            for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
                int i12 = i11 + 2;
                long j = jArr[i12];
                if ((((int) j) & 33554431) == i9) {
                    jArr[i12] = ((-6917529027641081857L) & j) | ((g4 ? 1L : 0L) * 2305843009213693952L) | ((g3 ? 1L : 0L) * 4611686018427387904L);
                    return;
                }
            }
        }
    }

    public final void b0(am0 am0Var) {
        if (this.d && this.O != xl0.a) {
            o80.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.U) {
            o80.a("modifier is updated when deactivated");
        }
        if (!F()) {
            this.P = am0Var;
            return;
        }
        b(am0Var);
        if (this.w) {
            D();
        }
    }

    @Override // defpackage.mk
    public final void c() {
        i3 i3Var;
        pn1 pn1Var = this.t;
        if (pn1Var != null) {
            pn1Var.c();
        }
        xd0 xd0Var = this.L;
        if (xd0Var != null) {
            xd0Var.i(true);
        }
        this.U = true;
        zl0 zl0Var = (ig1) this.J.f;
        for (zl0 zl0Var2 = zl0Var; zl0Var2 != null; zl0Var2 = zl0Var2.i) {
            if (zl0Var2.r) {
                zl0Var2.u0();
            }
        }
        for (zl0 zl0Var3 = zl0Var; zl0Var3 != null; zl0Var3 = zl0Var3.i) {
            if (zl0Var3.r) {
                zl0Var3.w0();
            }
        }
        while (zl0Var != null) {
            if (zl0Var.r) {
                zl0Var.q0();
            }
            zl0Var = zl0Var.i;
        }
        if (F()) {
            this.x = null;
            this.w = false;
        }
        eu0 eu0Var = this.s;
        if (eu0Var == null || (i3Var = ((d4) eu0Var).P) == null || !i3Var.k.e(this.e)) {
            return;
        }
        i3Var.d.C(i3Var.g, this.e, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [zl0] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [zl0] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [eo0] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [eo0] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final void c0(on1 on1Var) {
        if (Intrinsics.a(this.E, on1Var)) {
            return;
        }
        this.E = on1Var;
        zl0 zl0Var = (zl0) this.J.g;
        if ((zl0Var.h & 16) != 0) {
            while (zl0Var != null) {
                if ((zl0Var.g & 16) != 0) {
                    zq zqVar = zl0Var;
                    ?? r2 = 0;
                    while (zqVar != 0) {
                        if (zqVar instanceof tx0) {
                            ((tx0) zqVar).S();
                        } else if ((zqVar.g & 16) != 0 && (zqVar instanceof zq)) {
                            zl0 zl0Var2 = zqVar.t;
                            int i = 0;
                            zqVar = zqVar;
                            r2 = r2;
                            while (zl0Var2 != null) {
                                if ((zl0Var2.g & 16) != 0) {
                                    i++;
                                    r2 = r2;
                                    if (i == 1) {
                                        zqVar = zl0Var2;
                                    } else {
                                        if (r2 == 0) {
                                            r2 = new eo0(new zl0[16]);
                                        }
                                        if (zqVar != 0) {
                                            r2.b(zqVar);
                                            zqVar = 0;
                                        }
                                        r2.b(zl0Var2);
                                    }
                                }
                                zl0Var2 = zl0Var2.j;
                                zqVar = zqVar;
                                r2 = r2;
                            }
                            if (i == 1) {
                            }
                        }
                        zqVar = op.o(r2);
                    }
                }
                if ((zl0Var.h & 16) == 0) {
                    return;
                } else {
                    zl0Var = zl0Var.j;
                }
            }
        }
    }

    public final void d(eu0 eu0Var) {
        jd0 jd0Var;
        h81 v;
        if (this.s != null) {
            o80.b("Cannot attach " + this + " as it already is attached.  Tree: " + g(0));
        }
        jd0 jd0Var2 = this.r;
        if (jd0Var2 != null && !Intrinsics.a(jd0Var2.s, eu0Var)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(eu0Var);
            sb.append(") than the parent's owner(");
            jd0 s = s();
            sb.append(s != null ? s.s : null);
            sb.append("). This tree: ");
            sb.append(g(0));
            sb.append(" Parent tree: ");
            jd0 jd0Var3 = this.r;
            sb.append(jd0Var3 != null ? jd0Var3.g(0) : null);
            o80.b(sb.toString());
        }
        jd0 s2 = s();
        nd0 nd0Var = this.K;
        if (s2 == null) {
            nd0Var.p.v = true;
            ((d4) eu0Var).getRectManager().f(this, false);
            kj0 kj0Var = nd0Var.q;
            if (kj0Var != null) {
                kj0Var.t = ij0.d;
            }
        }
        l7 l7Var = this.J;
        ((qp0) l7Var.e).u = s2 != null ? (v80) s2.J.d : null;
        this.s = eu0Var;
        this.u = (s2 != null ? s2.u : -1) + 1;
        am0 am0Var = this.P;
        if (am0Var != null) {
            b(am0Var);
        }
        this.P = null;
        ((d4) eu0Var).m13getLayoutNodes().h(this.e, this);
        jd0 jd0Var4 = this.r;
        if (jd0Var4 == null || (jd0Var = jd0Var4.m) == null) {
            jd0Var = this.m;
        }
        Z(jd0Var);
        if (this.m == null && l7Var.g(512)) {
            Z(this);
        }
        if (!this.U) {
            for (zl0 zl0Var = (zl0) l7Var.g; zl0Var != null; zl0Var = zl0Var.j) {
                zl0Var.p0();
            }
        }
        eo0 eo0Var = (eo0) this.o.e;
        Object[] objArr = eo0Var.d;
        int i = eo0Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((jd0) objArr[i2]).d(eu0Var);
        }
        if (!this.U) {
            l7Var.h();
        }
        C();
        if (s2 != null) {
            s2.C();
        }
        w6 w6Var = this.Q;
        if (w6Var != null) {
            w6Var.invoke(eu0Var);
        }
        nd0Var.j();
        if (!this.U && l7Var.g(8)) {
            D();
        }
        i3 i3Var = ((d4) eu0Var).P;
        if (i3Var == null || (v = v()) == null || !v.d.b(p81.q)) {
            return;
        }
        i3Var.k.a(this.e);
        i3Var.d.C(i3Var.g, this.e, true);
    }

    public final void d0() {
        if (this.n <= 0 || !this.q) {
            return;
        }
        this.q = false;
        eo0 eo0Var = this.p;
        if (eo0Var == null) {
            eo0Var = new eo0(new jd0[16]);
            this.p = eo0Var;
        }
        eo0Var.g();
        eo0 eo0Var2 = (eo0) this.o.e;
        Object[] objArr = eo0Var2.d;
        int i = eo0Var2.g;
        for (int i2 = 0; i2 < i; i2++) {
            jd0 jd0Var = (jd0) objArr[i2];
            if (jd0Var.d) {
                eo0Var.c(eo0Var.g, jd0Var.x());
            } else {
                eo0Var.b(jd0Var);
            }
        }
        nd0 nd0Var = this.K;
        nd0Var.p.C = true;
        kj0 kj0Var = nd0Var.q;
        if (kj0Var != null) {
            kj0Var.w = true;
        }
    }

    public final void e() {
        this.H = this.G;
        this.G = hd0.g;
        eo0 x = x();
        Object[] objArr = x.d;
        int i = x.g;
        for (int i2 = 0; i2 < i; i2++) {
            jd0 jd0Var = (jd0) objArr[i2];
            if (jd0Var.G != hd0.g) {
                jd0Var.e();
            }
        }
    }

    public final void f() {
        this.H = this.G;
        this.G = hd0.g;
        eo0 x = x();
        Object[] objArr = x.d;
        int i = x.g;
        for (int i2 = 0; i2 < i; i2++) {
            jd0 jd0Var = (jd0) objArr[i2];
            if (jd0Var.G == hd0.e) {
                jd0Var.f();
            }
        }
    }

    public final String g(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        eo0 x = x();
        Object[] objArr = x.d;
        int i3 = x.g;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((jd0) objArr[i4]).g(i + 1));
        }
        String sb2 = sb.toString();
        return i == 0 ? sb2.substring(0, sb2.length() - 1) : sb2;
    }

    public final void h() {
        kd0 kd0Var;
        eu0 eu0Var = this.s;
        if (eu0Var == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            jd0 s = s();
            sb.append(s != null ? s.g(0) : null);
            o80.c(sb.toString());
            throw new kc0();
        }
        jd0 s2 = s();
        nd0 nd0Var = this.K;
        if (s2 != null) {
            s2.A();
            s2.C();
            uk0 uk0Var = nd0Var.p;
            hd0 hd0Var = hd0.g;
            uk0Var.p = hd0Var;
            kj0 kj0Var = nd0Var.q;
            if (kj0Var != null) {
                kj0Var.n = hd0Var;
            }
        }
        kd0 kd0Var2 = nd0Var.p.A;
        kd0Var2.b = true;
        kd0Var2.c = false;
        kd0Var2.d = false;
        kd0Var2.e = false;
        kd0Var2.f = null;
        kj0 kj0Var2 = nd0Var.q;
        if (kj0Var2 != null && (kd0Var = kj0Var2.u) != null) {
            kd0Var.b = true;
            kd0Var.c = false;
            kd0Var.d = false;
            kd0Var.e = false;
            kd0Var.f = null;
        }
        l7 l7Var = this.J;
        zl0 zl0Var = (ig1) l7Var.f;
        qp0 qp0Var = ((v80) l7Var.d).t;
        for (qp0 qp0Var2 = (qp0) l7Var.e; !Intrinsics.a(qp0Var2, qp0Var) && qp0Var2 != null; qp0Var2 = qp0Var2.t) {
            qp0Var2.b1();
            if (qp0Var2.s.G()) {
                qp0Var2.W0();
            }
        }
        x6 x6Var = this.R;
        if (x6Var != null) {
            x6Var.invoke(eu0Var);
        }
        for (zl0 zl0Var2 = zl0Var; zl0Var2 != null; zl0Var2 = zl0Var2.i) {
            if (zl0Var2.r) {
                zl0Var2.w0();
            }
        }
        this.v = true;
        eo0 eo0Var = (eo0) this.o.e;
        Object[] objArr = eo0Var.d;
        int i = eo0Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((jd0) objArr[i2]).h();
        }
        this.v = false;
        while (zl0Var != null) {
            if (zl0Var.r) {
                zl0Var.q0();
            }
            zl0Var = zl0Var.i;
        }
        d4 d4Var = (d4) eu0Var;
        d4Var.m13getLayoutNodes().g(this.e);
        sk0 sk0Var = d4Var.a0;
        i8 i8Var = sk0Var.b;
        ((s40) i8Var.e).v(this);
        ((s40) i8Var.g).v(this);
        ((s40) i8Var.h).v(this);
        ((eo0) sk0Var.e.e).j(this);
        d4Var.Q = true;
        i3 i3Var = d4Var.P;
        if (i3Var != null && i3Var.k.e(this.e)) {
            i3Var.d.C(i3Var.g, this.e, false);
        }
        d4Var.getRectManager().h(this);
        this.s = null;
        Z(null);
        this.u = 0;
        uk0 uk0Var2 = nd0Var.p;
        uk0Var2.m = Integer.MAX_VALUE;
        uk0Var2.l = Integer.MAX_VALUE;
        uk0Var2.v = false;
        kj0 kj0Var3 = nd0Var.q;
        if (kj0Var3 != null) {
            kj0Var3.m = Integer.MAX_VALUE;
            kj0Var3.l = Integer.MAX_VALUE;
            kj0Var3.t = ij0.g;
        }
        if (l7Var.g(8)) {
            h81 h81Var = this.x;
            this.x = null;
            this.w = false;
            d4Var.getSemanticsOwner().b(this, h81Var);
            d4Var.A();
        }
    }

    public final void i(xf xfVar, l50 l50Var) {
        try {
            ((qp0) this.J.e).C0(xfVar, l50Var);
        } catch (Throwable th) {
            W(th);
            throw null;
        }
    }

    public final void k() {
        if (this.m != null) {
            R(this, false, 5);
        } else {
            T(this, false, 5);
        }
        uk0 uk0Var = this.K.p;
        mm mmVar = uk0Var.n ? new mm(uk0Var.h) : null;
        eu0 eu0Var = this.s;
        if (mmVar != null) {
            if (eu0Var != null) {
                ((d4) eu0Var).u(this, mmVar.a);
            }
        } else if (eu0Var != null) {
            ((d4) eu0Var).t(true);
        }
    }

    public final List l() {
        kj0 kj0Var = this.K.q;
        kj0Var.getClass();
        eo0 eo0Var = kj0Var.v;
        nd0 nd0Var = kj0Var.j;
        nd0Var.a.m();
        if (!kj0Var.w) {
            return eo0Var.f();
        }
        jd0 jd0Var = nd0Var.a;
        eo0 x = jd0Var.x();
        Object[] objArr = x.d;
        int i = x.g;
        for (int i2 = 0; i2 < i; i2++) {
            jd0 jd0Var2 = (jd0) objArr[i2];
            if (eo0Var.g <= i2) {
                kj0 kj0Var2 = jd0Var2.K.q;
                kj0Var2.getClass();
                eo0Var.b(kj0Var2);
            } else {
                kj0 kj0Var3 = jd0Var2.K.q;
                kj0Var3.getClass();
                Object[] objArr2 = eo0Var.d;
                Object obj = objArr2[i2];
                objArr2[i2] = kj0Var3;
            }
        }
        eo0Var.l(((bo0) jd0Var.m()).d.g, eo0Var.g);
        kj0Var.w = false;
        return eo0Var.f();
    }

    public final List m() {
        return x().f();
    }

    public final List n() {
        return ((eo0) this.o.e).f();
    }

    public final boolean o() {
        return this.K.p.y;
    }

    public final boolean p() {
        return this.K.p.x;
    }

    public final hd0 q() {
        return this.K.p.p;
    }

    public final hd0 r() {
        hd0 hd0Var;
        kj0 kj0Var = this.K.q;
        return (kj0Var == null || (hd0Var = kj0Var.n) == null) ? hd0.g : hd0Var;
    }

    public final jd0 s() {
        jd0 jd0Var = this.r;
        while (jd0Var != null && jd0Var.d) {
            jd0Var = jd0Var.r;
        }
        return jd0Var;
    }

    @Override // defpackage.fu0
    public final boolean t() {
        return F();
    }

    public final String toString() {
        return t90.D(this) + " children: " + ((bo0) m()).d.g + " measurePolicy: " + this.B + " deactivated: " + this.U;
    }

    public final int u() {
        return this.K.p.m;
    }

    public final h81 v() {
        if (F() && !this.U && this.J.g(8)) {
            return this.x;
        }
        return null;
    }

    public final eo0 w() {
        boolean z = this.A;
        eo0 eo0Var = this.z;
        if (z) {
            eo0Var.g();
            eo0Var.c(eo0Var.g, x());
            Arrays.sort(eo0Var.d, 0, eo0Var.g, X);
            this.A = false;
        }
        return eo0Var;
    }

    public final eo0 x() {
        d0();
        if (this.n == 0) {
            return (eo0) this.o.e;
        }
        eo0 eo0Var = this.p;
        eo0Var.getClass();
        return eo0Var;
    }

    public final void y(long j, i60 i60Var, int i, boolean z) {
        l7 l7Var = this.J;
        qp0 qp0Var = (qp0) l7Var.e;
        o31 o31Var = qp0.Q;
        ((qp0) l7Var.e).O0(qp0.S, qp0Var.G0(j), i60Var, i, z);
    }

    public final void z(int i, jd0 jd0Var) {
        if (jd0Var.r != null && jd0Var.s != null) {
            o80.b(j(jd0Var));
        }
        jd0Var.r = this;
        yw ywVar = this.o;
        ((eo0) ywVar.e).a(i, jd0Var);
        ((ce) ywVar.g).invoke();
        M();
        if (jd0Var.d) {
            this.n++;
        }
        E();
        eu0 eu0Var = this.s;
        if (eu0Var != null) {
            jd0Var.d(eu0Var);
        }
        if (jd0Var.K.l > 0) {
            nd0 nd0Var = this.K;
            nd0Var.d(nd0Var.l + 1);
        }
        if (jd0Var.T > 0) {
            Y(this.T + 1);
        }
    }

    public jd0(int i) {
        this(i81.a.addAndGet(1), (i & 1) == 0);
    }
}
