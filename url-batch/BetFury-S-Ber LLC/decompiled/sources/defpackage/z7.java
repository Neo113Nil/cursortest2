package defpackage;

import android.os.Build;
import android.window.BackEvent;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class z7 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final long e;

    public z7(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        backEvent.getClass();
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        long frameTimeMillis = Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L;
        this.a = touchX;
        this.b = touchY;
        this.c = progress;
        this.d = swipeEdge;
        this.e = frameTimeMillis;
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + ", frameTimeMillis=" + this.e + ')';
    }
}
