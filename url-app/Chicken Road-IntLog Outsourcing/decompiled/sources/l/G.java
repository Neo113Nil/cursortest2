package l;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class G implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H f10767a;

    public G(H h3) {
        this.f10767a = h3;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1245q c1245q;
        int action = motionEvent.getAction();
        int x5 = (int) motionEvent.getX();
        int y5 = (int) motionEvent.getY();
        H h3 = this.f10767a;
        if (action == 0 && (c1245q = h3.f10791v) != null && c1245q.isShowing() && x5 >= 0 && x5 < h3.f10791v.getWidth() && y5 >= 0 && y5 < h3.f10791v.getHeight()) {
            h3.f10787r.postDelayed(h3.f10783n, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        h3.f10787r.removeCallbacks(h3.f10783n);
        return false;
    }
}
