package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ft0 {
    public final Integer PxuCJdSBwIXG;
    public final Object lS5Rgt96tfkO;

    public ft0(Integer num, Object obj) {
        this.PxuCJdSBwIXG = num;
        this.lS5Rgt96tfkO = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ft0)) {
            return false;
        }
        ft0 ft0Var = (ft0) obj;
        return this.PxuCJdSBwIXG.equals(ft0Var.PxuCJdSBwIXG) && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, ft0Var.lS5Rgt96tfkO);
    }

    public final int hashCode() {
        int hashCode = this.PxuCJdSBwIXG.hashCode() * 31;
        Object obj = this.lS5Rgt96tfkO;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + hashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.PxuCJdSBwIXG + ", right=" + this.lS5Rgt96tfkO + ')';
    }
}
