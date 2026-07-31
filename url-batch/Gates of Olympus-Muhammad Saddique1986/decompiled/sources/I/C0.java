package I;

import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class C0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f2644h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f2645i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(InterfaceC0424c interfaceC0424c, V1.d dVar) {
        super(2, dVar);
        this.f2645i = interfaceC0424c;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C0(this.f2645i, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f2644h;
        if (i3 == 0) {
            R1.a.e(obj);
            this.f2644h = 1;
            if (AbstractC0837y.f(16L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return this.f2645i.n(new Long(System.nanoTime()));
    }
}
