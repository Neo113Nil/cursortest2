package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
final class ik extends r61 {
    public final e81 PxuCJdSBwIXG;
    public final boolean TSizfFm2Yiuu;
    public final boolean Y1f8riQaR6yg;
    public final ae0 a92UlCVFR9N8;
    public final String e9gEMXR7LXtO;
    public final yn0 lS5Rgt96tfkO;

    public ik(e81 e81Var, yn0 yn0Var, boolean z, boolean z2, String str, ae0 ae0Var) {
        this.PxuCJdSBwIXG = e81Var;
        this.lS5Rgt96tfkO = yn0Var;
        this.TSizfFm2Yiuu = z;
        this.Y1f8riQaR6yg = z2;
        this.e9gEMXR7LXtO = str;
        this.a92UlCVFR9N8 = ae0Var;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        return new kk(this.PxuCJdSBwIXG, this.lS5Rgt96tfkO, this.TSizfFm2Yiuu, this.Y1f8riQaR6yg, this.e9gEMXR7LXtO, this.a92UlCVFR9N8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        if (r7.ozEBbv0hFTAB == null) goto L37;
     */
    @Override // defpackage.r61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a92UlCVFR9N8(m61 m61Var) {
        boolean z;
        tx txVar;
        kk kkVar = (kk) m61Var;
        hb0 hb0Var = kkVar.kpCQ9veP6n3I;
        e81 e81Var = kkVar.ryVscX7ZL4Ux;
        e81 e81Var2 = this.PxuCJdSBwIXG;
        boolean z2 = true;
        if (cs0.wdg6QnbFHrFF(e81Var, e81Var2)) {
            z = false;
        } else {
            kkVar.MDTGUQSX7PXD();
            kkVar.ryVscX7ZL4Ux = e81Var2;
            kkVar.ZbWwgt3aGe7A = e81Var2;
            z = true;
        }
        yn0 yn0Var = kkVar.pnx5pC0XzaCw;
        yn0 yn0Var2 = this.lS5Rgt96tfkO;
        if (!cs0.wdg6QnbFHrFF(yn0Var, yn0Var2)) {
            kkVar.pnx5pC0XzaCw = yn0Var2;
            z = true;
        }
        boolean z3 = kkVar.IAToe7bXGz4N;
        boolean z4 = this.TSizfFm2Yiuu;
        if (z3 != z4) {
            kkVar.IAToe7bXGz4N = z4;
            if (z4) {
                kkVar.nLZGh9p8gVSu();
            }
            z = true;
        }
        boolean z5 = kkVar.jyegZNwi31qc;
        boolean z6 = this.Y1f8riQaR6yg;
        if (z5 != z6) {
            if (z6) {
                kkVar.W7ceZOzvrRuI(hb0Var);
            } else {
                kkVar.X1HMmH2Ks65g(hb0Var);
                kkVar.MDTGUQSX7PXD();
            }
            th0.S2OOm9zPNm0h(kkVar);
            kkVar.jyegZNwi31qc = z6;
        }
        String str = kkVar.e6tOsSdd2EFb;
        String str2 = this.e9gEMXR7LXtO;
        if (!cs0.wdg6QnbFHrFF(str, str2)) {
            kkVar.e6tOsSdd2EFb = str2;
            th0.S2OOm9zPNm0h(kkVar);
        }
        kkVar.aF05bpZJlKEP = this.a92UlCVFR9N8;
        boolean z7 = kkVar.amuv7NJvPxHu;
        e81 e81Var3 = kkVar.ryVscX7ZL4Ux;
        if (z7 != (e81Var3 == null)) {
            boolean z8 = e81Var3 == null;
            kkVar.amuv7NJvPxHu = z8;
            if (!z8) {
            }
        }
        z2 = z;
        if (z2 && ((txVar = kkVar.ozEBbv0hFTAB) != null || !kkVar.amuv7NJvPxHu)) {
            if (txVar != null) {
                kkVar.X1HMmH2Ks65g(txVar);
            }
            kkVar.ozEBbv0hFTAB = null;
            kkVar.qYgDo2Ye5PY7();
        }
        hb0Var.MDTGUQSX7PXD(kkVar.ZbWwgt3aGe7A);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ik.class != obj.getClass()) {
            return false;
        }
        ik ikVar = (ik) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, ikVar.PxuCJdSBwIXG) && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, ikVar.lS5Rgt96tfkO) && this.TSizfFm2Yiuu == ikVar.TSizfFm2Yiuu && this.Y1f8riQaR6yg == ikVar.Y1f8riQaR6yg && cs0.wdg6QnbFHrFF(this.e9gEMXR7LXtO, ikVar.e9gEMXR7LXtO) && this.a92UlCVFR9N8 == ikVar.a92UlCVFR9N8;
    }

    public final int hashCode() {
        e81 e81Var = this.PxuCJdSBwIXG;
        int hashCode = (e81Var != null ? e81Var.hashCode() : 0) * 31;
        yn0 yn0Var = this.lS5Rgt96tfkO;
        int Y1f8riQaR6yg = o0.Y1f8riQaR6yg(o0.Y1f8riQaR6yg((hashCode + (yn0Var != null ? yn0Var.hashCode() : 0)) * 31, 31, this.TSizfFm2Yiuu), 31, this.Y1f8riQaR6yg);
        String str = this.e9gEMXR7LXtO;
        return this.a92UlCVFR9N8.hashCode() + ((Y1f8riQaR6yg + (str != null ? str.hashCode() : 0)) * 961);
    }
}
