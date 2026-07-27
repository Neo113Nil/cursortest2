package u1;

import G0.D;
import android.view.Choreographer;

/* renamed from: u1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1223g {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new D(runnable, 1));
    }
}
