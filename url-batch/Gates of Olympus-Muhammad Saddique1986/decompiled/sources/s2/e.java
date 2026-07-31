package s2;

/* loaded from: classes.dex */
public final class e extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f8370g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g f8371h;

    /* renamed from: i, reason: collision with root package name */
    public int f8372i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, X1.c cVar) {
        super(cVar);
        this.f8371h = gVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f8370g = obj;
        this.f8372i |= Integer.MIN_VALUE;
        Object D = g.D(this.f8371h, this);
        return D == W1.a.f4608d ? D : new n(D);
    }
}
