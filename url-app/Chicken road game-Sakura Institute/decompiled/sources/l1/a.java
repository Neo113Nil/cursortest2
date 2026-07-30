package l1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a implements r {

    /* renamed from: b, reason: collision with root package name */
    public final int f5771b;

    public a(int i7) {
        this.f5771b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        r6.k.d(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f5771b == ((a) obj).f5771b;
    }

    public final int hashCode() {
        return this.f5771b;
    }

    public final String toString() {
        return a0.m.l(new StringBuilder("AndroidPointerIcon(type="), this.f5771b, ')');
    }
}
