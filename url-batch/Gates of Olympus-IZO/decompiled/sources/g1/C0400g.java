package g1;

/* renamed from: g1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0400g extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public C0402i f4814d;

    /* renamed from: e, reason: collision with root package name */
    public C0396c f4815e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4816f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4817g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0402i f4818h;

    /* renamed from: i, reason: collision with root package name */
    public int f4819i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0400g(C0402i c0402i, R1.c cVar) {
        super(cVar);
        this.f4818h = c0402i;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f4817g = obj;
        this.f4819i |= Integer.MIN_VALUE;
        return this.f4818h.a(null, this);
    }
}
