package defpackage;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xe1 implements View.OnTouchListener {
    public final /* synthetic */ ye1 m;

    public xe1(ye1 ye1Var) {
        this.m = ye1Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ye1 ye1Var = this.m;
        ue1 ue1Var = ye1Var.C;
        Handler handler = ye1Var.G;
        ag agVar = ye1Var.K;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && agVar != null && agVar.isShowing() && x >= 0 && x < agVar.getWidth() && y >= 0 && y < agVar.getHeight()) {
            handler.postDelayed(ue1Var, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(ue1Var);
        return false;
    }
}
