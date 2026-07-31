package u1;

import I.InterfaceC0142c0;
import e2.InterfaceC0426e;
import java.util.List;
import java.util.Set;
import q2.InterfaceC0835w;
import t1.C1028h;
import t2.C1045P;

/* loaded from: classes.dex */
public final class l extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f9606h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f9607i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ S.t f9608j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(InterfaceC0142c0 interfaceC0142c0, p pVar, S.t tVar, V1.d dVar) {
        super(2, dVar);
        this.f9606h = interfaceC0142c0;
        this.f9607i = pVar;
        this.f9608j = tVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        l lVar = (l) o((V1.d) obj2, (InterfaceC0835w) obj);
        R1.y yVar = R1.y.f4171a;
        lVar.q(yVar);
        return yVar;
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new l(this.f9606h, this.f9607i, this.f9608j, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        R1.a.e(obj);
        for (C1028h c1028h : (Set) this.f9606h.getValue()) {
            p pVar = this.f9607i;
            if (!((List) ((C1045P) pVar.b().f8895e.f8956d).getValue()).contains(c1028h) && !this.f9608j.contains(c1028h)) {
                pVar.b().b(c1028h);
            }
        }
        return R1.y.f4171a;
    }
}
