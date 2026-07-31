package v1;

import I0.E;
import android.view.Choreographer;

/* renamed from: v1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1164f {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new E(runnable, 1));
    }
}
