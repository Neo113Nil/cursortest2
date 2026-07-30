package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
final class r02 extends r61 {
    public final e12 PxuCJdSBwIXG;
    public final k3 RAsUl2FVSrh6;
    public final boolean TSizfFm2Yiuu;
    public final lw Y1f8riQaR6yg;
    public final boolean a92UlCVFR9N8;
    public final e81 e9gEMXR7LXtO;
    public final th1 lS5Rgt96tfkO;

    public r02(k3 k3Var, lw lwVar, e81 e81Var, th1 th1Var, e12 e12Var, boolean z, boolean z2) {
        this.PxuCJdSBwIXG = e12Var;
        this.lS5Rgt96tfkO = th1Var;
        this.TSizfFm2Yiuu = z;
        this.Y1f8riQaR6yg = lwVar;
        this.e9gEMXR7LXtO = e81Var;
        this.a92UlCVFR9N8 = z2;
        this.RAsUl2FVSrh6 = k3Var;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        s02 s02Var = new s02();
        s02Var.ZbWwgt3aGe7A = this.PxuCJdSBwIXG;
        s02Var.pnx5pC0XzaCw = this.lS5Rgt96tfkO;
        s02Var.IAToe7bXGz4N = this.TSizfFm2Yiuu;
        s02Var.e6tOsSdd2EFb = this.Y1f8riQaR6yg;
        s02Var.jyegZNwi31qc = this.e9gEMXR7LXtO;
        s02Var.aF05bpZJlKEP = this.a92UlCVFR9N8;
        s02Var.kpCQ9veP6n3I = this.RAsUl2FVSrh6;
        return s02Var;
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        ((s02) m61Var).FT2GK7JK5Ma2(this.RAsUl2FVSrh6, this.Y1f8riQaR6yg, this.e9gEMXR7LXtO, this.lS5Rgt96tfkO, this.PxuCJdSBwIXG, this.a92UlCVFR9N8, this.TSizfFm2Yiuu);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r02.class != obj.getClass()) {
            return false;
        }
        r02 r02Var = (r02) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, r02Var.PxuCJdSBwIXG) && this.lS5Rgt96tfkO == r02Var.lS5Rgt96tfkO && this.TSizfFm2Yiuu == r02Var.TSizfFm2Yiuu && cs0.wdg6QnbFHrFF(this.Y1f8riQaR6yg, r02Var.Y1f8riQaR6yg) && cs0.wdg6QnbFHrFF(this.e9gEMXR7LXtO, r02Var.e9gEMXR7LXtO) && this.a92UlCVFR9N8 == r02Var.a92UlCVFR9N8 && cs0.wdg6QnbFHrFF(this.RAsUl2FVSrh6, r02Var.RAsUl2FVSrh6);
    }

    public final int hashCode() {
        int Y1f8riQaR6yg = o0.Y1f8riQaR6yg(o0.Y1f8riQaR6yg((this.lS5Rgt96tfkO.hashCode() + (this.PxuCJdSBwIXG.hashCode() * 31)) * 31, 31, this.TSizfFm2Yiuu), 31, false);
        lw lwVar = this.Y1f8riQaR6yg;
        int hashCode = (Y1f8riQaR6yg + (lwVar != null ? lwVar.hashCode() : 0)) * 31;
        e81 e81Var = this.e9gEMXR7LXtO;
        int Y1f8riQaR6yg2 = o0.Y1f8riQaR6yg((hashCode + (e81Var != null ? e81Var.hashCode() : 0)) * 961, 31, this.a92UlCVFR9N8);
        k3 k3Var = this.RAsUl2FVSrh6;
        return Y1f8riQaR6yg2 + (k3Var != null ? k3Var.hashCode() : 0);
    }
}
