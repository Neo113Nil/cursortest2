package E;

import B.L;
import e2.InterfaceC0426e;
import q2.InterfaceC0835w;
import t2.InterfaceC1053f;

/* loaded from: classes.dex */
public final class x extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f1009h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f1010i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y f1011j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, V1.d dVar) {
        super(2, dVar);
        this.f1011j = yVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((x) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        x xVar = new x(this.f1011j, dVar);
        xVar.f1010i = obj;
        return xVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f1009h;
        if (i3 == 0) {
            R1.a.e(obj);
            InterfaceC0835w interfaceC0835w = (InterfaceC0835w) this.f1010i;
            y yVar = this.f1011j;
            InterfaceC1053f a3 = yVar.f1012q.a();
            L l3 = new L(yVar, 2, interfaceC0835w);
            this.f1009h = 1;
            if (a3.d(l3, this) == aVar) {
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
