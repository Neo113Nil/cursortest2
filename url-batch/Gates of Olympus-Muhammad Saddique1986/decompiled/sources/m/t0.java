package m;

/* loaded from: classes.dex */
public final class t0 implements InterfaceC0640z {

    /* renamed from: a, reason: collision with root package name */
    public final int f6880a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6881b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0638x f6882c;

    public t0(int i3, int i4, InterfaceC0638x interfaceC0638x) {
        this.f6880a = i3;
        this.f6881b = i4;
        this.f6882c = interfaceC0638x;
    }

    @Override // m.InterfaceC0627l
    public final w0 a(u0 u0Var) {
        return new N2.z(this.f6880a, this.f6881b, this.f6882c);
    }

    @Override // m.InterfaceC0640z
    public final x0 e() {
        u0 u0Var = v0.f6899a;
        return new N2.z(this.f6880a, this.f6881b, this.f6882c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return t0Var.f6880a == this.f6880a && t0Var.f6881b == this.f6881b && f2.j.a(t0Var.f6882c, this.f6882c);
    }

    public final int hashCode() {
        return ((this.f6882c.hashCode() + (this.f6880a * 31)) * 31) + this.f6881b;
    }
}
