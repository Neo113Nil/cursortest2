package j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v implements p6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f3924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x.f0 f3925e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p6.f f3926f;

    public v(long j7, x.f0 f0Var, p6.f fVar) {
        this.f3924d = j7;
        this.f3925e = f0Var;
        this.f3926f = fVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        m0.s sVar = (m0.s) obj;
        int intValue = ((Number) obj2).intValue();
        if (sVar.N(intValue & 1, (intValue & 3) != 2)) {
            k0.d.a(this.f3924d, ((o2) sVar.j(p2.f3856a)).f3830m, u0.h.d(417635459, new a0.v(2, this.f3925e, this.f3926f), sVar), sVar, 384);
        } else {
            sVar.Q();
        }
        return c6.m.f1757a;
    }
}
