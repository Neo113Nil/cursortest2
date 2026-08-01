package defpackage;

import android.os.Build;
import android.window.BackEvent;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class r7 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final long e;

    public r7(BackEvent backEvent) {
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
