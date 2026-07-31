package I;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;
import t2.InterfaceC1031B;

/* loaded from: classes.dex */
public final class S0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f2756h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1031B f2757i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0166o0 f2758j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(InterfaceC1031B interfaceC1031B, C0166o0 c0166o0, V1.d dVar) {
        super(2, dVar);
        this.f2757i = interfaceC1031B;
        this.f2758j = c0166o0;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((S0) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new S0(this.f2757i, this.f2758j, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f2756h;
        if (i3 == 0) {
            R1.a.e(obj);
            R0 r02 = new R0(this.f2758j, 1);
            this.f2756h = 1;
            if (this.f2757i.d(r02, this) == aVar) {
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
