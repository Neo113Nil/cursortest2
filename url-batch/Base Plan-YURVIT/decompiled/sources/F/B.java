package F;

/* loaded from: classes.dex */
public final class B extends I0.b {

    /* renamed from: h, reason: collision with root package name */
    public P f224h;

    /* renamed from: i, reason: collision with root package name */
    public int f225i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f226j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ P f227k;

    /* renamed from: l, reason: collision with root package name */
    public int f228l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(P p2, I0.b bVar) {
        super(bVar);
        this.f227k = p2;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        this.f226j = obj;
        this.f228l |= Integer.MIN_VALUE;
        return this.f227k.h(this);
    }
}
