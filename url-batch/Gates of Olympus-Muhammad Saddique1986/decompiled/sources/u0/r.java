package u0;

/* loaded from: classes.dex */
public final class r extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9442g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1123s f9443h;

    /* renamed from: i, reason: collision with root package name */
    public int f9444i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C1123s c1123s, X1.c cVar) {
        super(cVar);
        this.f9443h = c1123s;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f9442g = obj;
        this.f9444i |= Integer.MIN_VALUE;
        this.f9443h.H(null, this);
        return W1.a.f4608d;
    }
}
