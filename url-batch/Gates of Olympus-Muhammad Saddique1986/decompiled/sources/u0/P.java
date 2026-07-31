package u0;

/* loaded from: classes.dex */
public final class P extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9239g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ S f9240h;

    /* renamed from: i, reason: collision with root package name */
    public int f9241i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(S s3, X1.c cVar) {
        super(cVar);
        this.f9240h = s3;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f9239g = obj;
        this.f9241i |= Integer.MIN_VALUE;
        this.f9240h.a(null, this);
        return W1.a.f4608d;
    }
}
