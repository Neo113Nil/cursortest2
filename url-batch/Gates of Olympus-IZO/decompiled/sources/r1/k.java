package r1;

import F.C0060q;
import I.C0089d;
import I.C0105l;
import I.C0113p;
import e2.AbstractC0381e;
import q1.C0784h;

/* loaded from: classes.dex */
public final class k extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0784h f7231e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f7232f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ R.i f7233g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ S.t f7234h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f7235i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(C0784h c0784h, p pVar, R.i iVar, S.t tVar, o oVar) {
        super(2);
        this.f7231e = c0784h;
        this.f7232f = pVar;
        this.f7233g = iVar;
        this.f7234h = tVar;
        this.f7235i = oVar;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        C0113p c0113p = (C0113p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0113p.x()) {
            c0113p.L();
        } else {
            C0784h c0784h = this.f7231e;
            boolean h3 = c0113p.h(c0784h);
            p pVar = this.f7232f;
            boolean f3 = h3 | c0113p.f(pVar);
            Object G3 = c0113p.G();
            if (f3 || G3 == C0105l.f2272a) {
                G3 = new R.h(this.f7234h, c0784h, pVar, 10);
                c0113p.a0(G3);
            }
            C0089d.c(c0784h, (Y1.c) G3, c0113p);
            AbstractC0381e.f(c0784h, this.f7233g, Q.f.b(-497631156, new C0060q(this.f7235i, 6, c0784h), c0113p), c0113p, 384);
        }
        return L1.z.f2729a;
    }
}
