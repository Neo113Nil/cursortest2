package L1;

/* loaded from: classes.dex */
public final class w extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3396g;

    /* renamed from: h, reason: collision with root package name */
    public int f3397h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x f3398i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, V1.d dVar) {
        super(dVar);
        this.f3398i = xVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f3396g = obj;
        this.f3397h |= Integer.MIN_VALUE;
        return this.f3398i.e(null, this);
    }
}
