package w2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f10034a;

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f10034a == ((g) obj).f10034a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10034a);
    }

    public final String toString() {
        int i3 = this.f10034a;
        return i3 == 0 ? "LineHeightStyle.Mode.Fixed" : i3 == 1 ? "LineHeightStyle.Mode.Minimum" : i3 == 2 ? "LineHeightStyle.Mode.Tight" : "Invalid";
    }
}
