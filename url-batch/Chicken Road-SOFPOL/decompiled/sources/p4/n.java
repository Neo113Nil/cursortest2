package p4;

import java.util.List;
import java.util.Set;
import m0.z0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z0 f5760h;
    public final /* synthetic */ p i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w0.p f5761j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(z0 z0Var, p pVar, w0.p pVar2, g6.c cVar) {
        super(2, cVar);
        this.f5760h = z0Var;
        this.i = pVar;
        this.f5761j = pVar2;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        n nVar = (n) l((g6.c) obj2, (a7.u) obj);
        c6.m mVar = c6.m.f1757a;
        nVar.p(mVar);
        return mVar;
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        return new n(this.f5760h, this.i, this.f5761j, cVar);
    }

    @Override // i6.a
    public final Object p(Object obj) {
        s6.a.K(obj);
        for (o4.d dVar : (Set) this.f5760h.getValue()) {
            p pVar = this.i;
            if (!((List) pVar.b().f5635e.f2430d.getValue()).contains(dVar) && !this.f5761j.contains(dVar)) {
                pVar.b().c(dVar);
            }
        }
        return c6.m.f1757a;
    }
}
