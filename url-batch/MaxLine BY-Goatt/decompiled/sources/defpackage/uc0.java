package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class uc0 extends ul1 implements rz2, r81 {
    public uc0 A;
    public uc0 B;
    public long C;

    public final boolean G0() {
        uc0 uc0Var = this.A;
        if (uc0Var != null) {
            return uc0Var.G0();
        }
        uc0 uc0Var2 = this.B;
        if (uc0Var2 != null) {
            return uc0Var2.G0();
        }
        return false;
    }

    public final void H0() {
        uc0 uc0Var = this.B;
        if (uc0Var != null) {
            uc0Var.H0();
            return;
        }
        uc0 uc0Var2 = this.A;
        if (uc0Var2 != null) {
            uc0Var2.H0();
        }
    }

    public final void I0() {
        uc0 uc0Var = this.B;
        if (uc0Var != null) {
            uc0Var.I0();
        }
        uc0 uc0Var2 = this.A;
        if (uc0Var2 != null) {
            uc0Var2.I0();
        }
        this.A = null;
    }

    public final void J0(ar0 ar0Var) {
        rz2 rz2Var;
        uc0 uc0Var;
        uc0 uc0Var2 = this.A;
        if (uc0Var2 == null || !o70.m(uc0Var2, l41.F(ar0Var))) {
            if (this.m.z) {
                c82 c82Var = new c82();
                nk2.p(this, new oc(c82Var, this, ar0Var, 6));
                rz2Var = (rz2) c82Var.m;
            } else {
                rz2Var = null;
            }
            uc0Var = (uc0) rz2Var;
        } else {
            uc0Var = uc0Var2;
        }
        if (uc0Var != null && uc0Var2 == null) {
            uc0Var.H0();
            uc0Var.J0(ar0Var);
            uc0 uc0Var3 = this.B;
            if (uc0Var3 != null) {
                uc0Var3.I0();
            }
        } else if (uc0Var == null && uc0Var2 != null) {
            uc0 uc0Var4 = this.B;
            if (uc0Var4 != null) {
                uc0Var4.H0();
                uc0Var4.J0(ar0Var);
            }
            uc0Var2.I0();
        } else if (!Intrinsics.b(uc0Var, uc0Var2)) {
            if (uc0Var != null) {
                uc0Var.H0();
                uc0Var.J0(ar0Var);
            }
            if (uc0Var2 != null) {
                uc0Var2.I0();
            }
        } else if (uc0Var != null) {
            uc0Var.J0(ar0Var);
        } else {
            uc0 uc0Var5 = this.B;
            if (uc0Var5 != null) {
                uc0Var5.J0(ar0Var);
            }
        }
        this.A = uc0Var;
    }

    public final void K0() {
        uc0 uc0Var = this.B;
        if (uc0Var != null) {
            uc0Var.K0();
            return;
        }
        uc0 uc0Var2 = this.A;
        if (uc0Var2 != null) {
            uc0Var2.K0();
        }
    }

    @Override // defpackage.rz2
    public final Object r() {
        return qb2.P;
    }

    @Override // defpackage.r81
    public final void v(long j) {
        this.C = j;
    }

    @Override // defpackage.ul1
    public final void z0() {
        this.B = null;
        this.A = null;
    }
}
