package h1;

import e2.InterfaceC0426e;
import q2.C0827n;
import t2.AbstractC1035F;
import t2.InterfaceC1053f;
import t2.InterfaceC1054g;

/* loaded from: classes.dex */
public final class G extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f6071h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ M f6072i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(M m3, V1.d dVar) {
        super(2, dVar);
        this.f6072i = m3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((G) o((V1.d) obj2, (InterfaceC1054g) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new G(this.f6072i, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f6071h;
        R1.y yVar = R1.y.f4171a;
        M m3 = this.f6072i;
        if (i3 == 0) {
            R1.a.e(obj);
            G1.g gVar = m3.f6099k;
            this.f6071h = 1;
            Object i02 = ((C0827n) gVar.f2094f).i0(this);
            if (i02 != aVar) {
                i02 = yVar;
            }
            if (i02 == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                if (i3 == 2) {
                    R1.a.e(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        InterfaceC1053f f3 = AbstractC1035F.f(m3.f().f6129c, -1);
        F.C c2 = new F.C(2, m3);
        this.f6071h = 2;
        return f3.d(c2, this) == aVar ? aVar : yVar;
    }
}
