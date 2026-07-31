package p;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class z0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7815h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ T f7816i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(T t3, V1.d dVar) {
        super(2, dVar);
        this.f7816i = t3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((z0) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new z0(this.f7816i, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7815h;
        if (i3 == 0) {
            R1.a.e(obj);
            this.f7815h = 1;
            if (this.f7816i.b(this) == aVar) {
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
