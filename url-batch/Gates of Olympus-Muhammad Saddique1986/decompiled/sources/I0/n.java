package I0;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f3078a;

    public static final boolean a(int i3, int i4) {
        return i3 == i4;
    }

    public static String b(int i3) {
        return a(i3, -1) ? "Unspecified" : a(i3, 0) ? "None" : a(i3, 1) ? "Characters" : a(i3, 2) ? "Words" : a(i3, 3) ? "Sentences" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f3078a == ((n) obj).f3078a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3078a);
    }

    public final String toString() {
        return b(this.f3078a);
    }
}
