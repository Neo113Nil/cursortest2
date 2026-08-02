package androidx.fragment.app;

/* renamed from: androidx.fragment.app.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0218w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4988a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f4989b;

    public /* synthetic */ RunnableC0218w(F f4, int i4) {
        this.f4988a = i4;
        this.f4989b = f4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4988a) {
            case 0:
                this.f4989b.startPostponedEnterTransition();
                break;
            default:
                this.f4989b.callStartTransitionListener(false);
                break;
        }
    }
}
