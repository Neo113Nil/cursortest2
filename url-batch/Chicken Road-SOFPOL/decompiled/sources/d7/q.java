package d7;

/* loaded from: classes.dex */
public final class q extends i6.c {

    /* renamed from: g, reason: collision with root package name */
    public d f2412g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f2413h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f2414j;

    /* renamed from: k, reason: collision with root package name */
    public Object f2415k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(d dVar, g6.c cVar) {
        super(cVar);
        this.f2414j = dVar;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        this.f2413h = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f2414j.a(null, this);
    }
}
