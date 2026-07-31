package x;

import I.InterfaceC0142c0;
import e2.InterfaceC0426e;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class g0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0142c0 f10120h;

    /* renamed from: i, reason: collision with root package name */
    public int f10121i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f10122j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f10123k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q.k f10124l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(InterfaceC0142c0 interfaceC0142c0, boolean z3, q.k kVar, V1.d dVar) {
        super(2, dVar);
        this.f10122j = interfaceC0142c0;
        this.f10123k = z3;
        this.f10124l = kVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((g0) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new g0(this.f10122j, this.f10123k, this.f10124l, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        InterfaceC0142c0 interfaceC0142c0;
        InterfaceC0142c0 interfaceC0142c02;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f10121i;
        if (i3 == 0) {
            R1.a.e(obj);
            interfaceC0142c0 = this.f10122j;
            q.m mVar = (q.m) interfaceC0142c0.getValue();
            if (mVar != null) {
                q.i nVar = this.f10123k ? new q.n(mVar) : new q.l(mVar);
                q.k kVar = this.f10124l;
                if (kVar != null) {
                    this.f10120h = interfaceC0142c0;
                    this.f10121i = 1;
                    if (kVar.b(nVar, this) == aVar) {
                        return aVar;
                    }
                    interfaceC0142c02 = interfaceC0142c0;
                }
                interfaceC0142c0.setValue(null);
            }
            return R1.y.f4171a;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        interfaceC0142c02 = this.f10120h;
        R1.a.e(obj);
        interfaceC0142c0 = interfaceC0142c02;
        interfaceC0142c0.setValue(null);
        return R1.y.f4171a;
    }
}
