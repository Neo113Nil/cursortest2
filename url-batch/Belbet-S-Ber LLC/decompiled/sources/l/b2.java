package l;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b2 implements View.OnTouchListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c2 f2406f;

    public b2(c2 c2Var) {
        this.f2406f = c2Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        c2 c2Var = this.f2406f;
        y1 y1Var = c2Var.f2422w;
        Handler handler = c2Var.A;
        y yVar = c2Var.E;
        int action = motionEvent.getAction();
        int x4 = (int) motionEvent.getX();
        int y4 = (int) motionEvent.getY();
        if (action == 0 && yVar != null && yVar.isShowing() && x4 >= 0 && x4 < yVar.getWidth() && y4 >= 0 && y4 < yVar.getHeight()) {
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
