package u;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class z0 extends i6.c {

    /* renamed from: g, reason: collision with root package name */
    public q6.r f7135g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f7136h;
    public final /* synthetic */ e1 i;

    /* renamed from: j, reason: collision with root package name */
    public int f7137j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(e1 e1Var, i6.c cVar) {
        super(cVar);
        this.i = e1Var;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        this.f7136h = obj;
        this.f7137j |= Integer.MIN_VALUE;
        return this.i.a(0L, this);
    }
}
