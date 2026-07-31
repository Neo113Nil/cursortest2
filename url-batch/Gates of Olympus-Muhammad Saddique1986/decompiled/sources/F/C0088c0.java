package F;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;

/* renamed from: F.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0088c0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f1488h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0100i0 f1489i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q.i f1490j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0088c0(C0100i0 c0100i0, q.i iVar, V1.d dVar) {
        super(2, dVar);
        this.f1489i = c0100i0;
        this.f1490j = iVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0088c0) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C0088c0(this.f1489i, this.f1490j, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f1488h;
        if (i3 == 0) {
            R1.a.e(obj);
            this.f1488h = 1;
            if (this.f1489i.a(this.f1490j, this) == aVar) {
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
