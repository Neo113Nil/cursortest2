package H1;

/* loaded from: classes.dex */
public final class d extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2620g;

    /* renamed from: h, reason: collision with root package name */
    public int f2621h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b f2622i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, V1.d dVar) {
        super(dVar);
        this.f2622i = bVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f2620g = obj;
        this.f2621h |= Integer.MIN_VALUE;
        return this.f2622i.e(null, this);
    }
}
