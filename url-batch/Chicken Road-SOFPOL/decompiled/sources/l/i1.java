package l;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i1 implements View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j1 f4277d;

    public i1(j1 j1Var) {
        this.f4277d = j1Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        j1 j1Var = this.f4277d;
        f1 f1Var = j1Var.f4309q;
        Handler handler = j1Var.f4313u;
        y yVar = j1Var.f4317y;
        int action = motionEvent.getAction();
        int x7 = (int) motionEvent.getX();
        int y7 = (int) motionEvent.getY();
        if (action == 0 && yVar != null && yVar.isShowing() && x7 >= 0 && x7 < yVar.getWidth() && y7 >= 0 && y7 < yVar.getHeight()) {
            handler.postDelayed(f1Var, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(f1Var);
        return false;
    }
}
