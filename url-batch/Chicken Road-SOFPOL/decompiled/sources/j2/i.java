package j2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f3992a;

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f3992a == ((i) obj).f3992a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3992a);
    }

    public final String toString() {
        int i = this.f3992a;
        return i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid";
    }
}
