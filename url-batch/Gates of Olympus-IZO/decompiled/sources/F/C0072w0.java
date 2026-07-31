package F;

import b0.AbstractC0259J;
import d0.InterfaceC0323d;

/* renamed from: F.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0072w0 extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1406e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f1407f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Y1.a f1408g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f1409h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f1410i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Y1.c f1411j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0072w0(int i3, float f3, Y1.a aVar, long j3, long j4, Y1.c cVar) {
        super(1);
        this.f1406e = i3;
        this.f1407f = f3;
        this.f1408g = aVar;
        this.f1409h = j3;
        this.f1410i = j4;
        this.f1411j = cVar;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        InterfaceC0323d interfaceC0323d = (InterfaceC0323d) obj;
        float b2 = a0.f.b(interfaceC0323d.c());
        boolean q2 = AbstractC0259J.q(this.f1406e, 0);
        float f3 = this.f1407f;
        if (!q2 && a0.f.b(interfaceC0323d.c()) <= a0.f.d(interfaceC0323d.c())) {
            f3 += interfaceC0323d.c0(b2);
        }
        float c02 = f3 / interfaceC0323d.c0(a0.f.d(interfaceC0323d.c()));
        float floatValue = ((Number) this.f1408g.b()).floatValue();
        float min = Math.min(floatValue, c02) + floatValue;
        if (min <= 1.0f) {
            AbstractC0076y0.b(interfaceC0323d, min, 1.0f, this.f1409h, b2, this.f1406e);
        }
        AbstractC0076y0.b(interfaceC0323d, 0.0f, floatValue, this.f1410i, b2, this.f1406e);
        this.f1411j.j(interfaceC0323d);
        return L1.z.f2729a;
    }
}
