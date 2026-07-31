package m;

import I.C0143d;
import e2.InterfaceC0426e;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class j0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public float f6822h;

    /* renamed from: i, reason: collision with root package name */
    public int f6823i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f6824j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l0 f6825k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(l0 l0Var, V1.d dVar) {
        super(2, dVar);
        this.f6825k = l0Var;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((j0) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        j0 j0Var = new j0(this.f6825k, dVar);
        j0Var.f6824j = obj;
        return j0Var;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        float h3;
        InterfaceC0835w interfaceC0835w;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f6823i;
        if (i3 == 0) {
            R1.a.e(obj);
            InterfaceC0835w interfaceC0835w2 = (InterfaceC0835w) this.f6824j;
            h3 = AbstractC0620e.h(interfaceC0835w2.q());
            interfaceC0835w = interfaceC0835w2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h3 = this.f6822h;
            interfaceC0835w = (InterfaceC0835w) this.f6824j;
            R1.a.e(obj);
        }
        while (AbstractC0837y.p(interfaceC0835w)) {
            G.n nVar = new G.n(this.f6825k, h3);
            this.f6824j = interfaceC0835w;
            this.f6822h = h3;
            this.f6823i = 1;
            V1.i iVar = this.f4642e;
            f2.j.c(iVar);
            if (C0143d.F(iVar).n(nVar, this) == aVar) {
                return aVar;
            }
        }
        return R1.y.f4171a;
    }
}
