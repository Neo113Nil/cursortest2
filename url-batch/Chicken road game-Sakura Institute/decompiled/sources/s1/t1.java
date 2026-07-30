package s1;

import android.view.MotionEvent;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public static final t1 f8432a = new t1();

    public final boolean a(MotionEvent motionEvent, int i7) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i7);
        if (Float.isInfinite(rawX) || Float.isNaN(rawX)) {
            return false;
        }
        rawY = motionEvent.getRawY(i7);
        return (Float.isInfinite(rawY) || Float.isNaN(rawY)) ? false : true;
    }
}
