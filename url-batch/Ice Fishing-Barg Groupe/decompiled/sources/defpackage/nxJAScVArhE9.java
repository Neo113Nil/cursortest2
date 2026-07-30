package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class nxJAScVArhE9 {
    public final String PxuCJdSBwIXG;
    public final xe0 lS5Rgt96tfkO;

    public nxJAScVArhE9(String str, xe0 xe0Var) {
        this.PxuCJdSBwIXG = str;
        this.lS5Rgt96tfkO = xe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxJAScVArhE9)) {
            return false;
        }
        nxJAScVArhE9 nxjascvarhe9 = (nxJAScVArhE9) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, nxjascvarhe9.PxuCJdSBwIXG) && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, nxjascvarhe9.lS5Rgt96tfkO);
    }

    public final int hashCode() {
        String str = this.PxuCJdSBwIXG;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        xe0 xe0Var = this.lS5Rgt96tfkO;
        return hashCode + (xe0Var != null ? xe0Var.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.PxuCJdSBwIXG + ", action=" + this.lS5Rgt96tfkO + ')';
    }
}
