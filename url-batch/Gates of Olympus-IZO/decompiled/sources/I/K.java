package I;

/* loaded from: classes.dex */
public final class K implements a1 {

    /* renamed from: a, reason: collision with root package name */
    public final C0102j0 f2157a;

    public K(C0102j0 c0102j0) {
        this.f2157a = c0102j0;
    }

    @Override // I.a1
    public final Object a(InterfaceC0110n0 interfaceC0110n0) {
        return this.f2157a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof K) && this.f2157a.equals(((K) obj).f2157a);
    }

    public final int hashCode() {
        return this.f2157a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f2157a + ')';
    }
}
