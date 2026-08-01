package w2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f10043a;

    public static String a(int i3) {
        return i3 == 1 ? "Left" : i3 == 2 ? "Right" : i3 == 3 ? "Center" : i3 == 4 ? "Justify" : i3 == 5 ? "Start" : i3 == 6 ? "End" : i3 == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f10043a == ((k) obj).f10043a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10043a);
    }

    public final String toString() {
        return a(this.f10043a);
    }
}
