package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class v31 extends dm1 {
    public final /* synthetic */ int OPXfSBeufaJ8;
    public final Object wdg6QnbFHrFF;

    public /* synthetic */ v31(int i, Object obj) {
        this.OPXfSBeufaJ8 = i;
        this.wdg6QnbFHrFF = obj;
    }

    @Override // defpackage.dm1
    public float TSizfFm2Yiuu(ey1 ey1Var) {
        int hnJvRxDXo0hm;
        switch (this.OPXfSBeufaJ8) {
            case 0:
                pe0 pe0Var = ey1Var.PxuCJdSBwIXG;
                if (pe0Var != null) {
                    return ((Number) pe0Var.rtx2ld2ELZv4(this, Float.valueOf(Float.NaN))).floatValue();
                }
                u31 u31Var = (u31) this.wdg6QnbFHrFF;
                if (u31Var.XL4ISE6Oc65B) {
                    return Float.NaN;
                }
                u31 u31Var2 = u31Var;
                while (true) {
                    cb1 cb1Var = u31Var2.EcgxDIVH5in8;
                    float f = (cb1Var == null || (hnJvRxDXo0hm = na.hnJvRxDXo0hm((ey1[]) cb1Var.TSizfFm2Yiuu, ey1Var)) < 0) ? Float.NaN : ((float[]) cb1Var.Y1f8riQaR6yg)[hnJvRxDXo0hm];
                    if (!Float.isNaN(f)) {
                        u31Var2.Nlhe969cAGO8(u31Var.OYiFbU3x63rc(), ey1Var);
                        return ey1Var.PxuCJdSBwIXG(f, u31Var2.HqMwxkFaipxD(), u31Var.HqMwxkFaipxD());
                    }
                    u31 HGgCfDnf0ga9 = u31Var2.HGgCfDnf0ga9();
                    if (HGgCfDnf0ga9 == null) {
                        u31Var2.Nlhe969cAGO8(u31Var.OYiFbU3x63rc(), ey1Var);
                        return Float.NaN;
                    }
                    u31Var2 = HGgCfDnf0ga9;
                }
                break;
            default:
                return super.TSizfFm2Yiuu(ey1Var);
        }
    }

    @Override // defpackage.dm1
    public final int a92UlCVFR9N8() {
        int i = this.OPXfSBeufaJ8;
        Object obj = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                return ((u31) obj).JTxCbbCwomzt();
            default:
                return ((r1) obj).getRoot().ryVscX7ZL4Ux.gPXPFXrUH4XX.rtx2ld2ELZv4;
        }
    }

    @Override // defpackage.dm1
    public final cw0 e9gEMXR7LXtO() {
        int i = this.OPXfSBeufaJ8;
        Object obj = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                return ((u31) obj).getLayoutDirection();
            default:
                return ((r1) obj).getLayoutDirection();
        }
    }

    @Override // defpackage.hy
    public final float lS5Rgt96tfkO() {
        int i = this.OPXfSBeufaJ8;
        Object obj = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                return ((u31) obj).lS5Rgt96tfkO();
            default:
                return ((r1) obj).getDensity().lS5Rgt96tfkO();
        }
    }

    @Override // defpackage.hy
    public final float r3s1LDPKFs1S() {
        int i = this.OPXfSBeufaJ8;
        Object obj = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                return ((u31) obj).r3s1LDPKFs1S();
            default:
                return ((r1) obj).getDensity().r3s1LDPKFs1S();
        }
    }
}
