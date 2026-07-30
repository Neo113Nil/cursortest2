package x0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f9595a;

    public static String a(int i7) {
        return i7 == 1 ? "Next" : i7 == 2 ? "Previous" : i7 == 3 ? "Left" : i7 == 4 ? "Right" : i7 == 5 ? "Up" : i7 == 6 ? "Down" : i7 == 7 ? "Enter" : i7 == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f9595a == ((b) obj).f9595a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9595a);
    }

    public final String toString() {
        return a(this.f9595a);
    }
}
