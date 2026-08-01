package defpackage;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class kr implements View.OnTouchListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ kr(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                lr lrVar = (lr) obj;
                hr hrVar = lrVar.w;
                Handler handler = lrVar.A;
                g5 g5Var = lrVar.E;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && g5Var != null && g5Var.isShowing() && x >= 0 && x < g5Var.getWidth() && y >= 0 && y < g5Var.getHeight()) {
                    handler.postDelayed(hrVar, 250L);
                } else if (action == 1) {
                    handler.removeCallbacks(hrVar);
                }
                return false;
            default:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) obj).onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
