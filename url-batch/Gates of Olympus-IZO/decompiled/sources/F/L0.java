package F;

import I.InterfaceC0088c0;
import k2.InterfaceC0550w;
import m.C0593d;

/* loaded from: classes.dex */
public final class L0 extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f1047e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0593d f1048f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f1049g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f1050h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q.h f1051i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0088c0 f1052j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(C0593d c0593d, float f3, boolean z3, q.h hVar, InterfaceC0088c0 interfaceC0088c0, P1.d dVar) {
        super(2, dVar);
        this.f1048f = c0593d;
        this.f1049g = f3;
        this.f1050h = z3;
        this.f1051i = hVar;
        this.f1052j = interfaceC0088c0;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new L0(this.f1048f, this.f1049g, this.f1050h, this.f1051i, this.f1052j, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((L0) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f1047e;
        q.h hVar = this.f1051i;
        InterfaceC0088c0 interfaceC0088c0 = this.f1052j;
        if (i3 == 0) {
            I2.l.Q(obj);
            C0593d c0593d = this.f1048f;
            float f3 = ((M0.e) c0593d.f5706e.getValue()).f2766d;
            float f4 = this.f1049g;
            if (!M0.e.a(f3, f4)) {
                if (this.f1050h) {
                    q.h hVar2 = (q.h) interfaceC0088c0.getValue();
                    this.f1047e = 2;
                    if (G.b.a(c0593d, f4, hVar2, hVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    M0.e eVar = new M0.e(f4);
                    this.f1047e = 1;
                    if (c0593d.e(eVar, this) == aVar) {
                        return aVar;
                    }
                }
            }
            return L1.z.f2729a;
        }
        if (i3 != 1 && i3 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        I2.l.Q(obj);
        interfaceC0088c0.setValue(hVar);
        return L1.z.f2729a;
    }
}
