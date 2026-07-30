package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xg1 extends n12 implements jj1, k6, jm1 {
    public Function1 A;
    public boolean F;
    public Object H;
    public boolean I;
    public final m91 r;
    public boolean s;
    public boolean w;
    public boolean x;
    public u10 y;
    public int t = Integer.MAX_VALUE;
    public int u = Integer.MAX_VALUE;
    public g91 v = g91.o;
    public long z = 0;
    public ug1 B = ug1.o;
    public final j91 C = new j91(this, 1);
    public final eo1 D = new eo1(new xg1[16]);
    public boolean E = true;
    public boolean G = true;

    public xg1(m91 m91Var) {
        this.r = m91Var;
        this.H = m91Var.p.C;
    }

    @Override // defpackage.jj1
    public final int V(int i) {
        q0();
        sg1 O0 = this.r.a().O0();
        O0.getClass();
        return O0.V(i);
    }

    @Override // defpackage.k6
    public final void X() {
        i91.U(this.r.a, false, 7);
    }

    @Override // defpackage.jj1
    public final int Y(int i) {
        q0();
        sg1 O0 = this.r.a().O0();
        O0.getClass();
        return O0.Y(i);
    }

    @Override // defpackage.k6
    public final j91 a() {
        return this.C;
    }

    @Override // defpackage.jj1
    public final int a0(int i) {
        q0();
        sg1 O0 = this.r.a().O0();
        O0.getClass();
        return O0.a0(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if ((r1 != null ? r1.Q.d : null) == defpackage.e91.p) goto L14;
     */
    @Override // defpackage.jj1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n12 c(long j) {
        g91 g91Var;
        m91 m91Var = this.r;
        i91 i91Var = m91Var.a;
        i91 i91Var2 = m91Var.a;
        i91 u = i91Var.u();
        if ((u != null ? u.Q.d : null) != e91.n) {
            i91 u2 = i91Var2.u();
        }
        m91Var.b = false;
        i91 u3 = i91Var2.u();
        if (u3 != null) {
            m91 m91Var2 = u3.Q;
            if (this.v != g91.o && !i91Var2.O) {
                h21.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ordinal = m91Var2.d.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                g91Var = g91.m;
            } else {
                if (ordinal != 2 && ordinal != 3) {
                    b71.q(m91Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                g91Var = g91.n;
            }
            this.v = g91Var;
        } else {
            this.v = g91.o;
        }
        if (i91Var2.M == g91.o) {
            i91Var2.e();
        }
        v0(j);
        return this;
    }

    @Override // defpackage.n12
    public final int d0() {
        sg1 O0 = this.r.a().O0();
        O0.getClass();
        return O0.d0();
    }

    @Override // defpackage.jj1
    public final int e(int i) {
        q0();
        sg1 O0 = this.r.a().O0();
        O0.getClass();
        return O0.e(i);
    }

    @Override // defpackage.n12
    public final int e0() {
        sg1 O0 = this.r.a().O0();
        O0.getClass();
        return O0.e0();
    }

    @Override // defpackage.n12, defpackage.jj1
    public final Object i() {
        return this.H;
    }

    @Override // defpackage.n12
    public final void i0(long j, float f, Function1 function1) {
        u0(j, function1);
    }

    @Override // defpackage.k6
    public final void l(j6 j6Var) {
        eo1 y = this.r.a.y();
        Object[] objArr = y.m;
        int i = y.o;
        for (int i2 = 0; i2 < i; i2++) {
            xg1 xg1Var = ((i91) objArr[i2]).Q.q;
            xg1Var.getClass();
            j6Var.invoke(xg1Var);
        }
    }

    @Override // defpackage.jm1
    public final void m(boolean z) {
        sg1 O0;
        m91 m91Var = this.r;
        sg1 O02 = m91Var.a().O0();
        if (Boolean.valueOf(z).equals(O02 != null ? Boolean.valueOf(O02.u) : null) || (O0 = m91Var.a().O0()) == null) {
            return;
        }
        O0.u = z;
    }

    public final void m0(boolean z) {
        m91 m91Var = this.r;
        if (z && m91Var.c) {
            return;
        }
        if (z || m91Var.c) {
            this.B = ug1.o;
            eo1 y = m91Var.a.y();
            Object[] objArr = y.m;
            int i = y.o;
            for (int i2 = 0; i2 < i; i2++) {
                xg1 xg1Var = ((i91) objArr[i2]).Q.q;
                xg1Var.getClass();
                xg1Var.m0(true);
            }
        }
    }

    @Override // defpackage.k6
    public final n21 n() {
        return this.r.a.P.c;
    }

    public final void n0() {
        ug1 ug1Var = this.B;
        m91 m91Var = this.r;
        boolean z = m91Var.c;
        i91 i91Var = m91Var.a;
        if (z) {
            this.B = ug1.n;
        } else {
            this.B = ug1.m;
        }
        if (ug1Var != ug1.m && m91Var.e) {
            i91.U(i91Var, true, 6);
        }
        eo1 y = i91Var.y();
        Object[] objArr = y.m;
        int i = y.o;
        for (int i2 = 0; i2 < i; i2++) {
            i91 i91Var2 = (i91) objArr[i2];
            xg1 xg1Var = i91Var2.Q.q;
            if (xg1Var == null) {
                lh.e("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (xg1Var.u != Integer.MAX_VALUE) {
                xg1Var.n0();
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
        return m91Var.q;
    }

    public final void o0() {
        m91 m91Var = this.r;
        if (m91Var.o > 0) {
            eo1 y = m91Var.a.y();
            Object[] objArr = y.m;
            int i = y.o;
            for (int i2 = 0; i2 < i; i2++) {
                i91 i91Var = (i91) objArr[i2];
                m91 m91Var2 = i91Var.Q;
                if ((m91Var2.m || m91Var2.n) && !m91Var2.f) {
                    i91Var.T(false);
                }
                xg1 xg1Var = m91Var2.q;
                if (xg1Var != null) {
                    xg1Var.o0();
                }
            }
        }
    }

    @Override // defpackage.k6
    public final void q() {
        this.F = true;
        j91 j91Var = this.C;
        j91Var.h();
        m91 m91Var = this.r;
        boolean z = m91Var.f;
        i91 i91Var = m91Var.a;
        if (z) {
            eo1 y = i91Var.y();
            Object[] objArr = y.m;
            int i = y.o;
            for (int i2 = 0; i2 < i; i2++) {
                i91 i91Var2 = (i91) objArr[i2];
                m91 m91Var2 = i91Var2.Q;
                if (m91Var2.e && i91Var2.s() == g91.m) {
                    xg1 xg1Var = m91Var2.q;
                    xg1Var.getClass();
                    xg1 xg1Var2 = m91Var2.q;
                    u10 u10Var = xg1Var2 != null ? xg1Var2.y : null;
                    u10Var.getClass();
                    if (xg1Var.v0(u10Var.a)) {
                        i91.U(i91Var, false, 7);
                    }
                }
            }
        }
        m21 m21Var = n().b0;
        m21Var.getClass();
        if (m91Var.g || (!m21Var.w && m91Var.f)) {
            m91Var.f = false;
            e91 e91Var = m91Var.d;
            m91Var.d = e91.p;
            rx1 a = l91.a(i91Var);
            m91Var.i(false);
            tx1 snapshotObserver = ((t7) a).getSnapshotObserver();
            k7 k7Var = new k7(15, this, m21Var);
            snapshotObserver.getClass();
            if (i91Var.s != null) {
                snapshotObserver.a(i91Var, snapshotObserver.h, k7Var);
            } else {
                snapshotObserver.a(i91Var, snapshotObserver.e, k7Var);
            }
            m91Var.d = e91Var;
            if (m91Var.m && m21Var.w) {
                requestLayout();
            }
            m91Var.g = false;
        }
        if (j91Var.b && j91Var.e()) {
            j91Var.g();
        }
        this.F = false;
    }

    public final void q0() {
        m91 m91Var = this.r;
        i91.U(m91Var.a, false, 7);
        i91 i91Var = m91Var.a;
        i91 u = i91Var.u();
        if (u == null || i91Var.M != g91.o) {
            return;
        }
        int ordinal = u.Q.d.ordinal();
        i91Var.M = ordinal != 0 ? ordinal != 2 ? u.M : g91.n : g91.m;
    }

    @Override // defpackage.k6
    public final boolean r() {
        return this.B != ug1.o;
    }

    @Override // defpackage.k6
    public final void requestLayout() {
        this.r.a.T(false);
    }

    public final void t0() {
        e91 e91Var;
        this.I = true;
        m91 m91Var = this.r;
        i91 u = m91Var.a.u();
        ug1 ug1Var = this.B;
        if ((ug1Var != ug1.m && !m91Var.c) || (ug1Var != ug1.n && m91Var.c)) {
            n0();
            if (this.s && u != null) {
                u.T(false);
            }
        }
        if (u != null) {
            m91 m91Var2 = u.Q;
            if (!this.s && ((e91Var = m91Var2.d) == e91.o || e91Var == e91.p)) {
                if (this.u != Integer.MAX_VALUE) {
                    h21.b("Place was called on a node which was placed already");
                }
                int i = m91Var2.h;
                this.u = i;
                m91Var2.h = i + 1;
            }
        } else {
            this.u = 0;
        }
        q();
    }

    public final void u0(long j, Function1 function1) {
        m91 m91Var = this.r;
        i91 i91Var = m91Var.a;
        i91 i91Var2 = m91Var.a;
        try {
            i91 u = i91Var.u();
            e91 e91Var = u != null ? u.Q.d : null;
            e91 e91Var2 = e91.p;
            if (e91Var == e91Var2) {
                m91Var.c = false;
            }
            if (i91Var2.Y) {
                h21.a("place is called on a deactivated node");
            }
            m91Var.d = e91Var2;
            this.w = true;
            this.I = false;
            if (!s31.a(j, this.z)) {
                if (m91Var.n || m91Var.m) {
                    m91Var.f = true;
                }
                o0();
            }
            rx1 a = l91.a(i91Var2);
            if (m91Var.f || !r()) {
                m91Var.h(false);
                this.C.e = false;
                tx1 snapshotObserver = ((t7) a).getSnapshotObserver();
                wg1 wg1Var = new wg1(this, a, j);
                snapshotObserver.getClass();
                if (i91Var2.s != null) {
                    snapshotObserver.a(i91Var2, snapshotObserver.g, wg1Var);
                } else {
                    snapshotObserver.a(i91Var2, snapshotObserver.f, wg1Var);
                }
            } else {
                sg1 O0 = m91Var.a().O0();
                O0.getClass();
                O0.H0(s31.c(j, O0.q));
                t0();
            }
            this.z = j;
            this.A = function1;
            m91Var.d = e91.q;
            Unit unit = Unit.a;
        } catch (Throwable th) {
            i91Var.Z(th);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0079, B:33:0x007d, B:34:0x0085, B:37:0x0097, B:39:0x00b4, B:43:0x0092), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064 A[Catch: all -> 0x0010, LOOP:0: B:28:0x0062->B:29:0x0064, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0079, B:33:0x007d, B:34:0x0085, B:37:0x0097, B:39:0x00b4, B:43:0x0092), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0079, B:33:0x007d, B:34:0x0085, B:37:0x0097, B:39:0x00b4, B:43:0x0092), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0079, B:33:0x007d, B:34:0x0085, B:37:0x0097, B:39:0x00b4, B:43:0x0092), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v0(long j) {
        boolean z;
        int i;
        int i2;
        sg1 O0;
        m91 m91Var = this.r;
        i91 i91Var = m91Var.a;
        i91 i91Var2 = m91Var.a;
        try {
            if (i91Var.Y) {
                h21.a("measure is called on a deactivated node");
            }
            i91 u = i91Var2.u();
            if (!i91Var2.O && (u == null || !u.O)) {
                z = false;
                i91Var2.O = z;
                if (!i91Var2.Q.e) {
                    u10 u10Var = this.y;
                    if (u10Var == null ? false : u10.b(u10Var.a, j)) {
                        rx1 rx1Var = i91Var2.y;
                        if (rx1Var != null) {
                            ((t7) rx1Var).j(i91Var2, true);
                        }
                        i91Var2.Y();
                        return false;
                    }
                }
                this.y = new u10(j);
                k0(j);
                this.C.d = false;
                eo1 y = i91Var2.y();
                Object[] objArr = y.m;
                i = y.o;
                for (i2 = 0; i2 < i; i2++) {
                    xg1 xg1Var = ((i91) objArr[i2]).Q.q;
                    xg1Var.getClass();
                    xg1Var.C.getClass();
                    Unit unit = Unit.a;
                }
                long j2 = !this.x ? this.o : -9223372034707292160L;
                this.x = true;
                O0 = m91Var.a().O0();
                if (O0 != null) {
                    h21.b("Lookahead result from lookaheadRemeasure cannot be null");
                }
                m91Var.c(j);
                j0((O0.m << 32) | (O0.n & 4294967295L));
                return ((int) (j2 >> 32)) == O0.m || ((int) (j2 & 4294967295L)) != O0.n;
            }
            z = true;
            i91Var2.O = z;
            if (!i91Var2.Q.e) {
            }
            this.y = new u10(j);
            k0(j);
            this.C.d = false;
            eo1 y2 = i91Var2.y();
            Object[] objArr2 = y2.m;
            i = y2.o;
            while (i2 < i) {
            }
            if (!this.x) {
            }
            this.x = true;
            O0 = m91Var.a().O0();
            if (O0 != null) {
            }
            m91Var.c(j);
            j0((O0.m << 32) | (O0.n & 4294967295L));
            if (((int) (j2 >> 32)) == O0.m) {
            }
        } catch (Throwable th) {
            i91Var.Z(th);
            throw null;
        }
    }
}
