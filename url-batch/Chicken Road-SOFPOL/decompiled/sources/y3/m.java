package y3;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f8909h;
    public final /* synthetic */ s0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(s0 s0Var, g6.c cVar) {
        super(2, cVar);
        this.i = s0Var;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        return ((m) l((g6.c) obj2, (s0) obj)).p(c6.m.f1757a);
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        m mVar = new m(this.i, cVar);
        mVar.f8909h = obj;
        return mVar;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        s6.a.K(obj);
        s0 s0Var = (s0) this.f8909h;
        return Boolean.valueOf((s0Var instanceof c) && ((c) s0Var).f8939a <= ((c) this.i).f8939a);
    }
}
