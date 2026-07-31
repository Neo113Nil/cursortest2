package u;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h0 extends i6.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f7011g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0 f7012h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, i6.c cVar) {
        super(cVar);
        this.f7012h = i0Var;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        this.f7011g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f7012h.h(null, null, this);
    }
}
