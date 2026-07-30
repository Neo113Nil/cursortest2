package a2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public static final w f461b = new w(false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f462a;

    public w() {
        this.f462a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            return this.f462a == ((w) obj).f462a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Boolean.hashCode(this.f462a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f462a + ", emojiSupportMatch=EmojiSupportMatch.Default)";
    }

    public w(boolean z8) {
        this.f462a = z8;
    }
}
