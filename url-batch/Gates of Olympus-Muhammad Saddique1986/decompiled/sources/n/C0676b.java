package n;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;

/* renamed from: n.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0676b extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7085h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q.k f7086i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q.h f7087j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0676b(q.k kVar, q.h hVar, V1.d dVar) {
        super(2, dVar);
        this.f7086i = kVar;
        this.f7087j = hVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0676b) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C0676b(this.f7086i, this.f7087j, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7085h;
        if (i3 == 0) {
            R1.a.e(obj);
            this.f7085h = 1;
            if (this.f7086i.b(this.f7087j, this) == aVar) {
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
