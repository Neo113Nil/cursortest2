package defpackage;

import android.graphics.Paint;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class cd0 extends qp0 {
    public static final xu1 W;
    public ad0 U;
    public bd0 V;

    static {
        xu1 d = m90.d();
        d.e(hi.e);
        ((Paint) d.b).setStrokeWidth(1.0f);
        d.j(1);
        W = d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cd0(jd0 jd0Var, ad0 ad0Var) {
        super(jd0Var);
        this.U = ad0Var;
        this.V = jd0Var.m != null ? new bd0(this) : null;
        if ((((zl0) ad0Var).d.g & 512) == 0) {
            return;
        }
        af.c();
        throw null;
    }

    @Override // defpackage.qp0
    public final void E0() {
        if (this.V == null) {
            this.V = new bd0(this);
        }
    }

    @Override // defpackage.qp0
    public final gj0 H0() {
        return this.V;
    }

    @Override // defpackage.qp0
    public final zl0 J0() {
        return ((zl0) this.U).d;
    }

    @Override // defpackage.zw0
    public final void Y(long j, float f, Function1 function1) {
        Z0(j, f, function1);
        if (this.n) {
            return;
        }
        U0();
        qp0 qp0Var = this.t;
        qp0Var.getClass();
        qp0Var.o = this.o;
        r0().b();
        qp0Var.o = false;
    }

    @Override // defpackage.qp0
    public final void Y0(xf xfVar, l50 l50Var) {
        qp0 qp0Var;
        qp0 qp0Var2 = this.t;
        qp0Var2.getClass();
        qp0Var2.C0(xfVar, l50Var);
        if (!((d4) md0.a(this.s)).getShowLayoutBounds() || (qp0Var = this.t) == null) {
            return;
        }
        if (ba0.a(this.g, qp0Var.g) && s90.a(qp0Var.D, 0L)) {
            return;
        }
        long j = this.g;
        xfVar.a(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, W);
    }

    @Override // defpackage.qk0
    public final zw0 c(long j) {
        c0(j);
        ad0 ad0Var = this.U;
        qp0 qp0Var = this.t;
        qp0Var.getClass();
        c1(ad0Var.P(this, qp0Var, j));
        T0();
        return this;
    }

    @Override // defpackage.ej0
    public final int e0(m60 m60Var) {
        bd0 bd0Var = this.V;
        if (bd0Var == null) {
            return t90.d(this, m60Var);
        }
        ln0 ln0Var = bd0Var.x;
        int d = ln0Var.d(m60Var);
        if (d >= 0) {
            return ln0Var.c[d];
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h1(ad0 ad0Var) {
        if (ad0Var.equals(this.U) || (((zl0) ad0Var).d.g & 512) == 0) {
            this.U = ad0Var;
        } else {
            af.c();
        }
    }
}
