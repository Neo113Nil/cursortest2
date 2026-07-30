package f4;

/* loaded from: classes.dex */
public final class b0 extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f3299f;

    /* renamed from: g, reason: collision with root package name */
    public int f3300g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z f3301h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(z zVar, h6.d dVar) {
        super(dVar);
        this.f3301h = zVar;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f3299f = obj;
        this.f3300g |= Integer.MIN_VALUE;
        return this.f3301h.k(null, this);
    }
}
