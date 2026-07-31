package p;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;

/* renamed from: p.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0772k0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7702h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0776m0 f7703i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f7704j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f7705k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0772k0(C0776m0 c0776m0, float f3, float f4, V1.d dVar) {
        super(2, dVar);
        this.f7703i = c0776m0;
        this.f7704j = f3;
        this.f7705k = f4;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0772k0) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C0772k0(this.f7703i, this.f7704j, this.f7705k, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7702h;
        if (i3 == 0) {
            R1.a.e(obj);
            C0793v0 c0793v0 = this.f7703i.f7720F;
            long e3 = l0.c.e(this.f7704j, this.f7705k);
            this.f7702h = 1;
            if (androidx.compose.foundation.gestures.a.a(c0793v0, e3, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return R1.y.f4171a;
    }
}
