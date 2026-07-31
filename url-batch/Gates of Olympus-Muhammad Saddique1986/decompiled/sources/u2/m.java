package u2;

import e2.InterfaceC0426e;
import n.C0659B;
import q2.InterfaceC0835w;
import t2.InterfaceC1053f;
import t2.InterfaceC1054g;

/* loaded from: classes.dex */
public final class m extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f9707h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f9708i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f9709j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1054g f9710k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, InterfaceC1054g interfaceC1054g, V1.d dVar) {
        super(2, dVar);
        this.f9709j = nVar;
        this.f9710k = interfaceC1054g;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((m) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        m mVar = new m(this.f9709j, this.f9710k, dVar);
        mVar.f9708i = obj;
        return mVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f9707h;
        if (i3 == 0) {
            R1.a.e(obj);
            InterfaceC0835w interfaceC0835w = (InterfaceC0835w) this.f9708i;
            f2.u uVar = new f2.u();
            n nVar = this.f9709j;
            InterfaceC1053f interfaceC1053f = nVar.f9697g;
            C0659B c0659b = new C0659B(uVar, interfaceC0835w, nVar, this.f9710k, 1);
            this.f9707h = 1;
            if (interfaceC1053f.d(c0659b, this) == aVar) {
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
