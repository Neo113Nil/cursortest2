package m;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class I0 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J0 f2929a;

    public I0(J0 j02) {
        this.f2929a = j02;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0184B c0184b;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        J0 j02 = this.f2929a;
        if (action == 0 && (c0184b = j02.f2955z) != null && c0184b.isShowing() && x2 >= 0 && x2 < j02.f2955z.getWidth() && y2 >= 0 && y2 < j02.f2955z.getHeight()) {
            j02.f2951v.postDelayed(j02.f2947r, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        j02.f2951v.removeCallbacks(j02.f2947r);
        return false;
    }
}
