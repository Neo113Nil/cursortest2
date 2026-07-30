package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xb1 {
    public final boolean PxuCJdSBwIXG;
    public final int RAsUl2FVSrh6;
    public final int TSizfFm2Yiuu;
    public final boolean Y1f8riQaR6yg;
    public final int a92UlCVFR9N8;
    public final boolean e9gEMXR7LXtO;
    public final boolean lS5Rgt96tfkO;
    public eu0 rtx2ld2ELZv4;

    public xb1(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3) {
        this.PxuCJdSBwIXG = z;
        this.lS5Rgt96tfkO = z2;
        this.TSizfFm2Yiuu = i;
        this.Y1f8riQaR6yg = z3;
        this.e9gEMXR7LXtO = z4;
        this.a92UlCVFR9N8 = i2;
        this.RAsUl2FVSrh6 = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof xb1)) {
            return false;
        }
        xb1 xb1Var = (xb1) obj;
        return this.PxuCJdSBwIXG == xb1Var.PxuCJdSBwIXG && this.lS5Rgt96tfkO == xb1Var.lS5Rgt96tfkO && this.TSizfFm2Yiuu == xb1Var.TSizfFm2Yiuu && cs0.wdg6QnbFHrFF(this.rtx2ld2ELZv4, xb1Var.rtx2ld2ELZv4) && this.Y1f8riQaR6yg == xb1Var.Y1f8riQaR6yg && this.e9gEMXR7LXtO == xb1Var.e9gEMXR7LXtO && this.a92UlCVFR9N8 == xb1Var.a92UlCVFR9N8 && this.RAsUl2FVSrh6 == xb1Var.RAsUl2FVSrh6;
    }

    public final int hashCode() {
        int i = (((((this.PxuCJdSBwIXG ? 1 : 0) * 31) + (this.lS5Rgt96tfkO ? 1 : 0)) * 31) + this.TSizfFm2Yiuu) * 961;
        return ((((((((((((i + (this.rtx2ld2ELZv4 != null ? r1.hashCode() : 0)) * 961) + (this.Y1f8riQaR6yg ? 1 : 0)) * 31) + (this.e9gEMXR7LXtO ? 1 : 0)) * 31) + this.a92UlCVFR9N8) * 31) + this.RAsUl2FVSrh6) * 31) - 1) * 31) - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(xb1.class.getSimpleName());
        sb.append("(");
        if (this.PxuCJdSBwIXG) {
            sb.append("launchSingleTop ");
        }
        if (this.lS5Rgt96tfkO) {
            sb.append("restoreState ");
        }
        int i = this.RAsUl2FVSrh6;
        int i2 = this.a92UlCVFR9N8;
        if (i2 != -1 || i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i2));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(")");
        }
        return sb.toString();
    }
}
