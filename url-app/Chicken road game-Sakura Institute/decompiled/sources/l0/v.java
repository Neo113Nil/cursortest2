package l0;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f7950a;

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return this.f7950a == ((v) obj).f7950a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7950a);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f7950a + ')';
    }
}
