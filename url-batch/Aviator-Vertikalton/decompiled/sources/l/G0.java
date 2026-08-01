package l;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class G0 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H0 f3226a;

    public G0(H0 h02) {
        this.f3226a = h02;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0233D c0233d;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        H0 h02 = this.f3226a;
        if (action == 0 && (c0233d = h02.f3252z) != null && c0233d.isShowing() && x2 >= 0 && x2 < h02.f3252z.getWidth() && y2 >= 0 && y2 < h02.f3252z.getHeight()) {
            h02.f3248v.postDelayed(h02.f3244r, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        h02.f3248v.removeCallbacks(h02.f3244r);
        return false;
    }
}
