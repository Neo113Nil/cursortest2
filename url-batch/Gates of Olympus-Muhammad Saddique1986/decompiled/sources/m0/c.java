package m0;

/* loaded from: classes.dex */
public final class c extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public e f6921g;

    /* renamed from: h, reason: collision with root package name */
    public long f6922h;

    /* renamed from: i, reason: collision with root package name */
    public long f6923i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f6924j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e f6925k;

    /* renamed from: l, reason: collision with root package name */
    public int f6926l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, X1.c cVar) {
        super(cVar);
        this.f6925k = eVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f6924j = obj;
        this.f6926l |= Integer.MIN_VALUE;
        return this.f6925k.z0(0L, 0L, this);
    }
}
