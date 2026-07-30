package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class he2 {
    public static final ge2 Companion = new ge2();
    public final int PxuCJdSBwIXG;

    public static String PxuCJdSBwIXG(int i) {
        return i == 1 ? "Left" : i == 2 ? "Right" : i == 3 ? "Center" : i == 4 ? "Justify" : i == 5 ? "Start" : i == 6 ? "End" : i == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof he2) {
            return this.PxuCJdSBwIXG == ((he2) obj).PxuCJdSBwIXG;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.PxuCJdSBwIXG);
    }

    public final String toString() {
        return PxuCJdSBwIXG(this.PxuCJdSBwIXG);
    }
}
