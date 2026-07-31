package B;

import e2.InterfaceC0426e;
import n0.C0702C;
import q2.AbstractC0837y;

/* loaded from: classes.dex */
public final class c0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f371h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f372i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x.Z f373j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(x.Z z3, V1.d dVar) {
        super(2, dVar);
        this.f373j = z3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((c0) o((V1.d) obj2, (C0702C) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        c0 c0Var = new c0(this.f373j, dVar);
        c0Var.f372i = obj;
        return c0Var;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f371h;
        R1.y yVar = R1.y.f4171a;
        if (i3 == 0) {
            R1.a.e(obj);
            C0702C c0702c = (C0702C) this.f372i;
            this.f371h = 1;
            Object e3 = AbstractC0837y.e(new x.U(c0702c, this.f373j, null), this);
            if (e3 != aVar) {
                e3 = yVar;
            }
            if (e3 == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return yVar;
    }
}
