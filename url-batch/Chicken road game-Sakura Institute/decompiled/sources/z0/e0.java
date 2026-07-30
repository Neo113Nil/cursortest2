package z0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f9989a;

    public final boolean equals(Object obj) {
        if (obj instanceof e0) {
            return this.f9989a == ((e0) obj).f9989a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9989a);
    }

    public final String toString() {
        int i7 = this.f9989a;
        return i7 == 0 ? "Argb8888" : i7 == 1 ? "Alpha8" : i7 == 2 ? "Rgb565" : i7 == 3 ? "F16" : i7 == 4 ? "Gpu" : "Unknown";
    }
}
