package F;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;
import t2.C1034E;

/* loaded from: classes.dex */
public final class D extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f1131h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q.k f1132i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ S.t f1133j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(q.k kVar, S.t tVar, V1.d dVar) {
        super(2, dVar);
        this.f1132i = kVar;
        this.f1133j = tVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((D) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new D(this.f1132i, this.f1133j, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f1131h;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
            return R1.y.f4171a;
        }
        R1.a.e(obj);
        C1034E c1034e = this.f1132i.f7843a;
        C c2 = new C(0, this.f1133j);
        this.f1131h = 1;
        c1034e.getClass();
        C1034E.m(c1034e, c2, this);
        return aVar;
    }
}
