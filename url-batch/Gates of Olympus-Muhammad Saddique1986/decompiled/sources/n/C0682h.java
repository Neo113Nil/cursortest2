package n;

import e2.InterfaceC0426e;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;

/* renamed from: n.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0682h extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0698y f7141h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0682h(C0698y c0698y, V1.d dVar) {
        super(2, dVar);
        this.f7141h = c0698y;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        C0682h c0682h = (C0682h) o((V1.d) obj2, (InterfaceC0835w) obj);
        R1.y yVar = R1.y.f4171a;
        c0682h.q(yVar);
        return yVar;
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C0682h(this.f7141h, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        R1.a.e(obj);
        C0698y c0698y = this.f7141h;
        q.g gVar = c0698y.D;
        if (gVar != null) {
            q.h hVar = new q.h(gVar);
            q.k kVar = c0698y.f7233s;
            if (kVar != null) {
                AbstractC0837y.r(c0698y.m0(), null, null, new C0676b(kVar, hVar, null), 3);
            }
            c0698y.D = null;
        }
        return R1.y.f4171a;
    }
}
