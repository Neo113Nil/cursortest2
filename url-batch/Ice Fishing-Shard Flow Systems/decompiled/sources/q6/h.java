package q6;

/* loaded from: classes.dex */
public final class h extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f7371d;

    /* renamed from: e, reason: collision with root package name */
    public int f7372e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i f7373i;

    /* renamed from: l, reason: collision with root package name */
    public Object f7374l;

    /* renamed from: m, reason: collision with root package name */
    public e f7375m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, V5.b bVar) {
        super(bVar);
        this.f7373i = iVar;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f7371d = obj;
        this.f7372e |= Integer.MIN_VALUE;
        return this.f7373i.e(null, this);
    }
}
