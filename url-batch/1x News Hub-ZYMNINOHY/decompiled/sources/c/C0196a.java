package c;

import android.window.BackEvent;

/* renamed from: c.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0196a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0196a f2556a = new C0196a();

    public final BackEvent a(float f, float f3, float f4, int i3) {
        return new BackEvent(f, f3, f4, i3);
    }

    public final float b(BackEvent backEvent) {
        kotlin.jvm.internal.j.e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        kotlin.jvm.internal.j.e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        kotlin.jvm.internal.j.e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        kotlin.jvm.internal.j.e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
