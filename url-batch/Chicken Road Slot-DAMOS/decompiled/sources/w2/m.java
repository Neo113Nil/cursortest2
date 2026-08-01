package w2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f10047a;

    public static String a(int i3) {
        return i3 == 1 ? "Ltr" : i3 == 2 ? "Rtl" : i3 == 3 ? "Content" : i3 == 4 ? "ContentOrLtr" : i3 == 5 ? "ContentOrRtl" : i3 == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f10047a == ((m) obj).f10047a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10047a);
    }

    public final String toString() {
        return a(this.f10047a);
    }
}
