package k;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class M implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f4932a;

    public M(N n7) {
        this.f4932a = n7;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        r rVar;
        N n7 = this.f4932a;
        K k4 = n7.f4949s;
        Handler handler = n7.f4953w;
        int action = motionEvent.getAction();
        int x6 = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && (rVar = n7.f4935A) != null && rVar.isShowing() && x6 >= 0 && x6 < n7.f4935A.getWidth() && y >= 0 && y < n7.f4935A.getHeight()) {
            handler.postDelayed(k4, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(k4);
        return false;
    }
}
