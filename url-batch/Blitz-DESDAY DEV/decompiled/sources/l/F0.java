package l;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class F0 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G0 f2858a;

    public F0(G0 g02) {
        this.f2858a = g02;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0173B c0173b;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        G0 g02 = this.f2858a;
        if (action == 0 && (c0173b = g02.f2884z) != null && c0173b.isShowing() && x2 >= 0 && x2 < g02.f2884z.getWidth() && y2 >= 0 && y2 < g02.f2884z.getHeight()) {
            g02.f2880v.postDelayed(g02.f2876r, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        g02.f2880v.removeCallbacks(g02.f2876r);
        return false;
    }
}
