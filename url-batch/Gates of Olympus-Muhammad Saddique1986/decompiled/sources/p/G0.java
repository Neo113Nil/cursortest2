package p;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class G0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7519h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ T f7520i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(T t3, V1.d dVar) {
        super(2, dVar);
        this.f7520i = t3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((G0) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new G0(this.f7520i, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7519h;
        if (i3 == 0) {
            R1.a.e(obj);
            this.f7519h = 1;
            if (this.f7520i.b(this) == aVar) {
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
