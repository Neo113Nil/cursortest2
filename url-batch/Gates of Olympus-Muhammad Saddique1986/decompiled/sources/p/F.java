package p;

import B.C0022x;
import F.C0087c;
import e2.InterfaceC0426e;
import n0.C0702C;
import o0.C0744c;
import q2.AbstractC0837y;

/* loaded from: classes.dex */
public final class F extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7511h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7512i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0776m0 f7513j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(C0776m0 c0776m0, V1.d dVar) {
        super(2, dVar);
        this.f7513j = c0776m0;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((F) o((V1.d) obj2, (C0702C) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        F f3 = new F(this.f7513j, dVar);
        f3.f7512i = obj;
        return f3;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7511h;
        if (i3 == 0) {
            R1.a.e(obj);
            C0702C c0702c = (C0702C) this.f7512i;
            C0744c c0744c = new C0744c();
            C0776m0 c0776m0 = this.f7513j;
            D d3 = new D(c0776m0, c0702c, new B.I(c0776m0, 4, c0744c), new C0022x(c0744c, 29, c0776m0), new E(c0776m0, 0), new E(c0776m0, 1), new C0087c(c0744c, 7, c0776m0), null);
            this.f7511h = 1;
            if (AbstractC0837y.e(d3, this) == aVar) {
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
