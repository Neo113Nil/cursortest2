package D;

/* loaded from: classes.dex */
public final class P extends y0.b {

    /* renamed from: h, reason: collision with root package name */
    public F0.o f115h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f116i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ S f117j;

    /* renamed from: k, reason: collision with root package name */
    public int f118k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(S s2, y0.b bVar) {
        super(bVar);
        this.f117j = s2;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        this.f116i = obj;
        this.f118k |= Integer.MIN_VALUE;
        return this.f117j.k(null, false, this);
    }
}
