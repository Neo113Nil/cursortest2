package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class uc {
    public static final tc Companion = new tc();
    public final float PxuCJdSBwIXG;

    public final boolean equals(Object obj) {
        if (obj instanceof uc) {
            return Float.compare(this.PxuCJdSBwIXG, ((uc) obj).PxuCJdSBwIXG) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.PxuCJdSBwIXG);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.PxuCJdSBwIXG + ')';
    }
}
