package n;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class H0 implements View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ I0 f6640d;

    public H0(I0 i02) {
        this.f6640d = i02;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0747z c0747z;
        I0 i02 = this.f6640d;
        F0 f02 = i02.f6666y;
        Handler handler = i02.f6645C;
        int action = motionEvent.getAction();
        int x7 = (int) motionEvent.getX();
        int y7 = (int) motionEvent.getY();
        if (action == 0 && (c0747z = i02.f6649G) != null && c0747z.isShowing() && x7 >= 0 && x7 < i02.f6649G.getWidth() && y7 >= 0 && y7 < i02.f6649G.getHeight()) {
            handler.postDelayed(f02, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(f02);
        return false;
    }
}
