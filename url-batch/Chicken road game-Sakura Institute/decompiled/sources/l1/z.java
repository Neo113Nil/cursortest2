package l1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final int f5859a;

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            return this.f5859a == ((z) obj).f5859a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5859a);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f5859a + ')';
    }
}
