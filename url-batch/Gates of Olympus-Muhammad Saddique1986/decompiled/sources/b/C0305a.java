package b;

import android.window.BackEvent;

/* renamed from: b.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0305a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0305a f5280a = new C0305a();

    public final BackEvent a(float f3, float f4, float f5, int i3) {
        return new BackEvent(f3, f4, f5, i3);
    }

    public final float b(BackEvent backEvent) {
        f2.j.f(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        f2.j.f(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        f2.j.f(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        f2.j.f(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
