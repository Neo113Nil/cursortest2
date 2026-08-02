package I;

/* loaded from: classes.dex */
public final class g0 extends J0.b {

    /* renamed from: h, reason: collision with root package name */
    public Object f642h;

    /* renamed from: i, reason: collision with root package name */
    public g1.d f643i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f644j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j0 f645k;

    /* renamed from: l, reason: collision with root package name */
    public int f646l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(j0 j0Var, J0.b bVar) {
        super(bVar);
        this.f645k = j0Var;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        this.f644j = obj;
        this.f646l |= Integer.MIN_VALUE;
        return this.f645k.b(null, this);
    }
}
