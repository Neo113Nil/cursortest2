package k;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b2 implements View.OnTouchListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c2 f2504f;

    public b2(c2 c2Var) {
        this.f2504f = c2Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        c2 c2Var = this.f2504f;
        y1 y1Var = c2Var.f2523w;
        Handler handler = c2Var.A;
        z zVar = c2Var.E;
        int action = motionEvent.getAction();
        int x3 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        if (action == 0 && zVar != null && zVar.isShowing() && x3 >= 0 && x3 < zVar.getWidth() && y3 >= 0 && y3 < zVar.getHeight()) {
            handler.postDelayed(y1Var, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(y1Var);
        return false;
    }
}
