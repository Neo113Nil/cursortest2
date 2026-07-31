package L1;

/* loaded from: classes.dex */
public final class d extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public e f3360g;

    /* renamed from: h, reason: collision with root package name */
    public String f3361h;

    /* renamed from: i, reason: collision with root package name */
    public long f3362i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f3363j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e f3364k;

    /* renamed from: l, reason: collision with root package name */
    public int f3365l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, X1.c cVar) {
        super(cVar);
        this.f3364k = eVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f3363j = obj;
        this.f3365l |= Integer.MIN_VALUE;
        return this.f3364k.b(this);
    }
}
