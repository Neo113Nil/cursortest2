package n;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0674a extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7080h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q.k f7081i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q.g f7082j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0674a(q.k kVar, q.g gVar, V1.d dVar) {
        super(2, dVar);
        this.f7081i = kVar;
        this.f7082j = gVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0674a) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C0674a(this.f7081i, this.f7082j, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7080h;
        if (i3 == 0) {
            R1.a.e(obj);
            this.f7080h = 1;
            if (this.f7081i.b(this.f7082j, this) == aVar) {
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
