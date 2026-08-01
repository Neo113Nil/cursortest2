package c2;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w0 extends a2.o0 implements a2.f0, a, y0 {
    public Function1 B;
    public float C;
    public Object E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean N;
    public float R;
    public boolean S;
    public Function1 T;
    public float V;
    public boolean X;

    /* renamed from: t, reason: collision with root package name */
    public final k0 f1687t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1688u;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1691x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1692y;

    /* renamed from: v, reason: collision with root package name */
    public int f1689v = Integer.MAX_VALUE;

    /* renamed from: w, reason: collision with root package name */
    public int f1690w = Integer.MAX_VALUE;

    /* renamed from: z, reason: collision with root package name */
    public e0 f1693z = e0.f1530i;
    public long A = 0;
    public boolean D = true;
    public final h0 K = new h0(this, 0);
    public final o0.e L = new o0.e(new w0[16]);
    public boolean M = true;
    public long O = x2.b.b(0, 0, 15);
    public final v0 P = new v0(this, 1);
    public final v0 Q = new v0(this, 0);
    public long U = 0;
    public final v0 W = new v0(this, 2);

    public w0(k0 k0Var) {
        this.f1687t = k0Var;
    }

    @Override // c2.a
    public final a A() {
        k0 k0Var;
        g0 s3 = this.f1687t.f1593a.s();
        if (s3 == null || (k0Var = s3.T) == null) {
            return null;
        }
        return k0Var.f1606p;
    }

    @Override // c2.a
    public final void B() {
        this.N = true;
        h0 h0Var = this.K;
        h0Var.h();
        boolean z10 = this.I;
        k0 k0Var = this.f1687t;
        if (z10) {
            o0.e w6 = k0Var.f1593a.w();
            Object[] objArr = w6.f7317d;
            int i3 = w6.f7319i;
            for (int i10 = 0; i10 < i3; i10++) {
                g0 g0Var = (g0) objArr[i10];
                if (g0Var.p() && g0Var.q() == e0.f1528d && g0.L(g0Var)) {
                    g0.R(k0Var.f1593a, false, 7);
                }
            }
        }
        if (this.J || (!v().f1635x && this.I)) {
            this.I = false;
            c0 c0Var = k0Var.f1596d;
            k0Var.f1596d = c0.f1507i;
            k0Var.g(false);
            g0 g0Var2 = k0Var.f1593a;
            q1 snapshotObserver = j0.a(g0Var2).getSnapshotObserver();
            snapshotObserver.f1645a.c(g0Var2, snapshotObserver.f1649e, this.Q);
            k0Var.f1596d = c0Var;
            this.J = false;
        }
        if (h0Var.f1571b && h0Var.e()) {
            h0Var.g();
        }
        this.N = false;
    }

    @Override // c2.a
    public final void L(a3.e eVar) {
        o0.e w6 = this.f1687t.f1593a.w();
        Object[] objArr = w6.f7317d;
        int i3 = w6.f7319i;
        for (int i10 = 0; i10 < i3; i10++) {
            eVar.invoke(((g0) objArr[i10]).T.f1606p);
        }
    }

    @Override // c2.a
    public final int P() {
        return this.f1690w;
    }

    @Override // c2.a
    public final void Q() {
        g0.R(this.f1687t.f1593a, false, 7);
    }

    @Override // a2.o0
    public final int W() {
        return this.f1687t.a().W();
    }

    @Override // a2.o0
    public final int X() {
        return this.f1687t.a().X();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0005, B:5:0x0010, B:7:0x0014, B:10:0x002c, B:12:0x0030, B:14:0x0038, B:17:0x0041, B:18:0x0043, B:20:0x0047, B:22:0x004d, B:24:0x0055, B:26:0x0061, B:28:0x006c, B:29:0x0070, B:30:0x0059, B:31:0x0084, B:33:0x0088, B:35:0x008c, B:36:0x0091, B:40:0x001c, B:42:0x0020, B:44:0x0024, B:46:0x0028), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0005, B:5:0x0010, B:7:0x0014, B:10:0x002c, B:12:0x0030, B:14:0x0038, B:17:0x0041, B:18:0x0043, B:20:0x0047, B:22:0x004d, B:24:0x0055, B:26:0x0061, B:28:0x006c, B:29:0x0070, B:30:0x0059, B:31:0x0084, B:33:0x0088, B:35:0x008c, B:36:0x0091, B:40:0x001c, B:42:0x0020, B:44:0x0024, B:46:0x0028), top: B:2:0x0005 }] */
    @Override // a2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(long j, float f3, Function1 function1) {
        s0 s0Var;
        s0 s0Var2;
        s0 s0Var3;
        i1 i1Var;
        g0 s3;
        k0 k0Var = this.f1687t;
        g0 g0Var = k0Var.f1593a;
        try {
            this.G = true;
            if (x2.i.a(j, this.A)) {
                if (function1 == this.B) {
                    if (this.X) {
                    }
                    s0Var = k0Var.f1607q;
                    if (s0Var != null) {
                        k0 k0Var2 = s0Var.f1661t;
                        if (s0Var.D == q0.f1643i && !k.q(k0Var2.f1593a)) {
                            k0Var2.f1595c = true;
                        }
                    }
                    s0Var2 = k0Var.f1607q;
                    if (s0Var2 != null && s0Var2.c0()) {
                        i1Var = k0Var.a().D;
                        if (i1Var != null || (r2 = i1Var.f1636y) == null) {
                            a2.n0 placementScope = j0.a(g0Var).getPlacementScope();
                        }
                        s0 s0Var4 = k0Var.f1607q;
                        s0Var4.getClass();
                        s3 = g0Var.s();
                        if (s3 != null) {
                            s3.T.f1599h = 0;
                        }
                        s0Var4.f1664w = Integer.MAX_VALUE;
                        placementScope.h(s0Var4, (int) (j >> 32), (int) (4294967295L & j), 0.0f);
                    }
                    s0Var3 = k0Var.f1607q;
                    if (s0Var3 != null && !s0Var3.f1666y) {
                        z1.a.b("Error: Placement happened before lookahead.");
                    }
                    g0(j, f3, function1);
                }
            }
            if (k0Var.f1601k || k0Var.j || this.X) {
                this.I = true;
                this.X = false;
            }
            s0Var = k0Var.f1607q;
            if (s0Var != null) {
            }
            s0Var2 = k0Var.f1607q;
            if (s0Var2 != null) {
                i1Var = k0Var.a().D;
                if (i1Var != null) {
                }
                a2.n0 placementScope2 = j0.a(g0Var).getPlacementScope();
                s0 s0Var42 = k0Var.f1607q;
                s0Var42.getClass();
                s3 = g0Var.s();
                if (s3 != null) {
                }
                s0Var42.f1664w = Integer.MAX_VALUE;
                placementScope2.h(s0Var42, (int) (j >> 32), (int) (4294967295L & j), 0.0f);
            }
            s0Var3 = k0Var.f1607q;
            if (s0Var3 != null) {
                z1.a.b("Error: Placement happened before lookahead.");
            }
            g0(j, f3, function1);
        } catch (Throwable th) {
            g0Var.U(th);
            throw null;
        }
    }

    @Override // c2.a
    public final h0 a() {
        return this.K;
    }

    @Override // a2.f0
    public final a2.o0 c(long j) {
        e0 e0Var;
        k0 k0Var = this.f1687t;
        g0 g0Var = k0Var.f1593a;
        g0 g0Var2 = k0Var.f1593a;
        e0 e0Var2 = g0Var.P;
        e0 e0Var3 = e0.f1530i;
        if (e0Var2 == e0Var3) {
            g0Var.c();
        }
        if (k.q(g0Var2)) {
            s0 s0Var = k0Var.f1607q;
            s0Var.getClass();
            s0Var.f1665x = e0Var3;
            s0Var.c(j);
        }
        g0 s3 = g0Var2.s();
        if (s3 != null) {
            k0 k0Var2 = s3.T;
            if (this.f1693z != e0Var3 && !g0Var2.R) {
                z1.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ordinal = k0Var2.f1596d.ordinal();
            if (ordinal == 0) {
                e0Var = e0.f1528d;
            } else {
                if (ordinal != 2) {
                    te.a1.i(k0Var2.f1596d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                e0Var = e0.f1529e;
            }
            this.f1693z = e0Var;
        } else {
            this.f1693z = e0Var3;
        }
        h0(j);
        return this;
    }

    public final List c0() {
        k0 k0Var = this.f1687t;
        k0Var.f1593a.b0();
        boolean z10 = this.M;
        o0.e eVar = this.L;
        if (!z10) {
            return eVar.f();
        }
        g0 g0Var = k0Var.f1593a;
        o0.e w6 = g0Var.w();
        Object[] objArr = w6.f7317d;
        int i3 = w6.f7319i;
        for (int i10 = 0; i10 < i3; i10++) {
            g0 g0Var2 = (g0) objArr[i10];
            if (eVar.f7319i <= i10) {
                eVar.b(g0Var2.T.f1606p);
            } else {
                w0 w0Var = g0Var2.T.f1606p;
                Object[] objArr2 = eVar.f7317d;
                Object obj = objArr2[i10];
                objArr2[i10] = w0Var;
            }
        }
        eVar.m(((o0.b) g0Var.l()).f7311d.f7319i, eVar.f7319i);
        this.M = false;
        return eVar.f();
    }

    public final void d0() {
        boolean z10 = this.F;
        this.F = true;
        k0 k0Var = this.f1687t;
        g0 g0Var = k0Var.f1593a;
        b1 b1Var = g0Var.S;
        if (!z10) {
            ((q) b1Var.f1493d).O0();
            j0.a(g0Var).getRectManager().f(k0Var.f1593a);
            if (g0Var.p()) {
                g0.R(g0Var, true, 6);
            } else if (g0Var.T.f1597e) {
                g0.P(g0Var, true, 6);
            }
        }
        i1 i1Var = ((q) b1Var.f1493d).C;
        for (i1 i1Var2 = (i1) b1Var.f1494e; !Intrinsics.a(i1Var2, i1Var) && i1Var2 != null; i1Var2 = i1Var2.C) {
            if (i1Var2.X) {
                i1Var2.K0();
            }
        }
        o0.e w6 = g0Var.w();
        Object[] objArr = w6.f7317d;
        int i3 = w6.f7319i;
        for (int i10 = 0; i10 < i3; i10++) {
            g0 g0Var2 = (g0) objArr[i10];
            if (g0Var2.t() != Integer.MAX_VALUE) {
                g0Var2.T.f1606p.d0();
                g0.S(g0Var2);
            }
        }
    }

    public final void e0() {
        if (this.F) {
            this.F = false;
            k0 k0Var = this.f1687t;
            g0 g0Var = k0Var.f1593a;
            g0 g0Var2 = k0Var.f1593a;
            j0.a(g0Var).getRectManager().g(g0Var2);
            b1 b1Var = g0Var2.S;
            i1 i1Var = ((q) b1Var.f1493d).C;
            for (i1 i1Var2 = (i1) b1Var.f1494e; !Intrinsics.a(i1Var2, i1Var) && i1Var2 != null; i1Var2 = i1Var2.C) {
                i1Var2.Q0();
                i1Var2.V0();
            }
            o0.e w6 = g0Var2.w();
            Object[] objArr = w6.f7317d;
            int i3 = w6.f7319i;
            for (int i10 = 0; i10 < i3; i10++) {
                ((g0) objArr[i10]).T.f1606p.e0();
            }
        }
    }

    public final void f0() {
        this.S = true;
        k0 k0Var = this.f1687t;
        g0 s3 = k0Var.f1593a.s();
        float f3 = v().N;
        g0 g0Var = k0Var.f1593a;
        b1 b1Var = g0Var.S;
        i1 i1Var = (i1) b1Var.f1494e;
        q qVar = (q) b1Var.f1493d;
        while (i1Var != qVar) {
            i1Var.getClass();
            x xVar = (x) i1Var;
            f3 += xVar.N;
            i1Var = xVar.C;
        }
        if (f3 != this.R) {
            this.R = f3;
            if (s3 != null) {
                s3.K();
            }
            if (s3 != null) {
                s3.z();
            }
        }
        if (!v().f1635x) {
            boolean z10 = this.F;
            if (!z10 || this.K.d()) {
                d0();
            }
            if (z10) {
                ((q) g0Var.S.f1493d).O0();
            } else {
                if (s3 != null) {
                    s3.z();
                }
                if (this.f1688u && s3 != null) {
                    s3.Q(false);
                }
            }
        }
        if (s3 != null) {
            k0 k0Var2 = s3.T;
            if (!this.f1688u && k0Var2.f1596d == c0.f1507i) {
                if (this.f1690w != Integer.MAX_VALUE) {
                    z1.a.b("Place was called on a node which was placed already");
                }
                int i3 = k0Var2.f1600i;
                this.f1690w = i3;
                k0Var2.f1600i = i3 + 1;
            }
        } else {
            this.f1690w = 0;
        }
        B();
    }

    public final void g0(long j, float f3, Function1 function1) {
        k0 k0Var = this.f1687t;
        g0 g0Var = k0Var.f1593a;
        g0 g0Var2 = k0Var.f1593a;
        if (g0Var.f1549d0) {
            z1.a.a("place is called on a deactivated node");
        }
        k0Var.f1596d = c0.f1507i;
        this.A = j;
        this.C = f3;
        this.B = function1;
        this.S = false;
        d2.v a9 = j0.a(g0Var2);
        if (this.I || !this.F) {
            this.K.f1574e = false;
            k0Var.f(false);
            this.T = function1;
            this.U = j;
            this.V = f3;
            q1 snapshotObserver = a9.getSnapshotObserver();
            snapshotObserver.f1645a.c(g0Var2, snapshotObserver.f1650f, this.W);
        } else {
            i1 a10 = k0Var.a();
            a10.T0(x2.i.c(j, a10.f135s), f3, function1);
            f0();
        }
        k0Var.f1596d = c0.f1509s;
        if (k0Var.a().f1635x && (k0Var.f1601k || k0Var.j)) {
            requestLayout();
        }
        this.f1692y = true;
    }

    @Override // a2.o0, a2.f0
    public final Object h() {
        return this.E;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[Catch: all -> 0x0010, LOOP:0: B:22:0x0050->B:23:0x0052, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0043, B:23:0x0052, B:25:0x0062, B:28:0x0079, B:30:0x0096, B:31:0x009c, B:33:0x00a8, B:35:0x00b2, B:39:0x00be, B:41:0x0074), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0043, B:23:0x0052, B:25:0x0062, B:28:0x0079, B:30:0x0096, B:31:0x009c, B:33:0x00a8, B:35:0x00b2, B:39:0x00be, B:41:0x0074), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0043, B:23:0x0052, B:25:0x0062, B:28:0x0079, B:30:0x0096, B:31:0x009c, B:33:0x00a8, B:35:0x00b2, B:39:0x00be, B:41:0x0074), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h0(long j) {
        boolean z10;
        int i3;
        int i10;
        long j3;
        c0 c0Var;
        c0 c0Var2;
        c0 c0Var3;
        k0 k0Var = this.f1687t;
        g0 g0Var = k0Var.f1593a;
        g0 g0Var2 = k0Var.f1593a;
        try {
            if (g0Var.f1549d0) {
                z1.a.a("measure is called on a deactivated node");
            }
            d2.v a9 = j0.a(g0Var2);
            g0 s3 = g0Var2.s();
            boolean z11 = true;
            if (!g0Var2.R && (s3 == null || !s3.R)) {
                z10 = false;
                g0Var2.R = z10;
                if (!g0Var2.p() && x2.a.b(this.f134r, j)) {
                    a9.n(g0Var2, false);
                    g0Var2.T();
                    return false;
                }
                this.K.f1573d = false;
                o0.e w6 = g0Var2.w();
                Object[] objArr = w6.f7317d;
                i3 = w6.f7319i;
                for (i10 = 0; i10 < i3; i10++) {
                    ((g0) objArr[i10]).T.f1606p.K.getClass();
                }
                this.f1691x = true;
                j3 = k0Var.a().f133i;
                b0(j);
                c0Var = k0Var.f1596d;
                c0Var2 = c0.f1509s;
                if (c0Var == c0Var2) {
                    z1.a.b("layout state is not idle before measure starts");
                }
                this.O = j;
                c0Var3 = c0.f1505d;
                k0Var.f1596d = c0Var3;
                this.H = false;
                q1 snapshotObserver = j0.a(g0Var2).getSnapshotObserver();
                snapshotObserver.f1645a.c(g0Var2, snapshotObserver.f1647c, this.P);
                if (k0Var.f1596d == c0Var3) {
                    this.I = true;
                    this.J = true;
                    k0Var.f1596d = c0Var2;
                }
                if (x2.k.a(k0Var.a().f133i, j3) && k0Var.a().f131d == this.f131d && k0Var.a().f132e == this.f132e) {
                    z11 = false;
                }
                a0((k0Var.a().f132e & 4294967295L) | (k0Var.a().f131d << 32));
                return z11;
            }
            z10 = true;
            g0Var2.R = z10;
            if (!g0Var2.p()) {
                a9.n(g0Var2, false);
                g0Var2.T();
                return false;
            }
            this.K.f1573d = false;
            o0.e w62 = g0Var2.w();
            Object[] objArr2 = w62.f7317d;
            i3 = w62.f7319i;
            while (i10 < i3) {
            }
            this.f1691x = true;
            j3 = k0Var.a().f133i;
            b0(j);
            c0Var = k0Var.f1596d;
            c0Var2 = c0.f1509s;
            if (c0Var == c0Var2) {
            }
            this.O = j;
            c0Var3 = c0.f1505d;
            k0Var.f1596d = c0Var3;
            this.H = false;
            q1 snapshotObserver2 = j0.a(g0Var2).getSnapshotObserver();
            snapshotObserver2.f1645a.c(g0Var2, snapshotObserver2.f1647c, this.P);
            if (k0Var.f1596d == c0Var3) {
            }
            if (x2.k.a(k0Var.a().f133i, j3)) {
                z11 = false;
            }
            a0((k0Var.a().f132e & 4294967295L) | (k0Var.a().f131d << 32));
            return z11;
        } catch (Throwable th) {
            g0Var.U(th);
            throw null;
        }
    }

    public final void i0() {
        k0 k0Var = this.f1687t;
        g0 g0Var = k0Var.f1593a;
        g0 g0Var2 = k0Var.f1593a;
        if (!g0Var.F() || k0Var.f1602l <= 0) {
            return;
        }
        k0 k0Var2 = g0Var2.T;
        if ((k0Var2.j || k0Var2.f1601k) && !k0Var2.f1606p.I) {
            g0Var2.Q(false);
        }
        o0.e w6 = g0Var2.w();
        Object[] objArr = w6.f7317d;
        int i3 = w6.f7319i;
        for (int i10 = 0; i10 < i3; i10++) {
            ((g0) objArr[i10]).T.f1606p.i0();
        }
    }

    @Override // c2.y0
    public final void q() {
        this.f1687t.a().getClass();
    }

    @Override // c2.a
    public final void requestLayout() {
        this.f1687t.f1593a.Q(false);
    }

    @Override // c2.a
    public final q v() {
        return (q) this.f1687t.f1593a.S.f1493d;
    }
}
