package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class t11 extends v11 {
    public final String PxuCJdSBwIXG;
    public final mi2 lS5Rgt96tfkO;

    public t11(String str, mi2 mi2Var) {
        this.PxuCJdSBwIXG = str;
        this.lS5Rgt96tfkO = mi2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t11)) {
            return false;
        }
        t11 t11Var = (t11) obj;
        return this.PxuCJdSBwIXG.equals(t11Var.PxuCJdSBwIXG) && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, t11Var.lS5Rgt96tfkO);
    }

    public final int hashCode() {
        int hashCode = this.PxuCJdSBwIXG.hashCode() * 31;
        mi2 mi2Var = this.lS5Rgt96tfkO;
        return (hashCode + (mi2Var != null ? mi2Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return o0.QrzZRwfaDlRX(new StringBuilder("LinkAnnotation.Clickable(tag="), this.PxuCJdSBwIXG, ')');
    }
}
