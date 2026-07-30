package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ds2 {
    public static final cs2 Companion = new cs2();
    public final boolean PxuCJdSBwIXG;
    public final boolean TSizfFm2Yiuu;
    public final Integer Y1f8riQaR6yg;
    public final boolean a92UlCVFR9N8;
    public final boolean e9gEMXR7LXtO;
    public final Integer lS5Rgt96tfkO;

    public ds2(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4) {
        this.PxuCJdSBwIXG = z;
        this.lS5Rgt96tfkO = num;
        this.TSizfFm2Yiuu = z2;
        this.Y1f8riQaR6yg = num2;
        this.e9gEMXR7LXtO = z3;
        this.a92UlCVFR9N8 = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds2)) {
            return false;
        }
        ds2 ds2Var = (ds2) obj;
        return this.PxuCJdSBwIXG == ds2Var.PxuCJdSBwIXG && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, ds2Var.lS5Rgt96tfkO) && this.TSizfFm2Yiuu == ds2Var.TSizfFm2Yiuu && cs0.wdg6QnbFHrFF(this.Y1f8riQaR6yg, ds2Var.Y1f8riQaR6yg) && this.e9gEMXR7LXtO == ds2Var.e9gEMXR7LXtO && this.a92UlCVFR9N8 == ds2Var.a92UlCVFR9N8;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.PxuCJdSBwIXG) * 31;
        Integer num = this.lS5Rgt96tfkO;
        int Y1f8riQaR6yg = o0.Y1f8riQaR6yg((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.TSizfFm2Yiuu);
        Integer num2 = this.Y1f8riQaR6yg;
        return Boolean.hashCode(this.a92UlCVFR9N8) + o0.Y1f8riQaR6yg((Y1f8riQaR6yg + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.e9gEMXR7LXtO);
    }

    public final String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.PxuCJdSBwIXG + ", clientMaxWindowBits=" + this.lS5Rgt96tfkO + ", clientNoContextTakeover=" + this.TSizfFm2Yiuu + ", serverMaxWindowBits=" + this.Y1f8riQaR6yg + ", serverNoContextTakeover=" + this.e9gEMXR7LXtO + ", unknownValues=" + this.a92UlCVFR9N8 + ')';
    }
}
