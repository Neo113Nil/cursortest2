package g2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f4040a;

    public static String a(int i7) {
        return i7 == -1 ? "Unspecified" : i7 == 0 ? "None" : i7 == 1 ? "Default" : i7 == 2 ? "Go" : i7 == 3 ? "Search" : i7 == 4 ? "Send" : i7 == 5 ? "Previous" : i7 == 6 ? "Next" : i7 == 7 ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f4040a == ((l) obj).f4040a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4040a);
    }

    public final String toString() {
        return a(this.f4040a);
    }
}
