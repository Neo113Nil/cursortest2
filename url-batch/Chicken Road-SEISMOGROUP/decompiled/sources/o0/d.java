package o0;

import U.g;
import Y.f;
import a.AbstractC0016a;
import d0.p;
import m0.r;

/* loaded from: classes.dex */
public final class d extends f implements p {

    /* renamed from: f, reason: collision with root package name */
    public int f1117f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1118g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.b f1119h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n0.b bVar, W.d dVar) {
        super(dVar);
        this.f1119h = bVar;
    }

    @Override // Y.b
    public final W.d b(Object obj, W.d dVar) {
        d dVar2 = new d(this.f1119h, dVar);
        dVar2.f1118g = obj;
        return dVar2;
    }

    @Override // Y.b
    public final Object c(Object obj) {
        X.a aVar = X.a.f450b;
        int i2 = this.f1117f;
        if (i2 == 0) {
            AbstractC0016a.D(obj);
            r rVar = (r) this.f1118g;
            this.f1117f = 1;
            if (this.f1119h.b(rVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0016a.D(obj);
        }
        return g.f433a;
    }

    @Override // d0.p
    public final Object e(Object obj, Object obj2) {
        return ((d) b((r) obj, (W.d) obj2)).c(g.f433a);
    }
}
