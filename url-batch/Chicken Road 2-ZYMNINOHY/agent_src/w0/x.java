package w0;

import W.AbstractC0108a;
import W.J;
import android.view.Choreographer;

/* loaded from: classes.dex */
public final class x extends w implements Choreographer.FrameCallback {
    @Override // w0.w
    public final void a() {
        long j4;
        this.f15914b.registerDisplayListener(this, J.o(null));
        this.f15913a.postFrameCallback(this);
        if (this.f15914b.getDisplay(0) != null) {
            j4 = (long) (1.0E9d / r0.getRefreshRate());
        } else {
            AbstractC0108a.s("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j4 = -9223372036854775807L;
        }
        this.f15916d = j4;
    }

    @Override // w0.w
    public final void b() {
        this.f15914b.unregisterDisplayListener(this);
        this.f15913a.removeFrameCallback(this);
        this.f15915c = -9223372036854775807L;
        this.f15916d = -9223372036854775807L;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j4) {
        this.f15915c = j4;
        this.f15913a.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i4) {
        long j4;
        if (i4 == 0) {
            this.f15913a.postFrameCallback(this);
            if (this.f15914b.getDisplay(0) != null) {
                j4 = (long) (1.0E9d / r5.getRefreshRate());
            } else {
                AbstractC0108a.s("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                j4 = -9223372036854775807L;
            }
            this.f15916d = j4;
        }
    }
}
