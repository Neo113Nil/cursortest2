package N0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f3535a;

    public static final boolean a(int i3, int i4) {
        return i3 == i4;
    }

    public static String b(int i3) {
        return a(i3, 1) ? "Hyphens.None" : a(i3, 2) ? "Hyphens.Auto" : a(i3, Integer.MIN_VALUE) ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f3535a == ((d) obj).f3535a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3535a);
    }

    public final String toString() {
        return b(this.f3535a);
    }
}
