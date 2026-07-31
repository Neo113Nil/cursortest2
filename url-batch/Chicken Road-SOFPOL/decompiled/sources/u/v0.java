package u;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v0 extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f7110h;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(long j7, g6.c cVar) {
        super(2, cVar);
        this.i = j7;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        v0 v0Var = (v0) l((g6.c) obj2, (c1) obj);
        c6.m mVar = c6.m.f1757a;
        v0Var.p(mVar);
        return mVar;
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        v0 v0Var = new v0(this.i, cVar);
        v0Var.f7110h = obj;
        return v0Var;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        s6.a.K(obj);
        e1 e1Var = ((c1) this.f7110h).f6948a;
        e1Var.c(e1Var.f6971k, this.i, 1);
        return c6.m.f1757a;
    }
}
