package q2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f6041a;

    public static String a(int i) {
        return i == 1 ? "Hyphens.None" : i == 2 ? "Hyphens.Auto" : i == Integer.MIN_VALUE ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f6041a == ((d) obj).f6041a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6041a);
    }

    public final String toString() {
        return a(this.f6041a);
    }
}
