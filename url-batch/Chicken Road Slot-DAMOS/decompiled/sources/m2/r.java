package m2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6511a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6512b;

    public r() {
        this.f6511a = false;
        this.f6512b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f6511a == rVar.f6511a && this.f6512b == rVar.f6512b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6512b) + (Boolean.hashCode(this.f6511a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f6511a + ", emojiSupportMatch=" + ((Object) h.a(this.f6512b)) + ')';
    }

    public r(int i3, boolean z10) {
        this.f6511a = z10;
        this.f6512b = i3;
    }
}
