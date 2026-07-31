package F;

/* loaded from: classes.dex */
public final class N extends I0.b {

    /* renamed from: h, reason: collision with root package name */
    public P0.n f277h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f278i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ P f279j;

    /* renamed from: k, reason: collision with root package name */
    public int f280k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(P p2, I0.b bVar) {
        super(bVar);
        this.f279j = p2;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        this.f278i = obj;
        this.f280k |= Integer.MIN_VALUE;
        return this.f279j.j(null, false, this);
    }
}
