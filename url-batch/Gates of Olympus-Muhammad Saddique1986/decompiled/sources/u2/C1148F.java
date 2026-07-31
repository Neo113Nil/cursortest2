package u2;

import e2.InterfaceC0426e;
import t2.InterfaceC1054g;

/* renamed from: u2.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1148F extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f9673h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f9674i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1054g f9675j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1148F(InterfaceC1054g interfaceC1054g, V1.d dVar) {
        super(2, dVar);
        this.f9675j = interfaceC1054g;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C1148F) o((V1.d) obj2, obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C1148F c1148f = new C1148F(this.f9675j, dVar);
        c1148f.f9674i = obj;
        return c1148f;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f9673h;
        if (i3 == 0) {
            R1.a.e(obj);
            Object obj2 = this.f9674i;
            this.f9673h = 1;
            if (this.f9675j.e(obj2, this) == aVar) {
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
