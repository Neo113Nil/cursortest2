package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class p11 {
    public static final k11 Companion = new k11();
    public static final p11 Y1f8riQaR6yg;
    public final float PxuCJdSBwIXG;
    public final int TSizfFm2Yiuu;
    public final int lS5Rgt96tfkO;

    static {
        j11.Companion.getClass();
        float f = j11.TSizfFm2Yiuu;
        o11.Companion.getClass();
        m11.Companion.getClass();
        Y1f8riQaR6yg = new p11(f, 17, 0);
    }

    public p11(float f, int i, int i2) {
        this.PxuCJdSBwIXG = f;
        this.lS5Rgt96tfkO = i;
        this.TSizfFm2Yiuu = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p11)) {
            return false;
        }
        p11 p11Var = (p11) obj;
        float f = p11Var.PxuCJdSBwIXG;
        i11 i11Var = j11.Companion;
        return Float.compare(this.PxuCJdSBwIXG, f) == 0 && this.lS5Rgt96tfkO == p11Var.lS5Rgt96tfkO && this.TSizfFm2Yiuu == p11Var.TSizfFm2Yiuu;
    }

    public final int hashCode() {
        i11 i11Var = j11.Companion;
        return Integer.hashCode(this.TSizfFm2Yiuu) + o0.lS5Rgt96tfkO(this.lS5Rgt96tfkO, Float.hashCode(this.PxuCJdSBwIXG) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) j11.lS5Rgt96tfkO(this.PxuCJdSBwIXG));
        sb.append(", trim=");
        String str = "Invalid";
        int i = this.lS5Rgt96tfkO;
        sb.append((Object) (i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(",mode=");
        int i2 = this.TSizfFm2Yiuu;
        if (i2 == 0) {
            str = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str = "LineHeightStyle.Mode.Tight";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p11(float f, int i) {
        this(f, i, 0);
        m11.Companion.getClass();
    }
}
