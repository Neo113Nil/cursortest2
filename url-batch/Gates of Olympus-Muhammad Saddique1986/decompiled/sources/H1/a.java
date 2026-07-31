package H1;

/* loaded from: classes.dex */
public final class a extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2613g;

    /* renamed from: h, reason: collision with root package name */
    public int f2614h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b f2615i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, V1.d dVar) {
        super(dVar);
        this.f2615i = bVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f2613g = obj;
        this.f2614h |= Integer.MIN_VALUE;
        return this.f2615i.e(null, this);
    }
}
