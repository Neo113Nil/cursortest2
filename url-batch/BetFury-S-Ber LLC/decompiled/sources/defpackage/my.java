package defpackage;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class my implements View.OnTouchListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ my(int i, Object obj) {
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
                ny nyVar = (ny) obj;
                ky kyVar = nyVar.w;
                Handler handler = nyVar.A;
                h5 h5Var = nyVar.E;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && h5Var != null && h5Var.isShowing() && x >= 0 && x < h5Var.getWidth() && y >= 0 && y < h5Var.getHeight()) {
                    handler.postDelayed(kyVar, 250L);
                } else if (action == 1) {
                    handler.removeCallbacks(kyVar);
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
