package m;

/* renamed from: m.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0592c0 implements InterfaceC0602l {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0615z f5700a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5701b;

    public C0592c0(InterfaceC0615z interfaceC0615z, long j3) {
        this.f5700a = interfaceC0615z;
        this.f5701b = j3;
    }

    @Override // m.InterfaceC0602l
    public final A0 a(y0 y0Var) {
        return new C0594d0(this.f5700a.a(y0Var), this.f5701b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0592c0)) {
            return false;
        }
        C0592c0 c0592c0 = (C0592c0) obj;
        return c0592c0.f5701b == this.f5701b && Z1.i.a(c0592c0.f5700a, this.f5700a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f5701b) + (this.f5700a.hashCode() * 31);
    }
}
