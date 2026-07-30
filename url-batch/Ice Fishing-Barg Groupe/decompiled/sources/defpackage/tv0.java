package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class tv0 extends uv0 {
    public final boolean PxuCJdSBwIXG;
    public final String lS5Rgt96tfkO;

    public tv0(String str, boolean z) {
        str.getClass();
        this.PxuCJdSBwIXG = z;
        this.lS5Rgt96tfkO = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv0)) {
            return false;
        }
        tv0 tv0Var = (tv0) obj;
        return this.PxuCJdSBwIXG == tv0Var.PxuCJdSBwIXG && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, tv0Var.lS5Rgt96tfkO);
    }

    public final int hashCode() {
        return this.lS5Rgt96tfkO.hashCode() + (Boolean.hashCode(this.PxuCJdSBwIXG) * 31);
    }

    public final String toString() {
        return "Settled(openTab=" + this.PxuCJdSBwIXG + ", tabUrl=" + this.lS5Rgt96tfkO + ")";
    }
}
