package b5;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q implements b {

    /* renamed from: d, reason: collision with root package name */
    public final i5.b f1170d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1171e;

    /* renamed from: i, reason: collision with root package name */
    public final wd.n f1172i;

    /* renamed from: r, reason: collision with root package name */
    public final hd.q f1173r = hd.h.b(new a1.b(6, this));

    /* JADX WARN: Multi-variable type inference failed */
    public q(i5.b bVar, String str, Function2 function2) {
        this.f1170d = bVar;
        this.f1171e = str;
        this.f1172i = (wd.n) function2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        hd.q qVar = this.f1173r;
        if (qVar.f4518e != hd.c0.f4498a) {
            ((i5.a) qVar.getValue()).close();
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function2, wd.n] */
    @Override // b5.b
    public final Object y(boolean z10, Function2 function2, nd.c cVar) {
        p pVar = (p) cVar.getContext().m(p.f1168e);
        o oVar = pVar != null ? pVar.f1169d : null;
        if (oVar != null) {
            return function2.invoke(oVar, cVar);
        }
        o oVar2 = new o(this.f1172i, (i5.a) this.f1173r.getValue());
        return ge.a0.B(new p(oVar2), new a3.t(function2, oVar2, (ld.a) null), cVar);
    }
}
