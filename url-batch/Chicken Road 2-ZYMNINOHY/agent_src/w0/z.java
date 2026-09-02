package w0;

import W.J;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;
import io.appmetrica.analytics.impl.ap;

/* loaded from: classes.dex */
public final class z extends w implements Choreographer$VsyncCallback {

    /* renamed from: e, reason: collision with root package name */
    public final Handler f15917e;

    public z(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager);
        this.f15917e = J.o(null);
    }

    @Override // w0.w
    public final void a() {
        this.f15914b.registerDisplayListener(this, J.o(null));
        this.f15913a.postVsyncCallback(this);
    }

    @Override // w0.w
    public final void b() {
        this.f15914b.unregisterDisplayListener(this);
        this.f15917e.removeCallbacksAndMessages(null);
        this.f15913a.removeVsyncCallback(this);
        this.f15915c = -9223372036854775807L;
        this.f15916d = -9223372036854775807L;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i4) {
        if (i4 == 0) {
            this.f15913a.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        long frameTimeNanos;
        Choreographer.FrameTimeline[] frameTimelines;
        long expectedPresentationTimeNanos;
        long expectedPresentationTimeNanos2;
        frameTimeNanos = frameData.getFrameTimeNanos();
        this.f15915c = frameTimeNanos;
        frameTimelines = frameData.getFrameTimelines();
        if (frameTimelines.length >= 2) {
            expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos();
            expectedPresentationTimeNanos2 = frameTimelines[0].getExpectedPresentationTimeNanos();
            long j4 = expectedPresentationTimeNanos - expectedPresentationTimeNanos2;
            this.f15916d = j4 != 0 ? j4 : -9223372036854775807L;
        } else {
            this.f15916d = -9223372036854775807L;
        }
        this.f15917e.postDelayed(new ap(8, this), 500L);
    }
}
