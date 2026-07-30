package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class o11 {
    public static final n11 Companion = new n11();
    public final int PxuCJdSBwIXG;

    public final boolean equals(Object obj) {
        if (obj instanceof o11) {
            return this.PxuCJdSBwIXG == ((o11) obj).PxuCJdSBwIXG;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.PxuCJdSBwIXG);
    }

    public final String toString() {
        int i = this.PxuCJdSBwIXG;
        return i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }
}
