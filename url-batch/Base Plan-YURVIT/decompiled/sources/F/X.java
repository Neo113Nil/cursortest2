package F;

/* loaded from: classes.dex */
public final class X extends I0.b {

    /* renamed from: h, reason: collision with root package name */
    public Y f320h;

    /* renamed from: i, reason: collision with root package name */
    public Object f321i;

    /* renamed from: j, reason: collision with root package name */
    public Object f322j;

    /* renamed from: k, reason: collision with root package name */
    public a0 f323k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f324l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y f325m;

    /* renamed from: n, reason: collision with root package name */
    public int f326n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Y y2, I0.b bVar) {
        super(bVar);
        this.f325m = y2;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        this.f324l = obj;
        this.f326n |= Integer.MIN_VALUE;
        return this.f325m.b(null, this);
    }
}
