package n;

/* renamed from: n.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0655j extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public C0658m f6095d;

    /* renamed from: e, reason: collision with root package name */
    public long f6096e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f6097f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0658m f6098g;

    /* renamed from: h, reason: collision with root package name */
    public int f6099h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0655j(C0658m c0658m, R1.c cVar) {
        super(cVar);
        this.f6098g = c0658m;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f6097f = obj;
        this.f6099h |= Integer.MIN_VALUE;
        return this.f6098g.f(0L, null, this);
    }
}
