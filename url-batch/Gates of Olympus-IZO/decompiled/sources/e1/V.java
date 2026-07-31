package e1;

/* loaded from: classes.dex */
public final class V extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public s2.c f4669d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4670e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f4671f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ X f4672g;

    /* renamed from: h, reason: collision with root package name */
    public int f4673h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(X x3, R1.c cVar) {
        super(cVar);
        this.f4672g = x3;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f4671f = obj;
        this.f4673h |= Integer.MIN_VALUE;
        return this.f4672g.c(null, this);
    }
}
