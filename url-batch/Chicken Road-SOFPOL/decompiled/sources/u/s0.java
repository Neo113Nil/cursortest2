package u;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class s0 extends i6.c {

    /* renamed from: g, reason: collision with root package name */
    public long f7092g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f7093h;
    public final /* synthetic */ k5.c i;

    /* renamed from: j, reason: collision with root package name */
    public int f7094j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(k5.c cVar, i6.c cVar2) {
        super(cVar2);
        this.i = cVar;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        this.f7093h = obj;
        this.f7094j |= Integer.MIN_VALUE;
        return this.i.c(0L, 0L, this);
    }
}
