package m;

/* loaded from: classes.dex */
public final class S extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public U f6660g;

    /* renamed from: h, reason: collision with root package name */
    public Object f6661h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6662i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ U f6663j;

    /* renamed from: k, reason: collision with root package name */
    public int f6664k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(U u3, X1.c cVar) {
        super(cVar);
        this.f6663j = u3;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f6662i = obj;
        this.f6664k |= Integer.MIN_VALUE;
        return U.i(this.f6663j, this);
    }
}
