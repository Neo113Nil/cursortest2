package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class le {
    public final m82 PxuCJdSBwIXG;

    public le(m82 m82Var) {
        this.PxuCJdSBwIXG = m82Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof le) {
            return k10.lS5Rgt96tfkO(1.0f, 1.0f) && this.PxuCJdSBwIXG.equals(((le) obj).PxuCJdSBwIXG);
        }
        return false;
    }

    public final int hashCode() {
        return this.PxuCJdSBwIXG.hashCode() + (Float.hashCode(1.0f) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) k10.TSizfFm2Yiuu(1.0f)) + ", brush=" + this.PxuCJdSBwIXG + ')';
    }
}
