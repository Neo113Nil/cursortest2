package p;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;

/* renamed from: p.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0770j0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7689h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0776m0 f7690i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f7691j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0770j0(C0776m0 c0776m0, long j3, V1.d dVar) {
        super(2, dVar);
        this.f7690i = c0776m0;
        this.f7691j = j3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0770j0) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C0770j0(this.f7690i, this.f7691j, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7689h;
        if (i3 == 0) {
            R1.a.e(obj);
            C0793v0 c0793v0 = this.f7690i.f7720F;
            n.e0 e0Var = n.e0.f7123e;
            C0768i0 c0768i0 = new C0768i0(this.f7691j, null);
            this.f7689h = 1;
            if (c0793v0.e(e0Var, c0768i0, this) == aVar) {
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
