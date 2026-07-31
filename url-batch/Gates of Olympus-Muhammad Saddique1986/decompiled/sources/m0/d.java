package m0;

/* loaded from: classes.dex */
public final class d extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public e f6927g;

    /* renamed from: h, reason: collision with root package name */
    public long f6928h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6929i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f6930j;

    /* renamed from: k, reason: collision with root package name */
    public int f6931k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, X1.c cVar) {
        super(cVar);
        this.f6930j = eVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f6929i = obj;
        this.f6931k |= Integer.MIN_VALUE;
        return this.f6930j.B0(0L, this);
    }
}
