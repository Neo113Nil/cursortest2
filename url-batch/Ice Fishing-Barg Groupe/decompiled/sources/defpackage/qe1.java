package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qe1 {
    public final int PxuCJdSBwIXG;
    public final Integer lS5Rgt96tfkO;

    public qe1(int i, Integer num) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe1)) {
            return false;
        }
        qe1 qe1Var = (qe1) obj;
        return this.PxuCJdSBwIXG == qe1Var.PxuCJdSBwIXG && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, qe1Var.lS5Rgt96tfkO);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.PxuCJdSBwIXG) * 31;
        Integer num = this.lS5Rgt96tfkO;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.PxuCJdSBwIXG + ", dataOffset=" + this.lS5Rgt96tfkO + ')';
    }
}
