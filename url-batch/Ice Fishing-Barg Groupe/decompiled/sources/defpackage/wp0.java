package defpackage;

import android.graphics.Insets;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class wp0 {
    public static final wp0 e9gEMXR7LXtO = new wp0(0, 0, 0, 0);
    public final int PxuCJdSBwIXG;
    public final int TSizfFm2Yiuu;
    public final int Y1f8riQaR6yg;
    public final int lS5Rgt96tfkO;

    public wp0(int i, int i2, int i3, int i4) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = i2;
        this.TSizfFm2Yiuu = i3;
        this.Y1f8riQaR6yg = i4;
    }

    public static wp0 PxuCJdSBwIXG(wp0 wp0Var, wp0 wp0Var2) {
        return TSizfFm2Yiuu(Math.max(wp0Var.PxuCJdSBwIXG, wp0Var2.PxuCJdSBwIXG), Math.max(wp0Var.lS5Rgt96tfkO, wp0Var2.lS5Rgt96tfkO), Math.max(wp0Var.TSizfFm2Yiuu, wp0Var2.TSizfFm2Yiuu), Math.max(wp0Var.Y1f8riQaR6yg, wp0Var2.Y1f8riQaR6yg));
    }

    public static wp0 TSizfFm2Yiuu(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e9gEMXR7LXtO : new wp0(i, i2, i3, i4);
    }

    public static wp0 Y1f8riQaR6yg(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return TSizfFm2Yiuu(i, i2, i3, i4);
    }

    public static wp0 lS5Rgt96tfkO(wp0 wp0Var, wp0 wp0Var2) {
        return TSizfFm2Yiuu(Math.min(wp0Var.PxuCJdSBwIXG, wp0Var2.PxuCJdSBwIXG), Math.min(wp0Var.lS5Rgt96tfkO, wp0Var2.lS5Rgt96tfkO), Math.min(wp0Var.TSizfFm2Yiuu, wp0Var2.TSizfFm2Yiuu), Math.min(wp0Var.Y1f8riQaR6yg, wp0Var2.Y1f8riQaR6yg));
    }

    public final Insets e9gEMXR7LXtO() {
        return yr.rtx2ld2ELZv4(this.PxuCJdSBwIXG, this.lS5Rgt96tfkO, this.TSizfFm2Yiuu, this.Y1f8riQaR6yg);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wp0.class != obj.getClass()) {
            return false;
        }
        wp0 wp0Var = (wp0) obj;
        return this.Y1f8riQaR6yg == wp0Var.Y1f8riQaR6yg && this.PxuCJdSBwIXG == wp0Var.PxuCJdSBwIXG && this.TSizfFm2Yiuu == wp0Var.TSizfFm2Yiuu && this.lS5Rgt96tfkO == wp0Var.lS5Rgt96tfkO;
    }

    public final int hashCode() {
        return (((((this.PxuCJdSBwIXG * 31) + this.lS5Rgt96tfkO) * 31) + this.TSizfFm2Yiuu) * 31) + this.Y1f8riQaR6yg;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.PxuCJdSBwIXG);
        sb.append(", top=");
        sb.append(this.lS5Rgt96tfkO);
        sb.append(", right=");
        sb.append(this.TSizfFm2Yiuu);
        sb.append(", bottom=");
        return o0.r3s1LDPKFs1S(sb, this.Y1f8riQaR6yg, '}');
    }
}
