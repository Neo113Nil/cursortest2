package m;

/* loaded from: classes.dex */
public final class x0 implements InterfaceC0615z {

    /* renamed from: a, reason: collision with root package name */
    public final int f5877a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5878b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0613x f5879c;

    public x0(int i3, int i4, InterfaceC0613x interfaceC0613x) {
        this.f5877a = i3;
        this.f5878b = i4;
        this.f5879c = interfaceC0613x;
    }

    @Override // m.InterfaceC0602l
    public final A0 a(y0 y0Var) {
        return new H2.z(this.f5877a, this.f5878b, this.f5879c);
    }

    @Override // m.InterfaceC0615z
    public final B0 e() {
        y0 y0Var = z0.f5885a;
        return new H2.z(this.f5877a, this.f5878b, this.f5879c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return x0Var.f5877a == this.f5877a && x0Var.f5878b == this.f5878b && Z1.i.a(x0Var.f5879c, this.f5879c);
    }

    public final int hashCode() {
        return ((this.f5879c.hashCode() + (this.f5877a * 31)) * 31) + this.f5878b;
    }
}
