package F;

/* loaded from: classes.dex */
public final class i0 extends I0.b {

    /* renamed from: h, reason: collision with root package name */
    public e1.d f374h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f375i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f376j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k0 f377k;

    /* renamed from: l, reason: collision with root package name */
    public int f378l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k0 k0Var, I0.b bVar) {
        super(bVar);
        this.f377k = k0Var;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        this.f376j = obj;
        this.f378l |= Integer.MIN_VALUE;
        return this.f377k.c(null, this);
    }
}
