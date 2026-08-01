package x1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f10315a;

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f10315a == ((r) obj).f10315a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10315a);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f10315a + ')';
    }
}
