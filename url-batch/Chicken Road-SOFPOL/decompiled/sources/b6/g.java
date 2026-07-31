package b6;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements p6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f1321e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y0.m f1322f;

    public /* synthetic */ g(w wVar, y0.m mVar, int i, int i8) {
        this.f1320d = i8;
        this.f1321e = wVar;
        this.f1322f = mVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        int i = this.f1320d;
        m0.s sVar = (m0.s) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                k.c(this.f1321e, this.f1322f, sVar, m0.b.w(1));
                break;
            case 1:
                k.e(this.f1321e, this.f1322f, sVar, m0.b.w(1));
                break;
            default:
                k.y(this.f1321e, this.f1322f, sVar, m0.b.w(1));
                break;
        }
        return c6.m.f1757a;
    }
}
