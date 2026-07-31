package k;

/* loaded from: classes.dex */
public final class t0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5105f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u0 f5106g;

    public /* synthetic */ t0(u0 u0Var, int i7) {
        this.f5105f = i7;
        this.f5106g = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5105f) {
            case 0:
                this.f5106g.c(false);
                break;
            default:
                this.f5106g.a();
                break;
        }
    }
}
