package y3;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h extends i6.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f8874g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c5.x f8875h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(c5.x xVar, i6.c cVar) {
        super(cVar);
        this.f8875h = xVar;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        this.f8874g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f8875h.i(this);
    }
}
