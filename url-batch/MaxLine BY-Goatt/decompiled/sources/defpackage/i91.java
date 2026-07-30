package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class i91 implements gz, sx1, pz {
    public static final pb2 Z = new pb2("Undefined intrinsics block and it is required", 1);
    public static final d91 a0 = new d91();
    public static final n b0 = new n(8);
    public boolean A;
    public boolean B;
    public sh2 C;
    public boolean D;
    public final eo1 E;
    public boolean F;
    public oj1 G;
    public t21 H;
    public ca0 I;
    public u81 J;
    public g53 K;
    public n00 L;
    public g91 M;
    public g91 N;
    public boolean O;
    public final fs1 P;
    public final m91 Q;
    public v91 R;
    public ks1 S;
    public boolean T;
    public vl1 U;
    public vl1 V;
    public boolean W;
    public int X;
    public boolean Y;
    public final boolean m;
    public int n;
    public long o;
    public long p;
    public long q;
    public boolean r;
    public i91 s;
    public int t;
    public final t21 u;
    public eo1 v;
    public boolean w;
    public i91 x;
    public rx1 y;
    public int z;

    public i91(int i, boolean z) {
        this.m = z;
        this.n = i;
        this.o = 9223372034707292159L;
        this.p = 0L;
        this.q = 9223372034707292159L;
        this.r = true;
        this.u = new t21(28, new eo1(new i91[16]), new u(14, this));
        this.E = new eo1(new i91[16]);
        this.F = true;
        this.G = Z;
        this.I = l91.a;
        this.J = u81.m;
        this.K = a0;
        n00.c.getClass();
        this.L = m00.b;
        g91 g91Var = g91.o;
        this.M = g91Var;
        this.N = g91Var;
        this.P = new fs1(this);
        this.Q = new m91(this);
        this.T = true;
        this.U = sl1.a;
    }

    public static void U(i91 i91Var, boolean z, int i) {
        i91 u;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (i91Var.s == null) {
            h21.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        rx1 rx1Var = i91Var.y;
        if (rx1Var == null || i91Var.A || i91Var.m) {
            return;
        }
        ((t7) rx1Var).z(i91Var, true, z, z2);
        if (z3) {
            xg1 xg1Var = i91Var.Q.q;
            xg1Var.getClass();
            m91 m91Var = xg1Var.r;
            i91 u2 = m91Var.a.u();
            g91 g91Var = m91Var.a.M;
            if (u2 == null || g91Var == g91.o) {
                return;
            }
            while (u2.M == g91Var && (u = u2.u()) != null) {
                u2 = u;
            }
            int ordinal = g91Var.ordinal();
            if (ordinal == 0) {
                if (u2.s != null) {
                    U(u2, z, 6);
                    return;
                } else {
                    W(u2, z, 6);
                    return;
                }
            }
            if (ordinal != 1) {
                lh.g("Intrinsics isn't used by the parent");
            } else if (u2.s != null) {
                u2.T(z);
            } else {
                u2.V(z);
            }
        }
    }

    public static void W(i91 i91Var, boolean z, int i) {
        rx1 rx1Var;
        i91 u;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (i91Var.A || i91Var.m || (rx1Var = i91Var.y) == null) {
            return;
        }
        ((t7) rx1Var).z(i91Var, false, z, z2);
        if (z3) {
            m91 m91Var = i91Var.Q.p.r;
            i91 u2 = m91Var.a.u();
            g91 g91Var = m91Var.a.M;
            if (u2 == null || g91Var == g91.o) {
                return;
            }
            while (u2.M == g91Var && (u = u2.u()) != null) {
                u2 = u;
            }
            int ordinal = g91Var.ordinal();
            if (ordinal == 0) {
                W(u2, z, 6);
            } else if (ordinal == 1) {
                u2.V(z);
            } else {
                lh.g("Intrinsics isn't used by the parent");
            }
        }
    }

    public static void X(i91 i91Var) {
        int i = h91.a[i91Var.Q.d.ordinal()];
        m91 m91Var = i91Var.Q;
        if (i != 1) {
            b71.q(m91Var.d, "Unexpected state ");
            return;
        }
        if (m91Var.e) {
            U(i91Var, true, 6);
            return;
        }
        if (m91Var.f) {
            i91Var.T(true);
        }
        if (i91Var.q()) {
            W(i91Var, true, 6);
        } else if (i91Var.p()) {
            i91Var.V(true);
        }
    }

    private final String j(i91 i91Var) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(i91Var);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(g(0));
        sb.append(" Other tree: ");
        i91 i91Var2 = i91Var.x;
        sb.append(i91Var2 != null ? i91Var2.g(0) : null);
        return sb.toString();
    }

    public final void A(int i, i91 i91Var) {
        if (i91Var.x != null && i91Var.y != null) {
            h21.b(j(i91Var));
        }
        i91Var.x = this;
        t21 t21Var = this.u;
        ((eo1) t21Var.n).a(i, i91Var);
        ((u) t21Var.o).invoke();
        P();
        if (i91Var.m) {
            this.t++;
        }
        H();
        rx1 rx1Var = this.y;
        if (rx1Var != null) {
            i91Var.d(rx1Var);
        }
        if (i91Var.Q.l > 0) {
            m91 m91Var = this.Q;
            m91Var.d(m91Var.l + 1);
        }
        if (i91Var.X > 0) {
            b0(this.X + 1);
        }
    }

    public final void B() {
        if (this.T) {
            fs1 fs1Var = this.P;
            ks1 ks1Var = fs1Var.c;
            ks1 ks1Var2 = fs1Var.d.C;
            this.S = null;
            while (true) {
                if (Intrinsics.b(ks1Var, ks1Var2)) {
                    break;
                }
                if ((ks1Var != null ? ks1Var.U : null) != null) {
                    this.S = ks1Var;
                    break;
                }
                ks1Var = ks1Var != null ? ks1Var.C : null;
            }
        }
        ks1 ks1Var3 = this.S;
        if (ks1Var3 != null && ks1Var3.U == null) {
            throw q40.f("layer was not set");
        }
        if (ks1Var3 != null) {
            ks1Var3.X0();
            return;
        }
        i91 u = u();
        if (u != null) {
            u.B();
        }
    }

    public final void C() {
        fs1 fs1Var = this.P;
        ks1 ks1Var = fs1Var.d;
        n21 n21Var = fs1Var.c;
        while (ks1Var != n21Var) {
            ks1Var.getClass();
            c91 c91Var = (c91) ks1Var;
            qx1 qx1Var = c91Var.U;
            if (qx1Var != null) {
                ((fw0) qx1Var).c();
            }
            ks1Var = c91Var.B;
        }
        qx1 qx1Var2 = fs1Var.c.U;
        if (qx1Var2 != null) {
            ((fw0) qx1Var2).c();
        }
    }

    public final void D() {
        if (this.m) {
            i91 u = u();
            if (u != null) {
                u.D();
                return;
            }
            return;
        }
        if (this.s != null) {
            U(this, false, 7);
        } else {
            W(this, false, 7);
        }
    }

    @Override // defpackage.sx1
    public final boolean E() {
        return I();
    }

    public final void F() {
        if (s31.a(this.o, 9223372034707292159L)) {
            return;
        }
        this.o = 9223372034707292159L;
        eo1 y = y();
        Object[] objArr = y.m;
        int i = y.o;
        for (int i2 = 0; i2 < i; i2++) {
            ((i91) objArr[i2]).F();
        }
    }

    public final void G() {
        if (this.D) {
            return;
        }
        if (this.P.b.r != null || this.V != null) {
            this.B = true;
            return;
        }
        sh2 sh2Var = this.C;
        this.D = true;
        c82 c82Var = new c82();
        c82Var.m = new sh2();
        tx1 snapshotObserver = ((t7) l91.a(this)).getSnapshotObserver();
        snapshotObserver.a(this, snapshotObserver.d, new k7(12, this, c82Var));
        this.D = false;
        this.C = (sh2) c82Var.m;
        this.B = false;
        t7 t7Var = (t7) l91.a(this);
        t7Var.getSemanticsOwner().b(this, sh2Var);
        t7Var.B();
    }

    public final void H() {
        i91 i91Var;
        if (this.t > 0) {
            this.w = true;
        }
        if (!this.m || (i91Var = this.x) == null) {
            return;
        }
        i91Var.H();
    }

    public final boolean I() {
        return this.y != null;
    }

    public final boolean J() {
        return this.Q.p.D;
    }

    public final Boolean K() {
        xg1 xg1Var = this.Q.q;
        if (xg1Var != null) {
            return Boolean.valueOf(xg1Var.r());
        }
        return null;
    }

    public final void L() {
        i91 u;
        if (this.M == g91.o) {
            f();
        }
        xg1 xg1Var = this.Q.q;
        xg1Var.getClass();
        try {
            xg1Var.s = true;
            if (!xg1Var.w) {
                h21.b("replace() called on item that was not placed");
            }
            xg1Var.I = false;
            boolean r = xg1Var.r();
            xg1Var.u0(xg1Var.z, xg1Var.A);
            if (r && !xg1Var.I && (u = xg1Var.r.a.u()) != null) {
                u.T(false);
            }
            xg1Var.s = false;
        } catch (Throwable th) {
            xg1Var.s = false;
            throw th;
        }
    }

    public final void M(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            t21 t21Var = this.u;
            eo1 eo1Var = (eo1) t21Var.n;
            u uVar = (u) t21Var.o;
            Object l = eo1Var.l(i5);
            uVar.invoke();
            ((eo1) t21Var.n).a(i6, (i91) l);
            uVar.invoke();
        }
        P();
        H();
        D();
    }

    public final void N(i91 i91Var) {
        if (i91Var.Q.l > 0) {
            this.Q.d(r0.l - 1);
        }
        if (this.y != null) {
            i91Var.h();
        }
        i91Var.x = null;
        if (i91Var.X > 0) {
            b0(this.X - 1);
        }
        i91Var.P.d.C = null;
        if (i91Var.m) {
            this.t--;
            eo1 eo1Var = (eo1) i91Var.u.n;
            Object[] objArr = eo1Var.m;
            int i = eo1Var.o;
            for (int i2 = 0; i2 < i; i2++) {
                ((i91) objArr[i2]).P.d.C = null;
            }
        }
        H();
        P();
    }

    public final void O() {
        this.r = true;
        eo1 y = y();
        Object[] objArr = y.m;
        int i = y.o;
        for (int i2 = 0; i2 < i; i2++) {
            ((i91) objArr[i2]).F();
        }
    }

    public final void P() {
        if (!this.m) {
            this.F = true;
            return;
        }
        i91 u = u();
        if (u != null) {
            u.P();
        }
    }

    public final void Q() {
        t21 t21Var = this.u;
        int i = ((eo1) t21Var.n).o;
        while (true) {
            i--;
            eo1 eo1Var = (eo1) t21Var.n;
            if (-1 >= i) {
                eo1Var.g();
                ((u) t21Var.o).invoke();
                return;
            }
            N((i91) eo1Var.m[i]);
        }
    }

    public final void R(int i, int i2) {
        if (i2 < 0) {
            h21.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            t21 t21Var = this.u;
            N((i91) ((eo1) t21Var.n).m[i3]);
            Object l = ((eo1) t21Var.n).l(i3);
            ((u) t21Var.o).invoke();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final void S() {
        i91 u;
        if (this.M == g91.o) {
            f();
        }
        nj1 nj1Var = this.Q.p;
        m91 m91Var = nj1Var.r;
        try {
            nj1Var.s = true;
            if (!nj1Var.w) {
                h21.b("replace called on unplaced item");
            }
            boolean z = nj1Var.D;
            nj1Var.w0(nj1Var.y, nj1Var.A, nj1Var.z);
            if (z && !nj1Var.Q && (u = m91Var.a.u()) != null) {
                u.V(false);
            }
        } finally {
        }
    }

    public final void T(boolean z) {
        rx1 rx1Var;
        if (this.m || (rx1Var = this.y) == null) {
            return;
        }
        ((t7) rx1Var).A(this, true, z);
    }

    public final void V(boolean z) {
        rx1 rx1Var;
        if (this.m || (rx1Var = this.y) == null) {
            return;
        }
        ((t7) rx1Var).A(this, false, z);
    }

    public final void Y() {
        eo1 y = y();
        Object[] objArr = y.m;
        int i = y.o;
        for (int i2 = 0; i2 < i; i2++) {
            i91 i91Var = (i91) objArr[i2];
            g91 g91Var = i91Var.N;
            i91Var.M = g91Var;
            if (g91Var != g91.o) {
                i91Var.Y();
            }
        }
    }

    public final void Z(Throwable th) {
        n00 n00Var = this.L;
        bp2 bp2Var = j00.a;
        v02 v02Var = (v02) n00Var;
        v02Var.getClass();
        g00 g00Var = (g00) ll3.P(v02Var, bp2Var);
        if (g00Var == null) {
            throw th;
        }
        s93.T(th, new h00(0, (i00) g00Var, this));
        throw th;
    }

    @Override // defpackage.gz
    public final void a() {
        v91 v91Var = this.R;
        if (v91Var != null) {
            v91Var.a();
        }
        fs1 fs1Var = this.P;
        ks1 ks1Var = fs1Var.c.B;
        for (ks1 ks1Var2 = fs1Var.d; !Intrinsics.b(ks1Var2, ks1Var) && ks1Var2 != null; ks1Var2 = ks1Var2.B) {
            ks1Var2.d1();
        }
    }

    public final void a0(ca0 ca0Var) {
        if (Intrinsics.b(this.I, ca0Var)) {
            return;
        }
        this.I = ca0Var;
        D();
        i91 u = u();
        if (u != null) {
            u.B();
        }
        C();
        for (ul1 ul1Var = this.P.f; ul1Var != null; ul1Var = ul1Var.r) {
            ul1Var.b();
        }
    }

    @Override // defpackage.gz
    public final void b() {
        v6 v6Var;
        v91 v91Var = this.R;
        if (v91Var != null) {
            v91Var.e(true);
        }
        this.Y = true;
        ul1 ul1Var = this.P.e;
        for (ul1 ul1Var2 = ul1Var; ul1Var2 != null; ul1Var2 = ul1Var2.q) {
            if (ul1Var2.z) {
                ul1Var2.B0();
            }
        }
        for (ul1 ul1Var3 = ul1Var; ul1Var3 != null; ul1Var3 = ul1Var3.q) {
            if (ul1Var3.z) {
                ul1Var3.D0();
            }
        }
        while (ul1Var != null) {
            if (ul1Var.z) {
                ul1Var.x0();
            }
            ul1Var = ul1Var.q;
        }
        if (I()) {
            this.C = null;
            this.B = false;
        }
        rx1 rx1Var = this.y;
        if (rx1Var != null) {
            t7 t7Var = (t7) rx1Var;
            t7Var.getRectManager().j(this);
            if (t7.e() && (v6Var = t7Var.Q) != null && v6Var.g.e(this.n)) {
                v6Var.a.h(v6Var.c, this.n, false);
            }
        }
    }

    public final void b0(int i) {
        i91 u;
        i91 u2;
        int i2 = this.X;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (u2 = u()) != null) {
                u2.b0(u2.X + 1);
            }
            if (i == 0 && this.X > 0 && (u = u()) != null) {
                u.b0(u.X - 1);
            }
            this.X = i;
        }
    }

    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v3, types: [ks1, ul1] */
    public final void c(vl1 vl1Var) {
        ?? r7;
        fs1 fs1Var;
        es1 es1Var;
        eo1 eo1Var;
        boolean z;
        boolean z2;
        boolean z3;
        eo1 eo1Var2;
        boolean z4;
        wn0 wn0Var;
        fs1 fs1Var2 = this.P;
        boolean d = fs1Var2.d(16);
        ul1 ul1Var = fs1Var2.e;
        boolean d2 = fs1Var2.d(1024);
        this.U = vl1Var;
        n21 n21Var = fs1Var2.c;
        i91 i91Var = fs1Var2.a;
        ul1 ul1Var2 = fs1Var2.f;
        es1 es1Var2 = fs1Var2.b;
        if (ul1Var2 == es1Var2) {
            h21.b("padChain called on already padded chain");
        }
        ul1 ul1Var3 = fs1Var2.f;
        ul1Var3.q = es1Var2;
        es1Var2.r = ul1Var3;
        eo1 eo1Var3 = fs1Var2.g;
        int i = eo1Var3 != null ? eo1Var3.o : 0;
        eo1 eo1Var4 = fs1Var2.h;
        if (eo1Var4 == null) {
            eo1Var4 = new eo1(new tl1[16]);
        }
        eo1 eo1Var5 = fs1Var2.i;
        eo1Var5.b(vl1Var);
        wn0 wn0Var2 = null;
        while (true) {
            int i2 = eo1Var5.o;
            int i3 = 1;
            if (i2 == 0) {
                break;
            }
            vl1 vl1Var2 = (vl1) eo1Var5.l(i2 - 1);
            if (vl1Var2 instanceof xw) {
                xw xwVar = (xw) vl1Var2;
                eo1Var5.b(xwVar.b);
                eo1Var5.b(xwVar.a);
            } else if (vl1Var2 instanceof tl1) {
                eo1Var4.b(vl1Var2);
            } else {
                if (wn0Var2 == null) {
                    wn0Var = new wn0(i3, eo1Var4);
                    wn0Var2 = wn0Var;
                } else {
                    wn0Var = wn0Var2;
                }
                vl1Var2.b(wn0Var);
            }
        }
        int i4 = eo1Var4.o;
        if (i4 == i) {
            ul1 ul1Var4 = es1Var2.r;
            int i5 = 0;
            while (ul1Var4 != null && i5 < i) {
                if (eo1Var3 == null) {
                    throw q40.f("expected prior modifier list to be non-empty");
                }
                tl1 tl1Var = (tl1) eo1Var3.m[i5];
                tl1 tl1Var2 = (tl1) eo1Var4.m[i5];
                if (Intrinsics.b(tl1Var, tl1Var2)) {
                    eo1Var2 = eo1Var3;
                    z4 = 2;
                } else {
                    eo1Var2 = eo1Var3;
                    z4 = tl1Var.getClass() == tl1Var2.getClass();
                }
                if (!z4) {
                    ul1Var4 = ul1Var4.q;
                    break;
                }
                if (z4) {
                    fs1.h(tl1Var, tl1Var2, ul1Var4);
                }
                ul1Var4 = ul1Var4.r;
                i5++;
                eo1Var3 = eo1Var2;
            }
            eo1Var2 = eo1Var3;
            if (i5 >= i) {
                fs1Var2 = fs1Var2;
                eo1Var3 = eo1Var2;
                z2 = false;
                fs1Var = fs1Var2;
                es1Var = es1Var2;
                eo1Var = eo1Var4;
                z = false;
                r7 = z2;
            } else {
                if (eo1Var2 == null) {
                    throw q40.f("expected prior modifier list to be non-empty");
                }
                if (ul1Var4 == null) {
                    throw q40.f("structuralUpdate requires a non-null tail");
                }
                boolean z5 = i91Var.V != null;
                ul1 ul1Var5 = ul1Var4;
                fs1Var = fs1Var2;
                eo1Var = eo1Var4;
                eo1Var3 = eo1Var2;
                z3 = false;
                fs1Var.f(i5, eo1Var3, eo1Var, ul1Var5, !z5);
                es1Var = es1Var2;
                z = true;
                r7 = z3;
            }
        } else {
            r7 = 0;
            z3 = false;
            z2 = false;
            vl1 vl1Var3 = i91Var.V;
            if (vl1Var3 != null && i == 0) {
                ul1 ul1Var6 = es1Var2;
                for (int i6 = 0; i6 < eo1Var4.o; i6++) {
                    ul1Var6 = fs1.b((tl1) eo1Var4.m[i6], ul1Var6);
                }
                int i7 = 0;
                for (ul1 ul1Var7 = ul1Var.q; ul1Var7 != null && ul1Var7 != es1Var2; ul1Var7 = ul1Var7.q) {
                    i7 |= ul1Var7.o;
                    ul1Var7.p = i7;
                }
                fs1Var = fs1Var2;
                es1Var = es1Var2;
                eo1Var = eo1Var4;
                z = true;
                r7 = z3;
            } else if (i4 != 0) {
                if (eo1Var3 == null) {
                    eo1Var3 = new eo1(new tl1[16]);
                }
                fs1Var = fs1Var2;
                es1Var = es1Var2;
                eo1Var = eo1Var4;
                fs1Var.f(0, eo1Var3, eo1Var, es1Var, !(vl1Var3 != null));
                z = true;
            } else {
                if (eo1Var3 == null) {
                    throw q40.f("expected prior modifier list to be non-empty");
                }
                ul1 ul1Var8 = es1Var2.r;
                for (int i8 = 0; ul1Var8 != null && i8 < eo1Var3.o; i8++) {
                    ul1Var8 = fs1.c(ul1Var8).r;
                }
                i91 u = i91Var.u();
                n21Var.C = u != null ? u.P.c : null;
                fs1Var2.d = n21Var;
                fs1Var = fs1Var2;
                es1Var = es1Var2;
                eo1Var = eo1Var4;
                z = false;
                r7 = z2;
            }
        }
        fs1Var.g = eo1Var;
        if (eo1Var3 != null) {
            eo1Var3.g();
        } else {
            eo1Var3 = r7;
        }
        fs1Var.h = eo1Var3;
        ul1 ul1Var9 = es1Var.r;
        if (ul1Var9 != null) {
            ul1Var = ul1Var9;
        }
        ul1Var.q = r7;
        es1Var.r = r7;
        es1Var.p = -1;
        es1Var.t = r7;
        if (ul1Var == es1Var) {
            h21.b("trimChain did not update the head");
        }
        fs1Var.f = ul1Var;
        if (z) {
            fs1Var.g();
        }
        boolean d3 = fs1Var.d(16);
        boolean d4 = fs1Var.d(1024);
        this.Q.j();
        if (this.s == null && fs1Var.d(512)) {
            c0(this);
        }
        if (d == d3 && d2 == d4) {
            return;
        }
        x72 rectManager = ((t7) l91.a(this)).getRectManager();
        rectManager.getClass();
        if (I()) {
            yf yfVar = rectManager.a;
            int i9 = this.n & 67108863;
            long[] jArr = (long[]) yfVar.o;
            int i10 = yfVar.n;
            for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
                int i12 = i11 + 2;
                long j = jArr[i12];
                if ((((int) j) & 67108863) == i9) {
                    jArr[i12] = (4611686018427387903L & j) | ((d4 ? 1L : 0L) * 4611686018427387904L) | ((d3 ? 1L : 0L) * Long.MIN_VALUE);
                    return;
                }
            }
        }
    }

    public final void c0(i91 i91Var) {
        if (Intrinsics.b(i91Var, this.s)) {
            return;
        }
        this.s = i91Var;
        m91 m91Var = this.Q;
        if (i91Var != null) {
            if (m91Var.q == null) {
                m91Var.q = new xg1(m91Var);
            }
            fs1 fs1Var = this.P;
            ks1 ks1Var = fs1Var.c.B;
            for (ks1 ks1Var2 = fs1Var.d; !Intrinsics.b(ks1Var2, ks1Var) && ks1Var2 != null; ks1Var2 = ks1Var2.B) {
                ks1Var2.L0();
            }
        } else {
            m91Var.q = null;
            m91Var.f = false;
            m91Var.e = false;
        }
        D();
    }

    public final void d(rx1 rx1Var) {
        i91 i91Var;
        v6 v6Var;
        sh2 w;
        if (this.y != null) {
            h21.b("Cannot attach " + this + " as it already is attached.  Tree: " + g(0));
        }
        i91 i91Var2 = this.x;
        if (i91Var2 != null && !Intrinsics.b(i91Var2.y, rx1Var)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(rx1Var);
            sb.append(") than the parent's owner(");
            i91 u = u();
            sb.append(u != null ? u.y : null);
            sb.append("). This tree: ");
            sb.append(g(0));
            sb.append(" Parent tree: ");
            i91 i91Var3 = this.x;
            sb.append(i91Var3 != null ? i91Var3.g(0) : null);
            h21.b(sb.toString());
        }
        i91 u2 = u();
        m91 m91Var = this.Q;
        if (u2 == null) {
            m91Var.p.D = true;
            xg1 xg1Var = m91Var.q;
            if (xg1Var != null) {
                xg1Var.B = ug1.m;
            }
        }
        fs1 fs1Var = this.P;
        fs1Var.d.C = u2 != null ? u2.P.c : null;
        this.y = rx1Var;
        this.z = (u2 != null ? u2.z : -1) + 1;
        vl1 vl1Var = this.V;
        if (vl1Var != null) {
            c(vl1Var);
        }
        this.V = null;
        ((t7) rx1Var).getLayoutNodes().h(this.n, this);
        i91 i91Var4 = this.x;
        if (i91Var4 == null || (i91Var = i91Var4.s) == null) {
            i91Var = this.s;
        }
        c0(i91Var);
        if (this.s == null && fs1Var.d(512)) {
            c0(this);
        }
        if (!this.Y) {
            for (ul1 ul1Var = fs1Var.f; ul1Var != null; ul1Var = ul1Var.r) {
                ul1Var.w0();
            }
        }
        eo1 eo1Var = (eo1) this.u.n;
        Object[] objArr = eo1Var.m;
        int i = eo1Var.o;
        for (int i2 = 0; i2 < i; i2++) {
            ((i91) objArr[i2]).d(rx1Var);
        }
        if (!this.Y) {
            fs1Var.e();
        }
        D();
        if (u2 != null) {
            u2.D();
        }
        m91Var.j();
        if (!this.Y && fs1Var.d(8)) {
            G();
        }
        t7 t7Var = (t7) rx1Var;
        if (!t7.e() || (v6Var = t7Var.Q) == null || (w = w()) == null || !w.m.b(gi2.q)) {
            return;
        }
        v6Var.g.a(this.n);
        v6Var.a.h(v6Var.c, this.n, true);
    }

    public final void d0(oj1 oj1Var) {
        if (Intrinsics.b(this.G, oj1Var)) {
            return;
        }
        this.G = oj1Var;
        t21 t21Var = this.H;
        if (t21Var != null) {
            ((lz1) t21Var.o).setValue(oj1Var);
        }
        D();
    }

    public final void e() {
        this.N = this.M;
        this.M = g91.o;
        eo1 y = y();
        Object[] objArr = y.m;
        int i = y.o;
        for (int i2 = 0; i2 < i; i2++) {
            i91 i91Var = (i91) objArr[i2];
            if (i91Var.M != g91.o) {
                i91Var.e();
            }
        }
    }

    public final void e0(vl1 vl1Var) {
        if (this.m && this.U != sl1.a) {
            h21.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.Y) {
            h21.a("modifier is updated when deactivated");
        }
        if (!I()) {
            this.V = vl1Var;
            return;
        }
        c(vl1Var);
        if (this.B) {
            G();
        }
    }

    public final void f() {
        this.N = this.M;
        this.M = g91.o;
        eo1 y = y();
        Object[] objArr = y.m;
        int i = y.o;
        for (int i2 = 0; i2 < i; i2++) {
            i91 i91Var = (i91) objArr[i2];
            if (i91Var.M == g91.n) {
                i91Var.f();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [ul1] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [ul1] */
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
    /* JADX WARN: Type inference failed for: r2v3, types: [eo1] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [eo1] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final void f0(g53 g53Var) {
        if (Intrinsics.b(this.K, g53Var)) {
            return;
        }
        this.K = g53Var;
        ul1 ul1Var = this.P.f;
        if ((ul1Var.p & 16) != 0) {
            while (ul1Var != null) {
                if ((ul1Var.o & 16) != 0) {
                    p90 p90Var = ul1Var;
                    ?? r2 = 0;
                    while (p90Var != 0) {
                        if (p90Var instanceof w22) {
                            ((w22) p90Var).e0();
                        } else if ((p90Var.o & 16) != 0 && (p90Var instanceof p90)) {
                            ul1 ul1Var2 = p90Var.B;
                            int i = 0;
                            p90Var = p90Var;
                            r2 = r2;
                            while (ul1Var2 != null) {
                                if ((ul1Var2.o & 16) != 0) {
                                    i++;
                                    r2 = r2;
                                    if (i == 1) {
                                        p90Var = ul1Var2;
                                    } else {
                                        if (r2 == 0) {
                                            r2 = new eo1(new ul1[16]);
                                        }
                                        if (p90Var != 0) {
                                            r2.b(p90Var);
                                            p90Var = 0;
                                        }
                                        r2.b(ul1Var2);
                                    }
                                }
                                ul1Var2 = ul1Var2.r;
                                p90Var = p90Var;
                                r2 = r2;
                            }
                            if (i == 1) {
                            }
                        }
                        p90Var = s03.c(r2);
                    }
                }
                if ((ul1Var.p & 16) == 0) {
                    return;
                } else {
                    ul1Var = ul1Var.r;
                }
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
        eo1 y = y();
        Object[] objArr = y.m;
        int i3 = y.o;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((i91) objArr[i4]).g(i + 1));
        }
        String sb2 = sb.toString();
        return i == 0 ? sb2.substring(0, sb2.length() - 1) : sb2;
    }

    public final void g0() {
        if (this.t <= 0 || !this.w) {
            return;
        }
        this.w = false;
        eo1 eo1Var = this.v;
        if (eo1Var == null) {
            eo1Var = new eo1(new i91[16]);
            this.v = eo1Var;
        }
        eo1Var.g();
        eo1 eo1Var2 = (eo1) this.u.n;
        Object[] objArr = eo1Var2.m;
        int i = eo1Var2.o;
        for (int i2 = 0; i2 < i; i2++) {
            i91 i91Var = (i91) objArr[i2];
            if (i91Var.m) {
                eo1Var.c(eo1Var.o, i91Var.y());
            } else {
                eo1Var.b(i91Var);
            }
        }
        m91 m91Var = this.Q;
        m91Var.p.K = true;
        xg1 xg1Var = m91Var.q;
        if (xg1Var != null) {
            xg1Var.E = true;
        }
    }

    public final void h() {
        v6 v6Var;
        j91 j91Var;
        rx1 rx1Var = this.y;
        if (rx1Var == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            i91 u = u();
            sb.append(u != null ? u.g(0) : null);
            h21.c(sb.toString());
            throw new k81();
        }
        i91 u2 = u();
        m91 m91Var = this.Q;
        if (u2 != null) {
            u2.B();
            u2.D();
            nj1 nj1Var = m91Var.p;
            g91 g91Var = g91.o;
            nj1Var.x = g91Var;
            xg1 xg1Var = m91Var.q;
            if (xg1Var != null) {
                xg1Var.v = g91Var;
            }
        }
        j91 j91Var2 = m91Var.p.I;
        j91Var2.b = true;
        j91Var2.c = false;
        j91Var2.d = false;
        j91Var2.e = false;
        j91Var2.f = null;
        xg1 xg1Var2 = m91Var.q;
        if (xg1Var2 != null && (j91Var = xg1Var2.C) != null) {
            j91Var.b = true;
            j91Var.c = false;
            j91Var.d = false;
            j91Var.e = false;
            j91Var.f = null;
        }
        fs1 fs1Var = this.P;
        ul1 ul1Var = fs1Var.e;
        ks1 ks1Var = fs1Var.c.B;
        for (ks1 ks1Var2 = fs1Var.d; !Intrinsics.b(ks1Var2, ks1Var) && ks1Var2 != null; ks1Var2 = ks1Var2.B) {
            ks1Var2.i1();
        }
        for (ul1 ul1Var2 = ul1Var; ul1Var2 != null; ul1Var2 = ul1Var2.q) {
            if (ul1Var2.z) {
                ul1Var2.D0();
            }
        }
        this.A = true;
        eo1 eo1Var = (eo1) this.u.n;
        Object[] objArr = eo1Var.m;
        int i = eo1Var.o;
        for (int i2 = 0; i2 < i; i2++) {
            ((i91) objArr[i2]).h();
        }
        Unit unit = Unit.a;
        this.A = false;
        while (ul1Var != null) {
            if (ul1Var.z) {
                ul1Var.x0();
            }
            ul1Var = ul1Var.q;
        }
        t7 t7Var = (t7) rx1Var;
        t7Var.getLayoutNodes().g(this.n);
        lj1 lj1Var = t7Var.c0;
        mh mhVar = lj1Var.b;
        ((ar0) mhVar.n).x(this);
        ((ar0) mhVar.o).x(this);
        ((ar0) mhVar.p).x(this);
        ((eo1) lj1Var.e.n).k(this);
        t7Var.R = true;
        t7Var.getRectManager().j(this);
        if (t7.e() && (v6Var = t7Var.Q) != null && v6Var.g.e(this.n)) {
            v6Var.a.h(v6Var.c, this.n, false);
        }
        this.y = null;
        this.o = 9223372034707292159L;
        c0(null);
        this.z = 0;
        nj1 nj1Var2 = m91Var.p;
        nj1Var2.u = Integer.MAX_VALUE;
        nj1Var2.t = Integer.MAX_VALUE;
        nj1Var2.D = false;
        xg1 xg1Var3 = m91Var.q;
        if (xg1Var3 != null) {
            xg1Var3.u = Integer.MAX_VALUE;
            xg1Var3.t = Integer.MAX_VALUE;
            xg1Var3.B = ug1.o;
        }
        if (fs1Var.d(8)) {
            sh2 sh2Var = this.C;
            this.C = null;
            this.B = false;
            t7Var.getSemanticsOwner().b(this, sh2Var);
            t7Var.B();
        }
    }

    public final void i(ls lsVar, dw0 dw0Var) {
        try {
            this.P.d.J0(lsVar, dw0Var);
            Unit unit = Unit.a;
        } catch (Throwable th) {
            this.Z(th);
            throw null;
        }
    }

    public final void k() {
        if (this.s != null) {
            U(this, false, 5);
        } else {
            W(this, false, 5);
        }
        nj1 nj1Var = this.Q.p;
        u10 u10Var = nj1Var.v ? new u10(nj1Var.p) : null;
        rx1 rx1Var = this.y;
        if (u10Var != null) {
            if (rx1Var != null) {
                ((t7) rx1Var).w(this, u10Var.a);
            }
        } else if (rx1Var != null) {
            ((t7) rx1Var).v(true);
        }
    }

    public final List l() {
        xg1 xg1Var = this.Q.q;
        xg1Var.getClass();
        eo1 eo1Var = xg1Var.D;
        m91 m91Var = xg1Var.r;
        m91Var.a.n();
        if (!xg1Var.E) {
            return eo1Var.f();
        }
        i91 i91Var = m91Var.a;
        eo1 y = i91Var.y();
        Object[] objArr = y.m;
        int i = y.o;
        for (int i2 = 0; i2 < i; i2++) {
            i91 i91Var2 = (i91) objArr[i2];
            if (eo1Var.o <= i2) {
                xg1 xg1Var2 = i91Var2.Q.q;
                xg1Var2.getClass();
                eo1Var.b(xg1Var2);
            } else {
                xg1 xg1Var3 = i91Var2.Q.q;
                xg1Var3.getClass();
                Object[] objArr2 = eo1Var.m;
                Object obj = objArr2[i2];
                objArr2[i2] = xg1Var3;
            }
        }
        eo1Var.m(((bo1) i91Var.n()).m.o, eo1Var.o);
        xg1Var.E = false;
        return eo1Var.f();
    }

    public final List m() {
        return this.Q.p.m0();
    }

    public final List n() {
        return y().f();
    }

    public final List o() {
        return ((eo1) this.u.n).f();
    }

    public final boolean p() {
        return this.Q.p.G;
    }

    public final boolean q() {
        return this.Q.p.F;
    }

    public final g91 r() {
        return this.Q.p.x;
    }

    public final g91 s() {
        g91 g91Var;
        xg1 xg1Var = this.Q.q;
        return (xg1Var == null || (g91Var = xg1Var.v) == null) ? g91.o : g91Var;
    }

    public final t21 t() {
        t21 t21Var = this.H;
        if (t21Var != null) {
            return t21Var;
        }
        t21 t21Var2 = new t21(this, this.G);
        this.H = t21Var2;
        return t21Var2;
    }

    public final String toString() {
        return z71.Q(this) + " children: " + ((bo1) n()).m.o + " measurePolicy: " + this.G + " deactivated: " + this.Y;
    }

    public final i91 u() {
        i91 i91Var = this.x;
        while (i91Var != null && i91Var.m) {
            i91Var = i91Var.x;
        }
        return i91Var;
    }

    public final int v() {
        return this.Q.p.u;
    }

    public final sh2 w() {
        if (I() && !this.Y && this.P.d(8)) {
            return this.C;
        }
        return null;
    }

    public final eo1 x() {
        boolean z = this.F;
        eo1 eo1Var = this.E;
        if (z) {
            eo1Var.g();
            eo1Var.c(eo1Var.o, y());
            Arrays.sort(eo1Var.m, 0, eo1Var.o, b0);
            this.F = false;
        }
        return eo1Var;
    }

    public final eo1 y() {
        g0();
        if (this.t == 0) {
            return (eo1) this.u.n;
        }
        eo1 eo1Var = this.v;
        eo1Var.getClass();
        return eo1Var;
    }

    public final void z(long j, ux0 ux0Var, int i, boolean z) {
        fs1 fs1Var = this.P;
        ks1 ks1Var = fs1Var.d;
        ia2 ia2Var = ks1.V;
        fs1Var.d.V0(ks1.Y, ks1Var.N0(j), ux0Var, i, z);
    }

    public i91(int i) {
        this(wh2.a.addAndGet(1), (i & 1) == 0);
    }
}
