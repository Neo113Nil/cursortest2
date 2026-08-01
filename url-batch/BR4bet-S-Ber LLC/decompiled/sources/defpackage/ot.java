package defpackage;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ot implements View.OnTouchListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ot(int i, Object obj) {
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
                pt ptVar = (pt) obj;
                lt ltVar = ptVar.w;
                Handler handler = ptVar.A;
                z4 z4Var = ptVar.E;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && z4Var != null && z4Var.isShowing() && x >= 0 && x < z4Var.getWidth() && y >= 0 && y < z4Var.getHeight()) {
                    handler.postDelayed(ltVar, 250L);
                } else if (action == 1) {
                    handler.removeCallbacks(ltVar);
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
