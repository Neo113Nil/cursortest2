package q2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f6048a;

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f6048a == ((h) obj).f6048a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6048a);
    }

    public final String toString() {
        int i = this.f6048a;
        return i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }
}
