package N2;

import m.C0607C;
import m.InterfaceC0638x;
import m.x0;

/* loaded from: classes.dex */
public final class z implements x0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f3712d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3713e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3714f;

    public z() {
        this.f3714f = new z[256];
        this.f3712d = 0;
        this.f3713e = 0;
    }

    @Override // m.w0
    public m.r d(long j3, m.r rVar, m.r rVar2, m.r rVar3) {
        return ((G1.g) this.f3714f).d(j3, rVar, rVar2, rVar3);
    }

    @Override // m.w0
    public m.r f(long j3, m.r rVar, m.r rVar2, m.r rVar3) {
        return ((G1.g) this.f3714f).f(j3, rVar, rVar2, rVar3);
    }

    @Override // m.w0
    public long g(m.r rVar, m.r rVar2, m.r rVar3) {
        return (this.f3712d + this.f3713e) * 1000000;
    }

    public z(int i3, int i4) {
        this.f3714f = null;
        this.f3712d = i3;
        int i5 = i4 & 7;
        this.f3713e = i5 == 0 ? 8 : i5;
    }

    public z(int i3, int i4, InterfaceC0638x interfaceC0638x) {
        this.f3712d = i3;
        this.f3713e = i4;
        this.f3714f = new G1.g(new C0607C(i3, i4, interfaceC0638x));
    }
}
