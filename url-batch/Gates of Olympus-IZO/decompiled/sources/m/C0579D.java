package m;

/* renamed from: m.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0579D implements InterfaceC0602l {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f5564a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5565b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5566c;

    public C0579D(x0 x0Var, int i3, long j3) {
        this.f5564a = x0Var;
        this.f5565b = i3;
        this.f5566c = j3;
    }

    @Override // m.InterfaceC0602l
    public final A0 a(y0 y0Var) {
        x0 x0Var = this.f5564a;
        return new C0(new H2.z(x0Var.f5877a, x0Var.f5878b, x0Var.f5879c), this.f5565b, this.f5566c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0579D)) {
            return false;
        }
        C0579D c0579d = (C0579D) obj;
        if (c0579d.f5564a.equals(this.f5564a) && c0579d.f5565b == this.f5565b) {
            return c0579d.f5566c == this.f5566c;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5566c) + ((AbstractC0600j.a(this.f5565b) + (this.f5564a.hashCode() * 31)) * 31);
    }
}
