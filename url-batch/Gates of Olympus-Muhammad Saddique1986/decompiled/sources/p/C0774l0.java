package p;

import a0.C0238c;
import e2.InterfaceC0426e;

/* renamed from: p.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0774l0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7712h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ long f7713i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0776m0 f7714j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0774l0(C0776m0 c0776m0, V1.d dVar) {
        super(2, dVar);
        this.f7714j = c0776m0;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        long j3 = ((C0238c) obj).f4722a;
        C0774l0 c0774l0 = new C0774l0(this.f7714j, (V1.d) obj2);
        c0774l0.f7713i = j3;
        return c0774l0.q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0774l0 c0774l0 = new C0774l0(this.f7714j, dVar);
        c0774l0.f7713i = ((C0238c) obj).f4722a;
        return c0774l0;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7712h;
        if (i3 == 0) {
            R1.a.e(obj);
            long j3 = this.f7713i;
            C0793v0 c0793v0 = this.f7714j.f7720F;
            this.f7712h = 1;
            obj = androidx.compose.foundation.gestures.a.a(c0793v0, j3, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return obj;
    }
}
