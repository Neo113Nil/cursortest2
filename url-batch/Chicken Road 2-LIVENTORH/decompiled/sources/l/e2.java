package l;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e2 implements View.OnTouchListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f2 f2283f;

    public e2(f2 f2Var) {
        this.f2283f = f2Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        f2 f2Var = this.f2283f;
        b2 b2Var = f2Var.f2300w;
        Handler handler = f2Var.A;
        b0 b0Var = f2Var.E;
        int action = motionEvent.getAction();
        int x3 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        if (action == 0 && b0Var != null && b0Var.isShowing() && x3 >= 0 && x3 < b0Var.getWidth() && y3 >= 0 && y3 < b0Var.getHeight()) {
            handler.postDelayed(b2Var, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(b2Var);
        return false;
    }
}
