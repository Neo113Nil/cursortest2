package G;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f295b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f296c;

    public /* synthetic */ h(i iVar, int i2) {
        this.f295b = i2;
        this.f296c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f295b) {
            case 0:
                this.f296c.b();
                break;
            default:
                this.f296c.b();
                break;
        }
    }
}
