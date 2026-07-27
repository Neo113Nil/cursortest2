package f1;

/* loaded from: classes.dex */
public final class U extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public Object f6544j;

    /* renamed from: k, reason: collision with root package name */
    public e3.c f6545k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f6546l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ X f6547m;

    /* renamed from: n, reason: collision with root package name */
    public int f6548n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(X x2, E2.c cVar) {
        super(cVar);
        this.f6547m = x2;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f6546l = obj;
        this.f6548n |= Integer.MIN_VALUE;
        return this.f6547m.b(null, this);
    }
}
