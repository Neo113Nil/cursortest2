package B;

import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import n0.C0702C;

/* loaded from: classes.dex */
public final class D extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f271h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f272i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f273j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(InterfaceC0424c interfaceC0424c, V1.d dVar) {
        super(2, dVar);
        this.f273j = interfaceC0424c;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((D) o((V1.d) obj2, (C0702C) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        D d3 = new D(this.f273j, dVar);
        d3.f272i = obj;
        return d3;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f271h;
        if (i3 == 0) {
            R1.a.e(obj);
            C0702C c0702c = (C0702C) this.f272i;
            C c2 = new C(this.f273j, null);
            this.f271h = 1;
            if (c0702c.y0(c2, this) == aVar) {
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
