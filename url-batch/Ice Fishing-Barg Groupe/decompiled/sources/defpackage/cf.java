package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class cf {
    public final hy PxuCJdSBwIXG;
    public final long lS5Rgt96tfkO;

    public cf(hb2 hb2Var, long j) {
        this.PxuCJdSBwIXG = hb2Var;
        this.lS5Rgt96tfkO = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf)) {
            return false;
        }
        cf cfVar = (cf) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, cfVar.PxuCJdSBwIXG) && rr.lS5Rgt96tfkO(this.lS5Rgt96tfkO, cfVar.lS5Rgt96tfkO);
    }

    public final int hashCode() {
        return Long.hashCode(this.lS5Rgt96tfkO) + (this.PxuCJdSBwIXG.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.PxuCJdSBwIXG + ", constraints=" + ((Object) rr.dgRBjINgWbAK(this.lS5Rgt96tfkO)) + ')';
    }
}
