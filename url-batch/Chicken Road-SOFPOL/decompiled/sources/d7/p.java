package d7;

/* loaded from: classes.dex */
public final class p extends i6.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2408g;

    /* renamed from: h, reason: collision with root package name */
    public int f2409h;
    public final /* synthetic */ m i;

    /* renamed from: j, reason: collision with root package name */
    public d f2410j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(m mVar, g6.c cVar) {
        super(cVar);
        this.i = mVar;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        this.f2408g = obj;
        this.f2409h |= Integer.MIN_VALUE;
        return this.i.c(null, this);
    }
}
