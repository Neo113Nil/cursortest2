package u2;

import e2.InterfaceC0426e;

/* renamed from: u2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1154f extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f9688h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f9689i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AbstractC1155g f9690j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1154f(AbstractC1155g abstractC1155g, V1.d dVar) {
        super(2, dVar);
        this.f9690j = abstractC1155g;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C1154f) o((V1.d) obj2, (s2.t) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C1154f c1154f = new C1154f(this.f9690j, dVar);
        c1154f.f9689i = obj;
        return c1154f;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f9688h;
        if (i3 == 0) {
            R1.a.e(obj);
            s2.t tVar = (s2.t) this.f9689i;
            this.f9688h = 1;
            if (this.f9690j.f(tVar, this) == aVar) {
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
