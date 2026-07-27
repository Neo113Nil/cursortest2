package s0;

import android.view.MotionEvent;

/* renamed from: s0.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1175w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1175w0 f10404a = new C1175w0();

    public final boolean a(MotionEvent motionEvent, int i2) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i2);
        if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
            rawY = motionEvent.getRawY(i2);
            if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
                return true;
            }
        }
        return false;
    }
}
