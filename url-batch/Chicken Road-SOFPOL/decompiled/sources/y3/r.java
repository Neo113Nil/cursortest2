package y3;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r extends i6.c {

    /* renamed from: g, reason: collision with root package name */
    public a7.m f8930g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f8931h;
    public final /* synthetic */ b0 i;

    /* renamed from: j, reason: collision with root package name */
    public int f8932j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(b0 b0Var, i6.c cVar) {
        super(cVar);
        this.i = b0Var;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        this.f8931h = obj;
        this.f8932j |= Integer.MIN_VALUE;
        return b0.b(this.i, null, this);
    }
}
