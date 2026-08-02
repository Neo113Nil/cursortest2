package I;

/* loaded from: classes.dex */
public final class h0 extends J0.b {

    /* renamed from: h, reason: collision with root package name */
    public g1.d f653h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f654i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f655j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j0 f656k;

    /* renamed from: l, reason: collision with root package name */
    public int f657l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(j0 j0Var, J0.b bVar) {
        super(bVar);
        this.f656k = j0Var;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        this.f655j = obj;
        this.f657l |= Integer.MIN_VALUE;
        return this.f656k.c(null, this);
    }
}
