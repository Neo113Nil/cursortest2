package k0;

/* loaded from: classes.dex */
public final class c extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public e f7358j;

    /* renamed from: k, reason: collision with root package name */
    public long f7359k;

    /* renamed from: l, reason: collision with root package name */
    public long f7360l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f7361m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e f7362n;

    /* renamed from: o, reason: collision with root package name */
    public int f7363o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, E2.c cVar) {
        super(cVar);
        this.f7362n = eVar;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f7361m = obj;
        this.f7363o |= Integer.MIN_VALUE;
        return this.f7362n.C0(0L, 0L, this);
    }
}
