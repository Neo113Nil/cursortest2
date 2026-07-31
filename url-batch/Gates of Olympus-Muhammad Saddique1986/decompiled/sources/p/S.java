package p;

/* loaded from: classes.dex */
public final class S extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public T f7594g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f7595h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ T f7596i;

    /* renamed from: j, reason: collision with root package name */
    public int f7597j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(T t3, X1.c cVar) {
        super(cVar);
        this.f7596i = t3;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f7595h = obj;
        this.f7597j |= Integer.MIN_VALUE;
        return this.f7596i.c(this);
    }
}
