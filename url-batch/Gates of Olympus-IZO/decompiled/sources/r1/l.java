package r1;

import I.InterfaceC0088c0;
import java.util.List;
import java.util.Set;
import k2.InterfaceC0550w;
import n2.C0692Q;
import q1.C0784h;

/* loaded from: classes.dex */
public final class l extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0088c0 f7236e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f7237f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ S.t f7238g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(InterfaceC0088c0 interfaceC0088c0, p pVar, S.t tVar, P1.d dVar) {
        super(2, dVar);
        this.f7236e = interfaceC0088c0;
        this.f7237f = pVar;
        this.f7238g = tVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new l(this.f7236e, this.f7237f, this.f7238g, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        l lVar = (l) create((InterfaceC0550w) obj, (P1.d) obj2);
        L1.z zVar = L1.z.f2729a;
        lVar.invokeSuspend(zVar);
        return zVar;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        I2.l.Q(obj);
        for (C0784h c0784h : (Set) this.f7236e.getValue()) {
            p pVar = this.f7237f;
            if (!((List) ((C0692Q) pVar.b().f6916e.f6272d).getValue()).contains(c0784h) && !this.f7238g.contains(c0784h)) {
                pVar.b().b(c0784h);
            }
        }
        return L1.z.f2729a;
    }
}
