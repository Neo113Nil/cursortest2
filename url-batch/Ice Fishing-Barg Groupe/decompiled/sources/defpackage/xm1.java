package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xm1 {
    public static final wm1 Companion = new wm1();
    public static final xm1 TSizfFm2Yiuu;
    public final boolean PxuCJdSBwIXG;
    public final int lS5Rgt96tfkO;

    static {
        i50.Companion.getClass();
        TSizfFm2Yiuu = new xm1(0, false);
    }

    public xm1() {
        this.PxuCJdSBwIXG = false;
        i50.Companion.getClass();
        this.lS5Rgt96tfkO = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm1)) {
            return false;
        }
        xm1 xm1Var = (xm1) obj;
        return this.PxuCJdSBwIXG == xm1Var.PxuCJdSBwIXG && this.lS5Rgt96tfkO == xm1Var.lS5Rgt96tfkO;
    }

    public final int hashCode() {
        return Integer.hashCode(this.lS5Rgt96tfkO) + (Boolean.hashCode(this.PxuCJdSBwIXG) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.PxuCJdSBwIXG + ", emojiSupportMatch=" + ((Object) i50.PxuCJdSBwIXG(this.lS5Rgt96tfkO)) + ')';
    }

    public xm1(int i, boolean z) {
        this.PxuCJdSBwIXG = z;
        this.lS5Rgt96tfkO = i;
    }
}
