package b;

import android.window.BackEvent;

/* renamed from: b.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0241a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0241a f4145a = new C0241a();

    public final BackEvent a(float f3, float f4, float f5, int i3) {
        return new BackEvent(f3, f4, f5, i3);
    }

    public final float b(BackEvent backEvent) {
        Z1.i.f(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        Z1.i.f(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        Z1.i.f(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        Z1.i.f(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
