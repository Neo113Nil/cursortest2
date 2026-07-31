package u2;

/* loaded from: classes.dex */
public final class p extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9712g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f9713h;

    /* renamed from: i, reason: collision with root package name */
    public int f9714i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, V1.d dVar) {
        super(dVar);
        this.f9713h = qVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f9712g = obj;
        this.f9714i |= Integer.MIN_VALUE;
        return this.f9713h.e(null, this);
    }
}
