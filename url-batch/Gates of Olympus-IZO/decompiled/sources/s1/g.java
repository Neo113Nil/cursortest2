package s1;

import android.view.Choreographer;

/* loaded from: classes.dex */
public abstract class g {
    public static void a(final Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: s1.f
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j3) {
                runnable.run();
            }
        });
    }
}
