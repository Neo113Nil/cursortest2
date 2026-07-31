package E;

/* loaded from: classes.dex */
public final class j extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public q f664d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f665e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f666f;

    /* renamed from: g, reason: collision with root package name */
    public int f667g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(q qVar, R1.c cVar) {
        super(cVar);
        this.f666f = qVar;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f665e = obj;
        this.f667g |= Integer.MIN_VALUE;
        return this.f666f.a(this);
    }
}
