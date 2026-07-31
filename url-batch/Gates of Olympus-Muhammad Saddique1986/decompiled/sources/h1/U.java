package h1;

/* loaded from: classes.dex */
public final class U extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public y2.c f6122g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6123h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6124i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ W f6125j;

    /* renamed from: k, reason: collision with root package name */
    public int f6126k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(W w2, X1.c cVar) {
        super(cVar);
        this.f6125j = w2;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f6124i = obj;
        this.f6126k |= Integer.MIN_VALUE;
        return this.f6125j.c(null, this);
    }
}
