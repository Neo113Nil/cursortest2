package y4;

/* loaded from: classes.dex */
public final class x extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f8645d;

    /* renamed from: e, reason: collision with root package name */
    public int f8646e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1046o f8647i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C1046o c1046o, V5.b bVar) {
        super(bVar);
        this.f8647i = c1046o;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f8645d = obj;
        this.f8646e |= Integer.MIN_VALUE;
        return this.f8647i.a(null, this);
    }
}
