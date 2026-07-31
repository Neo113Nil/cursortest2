package k0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f extends i6.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4157g;

    /* renamed from: h, reason: collision with root package name */
    public int f4158h;
    public final /* synthetic */ d7.d i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d7.d dVar, g6.c cVar) {
        super(cVar);
        this.i = dVar;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        this.f4157g = obj;
        this.f4158h |= Integer.MIN_VALUE;
        return this.i.a(null, this);
    }
}
