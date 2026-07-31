package e1;

/* renamed from: e1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0374x extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public C0351N f4752d;

    /* renamed from: e, reason: collision with root package name */
    public int f4753e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f4754f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0351N f4755g;

    /* renamed from: h, reason: collision with root package name */
    public int f4756h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0374x(C0351N c0351n, R1.c cVar) {
        super(cVar);
        this.f4755g = c0351n;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f4754f = obj;
        this.f4756h |= Integer.MIN_VALUE;
        return this.f4755g.e(this);
    }
}
