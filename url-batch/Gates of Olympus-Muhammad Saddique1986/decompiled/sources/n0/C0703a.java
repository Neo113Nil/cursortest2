package n0;

/* renamed from: n0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0703a implements InterfaceC0717o {

    /* renamed from: b, reason: collision with root package name */
    public final int f7269b;

    public C0703a(int i3) {
        this.f7269b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0703a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        f2.j.d(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f7269b == ((C0703a) obj).f7269b;
    }

    public final int hashCode() {
        return this.f7269b;
    }

    public final String toString() {
        return A.k.j(new StringBuilder("AndroidPointerIcon(type="), this.f7269b, ')');
    }
}
