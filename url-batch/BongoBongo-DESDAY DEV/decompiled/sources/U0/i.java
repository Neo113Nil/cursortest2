package U0;

import android.view.Choreographer;
import com.winfour.winrandom.ui.RandomDisplayView;

/* loaded from: classes.dex */
public final class i implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RandomDisplayView f885a;

    public i(RandomDisplayView randomDisplayView) {
        this.f885a = randomDisplayView;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        RandomDisplayView randomDisplayView = this.f885a;
        if (randomDisplayView.i) {
            float f2 = randomDisplayView.f2124h + 0.08f;
            randomDisplayView.f2124h = f2;
            if (f2 >= 1.0f) {
                randomDisplayView.f2124h = 1.0f;
                randomDisplayView.i = false;
            }
            randomDisplayView.invalidate();
            if (randomDisplayView.i) {
                Choreographer.getInstance().postFrameCallback(this);
            }
        }
    }
}
