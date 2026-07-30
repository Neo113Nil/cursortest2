package y4;

/* loaded from: classes.dex */
public final class q extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f8615d;

    /* renamed from: e, reason: collision with root package name */
    public int f8616e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q6.l f8617i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(q6.l lVar, V5.b bVar) {
        super(bVar);
        this.f8617i = lVar;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f8615d = obj;
        this.f8616e |= Integer.MIN_VALUE;
        return this.f8617i.a(null, this);
    }
}
