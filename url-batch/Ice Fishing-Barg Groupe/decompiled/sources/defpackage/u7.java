package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
final class u7<S> extends r61 {
    public final cl2 PxuCJdSBwIXG;
    public final y7 TSizfFm2Yiuu;
    public final d91 lS5Rgt96tfkO;

    public u7(cl2 cl2Var, d91 d91Var, y7 y7Var) {
        this.PxuCJdSBwIXG = cl2Var;
        this.lS5Rgt96tfkO = d91Var;
        this.TSizfFm2Yiuu = y7Var;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        x7 x7Var = new x7();
        x7Var.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        x7Var.S2OOm9zPNm0h = this.lS5Rgt96tfkO;
        x7Var.ZbWwgt3aGe7A = this.TSizfFm2Yiuu;
        x7Var.pnx5pC0XzaCw = -9223372034707292160L;
        return x7Var;
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        x7 x7Var = (x7) m61Var;
        x7Var.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        x7Var.S2OOm9zPNm0h = this.lS5Rgt96tfkO;
        x7Var.ZbWwgt3aGe7A = this.TSizfFm2Yiuu;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u7)) {
            return false;
        }
        u7 u7Var = (u7) obj;
        return cs0.wdg6QnbFHrFF(u7Var.PxuCJdSBwIXG, this.PxuCJdSBwIXG) && u7Var.lS5Rgt96tfkO.equals(this.lS5Rgt96tfkO);
    }

    public final int hashCode() {
        int hashCode = this.TSizfFm2Yiuu.hashCode() * 31;
        cl2 cl2Var = this.PxuCJdSBwIXG;
        return this.lS5Rgt96tfkO.hashCode() + ((hashCode + (cl2Var != null ? cl2Var.hashCode() : 0)) * 31);
    }
}
