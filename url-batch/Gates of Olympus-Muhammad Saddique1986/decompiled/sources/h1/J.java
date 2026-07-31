package h1;

import e2.InterfaceC0426e;

/* loaded from: classes.dex */
public final class J extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f6078h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6079i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ M f6080j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(M m3, V1.d dVar) {
        super(2, dVar);
        this.f6080j = m3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((J) o((V1.d) obj2, (O) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        J j3 = new J(this.f6080j, dVar);
        j3.f6079i = obj;
        return j3;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f6078h;
        if (i3 == 0) {
            R1.a.e(obj);
            O o3 = (O) this.f6079i;
            this.f6078h = 1;
            if (M.c(this.f6080j, o3, this) == aVar) {
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
