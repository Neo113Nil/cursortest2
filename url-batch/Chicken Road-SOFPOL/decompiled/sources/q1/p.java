package q1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f6021a;

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f6021a == ((p) obj).f6021a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6021a);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f6021a + ')';
    }
}
