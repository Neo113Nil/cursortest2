package u0;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;
import t2.InterfaceC1043N;

/* loaded from: classes.dex */
public final class b1 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f9311h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1043N f9312i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1128u0 f9313j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(InterfaceC1043N interfaceC1043N, C1128u0 c1128u0, V1.d dVar) {
        super(2, dVar);
        this.f9312i = interfaceC1043N;
        this.f9313j = c1128u0;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        ((b1) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
        return W1.a.f4608d;
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new b1(this.f9312i, this.f9313j, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f9311h;
        if (i3 == 0) {
            R1.a.e(obj);
            F.C c2 = new F.C(4, this.f9313j);
            this.f9311h = 1;
            if (this.f9312i.d(c2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        throw new C1.c();
    }
}
