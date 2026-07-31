package m;

/* loaded from: classes.dex */
public final class X implements InterfaceC0627l {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0640z f6698a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6699b;

    public X(InterfaceC0640z interfaceC0640z, long j3) {
        this.f6698a = interfaceC0640z;
        this.f6699b = j3;
    }

    @Override // m.InterfaceC0627l
    public final w0 a(u0 u0Var) {
        return new Y(this.f6698a.a(u0Var), this.f6699b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof X)) {
            return false;
        }
        X x3 = (X) obj;
        return x3.f6699b == this.f6699b && f2.j.a(x3.f6698a, this.f6698a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f6699b) + (this.f6698a.hashCode() * 31);
    }
}
