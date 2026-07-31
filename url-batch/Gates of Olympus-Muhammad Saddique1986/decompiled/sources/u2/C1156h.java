package u2;

import e2.InterfaceC0426e;
import t2.InterfaceC1054g;

/* renamed from: u2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1156h extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f9694h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f9695i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f9696j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1156h(i iVar, V1.d dVar) {
        super(2, dVar);
        this.f9696j = iVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C1156h) o((V1.d) obj2, (InterfaceC1054g) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C1156h c1156h = new C1156h(this.f9696j, dVar);
        c1156h.f9695i = obj;
        return c1156h;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f9694h;
        if (i3 == 0) {
            R1.a.e(obj);
            InterfaceC1054g interfaceC1054g = (InterfaceC1054g) this.f9695i;
            this.f9694h = 1;
            if (this.f9696j.j(interfaceC1054g, this) == aVar) {
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
