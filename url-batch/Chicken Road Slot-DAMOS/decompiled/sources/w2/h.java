package w2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f10035a;

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f10035a == ((h) obj).f10035a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10035a);
    }

    public final String toString() {
        int i3 = this.f10035a;
        return i3 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i3 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i3 == 17 ? "LineHeightStyle.Trim.Both" : i3 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }
}
