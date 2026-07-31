package p;

import e2.InterfaceC0426e;

/* renamed from: p.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0768i0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f7682h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f7683i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0768i0(long j3, V1.d dVar) {
        super(2, dVar);
        this.f7683i = j3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        C0768i0 c0768i0 = (C0768i0) o((V1.d) obj2, (C0787s0) obj);
        R1.y yVar = R1.y.f4171a;
        c0768i0.q(yVar);
        return yVar;
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0768i0 c0768i0 = new C0768i0(this.f7683i, dVar);
        c0768i0.f7682h = obj;
        return c0768i0;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        R1.a.e(obj);
        C0793v0 c0793v0 = ((C0787s0) this.f7682h).f7767a;
        C0793v0.a(c0793v0, c0793v0.f7785h, this.f7683i, 1);
        return R1.y.f4171a;
    }
}
