package q6;

/* loaded from: classes.dex */
public final class k extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public l f7384d;

    /* renamed from: e, reason: collision with root package name */
    public Object f7385e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7386i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f7387l;

    /* renamed from: m, reason: collision with root package name */
    public int f7388m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, V5.b bVar) {
        super(bVar);
        this.f7387l = lVar;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f7386i = obj;
        this.f7388m |= Integer.MIN_VALUE;
        return this.f7387l.a(null, this);
    }
}
