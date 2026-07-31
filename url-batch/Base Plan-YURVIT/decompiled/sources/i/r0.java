package i;

/* loaded from: classes.dex */
public final class r0 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2297e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s0 f2298f;

    public /* synthetic */ r0(s0 s0Var, int i2) {
        this.f2297e = i2;
        this.f2298f = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2297e) {
            case 0:
                this.f2298f.c(false);
                break;
            default:
                this.f2298f.a();
                break;
        }
    }
}
