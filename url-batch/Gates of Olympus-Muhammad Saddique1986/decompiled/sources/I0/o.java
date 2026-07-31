package I0;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f3079a;

    public static final boolean a(int i3, int i4) {
        return i3 == i4;
    }

    public static String b(int i3) {
        return a(i3, 0) ? "Unspecified" : a(i3, 1) ? "Text" : a(i3, 2) ? "Ascii" : a(i3, 3) ? "Number" : a(i3, 4) ? "Phone" : a(i3, 5) ? "Uri" : a(i3, 6) ? "Email" : a(i3, 7) ? "Password" : a(i3, 8) ? "NumberPassword" : a(i3, 9) ? "Decimal" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f3079a == ((o) obj).f3079a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3079a);
    }

    public final String toString() {
        return b(this.f3079a);
    }
}
