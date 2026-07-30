package f7;

/* loaded from: classes.dex */
public final class n extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f3518f;

    /* renamed from: g, reason: collision with root package name */
    public int f3519g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e0.e f3520h;

    /* renamed from: i, reason: collision with root package name */
    public a0.l0 f3521i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(e0.e eVar, h6.d dVar) {
        super(dVar);
        this.f3520h = eVar;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f3518f = obj;
        this.f3519g |= Integer.MIN_VALUE;
        return this.f3520h.b(null, this);
    }
}
