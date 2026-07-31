package s2;

/* loaded from: classes.dex */
public final class f extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f8373g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g f8374h;

    /* renamed from: i, reason: collision with root package name */
    public int f8375i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, X1.c cVar) {
        super(cVar);
        this.f8374h = gVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f8373g = obj;
        this.f8375i |= Integer.MIN_VALUE;
        Object E3 = this.f8374h.E(null, 0, 0L, this);
        return E3 == W1.a.f4608d ? E3 : new n(E3);
    }
}
