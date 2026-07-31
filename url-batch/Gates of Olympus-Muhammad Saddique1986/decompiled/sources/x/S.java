package x;

import e2.InterfaceC0426e;
import n0.C0702C;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class S extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f10000h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0702C f10001i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Z f10002j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(C0702C c0702c, Z z3, V1.d dVar) {
        super(2, dVar);
        this.f10001i = c0702c;
        this.f10002j = z3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((S) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new S(this.f10001i, this.f10002j, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f10000h;
        R1.y yVar = R1.y.f4171a;
        if (i3 == 0) {
            R1.a.e(obj);
            this.f10000h = 1;
            Object g3 = n.r.g(this.f10001i, new W(this.f10002j, null), this);
            if (g3 != aVar) {
                g3 = yVar;
            }
            if (g3 == aVar) {
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
