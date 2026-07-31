package L1;

/* loaded from: classes.dex */
public final class z extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3405g;

    /* renamed from: h, reason: collision with root package name */
    public int f3406h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x f3407i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(x xVar, V1.d dVar) {
        super(dVar);
        this.f3407i = xVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f3405g = obj;
        this.f3406h |= Integer.MIN_VALUE;
        return this.f3407i.e(null, this);
    }
}
