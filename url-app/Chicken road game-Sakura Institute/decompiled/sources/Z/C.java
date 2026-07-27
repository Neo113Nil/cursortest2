package Z;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final int f4450a;

    public static final boolean a(int i2, int i4) {
        return i2 == i4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C) {
            return this.f4450a == ((C) obj).f4450a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4450a);
    }

    public final String toString() {
        int i2 = this.f4450a;
        return a(i2, 0) ? "Argb8888" : a(i2, 1) ? "Alpha8" : a(i2, 2) ? "Rgb565" : a(i2, 3) ? "F16" : a(i2, 4) ? "Gpu" : "Unknown";
    }
}
