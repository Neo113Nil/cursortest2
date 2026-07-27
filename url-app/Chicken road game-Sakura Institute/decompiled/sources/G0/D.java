package G0;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final /* synthetic */ class D implements Choreographer.FrameCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Runnable f3024e;

    public /* synthetic */ D(Runnable runnable, int i2) {
        this.f3023d = i2;
        this.f3024e = runnable;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j4) {
        switch (this.f3023d) {
            case 0:
                this.f3024e.run();
                break;
            default:
                this.f3024e.run();
                break;
        }
    }
}
