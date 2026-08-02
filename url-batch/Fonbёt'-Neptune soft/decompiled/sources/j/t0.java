package j;

/* loaded from: classes.dex */
public final class t0 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3051e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u0 f3052f;

    public /* synthetic */ t0(u0 u0Var, int i2) {
        this.f3051e = i2;
        this.f3052f = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3051e) {
            case 0:
                this.f3052f.c(false);
                break;
            default:
                this.f3052f.a();
                break;
        }
    }
}
