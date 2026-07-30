package h;

/* loaded from: classes.dex */
public final class r0 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2269e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s0 f2270f;

    public /* synthetic */ r0(s0 s0Var, int i2) {
        this.f2269e = i2;
        this.f2270f = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2269e) {
            case 0:
                this.f2270f.c(false);
                break;
            default:
                this.f2270f.a();
                break;
        }
    }
}
