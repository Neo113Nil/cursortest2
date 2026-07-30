package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class gs2 {
    public final float PxuCJdSBwIXG;
    public final float lS5Rgt96tfkO;

    public gs2(float f, float f2) {
        this.PxuCJdSBwIXG = f;
        this.lS5Rgt96tfkO = f2;
    }

    public final float[] PxuCJdSBwIXG() {
        float f = this.PxuCJdSBwIXG;
        float f2 = this.lS5Rgt96tfkO;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs2)) {
            return false;
        }
        gs2 gs2Var = (gs2) obj;
        return Float.compare(this.PxuCJdSBwIXG, gs2Var.PxuCJdSBwIXG) == 0 && Float.compare(this.lS5Rgt96tfkO, gs2Var.lS5Rgt96tfkO) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.lS5Rgt96tfkO) + (Float.hashCode(this.PxuCJdSBwIXG) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.PxuCJdSBwIXG);
        sb.append(", y=");
        return o0.cpQdD2nAriOS(sb, this.lS5Rgt96tfkO, ')');
    }
}
