package d7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c extends i6.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2337g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f2338h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, g6.c cVar) {
        super(cVar);
        this.f2338h = dVar;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        this.f2337g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f2338h.a(null, this);
    }
}
