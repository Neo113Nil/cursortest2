package m2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f6479a;

    public static String a(int i3) {
        if (i3 == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i3 == 1) {
            return "EmojiSupportMatch.None";
        }
        if (i3 == 2) {
            return "EmojiSupportMatch.All";
        }
        return "Invalid(value=" + i3 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f6479a == ((h) obj).f6479a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6479a);
    }

    public final String toString() {
        return a(this.f6479a);
    }
}
