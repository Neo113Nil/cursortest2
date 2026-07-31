package B;

import I.U0;
import I.W0;
import e2.InterfaceC0426e;
import m.C0619d;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class M extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f298h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f299i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ W0 f300j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0619d f301k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(W0 w02, C0619d c0619d, V1.d dVar) {
        super(2, dVar);
        this.f300j = w02;
        this.f301k = c0619d;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((M) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        M m3 = new M(this.f300j, this.f301k, dVar);
        m3.f299i = obj;
        return m3;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f298h;
        if (i3 == 0) {
            R1.a.e(obj);
            InterfaceC0835w interfaceC0835w = (InterfaceC0835w) this.f299i;
            H1.c cVar = new H1.c(new U0(new J(this.f300j, 0), null));
            L l3 = new L(this.f301k, 0, interfaceC0835w);
            this.f298h = 1;
            if (cVar.d(l3, this) == aVar) {
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
