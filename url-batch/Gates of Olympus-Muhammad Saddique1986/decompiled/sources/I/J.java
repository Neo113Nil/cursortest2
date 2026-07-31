package I;

/* loaded from: classes.dex */
public final class J implements Z0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0156j0 f2712a;

    public J(C0156j0 c0156j0) {
        this.f2712a = c0156j0;
    }

    @Override // I.Z0
    public final Object a(InterfaceC0164n0 interfaceC0164n0) {
        return this.f2712a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J) && this.f2712a.equals(((J) obj).f2712a);
    }

    public final int hashCode() {
        return this.f2712a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f2712a + ')';
    }
}
