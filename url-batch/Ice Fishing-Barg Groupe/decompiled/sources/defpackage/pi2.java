package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class pi2 {
    public static final oi2 Companion = new oi2();
    public final int PxuCJdSBwIXG;

    public final boolean equals(Object obj) {
        if (obj instanceof pi2) {
            return this.PxuCJdSBwIXG == ((pi2) obj).PxuCJdSBwIXG;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.PxuCJdSBwIXG);
    }

    public final String toString() {
        int i = this.PxuCJdSBwIXG;
        return i == 1 ? "Linearity.Linear" : i == 2 ? "Linearity.FontHinting" : i == 3 ? "Linearity.None" : "Invalid";
    }
}
