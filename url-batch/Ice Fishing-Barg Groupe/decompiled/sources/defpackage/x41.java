package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class x41 {
    public final String PxuCJdSBwIXG;
    public final br0 lS5Rgt96tfkO;

    public x41(String str, br0 br0Var) {
        this.PxuCJdSBwIXG = str;
        this.lS5Rgt96tfkO = br0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x41)) {
            return false;
        }
        x41 x41Var = (x41) obj;
        return this.PxuCJdSBwIXG.equals(x41Var.PxuCJdSBwIXG) && this.lS5Rgt96tfkO.equals(x41Var.lS5Rgt96tfkO);
    }

    public final int hashCode() {
        return this.lS5Rgt96tfkO.hashCode() + (this.PxuCJdSBwIXG.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.PxuCJdSBwIXG + ", range=" + this.lS5Rgt96tfkO + ')';
    }
}
