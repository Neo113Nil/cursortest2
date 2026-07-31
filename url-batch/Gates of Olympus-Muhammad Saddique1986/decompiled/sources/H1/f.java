package H1;

/* loaded from: classes.dex */
public final class f extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2627g;

    /* renamed from: h, reason: collision with root package name */
    public int f2628h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b f2629i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar, V1.d dVar) {
        super(dVar);
        this.f2629i = bVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f2627g = obj;
        this.f2628h |= Integer.MIN_VALUE;
        return this.f2629i.e(null, this);
    }
}
