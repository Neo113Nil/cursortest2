package b0;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final int f5349a;

    public static final boolean a(int i3, int i4) {
        return i3 == i4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof F) {
            return this.f5349a == ((F) obj).f5349a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5349a);
    }

    public final String toString() {
        int i3 = this.f5349a;
        return a(i3, 0) ? "Argb8888" : a(i3, 1) ? "Alpha8" : a(i3, 2) ? "Rgb565" : a(i3, 3) ? "F16" : a(i3, 4) ? "Gpu" : "Unknown";
    }
}
