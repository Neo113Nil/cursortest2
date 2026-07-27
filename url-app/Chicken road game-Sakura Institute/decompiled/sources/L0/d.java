package L0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f3497a;

    public static final boolean a(int i2, int i4) {
        return i2 == i4;
    }

    public static String b(int i2) {
        return a(i2, 1) ? "Hyphens.None" : a(i2, 2) ? "Hyphens.Auto" : a(i2, Integer.MIN_VALUE) ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f3497a == ((d) obj).f3497a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3497a);
    }

    public final String toString() {
        return b(this.f3497a);
    }
}
