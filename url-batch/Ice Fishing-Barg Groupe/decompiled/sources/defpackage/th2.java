package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class th2 {
    public static final sh2 Companion = new sh2();
    public static final th2 TSizfFm2Yiuu = new th2(1.0f, 0.0f);
    public final float PxuCJdSBwIXG;
    public final float lS5Rgt96tfkO;

    public th2(float f, float f2) {
        this.PxuCJdSBwIXG = f;
        this.lS5Rgt96tfkO = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th2)) {
            return false;
        }
        th2 th2Var = (th2) obj;
        return this.PxuCJdSBwIXG == th2Var.PxuCJdSBwIXG && this.lS5Rgt96tfkO == th2Var.lS5Rgt96tfkO;
    }

    public final int hashCode() {
        return Float.hashCode(this.lS5Rgt96tfkO) + (Float.hashCode(this.PxuCJdSBwIXG) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.PxuCJdSBwIXG);
        sb.append(", skewX=");
        return o0.cpQdD2nAriOS(sb, this.lS5Rgt96tfkO, ')');
    }
}
