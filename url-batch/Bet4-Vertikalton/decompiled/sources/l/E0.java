package l;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class E0 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F0 f2778a;

    public E0(F0 f02) {
        this.f2778a = f02;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0178A c0178a;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        F0 f02 = this.f2778a;
        if (action == 0 && (c0178a = f02.f2804z) != null && c0178a.isShowing() && x2 >= 0 && x2 < f02.f2804z.getWidth() && y2 >= 0 && y2 < f02.f2804z.getHeight()) {
            f02.f2800v.postDelayed(f02.f2796r, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        f02.f2800v.removeCallbacks(f02.f2796r);
        return false;
    }
}
