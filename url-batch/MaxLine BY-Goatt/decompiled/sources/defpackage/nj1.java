package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nj1 extends n12 implements jj1, k6, jm1 {
    public float A;
    public Object C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean L;
    public float P;
    public boolean Q;
    public Function1 R;
    public float T;
    public boolean V;
    public final m91 r;
    public boolean s;
    public boolean v;
    public boolean w;
    public Function1 z;
    public int t = Integer.MAX_VALUE;
    public int u = Integer.MAX_VALUE;
    public g91 x = g91.o;
    public long y = 0;
    public boolean B = true;
    public final j91 I = new j91(this, 0);
    public final eo1 J = new eo1(new nj1[16]);
    public boolean K = true;
    public long M = v10.b(0, 0, 15);
    public final mj1 N = new mj1(this, 1);
    public final mj1 O = new mj1(this, 0);
    public long S = 0;
    public final mj1 U = new mj1(this, 2);

    public nj1(m91 m91Var) {
        this.r = m91Var;
    }

    @Override // defpackage.jj1
    public final int V(int i) {
        m91 m91Var = this.r;
        if (!j8.N(m91Var.a)) {
            t0();
            return m91Var.a().V(i);
        }
        xg1 xg1Var = m91Var.q;
        xg1Var.getClass();
        return xg1Var.V(i);
    }

    @Override // defpackage.k6
    public final void X() {
        i91.W(this.r.a, false, 7);
    }

    @Override // defpackage.jj1
    public final int Y(int i) {
        m91 m91Var = this.r;
        if (!j8.N(m91Var.a)) {
            t0();
            return m91Var.a().Y(i);
        }
        xg1 xg1Var = m91Var.q;
        xg1Var.getClass();
        return xg1Var.Y(i);
    }

    @Override // defpackage.k6
    public final j91 a() {
        return this.I;
    }

    @Override // defpackage.jj1
    public final int a0(int i) {
        m91 m91Var = this.r;
        if (!j8.N(m91Var.a)) {
            t0();
            return m91Var.a().a0(i);
        }
        xg1 xg1Var = m91Var.q;
        xg1Var.getClass();
        return xg1Var.a0(i);
    }

    @Override // defpackage.jj1
    public final n12 c(long j) {
        g91 g91Var;
        m91 m91Var = this.r;
        i91 i91Var = m91Var.a;
        i91 i91Var2 = m91Var.a;
        g91 g91Var2 = i91Var.M;
        g91 g91Var3 = g91.o;
        if (g91Var2 == g91Var3) {
            i91Var.e();
        }
        if (j8.N(i91Var2)) {
            xg1 xg1Var = m91Var.q;
            xg1Var.getClass();
            xg1Var.v = g91Var3;
            xg1Var.c(j);
        }
        i91 u = i91Var2.u();
        if (u != null) {
            m91 m91Var2 = u.Q;
            if (this.x != g91Var3 && !i91Var2.O) {
                h21.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ordinal = m91Var2.d.ordinal();
            if (ordinal == 0) {
                g91Var = g91.m;
            } else {
                if (ordinal != 2) {
                    b71.q(m91Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                g91Var = g91.n;
            }
            this.x = g91Var;
        } else {
            this.x = g91Var3;
        }
        x0(j);
        return this;
    }

    @Override // defpackage.n12
    public final int d0() {
        return this.r.a().d0();
    }

    @Override // defpackage.jj1
    public final int e(int i) {
        m91 m91Var = this.r;
        if (!j8.N(m91Var.a)) {
            t0();
            return m91Var.a().e(i);
        }
        xg1 xg1Var = m91Var.q;
        xg1Var.getClass();
        return xg1Var.e(i);
    }

    @Override // defpackage.n12
    public final int e0() {
        return this.r.a().e0();
    }

    @Override // defpackage.n12, defpackage.jj1
    public final Object i() {
        return this.C;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x002d, B:10:0x0031, B:14:0x004d, B:16:0x0055, B:18:0x0063, B:20:0x006e, B:21:0x0072, B:22:0x0059, B:23:0x003d, B:25:0x0043, B:27:0x0047, B:28:0x0049, B:29:0x0086, B:31:0x008a, B:33:0x008e, B:34:0x0093, B:38:0x001a, B:40:0x001e, B:42:0x0022, B:44:0x002a, B:45:0x0026), top: B:2:0x0007 }] */
    @Override // defpackage.n12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i0(long j, float f, Function1 function1) {
        xg1 xg1Var;
        xg1 xg1Var2;
        boolean z;
        m12 placementScope;
        m91 m91Var = this.r;
        i91 i91Var = m91Var.a;
        i91 i91Var2 = m91Var.a;
        try {
            this.E = true;
            if (s31.a(j, this.y)) {
                if (this.V) {
                }
                xg1Var = m91Var.q;
                if (xg1Var != null) {
                    m91 m91Var2 = xg1Var.r;
                    if (j8.N(m91Var2.a)) {
                        z = true;
                    } else {
                        if (xg1Var.B == ug1.o && !m91Var2.b) {
                            m91Var2.c = true;
                        }
                        z = m91Var2.c;
                    }
                    if (z) {
                        ks1 ks1Var = m91Var.a().C;
                        if (ks1Var == null || (placementScope = ks1Var.x) == null) {
                            placementScope = ((t7) l91.a(i91Var2)).getPlacementScope();
                        }
                        xg1 xg1Var3 = m91Var.q;
                        xg1Var3.getClass();
                        i91 u = i91Var2.u();
                        if (u != null) {
                            u.Q.h = 0;
                        }
                        xg1Var3.u = Integer.MAX_VALUE;
                        m12.g(placementScope, xg1Var3, (int) (j >> 32), (int) (4294967295L & j));
                    }
                }
                xg1Var2 = m91Var.q;
                if (xg1Var2 != null && !xg1Var2.w) {
                    h21.b("Error: Placement happened before lookahead.");
                }
                w0(j, f, function1);
                Unit unit = Unit.a;
            }
            if (m91Var.k || m91Var.j || this.V) {
                this.G = true;
                this.V = false;
            }
            q0();
            xg1Var = m91Var.q;
            if (xg1Var != null) {
            }
            xg1Var2 = m91Var.q;
            if (xg1Var2 != null) {
                h21.b("Error: Placement happened before lookahead.");
            }
            w0(j, f, function1);
            Unit unit2 = Unit.a;
        } catch (Throwable th) {
            i91Var.Z(th);
            throw null;
        }
    }

    @Override // defpackage.k6
    public final void l(j6 j6Var) {
        eo1 y = this.r.a.y();
        Object[] objArr = y.m;
        int i = y.o;
        for (int i2 = 0; i2 < i; i2++) {
            j6Var.invoke(((i91) objArr[i2]).Q.p);
        }
    }

    @Override // defpackage.jm1
    public final void m(boolean z) {
        m91 m91Var = this.r;
        if (z != m91Var.a().u) {
            m91Var.a().u = z;
            this.V = true;
        }
    }

    public final List m0() {
        m91 m91Var = this.r;
        m91Var.a.g0();
        boolean z = this.K;
        eo1 eo1Var = this.J;
        if (!z) {
            return eo1Var.f();
        }
        i91 i91Var = m91Var.a;
        eo1 y = i91Var.y();
        Object[] objArr = y.m;
        int i = y.o;
        for (int i2 = 0; i2 < i; i2++) {
            i91 i91Var2 = (i91) objArr[i2];
            if (eo1Var.o <= i2) {
                eo1Var.b(i91Var2.Q.p);
            } else {
                nj1 nj1Var = i91Var2.Q.p;
                Object[] objArr2 = eo1Var.m;
                Object obj = objArr2[i2];
                objArr2[i2] = nj1Var;
            }
        }
        eo1Var.m(((bo1) i91Var.n()).m.o, eo1Var.o);
        this.K = false;
        return eo1Var.f();
    }

    @Override // defpackage.k6
    public final n21 n() {
        return this.r.a.P.c;
    }

    public final void n0() {
        boolean z = this.D;
        this.D = true;
        i91 i91Var = this.r.a;
        fs1 fs1Var = i91Var.P;
        if (!z) {
            fs1Var.c.c1();
            if (i91Var.q()) {
                i91.W(i91Var, true, 6);
            } else if (i91Var.Q.e) {
                i91.U(i91Var, true, 6);
            }
        }
        ks1 ks1Var = fs1Var.c.B;
        for (ks1 ks1Var2 = fs1Var.d; !Intrinsics.b(ks1Var2, ks1Var) && ks1Var2 != null; ks1Var2 = ks1Var2.B) {
            if (ks1Var2.T) {
                ks1Var2.X0();
            }
        }
        eo1 y = i91Var.y();
        Object[] objArr = y.m;
        int i = y.o;
        for (int i2 = 0; i2 < i; i2++) {
            i91 i91Var2 = (i91) objArr[i2];
            if (i91Var2.v() != Integer.MAX_VALUE) {
                i91Var2.Q.p.n0();
                i91.X(i91Var2);
            }
        }
    }

    @Override // defpackage.k6
    public final k6 o() {
        m91 m91Var;
        i91 u = this.r.a.u();
        if (u == null || (m91Var = u.Q) == null) {
            return null;
        }
        return m91Var.p;
    }

    public final void o0() {
        if (this.D) {
            this.D = false;
            m91 m91Var = this.r;
            fs1 fs1Var = m91Var.a.P;
            ks1 ks1Var = fs1Var.c.B;
            for (ks1 ks1Var2 = fs1Var.d; !Intrinsics.b(ks1Var2, ks1Var) && ks1Var2 != null; ks1Var2 = ks1Var2.B) {
                ul1 S0 = ks1Var2.S0(ls1.g(1048576));
                if (S0 != null && (S0.m.p & 1048576) != 0) {
                    boolean g = ls1.g(1048576);
                    ul1 Q0 = ks1Var2.Q0();
                    if (g || (Q0 = Q0.q) != null) {
                        for (ul1 S02 = ks1Var2.S0(g); S02 != null && (S02.p & 1048576) != 0; S02 = S02.r) {
                            if ((S02.o & 1048576) != 0) {
                                ul1 ul1Var = S02;
                                eo1 eo1Var = null;
                                while (ul1Var != null) {
                                    if ((ul1Var.o & 1048576) != 0 && (ul1Var instanceof p90)) {
                                        int i = 0;
                                        for (ul1 ul1Var2 = ((p90) ul1Var).B; ul1Var2 != null; ul1Var2 = ul1Var2.r) {
                                            if ((ul1Var2.o & 1048576) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    ul1Var = ul1Var2;
                                                } else {
                                                    if (eo1Var == null) {
                                                        eo1Var = new eo1(new ul1[16]);
                                                    }
                                                    if (ul1Var != null) {
                                                        eo1Var.b(ul1Var);
                                                        ul1Var = null;
                                                    }
                                                    eo1Var.b(ul1Var2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    ul1Var = s03.c(eo1Var);
                                }
                            }
                            if (S02 != Q0) {
                            }
                        }
                    }
                }
                ks1Var2.i1();
            }
            eo1 y = m91Var.a.y();
            Object[] objArr = y.m;
            int i2 = y.o;
            for (int i3 = 0; i3 < i2; i3++) {
                ((i91) objArr[i3]).Q.p.o0();
            }
        }
    }

    @Override // defpackage.k6
    public final void q() {
        boolean z;
        this.L = true;
        j91 j91Var = this.I;
        j91Var.h();
        boolean z2 = this.G;
        m91 m91Var = this.r;
        if (z2) {
            eo1 y = m91Var.a.y();
            Object[] objArr = y.m;
            int i = y.o;
            for (int i2 = 0; i2 < i; i2++) {
                i91 i91Var = (i91) objArr[i2];
                boolean q = i91Var.q();
                m91 m91Var2 = i91Var.Q;
                if (q && i91Var.r() == g91.m) {
                    nj1 nj1Var = m91Var2.p;
                    u10 u10Var = nj1Var.v ? new u10(nj1Var.p) : null;
                    if (u10Var != null) {
                        if (i91Var.M == g91.o) {
                            i91Var.e();
                        }
                        z = m91Var2.p.x0(u10Var.a);
                    } else {
                        z = false;
                    }
                    if (z) {
                        i91.W(m91Var.a, false, 7);
                    }
                }
            }
        }
        if (this.H || (!n().w && this.G)) {
            this.G = false;
            e91 e91Var = m91Var.d;
            m91Var.d = e91.o;
            m91Var.g(false);
            i91 i91Var2 = m91Var.a;
            tx1 snapshotObserver = ((t7) l91.a(i91Var2)).getSnapshotObserver();
            snapshotObserver.getClass();
            snapshotObserver.a(i91Var2, snapshotObserver.e, this.O);
            m91Var.d = e91Var;
            if (n().w && m91Var.j) {
                requestLayout();
            }
            this.H = false;
        }
        if (j91Var.b && j91Var.e()) {
            j91Var.g();
        }
        this.L = false;
    }

    public final void q0() {
        m91 m91Var = this.r;
        if (m91Var.l > 0) {
            eo1 y = m91Var.a.y();
            Object[] objArr = y.m;
            int i = y.o;
            for (int i2 = 0; i2 < i; i2++) {
                i91 i91Var = (i91) objArr[i2];
                m91 m91Var2 = i91Var.Q;
                boolean z = m91Var2.j;
                nj1 nj1Var = m91Var2.p;
                if ((z || m91Var2.k) && !nj1Var.G) {
                    i91Var.V(false);
                }
                nj1Var.q0();
            }
        }
    }

    @Override // defpackage.k6
    public final boolean r() {
        return this.D;
    }

    @Override // defpackage.k6
    public final void requestLayout() {
        this.r.a.V(false);
    }

    public final void t0() {
        m91 m91Var = this.r;
        i91.W(m91Var.a, false, 7);
        i91 i91Var = m91Var.a;
        i91 u = i91Var.u();
        if (u == null || i91Var.M != g91.o) {
            return;
        }
        int ordinal = u.Q.d.ordinal();
        i91Var.M = ordinal != 0 ? ordinal != 2 ? u.M : g91.n : g91.m;
    }

    public final void u0() {
        this.Q = true;
        m91 m91Var = this.r;
        i91 u = m91Var.a.u();
        float f = n().M;
        i91 i91Var = m91Var.a;
        fs1 fs1Var = i91Var.P;
        ks1 ks1Var = fs1Var.d;
        n21 n21Var = fs1Var.c;
        while (ks1Var != n21Var) {
            ks1Var.getClass();
            c91 c91Var = (c91) ks1Var;
            f += c91Var.M;
            ks1Var = c91Var.B;
        }
        if (f != this.P) {
            this.P = f;
            if (u != null) {
                u.P();
            }
            if (u != null) {
                u.B();
            }
        }
        if (this.D) {
            i91Var.P.c.c1();
        } else {
            if (u != null) {
                u.B();
            }
            n0();
            if (this.s && u != null) {
                u.V(false);
            }
        }
        if (u != null) {
            m91 m91Var2 = u.Q;
            if (!this.s && m91Var2.d == e91.o) {
                if (this.u != Integer.MAX_VALUE) {
                    h21.b("Place was called on a node which was placed already");
                }
                int i = m91Var2.i;
                this.u = i;
                m91Var2.i = i + 1;
            }
        } else {
            this.u = 0;
        }
        q();
    }

    public final void v0(long j) {
        m91 m91Var = this.r;
        e91 e91Var = m91Var.d;
        i91 i91Var = m91Var.a;
        e91 e91Var2 = e91.q;
        if (e91Var != e91Var2) {
            h21.b("layout state is not idle before measure starts");
        }
        this.M = j;
        e91 e91Var3 = e91.m;
        m91Var.d = e91Var3;
        this.F = false;
        tx1 snapshotObserver = ((t7) l91.a(i91Var)).getSnapshotObserver();
        snapshotObserver.getClass();
        snapshotObserver.a(i91Var, snapshotObserver.c, this.N);
        if (m91Var.d == e91Var3) {
            this.G = true;
            this.H = true;
            m91Var.d = e91Var2;
        }
    }

    public final void w0(long j, float f, Function1 function1) {
        m91 m91Var = this.r;
        i91 i91Var = m91Var.a;
        i91 i91Var2 = m91Var.a;
        if (i91Var.Y) {
            h21.a("place is called on a deactivated node");
        }
        m91Var.d = e91.o;
        this.y = j;
        this.A = f;
        this.z = function1;
        this.Q = false;
        rx1 a = l91.a(i91Var2);
        if (this.G || !this.D) {
            this.I.e = false;
            m91Var.f(false);
            this.R = function1;
            this.S = j;
            this.T = f;
            tx1 snapshotObserver = ((t7) a).getSnapshotObserver();
            snapshotObserver.getClass();
            snapshotObserver.a(i91Var2, snapshotObserver.f, this.U);
        } else {
            ks1 a2 = m91Var.a();
            a2.g1(s31.c(j, a2.q), f, function1);
            u0();
        }
        m91Var.d = e91.q;
        this.w = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[Catch: all -> 0x0010, LOOP:0: B:22:0x0052->B:23:0x0054, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0045, B:23:0x0054, B:25:0x0066, B:27:0x0080, B:29:0x008a, B:33:0x0096), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean x0(long j) {
        boolean z;
        int i;
        int i2;
        long j2;
        m91 m91Var = this.r;
        i91 i91Var = m91Var.a;
        i91 i91Var2 = m91Var.a;
        try {
            if (i91Var.Y) {
                h21.a("measure is called on a deactivated node");
            }
            rx1 a = l91.a(i91Var2);
            i91 u = i91Var2.u();
            boolean z2 = true;
            if (!i91Var2.O && (u == null || !u.O)) {
                z = false;
                i91Var2.O = z;
                if (!i91Var2.q() && u10.b(this.p, j)) {
                    ((t7) a).j(i91Var2, false);
                    i91Var2.Y();
                    return false;
                }
                this.I.d = false;
                eo1 y = i91Var2.y();
                Object[] objArr = y.m;
                i = y.o;
                for (i2 = 0; i2 < i; i2++) {
                    ((i91) objArr[i2]).Q.p.I.getClass();
                    Unit unit = Unit.a;
                }
                this.v = true;
                j2 = m91Var.a().o;
                k0(j);
                v0(j);
                if (x31.a(m91Var.a().o, j2) && m91Var.a().m == this.m && m91Var.a().n == this.n) {
                    z2 = false;
                }
                j0((m91Var.a().n & 4294967295L) | (m91Var.a().m << 32));
                return z2;
            }
            z = true;
            i91Var2.O = z;
            if (!i91Var2.q()) {
                ((t7) a).j(i91Var2, false);
                i91Var2.Y();
                return false;
            }
            this.I.d = false;
            eo1 y2 = i91Var2.y();
            Object[] objArr2 = y2.m;
            i = y2.o;
            while (i2 < i) {
            }
            this.v = true;
            j2 = m91Var.a().o;
            k0(j);
            v0(j);
            if (x31.a(m91Var.a().o, j2)) {
                z2 = false;
            }
            j0((m91Var.a().n & 4294967295L) | (m91Var.a().m << 32));
            return z2;
        } catch (Throwable th) {
            i91Var.Z(th);
            throw null;
        }
    }
}
