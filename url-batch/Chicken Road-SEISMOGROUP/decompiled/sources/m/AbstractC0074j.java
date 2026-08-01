package m;

import android.view.Choreographer;

/* renamed from: m.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0074j {
    public static void a(final Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: m.i
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j2) {
                runnable.run();
            }
        });
    }
}
