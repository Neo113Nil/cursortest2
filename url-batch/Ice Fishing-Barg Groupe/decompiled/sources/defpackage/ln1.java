package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ln1 {
    public final gn1 PxuCJdSBwIXG;
    public final xm1 lS5Rgt96tfkO;

    public ln1() {
        this(null, new xm1());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln1)) {
            return false;
        }
        ln1 ln1Var = (ln1) obj;
        return cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, ln1Var.lS5Rgt96tfkO) && cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, ln1Var.PxuCJdSBwIXG);
    }

    public final int hashCode() {
        gn1 gn1Var = this.PxuCJdSBwIXG;
        int hashCode = (gn1Var != null ? gn1Var.hashCode() : 0) * 31;
        xm1 xm1Var = this.lS5Rgt96tfkO;
        return hashCode + (xm1Var != null ? xm1Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.PxuCJdSBwIXG + ", paragraphSyle=" + this.lS5Rgt96tfkO + ')';
    }

    public ln1(gn1 gn1Var, xm1 xm1Var) {
        this.PxuCJdSBwIXG = gn1Var;
        this.lS5Rgt96tfkO = xm1Var;
    }
}
