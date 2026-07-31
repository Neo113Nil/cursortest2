package e1;

/* loaded from: classes.dex */
public final class S extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public A2.k f4656d;

    /* renamed from: e, reason: collision with root package name */
    public s2.a f4657e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f4658f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ A2.k f4659g;

    /* renamed from: h, reason: collision with root package name */
    public int f4660h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(A2.k kVar, R1.c cVar) {
        super(cVar);
        this.f4659g = kVar;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f4658f = obj;
        this.f4660h |= Integer.MIN_VALUE;
        return this.f4659g.l(this);
    }
}
