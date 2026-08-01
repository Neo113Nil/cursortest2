package a;

/* loaded from: classes.dex */
public final class p extends Z0.e implements Y0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1115b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f1116c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(x xVar, int i) {
        super(0);
        this.f1115b = i;
        this.f1116c = xVar;
    }

    @Override // Y0.a
    public final Object a() {
        switch (this.f1115b) {
            case 0:
                this.f1116c.b();
                break;
            case 1:
                this.f1116c.a();
                break;
            default:
                this.f1116c.b();
                break;
        }
        return Q0.e.f694c;
    }
}
