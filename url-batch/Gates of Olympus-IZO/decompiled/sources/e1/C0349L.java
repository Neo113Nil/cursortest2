package e1;

/* renamed from: e1.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0349L extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public Z1.r f4628d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f4629e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0351N f4630f;

    /* renamed from: g, reason: collision with root package name */
    public int f4631g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0349L(C0351N c0351n, R1.c cVar) {
        super(cVar);
        this.f4630f = c0351n;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f4629e = obj;
        this.f4631g |= Integer.MIN_VALUE;
        return this.f4630f.i(null, false, this);
    }
}
