package r6;

/* loaded from: classes.dex */
public final class j extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public k f7563d;

    /* renamed from: e, reason: collision with root package name */
    public Object f7564e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7565i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f7566l;

    /* renamed from: m, reason: collision with root package name */
    public int f7567m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, V5.b bVar) {
        super(bVar);
        this.f7566l = kVar;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f7565i = obj;
        this.f7567m |= Integer.MIN_VALUE;
        return this.f7566l.a(null, this);
    }
}
