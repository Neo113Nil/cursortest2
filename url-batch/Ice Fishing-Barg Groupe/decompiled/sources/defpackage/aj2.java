package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class aj2 {
    public final String PxuCJdSBwIXG;
    public boolean TSizfFm2Yiuu = false;
    public aj1 Y1f8riQaR6yg = null;
    public String lS5Rgt96tfkO;

    public aj2(String str, String str2) {
        this.PxuCJdSBwIXG = str;
        this.lS5Rgt96tfkO = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj2)) {
            return false;
        }
        aj2 aj2Var = (aj2) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, aj2Var.PxuCJdSBwIXG) && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, aj2Var.lS5Rgt96tfkO) && this.TSizfFm2Yiuu == aj2Var.TSizfFm2Yiuu && cs0.wdg6QnbFHrFF(this.Y1f8riQaR6yg, aj2Var.Y1f8riQaR6yg);
    }

    public final int hashCode() {
        int Y1f8riQaR6yg = o0.Y1f8riQaR6yg((this.lS5Rgt96tfkO.hashCode() + (this.PxuCJdSBwIXG.hashCode() * 31)) * 31, 31, this.TSizfFm2Yiuu);
        aj1 aj1Var = this.Y1f8riQaR6yg;
        return Y1f8riQaR6yg + (aj1Var == null ? 0 : aj1Var.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.Y1f8riQaR6yg + ", isShowingSubstitution=" + this.TSizfFm2Yiuu + ')';
    }
}
