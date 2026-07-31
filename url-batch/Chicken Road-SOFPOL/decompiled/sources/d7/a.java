package d7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a extends i6.c {

    /* renamed from: g, reason: collision with root package name */
    public e7.q f2332g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f2333h;
    public final /* synthetic */ z i;

    /* renamed from: j, reason: collision with root package name */
    public int f2334j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(z zVar, g6.c cVar) {
        super(cVar);
        this.i = zVar;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        this.f2333h = obj;
        this.f2334j |= Integer.MIN_VALUE;
        return this.i.c(null, this);
    }
}
