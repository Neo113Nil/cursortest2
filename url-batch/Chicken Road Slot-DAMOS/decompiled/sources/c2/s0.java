package c2;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s0 extends a2.o0 implements a2.f0, a, y0 {
    public x2.a A;
    public Function1 C;
    public boolean H;
    public Object K;
    public boolean O;

    /* renamed from: t, reason: collision with root package name */
    public final k0 f1661t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1662u;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1666y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1667z;

    /* renamed from: v, reason: collision with root package name */
    public int f1663v = Integer.MAX_VALUE;

    /* renamed from: w, reason: collision with root package name */
    public int f1664w = Integer.MAX_VALUE;

    /* renamed from: x, reason: collision with root package name */
    public e0 f1665x = e0.f1530i;
    public long B = 0;
    public q0 D = q0.f1643i;
    public final h0 E = new h0(this, 1);
    public final o0.e F = new o0.e(new s0[16]);
    public boolean G = true;
    public final r0 I = new r0(this, 0);
    public boolean J = true;
    public long L = x2.b.b(0, 0, 15);
    public final r0 M = new r0(this, 2);
    public final r0 N = new r0(this, 1);

    public s0(k0 k0Var) {
        this.f1661t = k0Var;
        this.K = k0Var.f1606p.E;
    }

    @Override // c2.a
    public final a A() {
        k0 k0Var;
        g0 s3 = this.f1661t.f1593a.s();
        if (s3 == null || (k0Var = s3.T) == null) {
            return null;
        }
        return k0Var.f1607q;
    }

    @Override // c2.a
    public final void B() {
        this.H = true;
        h0 h0Var = this.E;
        h0Var.h();
        k0 k0Var = this.f1661t;
        boolean z10 = k0Var.f1598f;
        g0 g0Var = k0Var.f1593a;
        if (z10) {
            o0.e w6 = g0Var.w();
            Object[] objArr = w6.f7317d;
            int i3 = w6.f7319i;
            for (int i10 = 0; i10 < i3; i10++) {
                g0 g0Var2 = (g0) objArr[i10];
                k0 k0Var2 = g0Var2.T;
                if (k0Var2.f1597e && g0Var2.r() == e0.f1528d) {
                    s0 s0Var = k0Var2.f1607q;
                    s0Var.getClass();
                    s0 s0Var2 = k0Var2.f1607q;
                    x2.a aVar = s0Var2 != null ? s0Var2.A : null;
                    aVar.getClass();
                    if (s0Var.i0(aVar.f10316a)) {
                        g0.P(g0Var, false, 7);
                    }
                }
            }
        }
        p pVar = v().f1640e0;
        pVar.getClass();
        if (k0Var.g || (!pVar.f1635x && k0Var.f1598f)) {
            k0Var.f1598f = false;
            c0 c0Var = k0Var.f1596d;
            k0Var.f1596d = c0.f1508r;
            k0Var.i(false);
            q1 snapshotObserver = j0.a(g0Var).getSnapshotObserver();
            snapshotObserver.f1645a.c(g0Var, snapshotObserver.f1651h, this.I);
            k0Var.f1596d = c0Var;
            if (k0Var.f1603m && pVar.f1635x) {
                requestLayout();
            }
            k0Var.g = false;
        }
        if (h0Var.f1571b && h0Var.e()) {
            h0Var.g();
        }
        this.H = false;
    }

    @Override // c2.a
    public final void L(a3.e eVar) {
        o0.e w6 = this.f1661t.f1593a.w();
        Object[] objArr = w6.f7317d;
        int i3 = w6.f7319i;
        for (int i10 = 0; i10 < i3; i10++) {
            s0 s0Var = ((g0) objArr[i10]).T.f1607q;
            s0Var.getClass();
            eVar.invoke(s0Var);
        }
    }

    @Override // c2.a
    public final int P() {
        return this.f1664w;
    }

    @Override // c2.a
    public final void Q() {
        g0.P(this.f1661t.f1593a, false, 7);
    }

    @Override // a2.o0
    public final void Z(long j, float f3, Function1 function1) {
        h0(j, function1);
    }

    @Override // c2.a
    public final h0 a() {
        return this.E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r1 != null ? r1.T.f1596d : null) == c2.c0.f1508r) goto L13;
     */
    @Override // a2.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a2.o0 c(long j) {
        e0 e0Var;
        k0 k0Var = this.f1661t;
        g0 g0Var = k0Var.f1593a;
        g0 g0Var2 = k0Var.f1593a;
        g0 s3 = g0Var.s();
        if ((s3 != null ? s3.T.f1596d : null) != c0.f1506e) {
            g0 s10 = g0Var2.s();
        }
        k0Var.f1594b = false;
        g0 s11 = g0Var2.s();
        if (s11 != null) {
            k0 k0Var2 = s11.T;
            if (this.f1665x != e0.f1530i && !g0Var2.R) {
                z1.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ordinal = k0Var2.f1596d.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                e0Var = e0.f1528d;
            } else {
                if (ordinal != 2 && ordinal != 3) {
                    te.a1.i(k0Var2.f1596d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                e0Var = e0.f1529e;
            }
            this.f1665x = e0Var;
        } else {
            this.f1665x = e0.f1530i;
        }
        if (g0Var2.P == e0.f1530i) {
            g0Var2.c();
        }
        i0(j);
        return this;
    }

    public final boolean c0() {
        k0 k0Var = this.f1661t;
        return k.q(k0Var.f1593a) || k0Var.f1595c;
    }

    public final void d0(boolean z10) {
        if (z10 && c0()) {
            return;
        }
        if (z10 || c0()) {
            this.D = q0.f1643i;
            o0.e w6 = this.f1661t.f1593a.w();
            Object[] objArr = w6.f7317d;
            int i3 = w6.f7319i;
            for (int i10 = 0; i10 < i3; i10++) {
                s0 s0Var = ((g0) objArr[i10]).T.f1607q;
                s0Var.getClass();
                s0Var.d0(true);
            }
        }
    }

    public final void e0() {
        q0 q0Var = this.D;
        k0 k0Var = this.f1661t;
        boolean z10 = k0Var.f1595c;
        g0 g0Var = k0Var.f1593a;
        if (z10) {
            this.D = q0.f1642e;
        } else {
            this.D = q0.f1641d;
        }
        if (q0Var != q0.f1641d && k0Var.f1597e) {
            g0.P(g0Var, true, 6);
        }
        o0.e w6 = g0Var.w();
        Object[] objArr = w6.f7317d;
        int i3 = w6.f7319i;
        for (int i10 = 0; i10 < i3; i10++) {
            g0 g0Var2 = (g0) objArr[i10];
            s0 s0Var = g0Var2.T.f1607q;
            if (s0Var == null) {
                te.a1.e("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (s0Var.f1664w != Integer.MAX_VALUE) {
                s0Var.e0();
                g0.S(g0Var2);
            }
        }
    }

    public final void f0() {
        k0 k0Var = this.f1661t;
        if (k0Var.f1605o > 0) {
            o0.e w6 = k0Var.f1593a.w();
            Object[] objArr = w6.f7317d;
            int i3 = w6.f7319i;
            for (int i10 = 0; i10 < i3; i10++) {
                g0 g0Var = (g0) objArr[i10];
                k0 k0Var2 = g0Var.T;
                if ((k0Var2.f1603m || k0Var2.f1604n) && !k0Var2.f1598f) {
                    g0Var.O(false);
                }
                s0 s0Var = k0Var2.f1607q;
                if (s0Var != null) {
                    s0Var.f0();
                }
            }
        }
    }

    public final void g0() {
        c0 c0Var;
        this.O = true;
        k0 k0Var = this.f1661t;
        g0 s3 = k0Var.f1593a.s();
        q0 q0Var = this.D;
        if ((q0Var != q0.f1641d && !k0Var.f1595c) || (q0Var != q0.f1642e && k0Var.f1595c)) {
            e0();
            if (this.f1662u && s3 != null) {
                s3.O(false);
            }
        }
        if (s3 != null) {
            k0 k0Var2 = s3.T;
            if (!this.f1662u && ((c0Var = k0Var2.f1596d) == c0.f1507i || c0Var == c0.f1508r)) {
                if (this.f1664w != Integer.MAX_VALUE) {
                    z1.a.b("Place was called on a node which was placed already");
                }
                int i3 = k0Var2.f1599h;
                this.f1664w = i3;
                k0Var2.f1599h = i3 + 1;
            }
        } else {
            this.f1664w = 0;
        }
        B();
    }

    @Override // a2.o0, a2.f0
    public final Object h() {
        return this.K;
    }

    public final void h0(long j, Function1 function1) {
        k0 k0Var = this.f1661t;
        g0 g0Var = k0Var.f1593a;
        g0 g0Var2 = k0Var.f1593a;
        try {
            g0 s3 = g0Var.s();
            c0 c0Var = s3 != null ? s3.T.f1596d : null;
            c0 c0Var2 = c0.f1508r;
            if (c0Var == c0Var2) {
                k0Var.f1595c = false;
            }
            if (g0Var2.f1549d0) {
                z1.a.a("place is called on a deactivated node");
            }
            k0Var.f1596d = c0Var2;
            boolean z10 = true;
            this.f1666y = true;
            this.O = false;
            if (!x2.i.a(j, this.B)) {
                if (k0Var.f1604n || k0Var.f1603m) {
                    k0Var.f1598f = true;
                }
                f0();
            }
            d2.v a9 = j0.a(g0Var2);
            this.B = j;
            if (!k0Var.f1598f) {
                if (this.D == q0.f1643i) {
                    z10 = false;
                }
                if (z10) {
                    p0 B0 = k0Var.a().B0();
                    B0.getClass();
                    B0.u0(x2.i.c(j, B0.f135s));
                    g0();
                    this.C = function1;
                    k0Var.f1596d = c0.f1509s;
                }
            }
            k0Var.h(false);
            this.E.f1574e = false;
            q1 snapshotObserver = a9.getSnapshotObserver();
            snapshotObserver.f1645a.c(g0Var2, snapshotObserver.g, this.N);
            this.C = function1;
            k0Var.f1596d = c0.f1509s;
        } catch (Throwable th) {
            g0Var.U(th);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0045, B:26:0x0035, B:27:0x0049, B:29:0x0062, B:31:0x0075, B:33:0x0080, B:34:0x008a, B:38:0x009b, B:39:0x00a0, B:41:0x00b6, B:46:0x0083), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062 A[Catch: all -> 0x0010, LOOP:0: B:28:0x0060->B:29:0x0062, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0045, B:26:0x0035, B:27:0x0049, B:29:0x0062, B:31:0x0075, B:33:0x0080, B:34:0x008a, B:38:0x009b, B:39:0x00a0, B:41:0x00b6, B:46:0x0083), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0045, B:26:0x0035, B:27:0x0049, B:29:0x0062, B:31:0x0075, B:33:0x0080, B:34:0x008a, B:38:0x009b, B:39:0x00a0, B:41:0x00b6, B:46:0x0083), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0045, B:26:0x0035, B:27:0x0049, B:29:0x0062, B:31:0x0075, B:33:0x0080, B:34:0x008a, B:38:0x009b, B:39:0x00a0, B:41:0x00b6, B:46:0x0083), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0045, B:26:0x0035, B:27:0x0049, B:29:0x0062, B:31:0x0075, B:33:0x0080, B:34:0x008a, B:38:0x009b, B:39:0x00a0, B:41:0x00b6, B:46:0x0083), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i0(long j) {
        boolean z10;
        int i3;
        int i10;
        long j3;
        p0 B0;
        k0 k0Var = this.f1661t;
        g0 g0Var = k0Var.f1593a;
        g0 g0Var2 = k0Var.f1593a;
        try {
            if (g0Var.f1549d0) {
                z1.a.a("measure is called on a deactivated node");
            }
            g0 s3 = g0Var2.s();
            if (!g0Var2.R && (s3 == null || !s3.R)) {
                z10 = false;
                g0Var2.R = z10;
                if (!g0Var2.T.f1597e) {
                    x2.a aVar = this.A;
                    if (aVar == null ? false : x2.a.b(aVar.f10316a, j)) {
                        d2.v vVar = g0Var2.B;
                        if (vVar != null) {
                            vVar.n(g0Var2, true);
                        }
                        g0Var2.T();
                        return false;
                    }
                }
                this.A = new x2.a(j);
                b0(j);
                this.E.f1573d = false;
                o0.e w6 = g0Var2.w();
                Object[] objArr = w6.f7317d;
                i3 = w6.f7319i;
                for (i10 = 0; i10 < i3; i10++) {
                    s0 s0Var = ((g0) objArr[i10]).T.f1607q;
                    s0Var.getClass();
                    s0Var.E.getClass();
                }
                if (this.f1667z) {
                    long j10 = Integer.MIN_VALUE;
                    j3 = (j10 & 4294967295L) | (j10 << 32);
                } else {
                    j3 = this.f133i;
                }
                this.f1667z = true;
                B0 = k0Var.a().B0();
                if (!(B0 == null)) {
                    z1.a.b("Lookahead result from lookaheadRemeasure cannot be null");
                }
                k0Var.c(j);
                a0((B0.f132e & 4294967295L) | (B0.f131d << 32));
                return ((int) (j3 >> 32)) == B0.f131d || ((int) (j3 & 4294967295L)) != B0.f132e;
            }
            z10 = true;
            g0Var2.R = z10;
            if (!g0Var2.T.f1597e) {
            }
            this.A = new x2.a(j);
            b0(j);
            this.E.f1573d = false;
            o0.e w62 = g0Var2.w();
            Object[] objArr2 = w62.f7317d;
            i3 = w62.f7319i;
            while (i10 < i3) {
            }
            if (this.f1667z) {
            }
            this.f1667z = true;
            B0 = k0Var.a().B0();
            if (!(B0 == null)) {
            }
            k0Var.c(j);
            a0((B0.f132e & 4294967295L) | (B0.f131d << 32));
            if (((int) (j3 >> 32)) == B0.f131d) {
            }
        } catch (Throwable th) {
            g0Var.U(th);
            throw null;
        }
    }

    @Override // c2.y0
    public final void q() {
        k0 k0Var = this.f1661t;
        if (Boolean.FALSE.equals(k0Var.a().B0() != null ? Boolean.FALSE : null)) {
            return;
        }
        k0Var.a().B0();
    }

    @Override // c2.a
    public final void requestLayout() {
        this.f1661t.f1593a.O(false);
    }

    @Override // c2.a
    public final q v() {
        return (q) this.f1661t.f1593a.S.f1493d;
    }
}
