package l;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class F0 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G0 f3226a;

    public F0(G0 g02) {
        this.f3226a = g02;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0234C c0234c;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        G0 g02 = this.f3226a;
        if (action == 0 && (c0234c = g02.f3252z) != null && c0234c.isShowing() && x2 >= 0 && x2 < g02.f3252z.getWidth() && y2 >= 0 && y2 < g02.f3252z.getHeight()) {
            g02.f3248v.postDelayed(g02.f3244r, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        g02.f3248v.removeCallbacks(g02.f3244r);
        return false;
    }
}
