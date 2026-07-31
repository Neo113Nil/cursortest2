package u0;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class i1 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f9375h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k1 f9376i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(k1 k1Var, V1.d dVar) {
        super(2, dVar);
        this.f9376i = k1Var;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((i1) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new i1(this.f9376i, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f9375h;
        R1.y yVar = R1.y.f4171a;
        if (i3 == 0) {
            R1.a.e(obj);
            C1123s c1123s = this.f9376i.f9388d;
            this.f9375h = 1;
            Object c2 = c1123s.f9503q.c(this);
            if (c2 != aVar) {
                c2 = yVar;
            }
            if (c2 == aVar) {
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
