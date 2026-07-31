package I;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class Q0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f2746h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2747i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f2748j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f2749k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(InterfaceC0426e interfaceC0426e, InterfaceC0142c0 interfaceC0142c0, V1.d dVar) {
        super(2, dVar);
        this.f2748j = interfaceC0426e;
        this.f2749k = interfaceC0142c0;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((Q0) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        Q0 q0 = new Q0(this.f2748j, this.f2749k, dVar);
        q0.f2747i = obj;
        return q0;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f2746h;
        if (i3 == 0) {
            R1.a.e(obj);
            C0166o0 c0166o0 = new C0166o0(this.f2749k, ((InterfaceC0835w) this.f2747i).q());
            this.f2746h = 1;
            if (this.f2748j.h(c0166o0, this) == aVar) {
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
