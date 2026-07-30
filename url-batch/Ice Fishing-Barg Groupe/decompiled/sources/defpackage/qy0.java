package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
final class qy0 extends r61 {
    public final ae0 PxuCJdSBwIXG;
    public final th1 TSizfFm2Yiuu;
    public final boolean Y1f8riQaR6yg;
    public final py0 lS5Rgt96tfkO;

    public qy0(ae0 ae0Var, py0 py0Var, th1 th1Var, boolean z) {
        this.PxuCJdSBwIXG = ae0Var;
        this.lS5Rgt96tfkO = py0Var;
        this.TSizfFm2Yiuu = th1Var;
        this.Y1f8riQaR6yg = z;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        return new uy0(this.PxuCJdSBwIXG, this.lS5Rgt96tfkO, this.TSizfFm2Yiuu, this.Y1f8riQaR6yg);
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        uy0 uy0Var = (uy0) m61Var;
        uy0Var.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        uy0Var.S2OOm9zPNm0h = this.lS5Rgt96tfkO;
        th1 th1Var = uy0Var.ZbWwgt3aGe7A;
        th1 th1Var2 = this.TSizfFm2Yiuu;
        if (th1Var != th1Var2) {
            uy0Var.ZbWwgt3aGe7A = th1Var2;
            th0.S2OOm9zPNm0h(uy0Var);
        }
        boolean z = uy0Var.pnx5pC0XzaCw;
        boolean z2 = this.Y1f8riQaR6yg;
        if (z == z2) {
            return;
        }
        uy0Var.pnx5pC0XzaCw = z2;
        uy0Var.W7ceZOzvrRuI();
        th0.S2OOm9zPNm0h(uy0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qy0)) {
            return false;
        }
        qy0 qy0Var = (qy0) obj;
        return this.PxuCJdSBwIXG == qy0Var.PxuCJdSBwIXG && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, qy0Var.lS5Rgt96tfkO) && this.TSizfFm2Yiuu == qy0Var.TSizfFm2Yiuu && this.Y1f8riQaR6yg == qy0Var.Y1f8riQaR6yg;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + o0.Y1f8riQaR6yg((this.TSizfFm2Yiuu.hashCode() + ((this.lS5Rgt96tfkO.hashCode() + (this.PxuCJdSBwIXG.hashCode() * 31)) * 31)) * 31, 31, this.Y1f8riQaR6yg);
    }
}
