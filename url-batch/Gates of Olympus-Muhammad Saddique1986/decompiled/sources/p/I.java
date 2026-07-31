package p;

/* loaded from: classes.dex */
public final class I extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public C0776m0 f7531g;

    /* renamed from: h, reason: collision with root package name */
    public C0790u f7532h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7533i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0776m0 f7534j;

    /* renamed from: k, reason: collision with root package name */
    public int f7535k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(C0776m0 c0776m0, X1.c cVar) {
        super(cVar);
        this.f7534j = c0776m0;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f7533i = obj;
        this.f7535k |= Integer.MIN_VALUE;
        return C0776m0.D0(this.f7534j, null, this);
    }
}
