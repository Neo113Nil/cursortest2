package n0;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;

/* renamed from: n0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0701B extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7257h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0702C f7258i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0701B(C0702C c0702c, V1.d dVar) {
        super(2, dVar);
        this.f7258i = c0702c;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0701B) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C0701B(this.f7258i, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7257h;
        if (i3 == 0) {
            R1.a.e(obj);
            C0702C c0702c = this.f7258i;
            InterfaceC0426e interfaceC0426e = c0702c.f7262t;
            this.f7257h = 1;
            if (interfaceC0426e.h(c0702c, this) == aVar) {
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
