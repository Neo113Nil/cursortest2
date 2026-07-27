package f1;

/* loaded from: classes.dex */
public final class S extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public Y0.b f6536j;

    /* renamed from: k, reason: collision with root package name */
    public e3.a f6537k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f6538l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y0.b f6539m;

    /* renamed from: n, reason: collision with root package name */
    public int f6540n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(Y0.b bVar, E2.c cVar) {
        super(cVar);
        this.f6539m = bVar;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f6538l = obj;
        this.f6540n |= Integer.MIN_VALUE;
        return this.f6539m.x(this);
    }
}
