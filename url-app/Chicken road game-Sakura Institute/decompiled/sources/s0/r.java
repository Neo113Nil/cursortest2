package s0;

/* loaded from: classes.dex */
public final class r extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f10308j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1166s f10309k;

    /* renamed from: l, reason: collision with root package name */
    public int f10310l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C1166s c1166s, E2.c cVar) {
        super(cVar);
        this.f10309k = c1166s;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f10308j = obj;
        this.f10310l |= Integer.MIN_VALUE;
        this.f10309k.G(null, this);
        return D2.a.f2163d;
    }
}
