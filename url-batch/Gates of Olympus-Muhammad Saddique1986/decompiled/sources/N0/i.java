package N0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f3547a;

    public static final boolean a(int i3, int i4) {
        return i3 == i4;
    }

    public static String b(int i3) {
        return a(i3, 1) ? "Left" : a(i3, 2) ? "Right" : a(i3, 3) ? "Center" : a(i3, 4) ? "Justify" : a(i3, 5) ? "Start" : a(i3, 6) ? "End" : a(i3, Integer.MIN_VALUE) ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f3547a == ((i) obj).f3547a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3547a);
    }

    public final String toString() {
        return b(this.f3547a);
    }
}
