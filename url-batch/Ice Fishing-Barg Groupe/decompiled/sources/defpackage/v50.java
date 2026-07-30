package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
final class v50 extends r61 {
    public final gl2 PxuCJdSBwIXG;
    public final k70 TSizfFm2Yiuu;
    public final ae0 Y1f8riQaR6yg;
    public final w50 e9gEMXR7LXtO;
    public final e60 lS5Rgt96tfkO;

    public v50(gl2 gl2Var, e60 e60Var, k70 k70Var, ae0 ae0Var, w50 w50Var) {
        this.PxuCJdSBwIXG = gl2Var;
        this.lS5Rgt96tfkO = e60Var;
        this.TSizfFm2Yiuu = k70Var;
        this.Y1f8riQaR6yg = ae0Var;
        this.e9gEMXR7LXtO = w50Var;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        c60 c60Var = new c60();
        c60Var.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        c60Var.S2OOm9zPNm0h = this.TSizfFm2Yiuu;
        c60Var.ZbWwgt3aGe7A = this.Y1f8riQaR6yg;
        c60Var.pnx5pC0XzaCw = this.e9gEMXR7LXtO;
        c60Var.IAToe7bXGz4N = -9223372034707292160L;
        sr.lS5Rgt96tfkO(0, 0, 0, 0, 15);
        new b60(c60Var, 0);
        new b60(c60Var, 1);
        return c60Var;
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        c60 c60Var = (c60) m61Var;
        c60Var.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        c60Var.S2OOm9zPNm0h = this.TSizfFm2Yiuu;
        c60Var.ZbWwgt3aGe7A = this.Y1f8riQaR6yg;
        c60Var.pnx5pC0XzaCw = this.e9gEMXR7LXtO;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v50)) {
            return false;
        }
        v50 v50Var = (v50) obj;
        return v50Var.PxuCJdSBwIXG == this.PxuCJdSBwIXG && v50Var.lS5Rgt96tfkO.equals(this.lS5Rgt96tfkO) && cs0.wdg6QnbFHrFF(v50Var.TSizfFm2Yiuu, this.TSizfFm2Yiuu) && v50Var.Y1f8riQaR6yg == this.Y1f8riQaR6yg && cs0.wdg6QnbFHrFF(v50Var.e9gEMXR7LXtO, this.e9gEMXR7LXtO);
    }

    public final int hashCode() {
        return this.e9gEMXR7LXtO.hashCode() + ((this.Y1f8riQaR6yg.hashCode() + ((this.TSizfFm2Yiuu.hashCode() + ((this.lS5Rgt96tfkO.hashCode() + (this.PxuCJdSBwIXG.hashCode() * 923521)) * 31)) * 31)) * 31);
    }
}
