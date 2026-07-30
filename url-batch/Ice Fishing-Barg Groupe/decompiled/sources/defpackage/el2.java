package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class el2 implements dl2 {
    public final Object PxuCJdSBwIXG;
    public final Object lS5Rgt96tfkO;

    public el2(Object obj, Object obj2) {
        this.PxuCJdSBwIXG = obj;
        this.lS5Rgt96tfkO = obj2;
    }

    @Override // defpackage.dl2
    public final Object TSizfFm2Yiuu() {
        return this.lS5Rgt96tfkO;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dl2)) {
            return false;
        }
        dl2 dl2Var = (dl2) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, dl2Var.lS5Rgt96tfkO()) && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, dl2Var.TSizfFm2Yiuu());
    }

    public final int hashCode() {
        Object obj = this.PxuCJdSBwIXG;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.lS5Rgt96tfkO;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // defpackage.dl2
    public final Object lS5Rgt96tfkO() {
        return this.PxuCJdSBwIXG;
    }
}
