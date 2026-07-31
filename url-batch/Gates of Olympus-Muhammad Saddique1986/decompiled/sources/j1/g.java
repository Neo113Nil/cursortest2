package j1;

/* loaded from: classes.dex */
public final class g extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public i f6383g;

    /* renamed from: h, reason: collision with root package name */
    public C0557c f6384h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6385i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f6386j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i f6387k;

    /* renamed from: l, reason: collision with root package name */
    public int f6388l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, X1.c cVar) {
        super(cVar);
        this.f6387k = iVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f6386j = obj;
        this.f6388l |= Integer.MIN_VALUE;
        return this.f6387k.a(null, this);
    }
}
