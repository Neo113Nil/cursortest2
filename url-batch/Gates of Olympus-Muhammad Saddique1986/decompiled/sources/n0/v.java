package n0;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f7335a;

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return this.f7335a == ((v) obj).f7335a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7335a);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f7335a + ')';
    }
}
