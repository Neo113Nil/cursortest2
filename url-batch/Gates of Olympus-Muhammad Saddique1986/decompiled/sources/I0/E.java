package I0;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final /* synthetic */ class E implements Choreographer.FrameCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Runnable f3028e;

    public /* synthetic */ E(Runnable runnable, int i3) {
        this.f3027d = i3;
        this.f3028e = runnable;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        switch (this.f3027d) {
            case 0:
                this.f3028e.run();
                break;
            default:
                this.f3028e.run();
                break;
        }
    }
}
