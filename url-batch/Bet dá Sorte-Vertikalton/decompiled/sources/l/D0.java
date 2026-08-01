package l;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class D0 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E0 f2820a;

    public D0(E0 e02) {
        this.f2820a = e02;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0181A c0181a;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        E0 e02 = this.f2820a;
        if (action == 0 && (c0181a = e02.f2845z) != null && c0181a.isShowing() && x2 >= 0 && x2 < e02.f2845z.getWidth() && y2 >= 0 && y2 < e02.f2845z.getHeight()) {
            e02.f2841v.postDelayed(e02.f2837r, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        e02.f2841v.removeCallbacks(e02.f2837r);
        return false;
    }
}
