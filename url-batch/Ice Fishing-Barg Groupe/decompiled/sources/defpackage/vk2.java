package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class vk2 {
    public final double PxuCJdSBwIXG;
    public final double RAsUl2FVSrh6;
    public final double TSizfFm2Yiuu;
    public final double Y1f8riQaR6yg;
    public final double a92UlCVFR9N8;
    public final double e9gEMXR7LXtO;
    public final double lS5Rgt96tfkO;

    public vk2(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.PxuCJdSBwIXG = d;
        this.lS5Rgt96tfkO = d2;
        this.TSizfFm2Yiuu = d3;
        this.Y1f8riQaR6yg = d4;
        this.e9gEMXR7LXtO = d5;
        this.a92UlCVFR9N8 = d6;
        this.RAsUl2FVSrh6 = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            u9.XL4ISE6Oc65B("Parameters cannot be NaN");
            throw null;
        }
        if (d == -2.0d || d == -3.0d) {
            return;
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            u9.XL4ISE6Oc65B("Parameter a or g is zero, the transfer function is constant");
            throw null;
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            u9.XL4ISE6Oc65B("Parameter c is zero, the transfer function is constant");
            throw null;
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            u9.XL4ISE6Oc65B("Parameter a or g is zero, and c is zero, the transfer function is constant");
            throw null;
        }
        if (d4 < 0.0d) {
            u9.XL4ISE6Oc65B("The transfer function must be increasing");
            throw null;
        }
        if (d2 < 0.0d || d < 0.0d) {
            u9.XL4ISE6Oc65B("The transfer function must be positive or increasing");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk2)) {
            return false;
        }
        vk2 vk2Var = (vk2) obj;
        return Double.compare(this.PxuCJdSBwIXG, vk2Var.PxuCJdSBwIXG) == 0 && Double.compare(this.lS5Rgt96tfkO, vk2Var.lS5Rgt96tfkO) == 0 && Double.compare(this.TSizfFm2Yiuu, vk2Var.TSizfFm2Yiuu) == 0 && Double.compare(this.Y1f8riQaR6yg, vk2Var.Y1f8riQaR6yg) == 0 && Double.compare(this.e9gEMXR7LXtO, vk2Var.e9gEMXR7LXtO) == 0 && Double.compare(this.a92UlCVFR9N8, vk2Var.a92UlCVFR9N8) == 0 && Double.compare(this.RAsUl2FVSrh6, vk2Var.RAsUl2FVSrh6) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.RAsUl2FVSrh6) + ((Double.hashCode(this.a92UlCVFR9N8) + ((Double.hashCode(this.e9gEMXR7LXtO) + ((Double.hashCode(this.Y1f8riQaR6yg) + ((Double.hashCode(this.TSizfFm2Yiuu) + ((Double.hashCode(this.lS5Rgt96tfkO) + (Double.hashCode(this.PxuCJdSBwIXG) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.PxuCJdSBwIXG + ", a=" + this.lS5Rgt96tfkO + ", b=" + this.TSizfFm2Yiuu + ", c=" + this.Y1f8riQaR6yg + ", d=" + this.e9gEMXR7LXtO + ", e=" + this.a92UlCVFR9N8 + ", f=" + this.RAsUl2FVSrh6 + ')';
    }

    public /* synthetic */ vk2(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }
}
