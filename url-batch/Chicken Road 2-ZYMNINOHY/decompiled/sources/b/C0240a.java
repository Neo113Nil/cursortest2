package b;

import android.window.BackEvent;

/* renamed from: b.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0240a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0240a f5212a = new C0240a();

    public final BackEvent a(float f4, float f5, float f6, int i4) {
        return new BackEvent(f4, f5, f6, i4);
    }

    public final float b(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
