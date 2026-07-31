package p;

import e2.InterfaceC0426e;

/* renamed from: p.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0764g0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f7669h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f7670i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0764g0(long j3, V1.d dVar) {
        super(2, dVar);
        this.f7670i = j3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        C0764g0 c0764g0 = (C0764g0) o((V1.d) obj2, (C0787s0) obj);
        R1.y yVar = R1.y.f4171a;
        c0764g0.q(yVar);
        return yVar;
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0764g0 c0764g0 = new C0764g0(this.f7670i, dVar);
        c0764g0.f7669h = obj;
        return c0764g0;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        R1.a.e(obj);
        C0793v0 c0793v0 = ((C0787s0) this.f7669h).f7767a;
        C0793v0.a(c0793v0, c0793v0.f7785h, this.f7670i, 1);
        return R1.y.f4171a;
    }
}
