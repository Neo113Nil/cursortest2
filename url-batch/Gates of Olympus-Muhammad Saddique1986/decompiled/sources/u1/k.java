package u1;

import F.C0087c;
import I.C0143d;
import I.C0159l;
import I.C0167p;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import n.AbstractC0695v;
import t1.C1028h;

/* loaded from: classes.dex */
public final class k extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1028h f9601e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f9602f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ R.i f9603g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ S.t f9604h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f9605i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(C1028h c1028h, p pVar, R.i iVar, S.t tVar, o oVar) {
        super(2);
        this.f9601e = c1028h;
        this.f9602f = pVar;
        this.f9603g = iVar;
        this.f9604h = tVar;
        this.f9605i = oVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        C0167p c0167p = (C0167p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            C1028h c1028h = this.f9601e;
            boolean h3 = c0167p.h(c1028h);
            p pVar = this.f9602f;
            boolean f3 = h3 | c0167p.f(pVar);
            Object G3 = c0167p.G();
            if (f3 || G3 == C0159l.f2829a) {
                G3 = new R.h(this.f9604h, c1028h, pVar, 11);
                c0167p.a0(G3);
            }
            C0143d.c(c1028h, (InterfaceC0424c) G3, c0167p);
            AbstractC0695v.c(c1028h, this.f9603g, Q.f.b(-497631156, new C0087c(this.f9605i, 12, c1028h), c0167p), c0167p, 384);
        }
        return R1.y.f4171a;
    }
}
