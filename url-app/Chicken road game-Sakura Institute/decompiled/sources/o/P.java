package o;

/* loaded from: classes.dex */
public final class P extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public Q f8691j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f8692k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q f8693l;

    /* renamed from: m, reason: collision with root package name */
    public int f8694m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(Q q2, E2.c cVar) {
        super(cVar);
        this.f8693l = q2;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f8692k = obj;
        this.f8694m |= Integer.MIN_VALUE;
        return this.f8693l.b(this);
    }
}
