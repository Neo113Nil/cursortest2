package j2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f3993a;

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f3993a == ((j) obj).f3993a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3993a);
    }

    public final String toString() {
        int i = this.f3993a;
        return i == 0 ? "None" : i == 1 ? "Weight" : i == 2 ? "Style" : i == 65535 ? "All" : "Invalid";
    }
}
