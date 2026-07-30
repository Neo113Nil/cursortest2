package P0;

/* loaded from: classes.dex */
public final class h extends y0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f781h;

    /* renamed from: i, reason: collision with root package name */
    public int f782i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f783j;

    /* renamed from: k, reason: collision with root package name */
    public Object f784k;

    /* renamed from: l, reason: collision with root package name */
    public e f785l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, w0.d dVar) {
        super(dVar);
        this.f783j = iVar;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        this.f781h = obj;
        this.f782i |= Integer.MIN_VALUE;
        return this.f783j.d(null, this);
    }
}
