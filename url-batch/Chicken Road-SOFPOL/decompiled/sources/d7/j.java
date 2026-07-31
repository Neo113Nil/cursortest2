package d7;

/* loaded from: classes.dex */
public final class j extends i6.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2374g;

    /* renamed from: h, reason: collision with root package name */
    public int f2375h;
    public final /* synthetic */ k i;

    /* renamed from: j, reason: collision with root package name */
    public Object f2376j;

    /* renamed from: k, reason: collision with root package name */
    public g f2377k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, g6.c cVar) {
        super(cVar);
        this.i = kVar;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        this.f2374g = obj;
        this.f2375h |= Integer.MIN_VALUE;
        return this.i.c(null, this);
    }
}
