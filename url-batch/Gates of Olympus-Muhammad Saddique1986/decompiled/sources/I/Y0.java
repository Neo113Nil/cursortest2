package I;

/* loaded from: classes.dex */
public final class Y0 implements Z0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2787a;

    public Y0(Object obj) {
        this.f2787a = obj;
    }

    @Override // I.Z0
    public final Object a(InterfaceC0164n0 interfaceC0164n0) {
        return this.f2787a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Y0) && f2.j.a(this.f2787a, ((Y0) obj).f2787a);
    }

    public final int hashCode() {
        Object obj = this.f2787a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f2787a + ')';
    }
}
