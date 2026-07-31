package w1;

import e2.InterfaceC0426e;
import q2.C0821h;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class g extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ G1.f f9874h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0821h f9875i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(G1.f fVar, C0821h c0821h, V1.d dVar) {
        super(2, dVar);
        this.f9874h = fVar;
        this.f9875i = c0821h;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        g gVar = (g) o((V1.d) obj2, (InterfaceC0835w) obj);
        R1.y yVar = R1.y.f4171a;
        gVar.q(yVar);
        return yVar;
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new g(this.f9874h, this.f9875i, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        C0821h c0821h = this.f9875i;
        R1.a.e(obj);
        try {
            c0821h.u(this.f9874h.call());
        } catch (Throwable th) {
            c0821h.u(R1.a.b(th));
        }
        return R1.y.f4171a;
    }
}
