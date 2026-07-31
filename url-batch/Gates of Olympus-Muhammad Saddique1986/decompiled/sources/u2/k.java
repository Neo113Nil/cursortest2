package u2;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;
import t2.InterfaceC1054g;

/* loaded from: classes.dex */
public final class k extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f9698h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n f9699i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1054g f9700j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f9701k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, InterfaceC1054g interfaceC1054g, Object obj, V1.d dVar) {
        super(2, dVar);
        this.f9699i = nVar;
        this.f9700j = interfaceC1054g;
        this.f9701k = obj;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((k) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new k(this.f9699i, this.f9700j, this.f9701k, dVar);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [X1.i, e2.f] */
    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f9698h;
        if (i3 == 0) {
            R1.a.e(obj);
            ?? r4 = this.f9699i.f9711h;
            this.f9698h = 1;
            if (r4.g(this.f9700j, this.f9701k, this) == aVar) {
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
