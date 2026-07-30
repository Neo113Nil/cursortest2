package a0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n implements p2.y {

    /* renamed from: a, reason: collision with root package name */
    public final s0.c f110a;

    /* renamed from: b, reason: collision with root package name */
    public final o f111b;

    /* renamed from: c, reason: collision with root package name */
    public long f112c = 0;

    public n(s0.c cVar, o oVar) {
        this.f110a = cVar;
        this.f111b = oVar;
    }

    @Override // p2.y
    public final long a(m2.i iVar, long j8, m2.k kVar, long j9) {
        long a3 = this.f111b.a();
        if (!u3.r.h(a3)) {
            a3 = this.f112c;
        }
        this.f112c = a3;
        return m2.h.c(m2.h.c(a8.m.c(iVar.f6317a, iVar.f6318b), a8.m.I(a3)), this.f110a.a(j9, 0L, kVar));
    }
}
