package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class i50 {
    public static final h50 Companion = new h50();
    public final int PxuCJdSBwIXG;

    public static String PxuCJdSBwIXG(int i) {
        if (i == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i == 1) {
            return "EmojiSupportMatch.None";
        }
        if (i == 2) {
            return "EmojiSupportMatch.All";
        }
        return "Invalid(value=" + i + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i50) {
            return this.PxuCJdSBwIXG == ((i50) obj).PxuCJdSBwIXG;
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
