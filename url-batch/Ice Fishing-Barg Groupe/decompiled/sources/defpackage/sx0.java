package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
final class sx0 extends r61 {
    public final vy0 PxuCJdSBwIXG;
    public final th1 TSizfFm2Yiuu;
    public final ef lS5Rgt96tfkO;

    public sx0(vy0 vy0Var, ef efVar, th1 th1Var) {
        this.PxuCJdSBwIXG = vy0Var;
        this.lS5Rgt96tfkO = efVar;
        this.TSizfFm2Yiuu = th1Var;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        wx0 wx0Var = new wx0();
        wx0Var.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        wx0Var.S2OOm9zPNm0h = this.lS5Rgt96tfkO;
        wx0Var.ZbWwgt3aGe7A = this.TSizfFm2Yiuu;
        return wx0Var;
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        wx0 wx0Var = (wx0) m61Var;
        wx0Var.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        wx0Var.S2OOm9zPNm0h = this.lS5Rgt96tfkO;
        wx0Var.ZbWwgt3aGe7A = this.TSizfFm2Yiuu;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx0)) {
            return false;
        }
        sx0 sx0Var = (sx0) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, sx0Var.PxuCJdSBwIXG) && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, sx0Var.lS5Rgt96tfkO) && this.TSizfFm2Yiuu == sx0Var.TSizfFm2Yiuu;
    }

    public final int hashCode() {
        return this.TSizfFm2Yiuu.hashCode() + o0.Y1f8riQaR6yg((this.lS5Rgt96tfkO.hashCode() + (this.PxuCJdSBwIXG.hashCode() * 31)) * 31, 31, false);
    }
}
