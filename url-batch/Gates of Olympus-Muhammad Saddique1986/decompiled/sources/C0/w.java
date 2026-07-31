package C0;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public static final w f655b = new w(false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f656a;

    public w() {
        this.f656a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            return this.f656a == ((w) obj).f656a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Boolean.hashCode(this.f656a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f656a + ", emojiSupportMatch=EmojiSupportMatch.Default)";
    }

    public w(boolean z3) {
        this.f656a = z3;
    }
}
