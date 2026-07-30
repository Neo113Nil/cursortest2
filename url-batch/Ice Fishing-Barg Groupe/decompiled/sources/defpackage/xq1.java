package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xq1 {
    public static final wq1 Companion = new wq1();
    public static final xq1 TSizfFm2Yiuu = new xq1(0.0f, new tk(0.0f, 0.0f));
    public final float PxuCJdSBwIXG;
    public final tk lS5Rgt96tfkO;

    public xq1(float f, tk tkVar) {
        this.PxuCJdSBwIXG = f;
        this.lS5Rgt96tfkO = tkVar;
        if (Float.isNaN(f)) {
            u9.XL4ISE6Oc65B("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq1)) {
            return false;
        }
        xq1 xq1Var = (xq1) obj;
        return this.PxuCJdSBwIXG == xq1Var.PxuCJdSBwIXG && this.lS5Rgt96tfkO.equals(xq1Var.lS5Rgt96tfkO);
    }

    public final int hashCode() {
        return (this.lS5Rgt96tfkO.hashCode() + (Float.hashCode(this.PxuCJdSBwIXG) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.PxuCJdSBwIXG + ", range=" + this.lS5Rgt96tfkO + ", steps=0)";
    }
}
