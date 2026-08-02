package defpackage;

import android.os.Build;
import android.window.BackEvent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mx {
    public final float a;
    public final float b;
    public final int c;
    private final float d;
    private final long e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mx(BackEvent backEvent) {
        this(r1, r2, r3, r4, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        backEvent.getClass();
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.d + ", touchY=" + this.a + ", progress=" + this.b + ", swipeEdge=" + this.c + ", frameTimeMillis=" + this.e + ")";
    }

    public mx(float f, float f2, float f3, int i, long j) {
        this.d = f;
        this.a = f2;
        this.b = f3;
        this.c = i;
        this.e = j;
    }
}
