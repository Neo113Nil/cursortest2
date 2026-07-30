package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class mi2 {
    public final q82 PxuCJdSBwIXG;
    public final q82 TSizfFm2Yiuu;
    public final q82 Y1f8riQaR6yg;
    public final q82 lS5Rgt96tfkO;

    public mi2(q82 q82Var, q82 q82Var2, q82 q82Var3, q82 q82Var4) {
        this.PxuCJdSBwIXG = q82Var;
        this.lS5Rgt96tfkO = q82Var2;
        this.TSizfFm2Yiuu = q82Var3;
        this.Y1f8riQaR6yg = q82Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof mi2)) {
            return false;
        }
        mi2 mi2Var = (mi2) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, mi2Var.PxuCJdSBwIXG) && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, mi2Var.lS5Rgt96tfkO) && cs0.wdg6QnbFHrFF(this.TSizfFm2Yiuu, mi2Var.TSizfFm2Yiuu) && cs0.wdg6QnbFHrFF(this.Y1f8riQaR6yg, mi2Var.Y1f8riQaR6yg);
    }

    public final int hashCode() {
        q82 q82Var = this.PxuCJdSBwIXG;
        int hashCode = (q82Var != null ? q82Var.hashCode() : 0) * 31;
        q82 q82Var2 = this.lS5Rgt96tfkO;
        int hashCode2 = (hashCode + (q82Var2 != null ? q82Var2.hashCode() : 0)) * 31;
        q82 q82Var3 = this.TSizfFm2Yiuu;
        int hashCode3 = (hashCode2 + (q82Var3 != null ? q82Var3.hashCode() : 0)) * 31;
        q82 q82Var4 = this.Y1f8riQaR6yg;
        return hashCode3 + (q82Var4 != null ? q82Var4.hashCode() : 0);
    }
}
