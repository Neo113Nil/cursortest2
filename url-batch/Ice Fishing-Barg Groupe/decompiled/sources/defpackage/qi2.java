package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qi2 {
    public static final ni2 Companion = new ni2();
    public static final qi2 TSizfFm2Yiuu;
    public static final qi2 Y1f8riQaR6yg;
    public final int PxuCJdSBwIXG;
    public final boolean lS5Rgt96tfkO;

    static {
        pi2.Companion.getClass();
        TSizfFm2Yiuu = new qi2(2, false);
        Y1f8riQaR6yg = new qi2(1, true);
    }

    public qi2(int i, boolean z) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi2)) {
            return false;
        }
        qi2 qi2Var = (qi2) obj;
        return this.PxuCJdSBwIXG == qi2Var.PxuCJdSBwIXG && this.lS5Rgt96tfkO == qi2Var.lS5Rgt96tfkO;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.lS5Rgt96tfkO) + (Integer.hashCode(this.PxuCJdSBwIXG) * 31);
    }

    public final String toString() {
        return equals(TSizfFm2Yiuu) ? "TextMotion.Static" : equals(Y1f8riQaR6yg) ? "TextMotion.Animated" : "Invalid";
    }
}
