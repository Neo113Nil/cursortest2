package e1;

/* renamed from: e1.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0375y extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public C0351N f4757d;

    /* renamed from: e, reason: collision with root package name */
    public Y f4758e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4759f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4760g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0351N f4761h;

    /* renamed from: i, reason: collision with root package name */
    public int f4762i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0375y(C0351N c0351n, P1.d dVar) {
        super(dVar);
        this.f4761h = c0351n;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f4760g = obj;
        this.f4762i |= Integer.MIN_VALUE;
        return C0351N.b(this.f4761h, false, this);
    }
}
