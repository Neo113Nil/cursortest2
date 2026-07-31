package u0;

import android.view.MotionEvent;

/* renamed from: u0.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0989o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0989o0 f8379a = new C0989o0();

    public final boolean a(MotionEvent motionEvent, int i3) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i3);
        if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
            rawY = motionEvent.getRawY(i3);
            if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
                return true;
            }
        }
        return false;
    }
}
