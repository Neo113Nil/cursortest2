package P;

/* loaded from: classes.dex */
public final class B extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public Q f1950d;

    /* renamed from: e, reason: collision with root package name */
    public int f1951e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f1952i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q f1953l;

    /* renamed from: m, reason: collision with root package name */
    public int f1954m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(Q q4, X5.c cVar) {
        super(cVar);
        this.f1953l = q4;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f1952i = obj;
        this.f1954m |= Integer.MIN_VALUE;
        return this.f1953l.h(this);
    }
}
