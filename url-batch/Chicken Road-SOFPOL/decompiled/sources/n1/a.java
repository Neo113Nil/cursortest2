package n1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f5303a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f5303a == ((a) obj).f5303a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5303a);
    }

    public final String toString() {
        int i = this.f5303a;
        return i == 1 ? "Touch" : i == 2 ? "Keyboard" : "Error";
    }
}
