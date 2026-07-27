package G0;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f3066a;

    public static final boolean a(int i2, int i4) {
        return i2 == i4;
    }

    public static String b(int i2) {
        return a(i2, -1) ? "Unspecified" : a(i2, 0) ? "None" : a(i2, 1) ? "Default" : a(i2, 2) ? "Go" : a(i2, 3) ? "Search" : a(i2, 4) ? "Send" : a(i2, 5) ? "Previous" : a(i2, 6) ? "Next" : a(i2, 7) ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f3066a == ((l) obj).f3066a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3066a);
    }

    public final String toString() {
        return b(this.f3066a);
    }
}
