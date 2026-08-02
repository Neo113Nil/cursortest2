package j;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class K implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L f2872a;

    public K(L l2) {
        this.f2872a = l2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0242s c0242s;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        L l2 = this.f2872a;
        if (action == 0 && (c0242s = l2.f2896z) != null && c0242s.isShowing() && x2 >= 0 && x2 < l2.f2896z.getWidth() && y2 >= 0 && y2 < l2.f2896z.getHeight()) {
            l2.v.postDelayed(l2.f2889r, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        l2.v.removeCallbacks(l2.f2889r);
        return false;
    }
}
