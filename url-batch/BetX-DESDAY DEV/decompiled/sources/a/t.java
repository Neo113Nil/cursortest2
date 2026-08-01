package a;

/* loaded from: classes.dex */
public final class t extends X0.g implements W0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f933b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0039B f934c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(C0039B c0039b, int i) {
        super(0);
        this.f933b = i;
        this.f934c = c0039b;
    }

    @Override // W0.a
    public final Object a() {
        switch (this.f933b) {
            case 0:
                this.f934c.b();
                break;
            case 1:
                this.f934c.a();
                break;
            default:
                this.f934c.b();
                break;
        }
        return N0.f.f677c;
    }
}
