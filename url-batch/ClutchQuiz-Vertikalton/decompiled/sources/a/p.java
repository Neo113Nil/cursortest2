package a;

/* loaded from: classes.dex */
public final class p extends g1.g implements f1.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1221b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f1222c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(x xVar, int i) {
        super(0);
        this.f1221b = i;
        this.f1222c = xVar;
    }

    @Override // f1.a
    public final Object c() {
        switch (this.f1221b) {
            case 0:
                this.f1222c.c();
                break;
            case 1:
                this.f1222c.b();
                break;
            default:
                this.f1222c.c();
                break;
        }
        return U0.i.f864a;
    }
}
