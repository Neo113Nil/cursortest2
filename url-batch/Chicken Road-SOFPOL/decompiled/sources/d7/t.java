package d7;

/* loaded from: classes.dex */
public final class t extends i6.c {

    /* renamed from: g, reason: collision with root package name */
    public d f2420g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f2421h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f2422j;

    /* renamed from: k, reason: collision with root package name */
    public Object f2423k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(d dVar, g6.c cVar) {
        super(cVar);
        this.f2422j = dVar;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        this.f2421h = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f2422j.a(null, this);
    }
}
