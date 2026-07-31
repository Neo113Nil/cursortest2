package y3;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class o0 extends i6.c {

    /* renamed from: g, reason: collision with root package name */
    public i7.a f8915g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f8916h;
    public final /* synthetic */ c5.x i;

    /* renamed from: j, reason: collision with root package name */
    public int f8917j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(c5.x xVar, i6.c cVar) {
        super(cVar);
        this.i = xVar;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        this.f8916h = obj;
        this.f8917j |= Integer.MIN_VALUE;
        return this.i.p(this);
    }
}
