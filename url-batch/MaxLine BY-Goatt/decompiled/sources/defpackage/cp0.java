package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cp0 extends p90 implements go0, xh2, iv0, uo0 {
    public xo0 C;
    public final bp0 D;
    public final dp0 E;
    public final ep0 F;

    public cp0(bn1 bn1Var) {
        bp0 bp0Var = new bp0();
        bp0Var.A = bn1Var;
        G0(bp0Var);
        this.D = bp0Var;
        dp0 dp0Var = new dp0();
        G0(dp0Var);
        this.E = dp0Var;
        ep0 ep0Var = new ep0();
        G0(ep0Var);
        this.F = ep0Var;
        G0(new yo0(new rk(1, v41.a, v41.class, "onDispatchEventsCompleted", "onDispatchEventsCompleted(Landroidx/compose/ui/focus/FocusTargetNode;)V", 0, 0, 2), 3));
    }

    public final void J0(bn1 bn1Var) {
        jo0 jo0Var;
        bp0 bp0Var = this.D;
        if (Intrinsics.b(bp0Var.A, bn1Var)) {
            return;
        }
        bn1 bn1Var2 = bp0Var.A;
        if (bn1Var2 != null && (jo0Var = bp0Var.B) != null) {
            bn1Var2.c(new ko0(jo0Var));
        }
        bp0Var.B = null;
        bp0Var.A = bn1Var;
    }

    @Override // defpackage.xh2
    public final void M(sh2 sh2Var) {
        xo0 xo0Var = this.C;
        boolean z = false;
        if (xo0Var != null && xo0Var.a()) {
            z = true;
        }
        t71[] t71VarArr = ii2.a;
        ji2 ji2Var = gi2.k;
        t71 t71Var = ii2.a[4];
        sh2Var.d(ji2Var, Boolean.valueOf(z));
        sh2Var.d(rh2.v, new r1(null, new u(11, this)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.go0
    public final void X(xo0 xo0Var) {
        fp0 G0;
        if (Intrinsics.b(this.C, xo0Var)) {
            return;
        }
        boolean a = xo0Var.a();
        tb1 tb1Var = null;
        Object[] objArr = 0;
        if (a) {
            z71.H(u0(), null, new fj(2, (o30) (objArr == true ? 1 : 0), (Object) this), 3);
        }
        if (this.z) {
            yh2.l(this);
        }
        bp0 bp0Var = this.D;
        bn1 bn1Var = bp0Var.A;
        if (bn1Var != null) {
            jo0 jo0Var = bp0Var.B;
            if (a) {
                if (jo0Var != null) {
                    bp0Var.G0(bn1Var, new ko0(jo0Var));
                    bp0Var.B = null;
                }
                jo0 jo0Var2 = new jo0();
                bp0Var.G0(bn1Var, jo0Var2);
                bp0Var.B = jo0Var2;
            } else if (jo0Var != null) {
                bp0Var.G0(bn1Var, new ko0(jo0Var));
                bp0Var.B = null;
            }
        }
        ep0 ep0Var = this.F;
        if (a != ep0Var.A) {
            if (a) {
                ks1 ks1Var = ep0Var.B;
                if (ks1Var != null && ks1Var.Q0().z && (G0 = ep0Var.G0()) != null) {
                    G0.G0(ep0Var.B);
                }
            } else {
                fp0 G02 = ep0Var.G0();
                if (G02 != null) {
                    G02.G0(null);
                }
            }
            ep0Var.A = a;
        }
        dp0 dp0Var = this.E;
        if (a) {
            dp0Var.getClass();
            c82 c82Var = new c82();
            j8.P(dp0Var, new k7(10, c82Var, dp0Var));
            tb1 tb1Var2 = (tb1) c82Var.m;
            if (tb1Var2 != null) {
                tb1Var2.a();
                tb1Var = tb1Var2;
            }
            dp0Var.A = tb1Var;
        } else {
            tb1 tb1Var3 = dp0Var.A;
            if (tb1Var3 != null) {
                tb1Var3.b();
            }
            dp0Var.A = null;
        }
        dp0Var.B = a;
        this.C = xo0Var;
    }

    @Override // defpackage.ul1
    public final boolean v0() {
        return false;
    }

    @Override // defpackage.iv0
    public final void y(ks1 ks1Var) {
        this.F.y(ks1Var);
    }
}
