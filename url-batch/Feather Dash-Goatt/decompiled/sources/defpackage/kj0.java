package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class kj0 extends zw0 implements qk0, b3, nm0 {
    public Object A;
    public boolean E;
    public final nd0 j;
    public boolean k;
    public boolean o;
    public boolean p;
    public mm q;
    public Function1 s;
    public boolean x;
    public int l = Integer.MAX_VALUE;
    public int m = Integer.MAX_VALUE;
    public hd0 n = hd0.g;
    public long r = 0;
    public ij0 t = ij0.g;
    public final kd0 u = new kd0(this, 1);
    public final eo0 v = new eo0(new kj0[16]);
    public boolean w = true;
    public final jj0 y = new jj0(this, 0);
    public boolean z = true;
    public long B = nm.b(0, 0, 15);
    public final jj0 C = new jj0(this, 2);
    public final jj0 D = new jj0(this, 1);

    public kj0(nd0 nd0Var) {
        this.j = nd0Var;
        this.A = nd0Var.p.u;
    }

    @Override // defpackage.b3
    public final void B() {
        this.x = true;
        kd0 kd0Var = this.u;
        kd0Var.h();
        nd0 nd0Var = this.j;
        boolean z = nd0Var.f;
        jd0 jd0Var = nd0Var.a;
        if (z) {
            eo0 x = jd0Var.x();
            Object[] objArr = x.d;
            int i = x.g;
            for (int i2 = 0; i2 < i; i2++) {
                jd0 jd0Var2 = (jd0) objArr[i2];
                nd0 nd0Var2 = jd0Var2.K;
                if (nd0Var2.e && jd0Var2.r() == hd0.d) {
                    kj0 kj0Var = nd0Var2.q;
                    kj0Var.getClass();
                    kj0 kj0Var2 = nd0Var2.q;
                    mm mmVar = kj0Var2 != null ? kj0Var2.q : null;
                    mmVar.getClass();
                    if (kj0Var.o0(mmVar.a)) {
                        jd0.R(jd0Var, false, 7);
                    }
                }
            }
        }
        u80 u80Var = y().V;
        u80Var.getClass();
        if (nd0Var.g || (!u80Var.o && nd0Var.f)) {
            nd0Var.f = false;
            fd0 fd0Var = nd0Var.d;
            nd0Var.d = fd0.h;
            nd0Var.i(false);
            gu0 snapshotObserver = ((d4) md0.a(jd0Var)).getSnapshotObserver();
            snapshotObserver.a.b(jd0Var, snapshotObserver.h, this.y);
            nd0Var.d = fd0Var;
            if (nd0Var.m && u80Var.o) {
                requestLayout();
            }
            nd0Var.g = false;
        }
        if (kd0Var.b && kd0Var.e()) {
            kd0Var.g();
        }
        this.x = false;
    }

    @Override // defpackage.b3
    public final int O() {
        return this.m;
    }

    @Override // defpackage.b3
    public final void P() {
        jd0.R(this.j.a, false, 7);
    }

    @Override // defpackage.zw0
    public final void Y(long j, float f, Function1 function1) {
        n0(j, function1);
    }

    @Override // defpackage.b3
    public final kd0 a() {
        return this.u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if ((r1 != null ? r1.K.d : null) == defpackage.fd0.h) goto L14;
     */
    @Override // defpackage.qk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zw0 c(long j) {
        hd0 hd0Var;
        nd0 nd0Var = this.j;
        jd0 jd0Var = nd0Var.a;
        jd0 jd0Var2 = nd0Var.a;
        jd0 s = jd0Var.s();
        if ((s != null ? s.K.d : null) != fd0.e) {
            jd0 s2 = jd0Var2.s();
        }
        nd0Var.b = false;
        jd0 s3 = jd0Var2.s();
        if (s3 != null) {
            nd0 nd0Var2 = s3.K;
            if (this.n != hd0.g && !jd0Var2.I) {
                o80.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ordinal = nd0Var2.d.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                hd0Var = hd0.d;
            } else {
                if (ordinal != 2 && ordinal != 3) {
                    dd0.d(nd0Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                hd0Var = hd0.e;
            }
            this.n = hd0Var;
        } else {
            this.n = hd0.g;
        }
        if (jd0Var2.G == hd0.g) {
            jd0Var2.e();
        }
        o0(j);
        return this;
    }

    public final boolean d0() {
        nd0 nd0Var = this.j;
        return ca0.r(nd0Var.a) || nd0Var.c;
    }

    public final void e0(boolean z) {
        if (z && d0()) {
            return;
        }
        if (z || d0()) {
            this.t = ij0.g;
            eo0 x = this.j.a.x();
            Object[] objArr = x.d;
            int i = x.g;
            for (int i2 = 0; i2 < i; i2++) {
                kj0 kj0Var = ((jd0) objArr[i2]).K.q;
                kj0Var.getClass();
                kj0Var.e0(true);
            }
        }
    }

    public final void f0() {
        ij0 ij0Var = this.t;
        nd0 nd0Var = this.j;
        boolean z = nd0Var.c;
        jd0 jd0Var = nd0Var.a;
        if (z) {
            this.t = ij0.e;
        } else {
            this.t = ij0.d;
        }
        if (ij0Var != ij0.d && nd0Var.e) {
            jd0.R(jd0Var, true, 6);
        }
        eo0 x = jd0Var.x();
        Object[] objArr = x.d;
        int i = x.g;
        for (int i2 = 0; i2 < i; i2++) {
            jd0 jd0Var2 = (jd0) objArr[i2];
            kj0 kj0Var = jd0Var2.K.q;
            if (kj0Var == null) {
                dd0.e("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (kj0Var.m != Integer.MAX_VALUE) {
                kj0Var.f0();
                jd0.U(jd0Var2);
            }
        }
    }

    @Override // defpackage.zw0, defpackage.qk0
    public final Object h() {
        return this.A;
    }

    public final void h0() {
        nd0 nd0Var = this.j;
        if (nd0Var.o > 0) {
            eo0 x = nd0Var.a.x();
            Object[] objArr = x.d;
            int i = x.g;
            for (int i2 = 0; i2 < i; i2++) {
                jd0 jd0Var = (jd0) objArr[i2];
                nd0 nd0Var2 = jd0Var.K;
                if ((nd0Var2.m || nd0Var2.n) && !nd0Var2.f) {
                    jd0Var.Q(false);
                }
                kj0 kj0Var = nd0Var2.q;
                if (kj0Var != null) {
                    kj0Var.h0();
                }
            }
        }
    }

    public final void j0() {
        fd0 fd0Var;
        this.E = true;
        nd0 nd0Var = this.j;
        jd0 s = nd0Var.a.s();
        ij0 ij0Var = this.t;
        if ((ij0Var != ij0.d && !nd0Var.c) || (ij0Var != ij0.e && nd0Var.c)) {
            f0();
            if (this.k && s != null) {
                s.Q(false);
            }
        }
        if (s != null) {
            nd0 nd0Var2 = s.K;
            if (!this.k && ((fd0Var = nd0Var2.d) == fd0.g || fd0Var == fd0.h)) {
                if (this.m != Integer.MAX_VALUE) {
                    o80.b("Place was called on a node which was placed already");
                }
                int i = nd0Var2.h;
                this.m = i;
                nd0Var2.h = i + 1;
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
            kj0 kj0Var = ((jd0) objArr[i2]).K.q;
            kj0Var.getClass();
            a3Var.invoke(kj0Var);
        }
    }

    public final void n0(long j, Function1 function1) {
        nd0 nd0Var = this.j;
        jd0 jd0Var = nd0Var.a;
        jd0 jd0Var2 = nd0Var.a;
        try {
            jd0 s = jd0Var.s();
            fd0 fd0Var = s != null ? s.K.d : null;
            fd0 fd0Var2 = fd0.h;
            if (fd0Var == fd0Var2) {
                nd0Var.c = false;
            }
            if (jd0Var2.U) {
                o80.a("place is called on a deactivated node");
            }
            nd0Var.d = fd0Var2;
            boolean z = true;
            this.o = true;
            this.E = false;
            if (!s90.a(j, this.r)) {
                if (nd0Var.n || nd0Var.m) {
                    nd0Var.f = true;
                }
                h0();
            }
            eu0 a = md0.a(jd0Var2);
            this.r = j;
            if (!nd0Var.f) {
                if (this.t == ij0.g) {
                    z = false;
                }
                if (z) {
                    gj0 H0 = nd0Var.a().H0();
                    H0.getClass();
                    H0.A0(s90.c(j, H0.i));
                    j0();
                    this.s = function1;
                    nd0Var.d = fd0.i;
                }
            }
            nd0Var.h(false);
            this.u.e = false;
            gu0 snapshotObserver = ((d4) a).getSnapshotObserver();
            snapshotObserver.a.b(jd0Var2, snapshotObserver.g, this.D);
            this.s = function1;
            nd0Var.d = fd0.i;
        } catch (Throwable th) {
            jd0Var.W(th);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0077, B:33:0x007b, B:34:0x0083, B:37:0x0095, B:39:0x00b2, B:43:0x0090), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064 A[Catch: all -> 0x0010, LOOP:0: B:28:0x0062->B:29:0x0064, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0077, B:33:0x007b, B:34:0x0083, B:37:0x0095, B:39:0x00b2, B:43:0x0090), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0077, B:33:0x007b, B:34:0x0083, B:37:0x0095, B:39:0x00b2, B:43:0x0090), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0090 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0077, B:33:0x007b, B:34:0x0083, B:37:0x0095, B:39:0x00b2, B:43:0x0090), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o0(long j) {
        boolean z;
        int i;
        int i2;
        gj0 H0;
        nd0 nd0Var = this.j;
        jd0 jd0Var = nd0Var.a;
        jd0 jd0Var2 = nd0Var.a;
        try {
            if (jd0Var.U) {
                o80.a("measure is called on a deactivated node");
            }
            jd0 s = jd0Var2.s();
            if (!jd0Var2.I && (s == null || !s.I)) {
                z = false;
                jd0Var2.I = z;
                if (!jd0Var2.K.e) {
                    mm mmVar = this.q;
                    if (mmVar == null ? false : mm.b(mmVar.a, j)) {
                        eu0 eu0Var = jd0Var2.s;
                        if (eu0Var != null) {
                            ((d4) eu0Var).l(jd0Var2, true);
                        }
                        jd0Var2.V();
                        return false;
                    }
                }
                this.q = new mm(j);
                c0(j);
                this.u.d = false;
                eo0 x = jd0Var2.x();
                Object[] objArr = x.d;
                i = x.g;
                for (i2 = 0; i2 < i; i2++) {
                    kj0 kj0Var = ((jd0) objArr[i2]).K.q;
                    kj0Var.getClass();
                    kj0Var.u.getClass();
                }
                long j2 = !this.p ? this.g : -9223372034707292160L;
                this.p = true;
                H0 = nd0Var.a().H0();
                if (H0 != null) {
                    o80.b("Lookahead result from lookaheadRemeasure cannot be null");
                }
                nd0Var.c(j);
                Z((H0.d << 32) | (H0.e & 4294967295L));
                return ((int) (j2 >> 32)) == H0.d || ((int) (j2 & 4294967295L)) != H0.e;
            }
            z = true;
            jd0Var2.I = z;
            if (!jd0Var2.K.e) {
            }
            this.q = new mm(j);
            c0(j);
            this.u.d = false;
            eo0 x2 = jd0Var2.x();
            Object[] objArr2 = x2.d;
            i = x2.g;
            while (i2 < i) {
            }
            if (!this.p) {
            }
            this.p = true;
            H0 = nd0Var.a().H0();
            if (H0 != null) {
            }
            nd0Var.c(j);
            Z((H0.d << 32) | (H0.e & 4294967295L));
            if (((int) (j2 >> 32)) == H0.d) {
            }
        } catch (Throwable th) {
            jd0Var.W(th);
            throw null;
        }
    }

    @Override // defpackage.nm0
    public final void r(boolean z) {
        gj0 H0;
        nd0 nd0Var = this.j;
        gj0 H02 = nd0Var.a().H0();
        if (Boolean.valueOf(z).equals(H02 != null ? Boolean.valueOf(H02.m) : null) || (H0 = nd0Var.a().H0()) == null) {
            return;
        }
        H0.m = z;
    }

    @Override // defpackage.b3
    public final void requestLayout() {
        this.j.a.Q(false);
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
        return nd0Var.q;
    }
}
