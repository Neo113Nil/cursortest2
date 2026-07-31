package n;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;

/* renamed from: n.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0680f extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7125h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0698y f7126i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q.m f7127j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0680f(C0698y c0698y, q.m mVar, V1.d dVar) {
        super(2, dVar);
        this.f7126i = c0698y;
        this.f7127j = mVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0680f) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C0680f(this.f7126i, this.f7127j, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7125h;
        if (i3 == 0) {
            R1.a.e(obj);
            q.k kVar = this.f7126i.f7233s;
            if (kVar != null) {
                q.n nVar = new q.n(this.f7127j);
                this.f7125h = 1;
                if (kVar.b(nVar, this) == aVar) {
                    return aVar;
                }
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
