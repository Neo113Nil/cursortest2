package k;

/* loaded from: classes.dex */
public final class o0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14067a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f14068b;

    public /* synthetic */ o0(p0 p0Var, int i4) {
        this.f14067a = i4;
        this.f14068b = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14067a) {
            case 0:
                this.f14068b.c(false);
                break;
            default:
                this.f14068b.a();
                break;
        }
    }
}
