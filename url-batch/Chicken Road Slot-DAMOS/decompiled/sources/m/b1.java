package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b1 implements View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c1 f6029d;

    public b1(c1 c1Var) {
        this.f6029d = c1Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        c1 c1Var = this.f6029d;
        y0 y0Var = c1Var.B;
        Handler handler = c1Var.F;
        s sVar = c1Var.J;
        int action = motionEvent.getAction();
        int x10 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        if (action == 0 && sVar != null && sVar.isShowing() && x10 >= 0 && x10 < sVar.getWidth() && y3 >= 0 && y3 < sVar.getHeight()) {
            handler.postDelayed(y0Var, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(y0Var);
        return false;
    }
}
