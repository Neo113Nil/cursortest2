package i1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f4589a;

    public static String a(int i3) {
        return i3 == 1 ? "Next" : i3 == 2 ? "Previous" : i3 == 3 ? "Left" : i3 == 4 ? "Right" : i3 == 5 ? "Up" : i3 == 6 ? "Down" : i3 == 7 ? "Enter" : i3 == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f4589a == ((c) obj).f4589a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4589a);
    }

    public final String toString() {
        return a(this.f4589a);
    }
}
