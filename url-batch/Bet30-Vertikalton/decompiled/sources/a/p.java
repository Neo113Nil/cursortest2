package a;

/* loaded from: classes.dex */
public final class p extends X0.e implements W0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1080b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f1081c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(x xVar, int i) {
        super(0);
        this.f1080b = i;
        this.f1081c = xVar;
    }

    @Override // W0.a
    public final Object a() {
        switch (this.f1080b) {
            case 0:
                this.f1081c.b();
                break;
            case 1:
                this.f1081c.a();
                break;
            default:
                this.f1081c.b();
                break;
        }
        return P0.d.f627c;
    }
}
