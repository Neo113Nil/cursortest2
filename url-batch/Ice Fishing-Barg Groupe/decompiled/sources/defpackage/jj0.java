package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
final class jj0 extends r61 {
    public final dj2 PxuCJdSBwIXG;
    public final int TSizfFm2Yiuu;
    public final int lS5Rgt96tfkO;

    public jj0(dj2 dj2Var, int i, int i2) {
        this.PxuCJdSBwIXG = dj2Var;
        this.lS5Rgt96tfkO = i;
        this.TSizfFm2Yiuu = i2;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        mj0 mj0Var = new mj0();
        mj0Var.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        mj0Var.S2OOm9zPNm0h = this.lS5Rgt96tfkO;
        mj0Var.ZbWwgt3aGe7A = this.TSizfFm2Yiuu;
        mj0Var.IAToe7bXGz4N = -1;
        mj0Var.e6tOsSdd2EFb = -1;
        return mj0Var;
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        mj0 mj0Var = (mj0) m61Var;
        dj2 dj2Var = mj0Var.VhhvGxCb8gfr;
        dj2 dj2Var2 = this.PxuCJdSBwIXG;
        boolean wdg6QnbFHrFF = cs0.wdg6QnbFHrFF(dj2Var, dj2Var2);
        int i = this.lS5Rgt96tfkO;
        int i2 = this.TSizfFm2Yiuu;
        if (wdg6QnbFHrFF && mj0Var.S2OOm9zPNm0h == i && mj0Var.ZbWwgt3aGe7A == i2) {
            return;
        }
        mj0Var.VhhvGxCb8gfr = dj2Var2;
        mj0Var.S2OOm9zPNm0h = i;
        mj0Var.ZbWwgt3aGe7A = i2;
        mj0Var.jyegZNwi31qc = th0.ozEBbv0hFTAB(dj2Var2, zv.zf8DYfih6EZu(mj0Var).BjEWd04qc7Mw);
        mj0Var.pnx5pC0XzaCw = true;
        ng0.e6tOsSdd2EFb(mj0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj0)) {
            return false;
        }
        jj0 jj0Var = (jj0) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, jj0Var.PxuCJdSBwIXG) && this.lS5Rgt96tfkO == jj0Var.lS5Rgt96tfkO && this.TSizfFm2Yiuu == jj0Var.TSizfFm2Yiuu;
    }

    public final int hashCode() {
        return (((this.PxuCJdSBwIXG.hashCode() * 31) + this.lS5Rgt96tfkO) * 31) + this.TSizfFm2Yiuu;
    }
}
