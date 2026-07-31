package I;

/* loaded from: classes.dex */
public final class Z0 implements a1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2230a;

    public Z0(Object obj) {
        this.f2230a = obj;
    }

    @Override // I.a1
    public final Object a(InterfaceC0110n0 interfaceC0110n0) {
        return this.f2230a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Z0) && Z1.i.a(this.f2230a, ((Z0) obj).f2230a);
    }

    public final int hashCode() {
        Object obj = this.f2230a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f2230a + ')';
    }
}
