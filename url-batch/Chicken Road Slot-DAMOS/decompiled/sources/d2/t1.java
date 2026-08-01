package d2;

import android.view.MotionEvent;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public static final t1 f3538a = new t1();

    public final boolean a(MotionEvent motionEvent, int i3) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i3);
        if ((Float.floatToRawIntBits(rawX) & Integer.MAX_VALUE) >= 2139095040) {
            return false;
        }
        rawY = motionEvent.getRawY(i3);
        return (Float.floatToRawIntBits(rawY) & Integer.MAX_VALUE) < 2139095040;
    }
}
