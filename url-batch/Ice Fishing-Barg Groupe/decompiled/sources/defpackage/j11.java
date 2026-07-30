package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class j11 {
    public static final i11 Companion = new i11();
    public static final float TSizfFm2Yiuu;
    public static final float Y1f8riQaR6yg;
    public static final float lS5Rgt96tfkO;
    public final float PxuCJdSBwIXG;

    static {
        PxuCJdSBwIXG(0.0f);
        PxuCJdSBwIXG(0.5f);
        lS5Rgt96tfkO = 0.5f;
        PxuCJdSBwIXG(-1.0f);
        TSizfFm2Yiuu = -1.0f;
        PxuCJdSBwIXG(1.0f);
        Y1f8riQaR6yg = 1.0f;
    }

    public static void PxuCJdSBwIXG(float f) {
        if ((0.0f > f || f > 1.0f) && f != -1.0f) {
            fp0.lS5Rgt96tfkO("topRatio should be in [0..1] range or -1");
        }
    }

    public static String lS5Rgt96tfkO(float f) {
        if (f == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f == lS5Rgt96tfkO) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f == TSizfFm2Yiuu) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f == Y1f8riQaR6yg) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j11) {
            return Float.compare(this.PxuCJdSBwIXG, ((j11) obj).PxuCJdSBwIXG) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.PxuCJdSBwIXG);
    }

    public final String toString() {
        return lS5Rgt96tfkO(this.PxuCJdSBwIXG);
    }
}
