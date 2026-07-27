package f1;

/* loaded from: classes.dex */
public final class V extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public e3.c f6549j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6550k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f6551l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ X f6552m;

    /* renamed from: n, reason: collision with root package name */
    public int f6553n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(X x2, E2.c cVar) {
        super(cVar);
        this.f6552m = x2;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f6551l = obj;
        this.f6553n |= Integer.MIN_VALUE;
        return this.f6552m.c(null, this);
    }
}
