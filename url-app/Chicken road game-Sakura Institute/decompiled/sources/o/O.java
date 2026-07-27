package o;

/* loaded from: classes.dex */
public final class O extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public Q f8675j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f8676k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q f8677l;

    /* renamed from: m, reason: collision with root package name */
    public int f8678m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(Q q2, E2.c cVar) {
        super(cVar);
        this.f8677l = q2;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f8676k = obj;
        this.f8678m |= Integer.MIN_VALUE;
        return this.f8677l.a(this);
    }
}
