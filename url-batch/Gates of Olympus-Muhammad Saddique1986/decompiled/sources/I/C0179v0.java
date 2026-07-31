package I;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;

/* renamed from: I.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0179v0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f2947h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2948i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0185y0 f2949j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ X f2950k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0179v0(C0185y0 c0185y0, X x3, V1.d dVar) {
        super(2, dVar);
        this.f2949j = c0185y0;
        this.f2950k = x3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0179v0) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0179v0 c0179v0 = new C0179v0(this.f2949j, this.f2950k, dVar);
        c0179v0.f2948i = obj;
        return c0179v0;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f2947h;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
            return R1.y.f4171a;
        }
        R1.a.e(obj);
        InterfaceC0835w interfaceC0835w = (InterfaceC0835w) this.f2948i;
        this.f2947h = 1;
        this.f2949j.g(interfaceC0835w, this.f2950k, this);
        return aVar;
    }
}
