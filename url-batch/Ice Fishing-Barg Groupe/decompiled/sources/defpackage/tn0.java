package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class tn0 {
    public final int PxuCJdSBwIXG;
    public final Object lS5Rgt96tfkO;

    public tn0(int i, Object obj) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn0)) {
            return false;
        }
        tn0 tn0Var = (tn0) obj;
        return this.PxuCJdSBwIXG == tn0Var.PxuCJdSBwIXG && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, tn0Var.lS5Rgt96tfkO);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.PxuCJdSBwIXG) * 31;
        Object obj = this.lS5Rgt96tfkO;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.PxuCJdSBwIXG + ", value=" + this.lS5Rgt96tfkO + ')';
    }
}
