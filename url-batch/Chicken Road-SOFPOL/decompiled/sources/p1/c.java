package p1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c extends i6.c {

    /* renamed from: g, reason: collision with root package name */
    public long f5718g;

    /* renamed from: h, reason: collision with root package name */
    public long f5719h;
    public /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f5720j;

    /* renamed from: k, reason: collision with root package name */
    public int f5721k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, i6.c cVar) {
        super(cVar);
        this.f5720j = eVar;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        this.i = obj;
        this.f5721k |= Integer.MIN_VALUE;
        return this.f5720j.s0(0L, 0L, this);
    }
}
