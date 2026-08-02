package I;

/* loaded from: classes.dex */
public final class B extends J0.b {

    /* renamed from: h, reason: collision with root package name */
    public P f506h;

    /* renamed from: i, reason: collision with root package name */
    public int f507i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f508j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ P f509k;

    /* renamed from: l, reason: collision with root package name */
    public int f510l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(P p2, J0.b bVar) {
        super(bVar);
        this.f509k = p2;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        this.f508j = obj;
        this.f510l |= Integer.MIN_VALUE;
        return this.f509k.h(this);
    }
}
