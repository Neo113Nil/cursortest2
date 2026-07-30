package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class o3 {
    public final float PxuCJdSBwIXG;
    public final float lS5Rgt96tfkO;

    public o3(float f, float f2) {
        this.PxuCJdSBwIXG = f;
        this.lS5Rgt96tfkO = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj;
        return Float.compare(this.PxuCJdSBwIXG, o3Var.PxuCJdSBwIXG) == 0 && Float.compare(this.lS5Rgt96tfkO, o3Var.lS5Rgt96tfkO) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.lS5Rgt96tfkO) + (Float.hashCode(this.PxuCJdSBwIXG) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.PxuCJdSBwIXG);
        sb.append(", velocityCoefficient=");
        return o0.cpQdD2nAriOS(sb, this.lS5Rgt96tfkO, ')');
    }
}
