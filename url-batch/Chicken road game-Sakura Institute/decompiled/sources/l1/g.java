package l1;

import android.view.MotionEvent;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f5802a = new g();

    public final long a(MotionEvent motionEvent, int i7) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i7);
        rawY = motionEvent.getRawY(i7);
        return u3.r.a(rawX, rawY);
    }
}
