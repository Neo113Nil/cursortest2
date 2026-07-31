package E;

import B.L;
import e2.InterfaceC0426e;
import q2.InterfaceC0835w;
import t2.InterfaceC1053f;

/* renamed from: E.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0079g extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f956h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f957i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q.j f958j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0073a f959k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0079g(q.j jVar, C0073a c0073a, V1.d dVar) {
        super(2, dVar);
        this.f958j = jVar;
        this.f959k = c0073a;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0079g) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0079g c0079g = new C0079g(this.f958j, this.f959k, dVar);
        c0079g.f957i = obj;
        return c0079g;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f956h;
        if (i3 == 0) {
            R1.a.e(obj);
            InterfaceC0835w interfaceC0835w = (InterfaceC0835w) this.f957i;
            InterfaceC1053f a3 = this.f958j.a();
            L l3 = new L(this.f959k, 1, interfaceC0835w);
            this.f956h = 1;
            if (a3.d(l3, this) == aVar) {
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
