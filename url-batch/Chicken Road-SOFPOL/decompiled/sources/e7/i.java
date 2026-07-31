package e7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i extends i6.c {

    /* renamed from: g, reason: collision with root package name */
    public j f2553g;

    /* renamed from: h, reason: collision with root package name */
    public Object f2554h;
    public /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f2555j;

    /* renamed from: k, reason: collision with root package name */
    public int f2556k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, g6.c cVar) {
        super(cVar);
        this.f2555j = jVar;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        this.i = obj;
        this.f2556k |= Integer.MIN_VALUE;
        return this.f2555j.a(null, this);
    }
}
