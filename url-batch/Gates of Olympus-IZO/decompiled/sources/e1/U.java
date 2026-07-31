package e1;

/* loaded from: classes.dex */
public final class U extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public Object f4664d;

    /* renamed from: e, reason: collision with root package name */
    public s2.c f4665e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f4666f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ X f4667g;

    /* renamed from: h, reason: collision with root package name */
    public int f4668h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(X x3, R1.c cVar) {
        super(cVar);
        this.f4667g = x3;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f4666f = obj;
        this.f4668h |= Integer.MIN_VALUE;
        return this.f4667g.b(null, this);
    }
}
