package G;

/* loaded from: classes.dex */
public final class J implements a1 {

    /* renamed from: a, reason: collision with root package name */
    public final C0205j0 f2710a;

    public J(C0205j0 c0205j0) {
        this.f2710a = c0205j0;
    }

    @Override // G.a1
    public final Object a(InterfaceC0213n0 interfaceC0213n0) {
        return this.f2710a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J) && this.f2710a.equals(((J) obj).f2710a);
    }

    public final int hashCode() {
        return this.f2710a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f2710a + ')';
    }
}
