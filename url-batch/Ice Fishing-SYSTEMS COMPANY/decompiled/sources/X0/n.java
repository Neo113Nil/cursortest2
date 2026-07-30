package X0;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3699a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f3700b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3701c;

    public /* synthetic */ n(v vVar, String str, int i) {
        this.f3699a = i;
        this.f3700b = vVar;
        this.f3701c = str;
    }

    @Override // X0.u
    public final void run() {
        switch (this.f3699a) {
            case 0:
                this.f3700b.r(this.f3701c);
                break;
            case 1:
                this.f3700b.q(this.f3701c);
                break;
            default:
                this.f3700b.t(this.f3701c);
                break;
        }
    }
}
