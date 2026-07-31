package y0;

/* loaded from: classes.dex */
public final class i extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public j f8813d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f8814e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f8815f;

    /* renamed from: g, reason: collision with root package name */
    public int f8816g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, R1.c cVar) {
        super(cVar);
        this.f8815f = jVar;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f8814e = obj;
        this.f8816g |= Integer.MIN_VALUE;
        return this.f8815f.a(0.0f, this);
    }
}
