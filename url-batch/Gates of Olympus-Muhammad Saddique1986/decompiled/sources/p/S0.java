package p;

import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import e2.InterfaceC0427f;
import n0.C0702C;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class S0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7598h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7599i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0702C f7600j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0427f f7601k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f7602l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f7603m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f7604n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(C0702C c0702c, InterfaceC0427f interfaceC0427f, InterfaceC0424c interfaceC0424c, InterfaceC0424c interfaceC0424c2, InterfaceC0424c interfaceC0424c3, V1.d dVar) {
        super(2, dVar);
        this.f7600j = c0702c;
        this.f7601k = interfaceC0427f;
        this.f7602l = interfaceC0424c;
        this.f7603m = interfaceC0424c2;
        this.f7604n = interfaceC0424c3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((S0) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        S0 s02 = new S0(this.f7600j, this.f7601k, this.f7602l, this.f7603m, this.f7604n, dVar);
        s02.f7599i = obj;
        return s02;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7598h;
        if (i3 == 0) {
            R1.a.e(obj);
            InterfaceC0835w interfaceC0835w = (InterfaceC0835w) this.f7599i;
            C0702C c0702c = this.f7600j;
            T t3 = new T(c0702c);
            R0 r02 = new R0(interfaceC0835w, this.f7601k, this.f7602l, this.f7603m, this.f7604n, t3, null);
            this.f7598h = 1;
            if (n.r.g(c0702c, r02, this) == aVar) {
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
