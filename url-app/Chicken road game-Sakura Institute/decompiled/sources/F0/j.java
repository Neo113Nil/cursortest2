package F0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f2612a;

    public static final boolean a(int i2, int i4) {
        return i2 == i4;
    }

    public static String b(int i2) {
        return a(i2, 0) ? "None" : a(i2, 1) ? "All" : a(i2, 2) ? "Weight" : a(i2, 3) ? "Style" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f2612a == ((j) obj).f2612a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2612a);
    }

    public final String toString() {
        return b(this.f2612a);
    }
}
