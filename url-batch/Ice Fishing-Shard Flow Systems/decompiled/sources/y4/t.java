package y4;

/* loaded from: classes.dex */
public final class t extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f8626d;

    /* renamed from: e, reason: collision with root package name */
    public int f8627e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1046o f8628i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(C1046o c1046o, V5.b bVar) {
        super(bVar);
        this.f8628i = c1046o;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f8626d = obj;
        this.f8627e |= Integer.MIN_VALUE;
        return this.f8628i.a(null, this);
    }
}
