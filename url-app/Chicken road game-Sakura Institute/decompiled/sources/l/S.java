package l;

/* loaded from: classes.dex */
public final class S extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public U f7622j;

    /* renamed from: k, reason: collision with root package name */
    public Object f7623k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f7624l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ U f7625m;

    /* renamed from: n, reason: collision with root package name */
    public int f7626n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(U u4, E2.c cVar) {
        super(cVar);
        this.f7625m = u4;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f7624l = obj;
        this.f7626n |= Integer.MIN_VALUE;
        return U.t(this.f7625m, this);
    }
}
