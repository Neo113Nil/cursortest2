package androidx.lifecycle;

import e2.InterfaceC0426e;
import p1.C0803b;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class H extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f5169h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f5170i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0294x f5171j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ EnumC0286o f5172k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0803b f5173l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(C0294x c0294x, EnumC0286o enumC0286o, C0803b c0803b, V1.d dVar) {
        super(2, dVar);
        this.f5171j = c0294x;
        this.f5172k = enumC0286o;
        this.f5173l = c0803b;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((H) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        H h3 = new H(this.f5171j, this.f5172k, this.f5173l, dVar);
        h3.f5170i = obj;
        return h3;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f5169h;
        if (i3 == 0) {
            R1.a.e(obj);
            InterfaceC0835w interfaceC0835w = (InterfaceC0835w) this.f5170i;
            x2.e eVar = q2.E.f7851a;
            r2.d dVar = v2.m.f9819a.f8207i;
            G g3 = new G(this.f5171j, this.f5172k, interfaceC0835w, this.f5173l, null);
            this.f5169h = 1;
            if (AbstractC0837y.z(dVar, g3, this) == aVar) {
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
