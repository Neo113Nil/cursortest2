package m;

/* loaded from: classes.dex */
public final class X extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public Z f5648d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5649e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f5650f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Z f5651g;

    /* renamed from: h, reason: collision with root package name */
    public int f5652h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Z z3, R1.c cVar) {
        super(cVar);
        this.f5651g = z3;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f5650f = obj;
        this.f5652h |= Integer.MIN_VALUE;
        return Z.i(this.f5651g, this);
    }
}
