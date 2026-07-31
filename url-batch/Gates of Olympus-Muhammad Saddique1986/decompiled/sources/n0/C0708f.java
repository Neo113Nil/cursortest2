package n0;

import android.view.MotionEvent;

/* renamed from: n0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0708f {

    /* renamed from: a, reason: collision with root package name */
    public static final C0708f f7282a = new C0708f();

    public final long a(MotionEvent motionEvent, int i3) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i3);
        rawY = motionEvent.getRawY(i3);
        return l0.c.e(rawX, rawY);
    }
}
