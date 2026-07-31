package I0;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f3070a;

    public static final boolean a(int i3, int i4) {
        return i3 == i4;
    }

    public static String b(int i3) {
        return a(i3, -1) ? "Unspecified" : a(i3, 0) ? "None" : a(i3, 1) ? "Default" : a(i3, 2) ? "Go" : a(i3, 3) ? "Search" : a(i3, 4) ? "Send" : a(i3, 5) ? "Previous" : a(i3, 6) ? "Next" : a(i3, 7) ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f3070a == ((l) obj).f3070a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3070a);
    }

    public final String toString() {
        return b(this.f3070a);
    }
}
