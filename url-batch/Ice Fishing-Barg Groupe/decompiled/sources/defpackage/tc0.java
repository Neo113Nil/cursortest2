package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class tc0 {
    public static final sc0 Companion = new sc0();
    public final int PxuCJdSBwIXG;

    public final boolean equals(Object obj) {
        if (obj instanceof tc0) {
            return this.PxuCJdSBwIXG == ((tc0) obj).PxuCJdSBwIXG;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.PxuCJdSBwIXG);
    }

    public final String toString() {
        int i = this.PxuCJdSBwIXG;
        return i == 0 ? "None" : i == 1 ? "Weight" : i == 2 ? "Style" : i == 65535 ? "All" : "Invalid";
    }
}
