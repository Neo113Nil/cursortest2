package h1;

/* loaded from: classes.dex */
public final class Q extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public G1.g f6109g;

    /* renamed from: h, reason: collision with root package name */
    public y2.a f6110h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6111i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ G1.g f6112j;

    /* renamed from: k, reason: collision with root package name */
    public int f6113k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(G1.g gVar, X1.c cVar) {
        super(cVar);
        this.f6112j = gVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f6111i = obj;
        this.f6113k |= Integer.MIN_VALUE;
        return this.f6112j.l(this);
    }
}
