package L1;

/* renamed from: L1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0202c extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3357g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f3358h;

    /* renamed from: i, reason: collision with root package name */
    public int f3359i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0202c(e eVar, X1.c cVar) {
        super(cVar);
        this.f3358h = eVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f3357g = obj;
        this.f3359i |= Integer.MIN_VALUE;
        return this.f3358h.a(this);
    }
}
