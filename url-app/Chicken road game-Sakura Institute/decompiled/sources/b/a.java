package b;

import android.window.BackEvent;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1131a = new a();

    public final BackEvent a(float f9, float f10, float f11, int i7) {
        return new BackEvent(f9, f10, f11, i7);
    }

    public final float b(BackEvent backEvent) {
        r6.k.f(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        r6.k.f(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        r6.k.f(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        r6.k.f(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
