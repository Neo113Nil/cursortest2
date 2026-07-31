package n;

import e2.InterfaceC0426e;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;

/* renamed from: n.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0681g extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0698y f7130h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0681g(C0698y c0698y, V1.d dVar) {
        super(2, dVar);
        this.f7130h = c0698y;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        C0681g c0681g = (C0681g) o((V1.d) obj2, (InterfaceC0835w) obj);
        R1.y yVar = R1.y.f4171a;
        c0681g.q(yVar);
        return yVar;
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C0681g(this.f7130h, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        R1.a.e(obj);
        C0698y c0698y = this.f7130h;
        if (c0698y.D == null) {
            q.g gVar = new q.g();
            q.k kVar = c0698y.f7233s;
            if (kVar != null) {
                AbstractC0837y.r(c0698y.m0(), null, null, new C0674a(kVar, gVar, null), 3);
            }
            c0698y.D = gVar;
        }
        return R1.y.f4171a;
    }
}
