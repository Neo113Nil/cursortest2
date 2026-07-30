package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
final class t02 extends r61 {
    public final e12 PxuCJdSBwIXG;
    public final boolean TSizfFm2Yiuu;
    public final boolean Y1f8riQaR6yg;
    public final e81 e9gEMXR7LXtO;
    public final th1 lS5Rgt96tfkO;

    public t02(e12 e12Var, th1 th1Var, boolean z, boolean z2, e81 e81Var) {
        this.PxuCJdSBwIXG = e12Var;
        this.lS5Rgt96tfkO = th1Var;
        this.TSizfFm2Yiuu = z;
        this.Y1f8riQaR6yg = z2;
        this.e9gEMXR7LXtO = e81Var;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        return new d12(null, null, this.e9gEMXR7LXtO, this.lS5Rgt96tfkO, this.PxuCJdSBwIXG, this.TSizfFm2Yiuu, this.Y1f8riQaR6yg);
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        ((d12) m61Var).f(null, null, this.e9gEMXR7LXtO, this.lS5Rgt96tfkO, this.PxuCJdSBwIXG, this.TSizfFm2Yiuu, this.Y1f8riQaR6yg);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t02)) {
            return false;
        }
        t02 t02Var = (t02) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, t02Var.PxuCJdSBwIXG) && this.lS5Rgt96tfkO == t02Var.lS5Rgt96tfkO && this.TSizfFm2Yiuu == t02Var.TSizfFm2Yiuu && this.Y1f8riQaR6yg == t02Var.Y1f8riQaR6yg && cs0.wdg6QnbFHrFF(this.e9gEMXR7LXtO, t02Var.e9gEMXR7LXtO);
    }

    public final int hashCode() {
        int Y1f8riQaR6yg = o0.Y1f8riQaR6yg(o0.Y1f8riQaR6yg((this.lS5Rgt96tfkO.hashCode() + (this.PxuCJdSBwIXG.hashCode() * 31)) * 961, 31, this.TSizfFm2Yiuu), 961, this.Y1f8riQaR6yg);
        e81 e81Var = this.e9gEMXR7LXtO;
        return (Y1f8riQaR6yg + (e81Var != null ? e81Var.hashCode() : 0)) * 31;
    }
}
