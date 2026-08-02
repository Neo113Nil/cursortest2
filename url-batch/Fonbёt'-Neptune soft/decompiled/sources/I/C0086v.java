package I;

/* renamed from: I.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0086v extends J0.b {

    /* renamed from: h, reason: collision with root package name */
    public P f713h;

    /* renamed from: i, reason: collision with root package name */
    public g1.d f714i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f715j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ P f716k;

    /* renamed from: l, reason: collision with root package name */
    public int f717l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0086v(P p2, J0.b bVar) {
        super(bVar);
        this.f716k = p2;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        this.f715j = obj;
        this.f717l |= Integer.MIN_VALUE;
        return P.a(this.f716k, this);
    }
}
