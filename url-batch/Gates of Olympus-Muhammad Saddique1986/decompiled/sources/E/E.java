package E;

import e2.InterfaceC0426e;
import m.C0619d;
import m.t0;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class E extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f919h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ F f920i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t0 f921j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(F f3, t0 t0Var, V1.d dVar) {
        super(2, dVar);
        this.f920i = f3;
        this.f921j = t0Var;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((E) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new E(this.f920i, this.f921j, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f919h;
        if (i3 == 0) {
            R1.a.e(obj);
            C0619d c0619d = (C0619d) this.f920i.f924c;
            Float f3 = new Float(0.0f);
            this.f919h = 1;
            if (C0619d.c(c0619d, f3, this.f921j, null, this, 12) == aVar) {
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
