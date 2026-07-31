package F;

import b0.AbstractC0259J;
import d0.C0325f;
import d0.InterfaceC0323d;

/* renamed from: F.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0070v0 extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f1398e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1399f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0070v0(long j3, int i3) {
        super(1);
        this.f1398e = j3;
        this.f1399f = i3;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        InterfaceC0323d interfaceC0323d = (InterfaceC0323d) obj;
        float min = Math.min(interfaceC0323d.F(AbstractC0064s0.f1374b), a0.f.b(interfaceC0323d.c()));
        float b2 = (a0.f.b(interfaceC0323d.c()) - min) / 2;
        boolean q2 = AbstractC0259J.q(this.f1399f, 1);
        long j3 = this.f1398e;
        if (q2) {
            float f3 = min / 2.0f;
            interfaceC0323d.h0(j3, f3, (r18 & 4) != 0 ? interfaceC0323d.w() : I2.l.f((a0.f.d(interfaceC0323d.c()) - f3) - b2, a0.f.b(interfaceC0323d.c()) / 2.0f), 1.0f, C0325f.f4448b, null, 3);
        } else {
            InterfaceC0323d.s(interfaceC0323d, j3, I2.l.f((a0.f.d(interfaceC0323d.c()) - min) - b2, (a0.f.b(interfaceC0323d.c()) - min) / 2.0f), I2.d.h(min, min), null, 120);
        }
        return L1.z.f2729a;
    }
}
