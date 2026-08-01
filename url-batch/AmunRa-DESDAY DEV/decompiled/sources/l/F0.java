package l;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class F0 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G0 f2936a;

    public F0(G0 g02) {
        this.f2936a = g02;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0187C c0187c;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        G0 g02 = this.f2936a;
        if (action == 0 && (c0187c = g02.f2961z) != null && c0187c.isShowing() && x2 >= 0 && x2 < g02.f2961z.getWidth() && y2 >= 0 && y2 < g02.f2961z.getHeight()) {
            g02.f2957v.postDelayed(g02.f2953r, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        g02.f2957v.removeCallbacks(g02.f2953r);
        return false;
    }
}
