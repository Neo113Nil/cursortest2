package t;

/* renamed from: t.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0975c extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public V1.k f8469g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f8470h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0976d f8471i;

    /* renamed from: j, reason: collision with root package name */
    public int f8472j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0975c(C0976d c0976d, X1.c cVar) {
        super(cVar);
        this.f8471i = c0976d;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f8470h = obj;
        this.f8472j |= Integer.MIN_VALUE;
        return this.f8471i.l(this);
    }
}
