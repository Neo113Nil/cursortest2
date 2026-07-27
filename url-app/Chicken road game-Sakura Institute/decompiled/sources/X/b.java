package X;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f4312a;

    public static final boolean a(int i2, int i4) {
        return i2 == i4;
    }

    public static String b(int i2) {
        return a(i2, 1) ? "Next" : a(i2, 2) ? "Previous" : a(i2, 3) ? "Left" : a(i2, 4) ? "Right" : a(i2, 5) ? "Up" : a(i2, 6) ? "Down" : a(i2, 7) ? "Enter" : a(i2, 8) ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f4312a == ((b) obj).f4312a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4312a);
    }

    public final String toString() {
        return b(this.f4312a);
    }
}
