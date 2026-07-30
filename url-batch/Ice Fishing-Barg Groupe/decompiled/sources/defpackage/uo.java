package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class uo {
    public final int PxuCJdSBwIXG;
    public final Integer lS5Rgt96tfkO;

    public uo(int i, jh0 jh0Var, Integer num) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo)) {
            return false;
        }
        uo uoVar = (uo) obj;
        return this.PxuCJdSBwIXG == uoVar.PxuCJdSBwIXG && cs0.wdg6QnbFHrFF(null, null) && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, uoVar.lS5Rgt96tfkO);
    }

    public final int hashCode() {
        int hashCode = ((Integer.hashCode(this.PxuCJdSBwIXG) * 31) + 0) * 31;
        Integer num = this.lS5Rgt96tfkO;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.PxuCJdSBwIXG + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.lS5Rgt96tfkO + ')';
    }
}
