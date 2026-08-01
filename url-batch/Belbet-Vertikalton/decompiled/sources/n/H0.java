package n;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class H0 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I0 f3456a;

    public H0(I0 i02) {
        this.f3456a = i02;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0246B c0246b;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        I0 i02 = this.f3456a;
        if (action == 0 && (c0246b = i02.f3482z) != null && c0246b.isShowing() && x2 >= 0 && x2 < i02.f3482z.getWidth() && y2 >= 0 && y2 < i02.f3482z.getHeight()) {
            i02.f3478v.postDelayed(i02.f3474r, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        i02.f3478v.removeCallbacks(i02.f3474r);
        return false;
    }
}
