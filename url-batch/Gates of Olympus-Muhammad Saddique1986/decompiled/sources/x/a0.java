package x;

import e2.InterfaceC0426e;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;
import z.C1248l;
import z.C1249m;

/* loaded from: classes.dex */
public final class a0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f10053h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1249m f10054i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(C1249m c1249m, V1.d dVar) {
        super(2, dVar);
        this.f10054i = c1249m;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((a0) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new a0(this.f10054i, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f10053h;
        R1.y yVar = R1.y.f4171a;
        if (i3 == 0) {
            R1.a.e(obj);
            this.f10053h = 1;
            C1249m c1249m = this.f10054i;
            c1249m.getClass();
            Object e3 = AbstractC0837y.e(new C1248l(c1249m, null), this);
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
