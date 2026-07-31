package I;

import e2.InterfaceC0426e;
import q2.AbstractC0837y;
import t2.InterfaceC1031B;

/* loaded from: classes.dex */
public final class T0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f2762h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2763i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ V1.i f2764j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1031B f2765k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(V1.i iVar, InterfaceC1031B interfaceC1031B, V1.d dVar) {
        super(2, dVar);
        this.f2764j = iVar;
        this.f2765k = interfaceC1031B;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((T0) o((V1.d) obj2, (C0166o0) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        T0 t02 = new T0(this.f2764j, this.f2765k, dVar);
        t02.f2763i = obj;
        return t02;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f2762h;
        if (i3 == 0) {
            R1.a.e(obj);
            C0166o0 c0166o0 = (C0166o0) this.f2763i;
            V1.j jVar = V1.j.f4558d;
            V1.i iVar = this.f2764j;
            boolean a3 = f2.j.a(iVar, jVar);
            InterfaceC1031B interfaceC1031B = this.f2765k;
            if (a3) {
                R0 r02 = new R0(c0166o0, 0);
                this.f2762h = 1;
                if (interfaceC1031B.d(r02, this) == aVar) {
                    return aVar;
                }
            } else {
                S0 s02 = new S0(interfaceC1031B, c0166o0, null);
                this.f2762h = 2;
                if (AbstractC0837y.z(iVar, s02, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i3 != 1 && i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return R1.y.f4171a;
    }
}
