package l;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class E0 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F0 f2805a;

    public E0(F0 f02) {
        this.f2805a = f02;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0182B c0182b;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        F0 f02 = this.f2805a;
        if (action == 0 && (c0182b = f02.f2830z) != null && c0182b.isShowing() && x2 >= 0 && x2 < f02.f2830z.getWidth() && y2 >= 0 && y2 < f02.f2830z.getHeight()) {
            f02.f2826v.postDelayed(f02.f2822r, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        f02.f2826v.removeCallbacks(f02.f2822r);
        return false;
    }
}
