package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class uk0 extends zw0 implements qk0, b3, nm0 {
    public boolean D;
    public float H;
    public boolean I;
    public Function1 J;
    public float L;
    public boolean N;
    public final nd0 j;
    public boolean k;
    public boolean n;
    public boolean o;
    public Function1 r;
    public float s;
    public Object u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public int l = Integer.MAX_VALUE;
    public int m = Integer.MAX_VALUE;
    public hd0 p = hd0.g;
    public long q = 0;
    public boolean t = true;
    public final kd0 A = new kd0(this, 0);
    public final eo0 B = new eo0(new uk0[16]);
    public boolean C = true;
    public long E = nm.b(0, 0, 15);
    public final tk0 F = new tk0(this, 1);
    public final tk0 G = new tk0(this, 0);
    public long K = 0;
    public final tk0 M = new tk0(this, 2);

    public uk0(nd0 nd0Var) {
        this.j = nd0Var;
    }

    @Override // defpackage.b3
    public final void B() {
        boolean z;
        this.D = true;
        kd0 kd0Var = this.A;
        kd0Var.h();
        boolean z2 = this.y;
        nd0 nd0Var = this.j;
        if (z2) {
            eo0 x = nd0Var.a.x();
            Object[] objArr = x.d;
            int i = x.g;
            for (int i2 = 0; i2 < i; i2++) {
                jd0 jd0Var = (jd0) objArr[i2];
                boolean p = jd0Var.p();
                nd0 nd0Var2 = jd0Var.K;
                if (p && jd0Var.q() == hd0.d) {
                    uk0 uk0Var = nd0Var2.p;
                    mm mmVar = uk0Var.n ? new mm(uk0Var.h) : null;
                    if (mmVar != null) {
                        if (jd0Var.G == hd0.g) {
                            jd0Var.e();
                        }
                        z = nd0Var2.p.o0(mmVar.a);
                    } else {
                        z = false;
                    }
                    if (z) {
                        jd0.T(nd0Var.a, false, 7);
                    }
                }
            }
        }
        if (this.z || (!y().o && this.y)) {
            this.y = false;
            fd0 fd0Var = nd0Var.d;
            nd0Var.d = fd0.g;
            nd0Var.g(false);
            jd0 jd0Var2 = nd0Var.a;
            gu0 snapshotObserver = ((d4) md0.a(jd0Var2)).getSnapshotObserver();
            snapshotObserver.a.b(jd0Var2, snapshotObserver.e, this.G);
            nd0Var.d = fd0Var;
            this.z = false;
        }
        if (kd0Var.b && kd0Var.e()) {
            kd0Var.g();
        }
        this.D = false;
    }

    @Override // defpackage.b3
    public final int O() {
        return this.m;
    }

    @Override // defpackage.b3
    public final void P() {
        jd0.T(this.j.a, false, 7);
    }

    @Override // defpackage.zw0
    public final int S() {
        return this.j.a().S();
    }

    @Override // defpackage.zw0
    public final int W() {
        return this.j.a().W();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x002d, B:10:0x0031, B:12:0x0039, B:15:0x0042, B:16:0x0044, B:18:0x0048, B:20:0x004e, B:22:0x0056, B:24:0x0064, B:26:0x006f, B:27:0x0073, B:28:0x005a, B:29:0x0087, B:31:0x008b, B:33:0x008f, B:34:0x0094, B:38:0x001a, B:40:0x001e, B:42:0x0022, B:44:0x002a, B:45:0x0026), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x002d, B:10:0x0031, B:12:0x0039, B:15:0x0042, B:16:0x0044, B:18:0x0048, B:20:0x004e, B:22:0x0056, B:24:0x0064, B:26:0x006f, B:27:0x0073, B:28:0x005a, B:29:0x0087, B:31:0x008b, B:33:0x008f, B:34:0x0094, B:38:0x001a, B:40:0x001e, B:42:0x0022, B:44:0x002a, B:45:0x0026), top: B:2:0x0007 }] */
    @Override // defpackage.zw0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(long j, float f, Function1 function1) {
        kj0 kj0Var;
        kj0 kj0Var2;
        kj0 kj0Var3;
        qp0 qp0Var;
        jd0 s;
        nd0 nd0Var = this.j;
        jd0 jd0Var = nd0Var.a;
        jd0 jd0Var2 = nd0Var.a;
        try {
            this.w = true;
            if (s90.a(j, this.q)) {
                if (this.N) {
                }
                kj0Var = nd0Var.q;
                if (kj0Var != null) {
                    nd0 nd0Var2 = kj0Var.j;
                    if (kj0Var.t == ij0.g && !ca0.r(nd0Var2.a)) {
                        nd0Var2.c = true;
                    }
                }
                kj0Var2 = nd0Var.q;
                if (kj0Var2 != null && kj0Var2.d0()) {
                    qp0Var = nd0Var.a().u;
                    if (qp0Var != null || (r3 = qp0Var.p) == null) {
                        yw0 placementScope = ((d4) md0.a(jd0Var2)).getPlacementScope();
                    }
                    kj0 kj0Var4 = nd0Var.q;
                    kj0Var4.getClass();
                    s = jd0Var2.s();
                    if (s != null) {
                        s.K.h = 0;
                    }
                    kj0Var4.m = Integer.MAX_VALUE;
                    yw0.h(placementScope, kj0Var4, (int) (j >> 32), (int) (4294967295L & j));
                }
                kj0Var3 = nd0Var.q;
                if (kj0Var3 != null && !kj0Var3.o) {
                    o80.b("Error: Placement happened before lookahead.");
                }
                n0(j, f, function1);
            }
            if (nd0Var.k || nd0Var.j || this.N) {
                this.y = true;
                this.N = false;
            }
            h0();
            kj0Var = nd0Var.q;
            if (kj0Var != null) {
            }
            kj0Var2 = nd0Var.q;
            if (kj0Var2 != null) {
                qp0Var = nd0Var.a().u;
                if (qp0Var != null) {
                }
                yw0 placementScope2 = ((d4) md0.a(jd0Var2)).getPlacementScope();
                kj0 kj0Var42 = nd0Var.q;
                kj0Var42.getClass();
                s = jd0Var2.s();
                if (s != null) {
                }
                kj0Var42.m = Integer.MAX_VALUE;
                yw0.h(placementScope2, kj0Var42, (int) (j >> 32), (int) (4294967295L & j));
            }
            kj0Var3 = nd0Var.q;
            if (kj0Var3 != null) {
                o80.b("Error: Placement happened before lookahead.");
            }
            n0(j, f, function1);
        } catch (Throwable th) {
            jd0Var.W(th);
            throw null;
        }
    }

    @Override // defpackage.b3
    public final kd0 a() {
        return this.A;
    }

    @Override // defpackage.qk0
    public final zw0 c(long j) {
        hd0 hd0Var;
        nd0 nd0Var = this.j;
        jd0 jd0Var = nd0Var.a;
        jd0 jd0Var2 = nd0Var.a;
        hd0 hd0Var2 = jd0Var.G;
        hd0 hd0Var3 = hd0.g;
        if (hd0Var2 == hd0Var3) {
            jd0Var.e();
        }
        if (ca0.r(jd0Var2)) {
            kj0 kj0Var = nd0Var.q;
            kj0Var.getClass();
            kj0Var.n = hd0Var3;
            kj0Var.c(j);
        }
        jd0 s = jd0Var2.s();
        if (s != null) {
            nd0 nd0Var2 = s.K;
            if (this.p != hd0Var3 && !jd0Var2.I) {
                o80.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ordinal = nd0Var2.d.ordinal();
            if (ordinal == 0) {
                hd0Var = hd0.d;
            } else {
                if (ordinal != 2) {
                    dd0.d(nd0Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                hd0Var = hd0.e;
            }
            this.p = hd0Var;
        } else {
            this.p = hd0Var3;
        }
        o0(j);
        return this;
    }

    public final List d0() {
        nd0 nd0Var = this.j;
        nd0Var.a.d0();
        boolean z = this.C;
        eo0 eo0Var = this.B;
        if (!z) {
            return eo0Var.f();
        }
        jd0 jd0Var = nd0Var.a;
        eo0 x = jd0Var.x();
        Object[] objArr = x.d;
        int i = x.g;
        for (int i2 = 0; i2 < i; i2++) {
            jd0 jd0Var2 = (jd0) objArr[i2];
            if (eo0Var.g <= i2) {
                eo0Var.b(jd0Var2.K.p);
            } else {
                uk0 uk0Var = jd0Var2.K.p;
                Object[] objArr2 = eo0Var.d;
                Object obj = objArr2[i2];
                objArr2[i2] = uk0Var;
            }
        }
        eo0Var.l(((bo0) jd0Var.m()).d.g, eo0Var.g);
        this.C = false;
        return eo0Var.f();
    }

    public final void e0() {
        boolean z = this.v;
        this.v = true;
        nd0 nd0Var = this.j;
        jd0 jd0Var = nd0Var.a;
        l7 l7Var = jd0Var.J;
        if (!z) {
            ((v80) l7Var.d).U0();
            ((d4) md0.a(jd0Var)).getRectManager().f(nd0Var.a, true);
            if (jd0Var.p()) {
                jd0.T(jd0Var, true, 6);
            } else if (jd0Var.K.e) {
                jd0.R(jd0Var, true, 6);
            }
        }
        qp0 qp0Var = ((v80) l7Var.d).t;
        for (qp0 qp0Var2 = (qp0) l7Var.e; !Intrinsics.a(qp0Var2, qp0Var) && qp0Var2 != null; qp0Var2 = qp0Var2.t) {
            if (qp0Var2.O) {
                qp0Var2.Q0();
            }
        }
        eo0 x = jd0Var.x();
        Object[] objArr = x.d;
        int i = x.g;
        for (int i2 = 0; i2 < i; i2++) {
            jd0 jd0Var2 = (jd0) objArr[i2];
            if (jd0Var2.u() != Integer.MAX_VALUE) {
                jd0Var2.K.p.e0();
                jd0.U(jd0Var2);
            }
        }
    }

    public final void f0() {
        if (this.v) {
            this.v = false;
            nd0 nd0Var = this.j;
            jd0 jd0Var = nd0Var.a;
            jd0 jd0Var2 = nd0Var.a;
            ((d4) md0.a(jd0Var)).getRectManager().h(jd0Var2);
            l7 l7Var = jd0Var2.J;
            qp0 qp0Var = ((v80) l7Var.d).t;
            for (qp0 qp0Var2 = (qp0) l7Var.e; !Intrinsics.a(qp0Var2, qp0Var) && qp0Var2 != null; qp0Var2 = qp0Var2.t) {
                qp0Var2.W0();
                qp0Var2.b1();
            }
            eo0 x = jd0Var2.x();
            Object[] objArr = x.d;
            int i = x.g;
            for (int i2 = 0; i2 < i; i2++) {
                ((jd0) objArr[i2]).K.p.f0();
            }
        }
    }

    @Override // defpackage.zw0, defpackage.qk0
    public final Object h() {
        return this.u;
    }

    public final void h0() {
        nd0 nd0Var = this.j;
        if (nd0Var.l > 0) {
            eo0 x = nd0Var.a.x();
            Object[] objArr = x.d;
            int i = x.g;
            for (int i2 = 0; i2 < i; i2++) {
                jd0 jd0Var = (jd0) objArr[i2];
                nd0 nd0Var2 = jd0Var.K;
                boolean z = nd0Var2.j;
                uk0 uk0Var = nd0Var2.p;
                if ((z || nd0Var2.k) && !uk0Var.y) {
                    jd0Var.S(false);
                }
                uk0Var.h0();
            }
        }
    }

    public final void j0() {
        this.I = true;
        nd0 nd0Var = this.j;
        jd0 s = nd0Var.a.s();
        float f = y().E;
        jd0 jd0Var = nd0Var.a;
        l7 l7Var = jd0Var.J;
        qp0 qp0Var = (qp0) l7Var.e;
        v80 v80Var = (v80) l7Var.d;
        while (qp0Var != v80Var) {
            qp0Var.getClass();
            cd0 cd0Var = (cd0) qp0Var;
            f += cd0Var.E;
            qp0Var = cd0Var.t;
        }
        if (f != this.H) {
            this.H = f;
            if (s != null) {
                s.M();
            }
            if (s != null) {
                s.A();
            }
        }
        if (!y().o) {
            boolean z = this.v;
            if (!z || this.A.d()) {
                e0();
            }
            if (z) {
                ((v80) jd0Var.J.d).U0();
            } else {
                if (s != null) {
                    s.A();
                }
                if (this.k && s != null) {
                    s.S(false);
                }
            }
        }
        if (s != null) {
            nd0 nd0Var2 = s.K;
            if (!this.k && nd0Var2.d == fd0.g) {
                if (this.m != Integer.MAX_VALUE) {
                    o80.b("Place was called on a node which was placed already");
                }
                int i = nd0Var2.i;
                this.m = i;
                nd0Var2.i = i + 1;
            }
        } else {
            this.m = 0;
        }
        B();
    }

    @Override // defpackage.b3
    public final void n(a3 a3Var) {
        eo0 x = this.j.a.x();
        Object[] objArr = x.d;
        int i = x.g;
        for (int i2 = 0; i2 < i; i2++) {
            a3Var.invoke(((jd0) objArr[i2]).K.p);
        }
    }

    public final void n0(long j, float f, Function1 function1) {
        nd0 nd0Var = this.j;
        jd0 jd0Var = nd0Var.a;
        jd0 jd0Var2 = nd0Var.a;
        if (jd0Var.U) {
            o80.a("place is called on a deactivated node");
        }
        nd0Var.d = fd0.g;
        this.q = j;
        this.s = f;
        this.r = function1;
        this.I = false;
        eu0 a = md0.a(jd0Var2);
        if (this.y || !this.v) {
            this.A.e = false;
            nd0Var.f(false);
            this.J = function1;
            this.K = j;
            this.L = f;
            gu0 snapshotObserver = ((d4) a).getSnapshotObserver();
            snapshotObserver.a.b(jd0Var2, snapshotObserver.f, this.M);
        } else {
            qp0 a2 = nd0Var.a();
            a2.Z0(s90.c(j, a2.i), f, function1);
            j0();
        }
        nd0Var.d = fd0.i;
        if (nd0Var.a().o && (nd0Var.k || nd0Var.j)) {
            requestLayout();
        }
        this.o = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[Catch: all -> 0x0010, LOOP:0: B:22:0x0052->B:23:0x0054, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0045, B:23:0x0054, B:25:0x0064, B:28:0x007b, B:30:0x009a, B:31:0x00a0, B:33:0x00ac, B:35:0x00b6, B:39:0x00c2, B:41:0x0076), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0045, B:23:0x0054, B:25:0x0064, B:28:0x007b, B:30:0x009a, B:31:0x00a0, B:33:0x00ac, B:35:0x00b6, B:39:0x00c2, B:41:0x0076), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0045, B:23:0x0054, B:25:0x0064, B:28:0x007b, B:30:0x009a, B:31:0x00a0, B:33:0x00ac, B:35:0x00b6, B:39:0x00c2, B:41:0x0076), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o0(long j) {
        boolean z;
        int i;
        int i2;
        long j2;
        fd0 fd0Var;
        fd0 fd0Var2;
        fd0 fd0Var3;
        nd0 nd0Var = this.j;
        jd0 jd0Var = nd0Var.a;
        jd0 jd0Var2 = nd0Var.a;
        try {
            if (jd0Var.U) {
                o80.a("measure is called on a deactivated node");
            }
            eu0 a = md0.a(jd0Var2);
            jd0 s = jd0Var2.s();
            boolean z2 = true;
            if (!jd0Var2.I && (s == null || !s.I)) {
                z = false;
                jd0Var2.I = z;
                if (!jd0Var2.p() && mm.b(this.h, j)) {
                    ((d4) a).l(jd0Var2, false);
                    jd0Var2.V();
                    return false;
                }
                this.A.d = false;
                eo0 x = jd0Var2.x();
                Object[] objArr = x.d;
                i = x.g;
                for (i2 = 0; i2 < i; i2++) {
                    ((jd0) objArr[i2]).K.p.A.getClass();
                }
                this.n = true;
                j2 = nd0Var.a().g;
                c0(j);
                fd0Var = nd0Var.d;
                fd0Var2 = fd0.i;
                if (fd0Var == fd0Var2) {
                    o80.b("layout state is not idle before measure starts");
                }
                this.E = j;
                fd0Var3 = fd0.d;
                nd0Var.d = fd0Var3;
                this.x = false;
                gu0 snapshotObserver = ((d4) md0.a(jd0Var2)).getSnapshotObserver();
                snapshotObserver.a.b(jd0Var2, snapshotObserver.c, this.F);
                if (nd0Var.d == fd0Var3) {
                    this.y = true;
                    this.z = true;
                    nd0Var.d = fd0Var2;
                }
                if (ba0.a(nd0Var.a().g, j2) && nd0Var.a().d == this.d && nd0Var.a().e == this.e) {
                    z2 = false;
                }
                Z((nd0Var.a().e & 4294967295L) | (nd0Var.a().d << 32));
                return z2;
            }
            z = true;
            jd0Var2.I = z;
            if (!jd0Var2.p()) {
                ((d4) a).l(jd0Var2, false);
                jd0Var2.V();
                return false;
            }
            this.A.d = false;
            eo0 x2 = jd0Var2.x();
            Object[] objArr2 = x2.d;
            i = x2.g;
            while (i2 < i) {
            }
            this.n = true;
            j2 = nd0Var.a().g;
            c0(j);
            fd0Var = nd0Var.d;
            fd0Var2 = fd0.i;
            if (fd0Var == fd0Var2) {
            }
            this.E = j;
            fd0Var3 = fd0.d;
            nd0Var.d = fd0Var3;
            this.x = false;
            gu0 snapshotObserver2 = ((d4) md0.a(jd0Var2)).getSnapshotObserver();
            snapshotObserver2.a.b(jd0Var2, snapshotObserver2.c, this.F);
            if (nd0Var.d == fd0Var3) {
            }
            if (ba0.a(nd0Var.a().g, j2)) {
                z2 = false;
            }
            Z((nd0Var.a().e & 4294967295L) | (nd0Var.a().d << 32));
            return z2;
        } catch (Throwable th) {
            jd0Var.W(th);
            throw null;
        }
    }

    @Override // defpackage.nm0
    public final void r(boolean z) {
        nd0 nd0Var = this.j;
        if (z != nd0Var.a().m) {
            nd0Var.a().m = z;
            this.N = true;
        }
    }

    @Override // defpackage.b3
    public final void requestLayout() {
        this.j.a.S(false);
    }

    @Override // defpackage.b3
    public final v80 y() {
        return (v80) this.j.a.J.d;
    }

    @Override // defpackage.b3
    public final b3 z() {
        nd0 nd0Var;
        jd0 s = this.j.a.s();
        if (s == null || (nd0Var = s.K) == null) {
            return null;
        }
        return nd0Var.p;
    }
}
