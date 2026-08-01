package w2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f10027a;

    public static String a(int i3) {
        return i3 == 1 ? "Hyphens.None" : i3 == 2 ? "Hyphens.Auto" : i3 == 0 ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f10027a == ((d) obj).f10027a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10027a);
    }

    public final String toString() {
        return a(this.f10027a);
    }
}
