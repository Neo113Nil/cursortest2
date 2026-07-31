package I;

/* renamed from: I.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0104k0 extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public C0106l0 f2267d;

    /* renamed from: e, reason: collision with root package name */
    public Y1.c f2268e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f2269f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0106l0 f2270g;

    /* renamed from: h, reason: collision with root package name */
    public int f2271h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0104k0(C0106l0 c0106l0, R1.c cVar) {
        super(cVar);
        this.f2270g = c0106l0;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f2269f = obj;
        this.f2271h |= Integer.MIN_VALUE;
        return this.f2270g.j(null, this);
    }
}
