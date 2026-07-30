package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class m70 {
    public final km2 PxuCJdSBwIXG;

    public m70(km2 km2Var) {
        this.PxuCJdSBwIXG = km2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m70) {
            return Float.compare(0.0f, 0.0f) == 0 && this.PxuCJdSBwIXG.equals(((m70) obj).PxuCJdSBwIXG);
        }
        return false;
    }

    public final int hashCode() {
        return this.PxuCJdSBwIXG.hashCode() + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.PxuCJdSBwIXG + ')';
    }
}
