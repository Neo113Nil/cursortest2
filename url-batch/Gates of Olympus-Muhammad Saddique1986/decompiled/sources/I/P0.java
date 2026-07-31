package I;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class P0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f2738h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2739i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f2740j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f2741k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(InterfaceC0426e interfaceC0426e, InterfaceC0142c0 interfaceC0142c0, V1.d dVar) {
        super(2, dVar);
        this.f2740j = interfaceC0426e;
        this.f2741k = interfaceC0142c0;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((P0) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        P0 p02 = new P0(this.f2740j, this.f2741k, dVar);
        p02.f2739i = obj;
        return p02;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f2738h;
        if (i3 == 0) {
            R1.a.e(obj);
            C0166o0 c0166o0 = new C0166o0(this.f2741k, ((InterfaceC0835w) this.f2739i).q());
            this.f2738h = 1;
            if (this.f2740j.h(c0166o0, this) == aVar) {
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
