package defpackage;

import android.os.Build;
import android.window.BackEvent;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class d7 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final long e;

    public d7(BackEvent backEvent) {
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
