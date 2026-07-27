package A0;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public static final w f387b = new w(false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f388a;

    public w() {
        this.f388a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            return this.f388a == ((w) obj).f388a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Boolean.hashCode(this.f388a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f388a + ", emojiSupportMatch=EmojiSupportMatch.Default)";
    }

    public w(boolean z4) {
        this.f388a = z4;
    }
}
