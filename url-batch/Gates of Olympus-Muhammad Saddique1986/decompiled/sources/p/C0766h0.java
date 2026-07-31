package p;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;

/* renamed from: p.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0766h0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7673h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0776m0 f7674i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f7675j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0766h0(C0776m0 c0776m0, long j3, V1.d dVar) {
        super(2, dVar);
        this.f7674i = c0776m0;
        this.f7675j = j3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0766h0) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C0766h0(this.f7674i, this.f7675j, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7673h;
        if (i3 == 0) {
            R1.a.e(obj);
            C0793v0 c0793v0 = this.f7674i.f7720F;
            n.e0 e0Var = n.e0.f7123e;
            C0764g0 c0764g0 = new C0764g0(this.f7675j, null);
            this.f7673h = 1;
            if (c0793v0.e(e0Var, c0764g0, this) == aVar) {
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
