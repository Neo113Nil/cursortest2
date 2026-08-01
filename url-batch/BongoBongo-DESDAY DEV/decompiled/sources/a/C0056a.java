package a;

import android.window.BackEvent;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0056a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0056a f1226a = new C0056a();

    public final BackEvent a(float f2, float f3, float f4, int i) {
        return new BackEvent(f2, f3, f4, i);
    }

    public final float b(BackEvent backEvent) {
        h1.d.e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        h1.d.e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        h1.d.e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        h1.d.e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
