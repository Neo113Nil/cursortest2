package H2;

import m.B0;
import m.C0578C;
import m.InterfaceC0613x;

/* loaded from: classes.dex */
public final class z implements B0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f2055a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2056b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2057c;

    public z() {
        this.f2057c = new z[256];
        this.f2055a = 0;
        this.f2056b = 0;
    }

    @Override // m.A0
    public m.r b(long j3, m.r rVar, m.r rVar2, m.r rVar3) {
        return ((A2.k) this.f2057c).b(j3, rVar, rVar2, rVar3);
    }

    @Override // m.A0
    public m.r c(long j3, m.r rVar, m.r rVar2, m.r rVar3) {
        return ((A2.k) this.f2057c).c(j3, rVar, rVar2, rVar3);
    }

    @Override // m.A0
    public long d(m.r rVar, m.r rVar2, m.r rVar3) {
        return (this.f2056b + this.f2055a) * 1000000;
    }

    public z(int i3, int i4) {
        this.f2057c = null;
        this.f2055a = i3;
        int i5 = i4 & 7;
        this.f2056b = i5 == 0 ? 8 : i5;
    }

    public z(int i3, int i4, InterfaceC0613x interfaceC0613x) {
        this.f2055a = i3;
        this.f2056b = i4;
        this.f2057c = new A2.k(new C0578C(i3, i4, interfaceC0613x));
    }
}
