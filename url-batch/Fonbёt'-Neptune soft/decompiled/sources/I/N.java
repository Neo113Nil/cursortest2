package I;

/* loaded from: classes.dex */
public final class N extends J0.b {

    /* renamed from: h, reason: collision with root package name */
    public Q0.n f558h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f559i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ P f560j;

    /* renamed from: k, reason: collision with root package name */
    public int f561k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(P p2, J0.b bVar) {
        super(bVar);
        this.f560j = p2;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        this.f559i = obj;
        this.f561k |= Integer.MIN_VALUE;
        return this.f560j.j(null, false, this);
    }
}
