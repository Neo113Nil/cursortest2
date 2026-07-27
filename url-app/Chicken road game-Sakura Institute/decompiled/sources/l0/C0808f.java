package l0;

import a.AbstractC0345a;
import android.view.MotionEvent;

/* renamed from: l0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0808f {

    /* renamed from: a, reason: collision with root package name */
    public static final C0808f f7897a = new C0808f();

    public final long a(MotionEvent motionEvent, int i2) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i2);
        rawY = motionEvent.getRawY(i2);
        return AbstractC0345a.c(rawX, rawY);
    }
}
