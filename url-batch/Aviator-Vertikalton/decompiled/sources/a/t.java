package a;

/* loaded from: classes.dex */
public final class t extends X0.g implements W0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f932b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0039B f933c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(C0039B c0039b, int i) {
        super(0);
        this.f932b = i;
        this.f933c = c0039b;
    }

    @Override // W0.a
    public final Object a() {
        switch (this.f932b) {
            case 0:
                this.f933c.b();
                break;
            case 1:
                this.f933c.a();
                break;
            default:
                this.f933c.b();
                break;
        }
        return N0.e.f676c;
    }
}
