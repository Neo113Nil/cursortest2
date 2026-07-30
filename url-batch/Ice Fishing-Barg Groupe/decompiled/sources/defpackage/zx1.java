package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class zx1 {
    public float PxuCJdSBwIXG;
    public boolean lS5Rgt96tfkO;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx1)) {
            return false;
        }
        zx1 zx1Var = (zx1) obj;
        return Float.compare(this.PxuCJdSBwIXG, zx1Var.PxuCJdSBwIXG) == 0 && this.lS5Rgt96tfkO == zx1Var.lS5Rgt96tfkO;
    }

    public final int hashCode() {
        return o0.Y1f8riQaR6yg(Float.hashCode(this.PxuCJdSBwIXG) * 31, 961, this.lS5Rgt96tfkO);
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.PxuCJdSBwIXG + ", fill=" + this.lS5Rgt96tfkO + ", crossAxisAlignment=null, flowLayoutData=null)";
    }
}
