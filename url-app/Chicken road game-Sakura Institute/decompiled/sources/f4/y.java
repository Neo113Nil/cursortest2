package f4;

/* loaded from: classes.dex */
public final class y extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f3358f;

    /* renamed from: g, reason: collision with root package name */
    public int f3359g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z f3360h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, h6.d dVar) {
        super(dVar);
        this.f3360h = zVar;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f3358f = obj;
        this.f3359g |= Integer.MIN_VALUE;
        return this.f3360h.k(null, this);
    }
}
