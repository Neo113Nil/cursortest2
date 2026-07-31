package f1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final int f2710a;

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            return this.f2710a == ((z) obj).f2710a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2710a);
    }

    public final String toString() {
        int i = this.f2710a;
        return i == 0 ? "Argb8888" : i == 1 ? "Alpha8" : i == 2 ? "Rgb565" : i == 3 ? "F16" : i == 4 ? "Gpu" : "Unknown";
    }
}
