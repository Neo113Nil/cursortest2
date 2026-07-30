package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class gj0 extends ej0 implements qk0 {
    public final qp0 s;
    public LinkedHashMap u;
    public wk0 w;
    public final ln0 x;
    public long t = 0;
    public final hj0 v = new hj0(this);

    public gj0(qp0 qp0Var) {
        this.s = qp0Var;
        ln0 ln0Var = qq0.a;
        this.x = new ln0();
    }

    public static final void y0(gj0 gj0Var, wk0 wk0Var) {
        LinkedHashMap linkedHashMap;
        if (wk0Var != null) {
            gj0Var.Z((wk0Var.c() & 4294967295L) | (wk0Var.e() << 32));
        } else {
            gj0Var.Z(0L);
        }
        if (!Intrinsics.a(gj0Var.w, wk0Var) && wk0Var != null && ((((linkedHashMap = gj0Var.u) != null && !linkedHashMap.isEmpty()) || !wk0Var.a().isEmpty()) && !Intrinsics.a(wk0Var.a(), gj0Var.u))) {
            kj0 kj0Var = gj0Var.s.s.K.q;
            kj0Var.getClass();
            kj0Var.u.f();
            LinkedHashMap linkedHashMap2 = gj0Var.u;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                gj0Var.u = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(wk0Var.a());
        }
        gj0Var.w = wk0Var;
    }

    public final void A0(long j) {
        if (!s90.a(this.t, j)) {
            this.t = j;
            qp0 qp0Var = this.s;
            kj0 kj0Var = qp0Var.s.K.q;
            if (kj0Var != null) {
                kj0Var.h0();
            }
            ej0.v0(qp0Var);
        }
        if (this.o) {
            return;
        }
        h0(r0());
    }

    public final long B0(gj0 gj0Var, boolean z) {
        long j = 0;
        while (!this.equals(gj0Var)) {
            if (!this.m || !z) {
                j = s90.c(j, this.t);
            }
            qp0 qp0Var = this.s.u;
            qp0Var.getClass();
            this = qp0Var.H0();
            this.getClass();
        }
        return j;
    }

    @Override // defpackage.zw0
    public final void Y(long j, float f, Function1 function1) {
        A0(j);
        if (this.n) {
            return;
        }
        z0();
    }

    @Override // defpackage.nr
    public final float f() {
        return this.s.f();
    }

    @Override // defpackage.xk0
    public final vc0 getLayoutDirection() {
        return this.s.s.D;
    }

    @Override // defpackage.zw0, defpackage.qk0
    public final Object h() {
        return this.s.h();
    }

    @Override // defpackage.nr
    public final float k() {
        return this.s.k();
    }

    @Override // defpackage.ej0, defpackage.xk0
    public final boolean m() {
        return true;
    }

    @Override // defpackage.ej0
    public final ej0 n0() {
        qp0 qp0Var = this.s.t;
        if (qp0Var != null) {
            return qp0Var.H0();
        }
        return null;
    }

    @Override // defpackage.ej0
    public final uc0 o0() {
        return this.v;
    }

    @Override // defpackage.ej0
    public final boolean p0() {
        return this.w != null;
    }

    @Override // defpackage.ej0
    public final jd0 q0() {
        return this.s.s;
    }

    @Override // defpackage.ej0
    public final wk0 r0() {
        wk0 wk0Var = this.w;
        if (wk0Var != null) {
            return wk0Var;
        }
        throw qy0.g("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.ej0
    public final ej0 s0() {
        qp0 qp0Var = this.s.u;
        if (qp0Var != null) {
            return qp0Var.H0();
        }
        return null;
    }

    @Override // defpackage.ej0
    public final long t0() {
        return this.t;
    }

    @Override // defpackage.ej0
    public final void x0() {
        Y(this.t, 0.0f, null);
    }

    public void z0() {
        r0().b();
    }
}
