package p;

/* loaded from: classes.dex */
public final class Q extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public T f7571g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f7572h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ T f7573i;

    /* renamed from: j, reason: collision with root package name */
    public int f7574j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(T t3, X1.c cVar) {
        super(cVar);
        this.f7573i = t3;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f7572h = obj;
        this.f7574j |= Integer.MIN_VALUE;
        return this.f7573i.b(this);
    }
}
