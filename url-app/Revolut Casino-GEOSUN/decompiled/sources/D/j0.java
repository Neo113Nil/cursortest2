package D;

/* loaded from: classes.dex */
public final class j0 extends y0.b {

    /* renamed from: h, reason: collision with root package name */
    public U0.d f214h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f215i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f216j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l0 f217k;

    /* renamed from: l, reason: collision with root package name */
    public int f218l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(l0 l0Var, y0.b bVar) {
        super(bVar);
        this.f217k = l0Var;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        this.f216j = obj;
        this.f218l |= Integer.MIN_VALUE;
        return this.f217k.c(null, this);
    }
}
