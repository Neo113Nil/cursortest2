package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class yk2 {
    public final v8 PxuCJdSBwIXG;
    public final df1 lS5Rgt96tfkO;

    public yk2(v8 v8Var, df1 df1Var) {
        this.PxuCJdSBwIXG = v8Var;
        this.lS5Rgt96tfkO = df1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk2)) {
            return false;
        }
        yk2 yk2Var = (yk2) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, yk2Var.PxuCJdSBwIXG) && this.lS5Rgt96tfkO.equals(yk2Var.lS5Rgt96tfkO);
    }

    public final int hashCode() {
        return this.lS5Rgt96tfkO.hashCode() + (this.PxuCJdSBwIXG.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.PxuCJdSBwIXG) + ", offsetMapping=" + this.lS5Rgt96tfkO + ')';
    }
}
