package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class py {
    public static final oy Companion = new oy();
    public final long PxuCJdSBwIXG;
    public final long lS5Rgt96tfkO;

    static {
        ir0.Companion.getClass();
        p10.Companion.getClass();
    }

    public py(long j, long j2) {
        this.PxuCJdSBwIXG = j;
        this.lS5Rgt96tfkO = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof py) {
            py pyVar = (py) obj;
            return ir0.PxuCJdSBwIXG(this.PxuCJdSBwIXG, pyVar.PxuCJdSBwIXG) && this.lS5Rgt96tfkO == pyVar.lS5Rgt96tfkO;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.lS5Rgt96tfkO) + (Long.hashCode(this.PxuCJdSBwIXG) * 31);
    }
}
