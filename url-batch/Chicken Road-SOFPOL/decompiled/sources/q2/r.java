package q2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f6067a;

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f6067a == ((r) obj).f6067a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6067a);
    }

    public final String toString() {
        int i = this.f6067a;
        return i == 1 ? "Linearity.Linear" : i == 2 ? "Linearity.FontHinting" : i == 3 ? "Linearity.None" : "Invalid";
    }
}
