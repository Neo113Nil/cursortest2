package q;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f7266e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f f7267i;

    public /* synthetic */ b(f fVar, Bundle bundle, int i2) {
        this.f7265d = i2;
        this.f7267i = fVar;
        this.f7266e = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7265d) {
            case 0:
                this.f7267i.f7285f.onUnminimized(this.f7266e);
                break;
            case 1:
                this.f7267i.f7285f.onMessageChannelReady(this.f7266e);
                break;
            case 2:
                this.f7267i.f7285f.onWarmupCompleted(this.f7266e);
                break;
            default:
                this.f7267i.f7285f.onMinimized(this.f7266e);
                break;
        }
    }
}
