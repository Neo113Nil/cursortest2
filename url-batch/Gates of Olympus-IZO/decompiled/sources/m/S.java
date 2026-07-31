package m;

/* loaded from: classes.dex */
public final class S extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public Z f5625d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f5626e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Z f5627f;

    /* renamed from: g, reason: collision with root package name */
    public int f5628g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(Z z3, R1.c cVar) {
        super(cVar);
        this.f5627f = z3;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f5626e = obj;
        this.f5628g |= Integer.MIN_VALUE;
        return Z.h(this.f5627f, this);
    }
}
