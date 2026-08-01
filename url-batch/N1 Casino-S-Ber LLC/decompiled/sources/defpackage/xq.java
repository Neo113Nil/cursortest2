package defpackage;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class xq implements View.OnTouchListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ xq(int i, Object obj) {
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
                yq yqVar = (yq) obj;
                vq vqVar = yqVar.w;
                Handler handler = yqVar.A;
                p4 p4Var = yqVar.E;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && p4Var != null && p4Var.isShowing() && x >= 0 && x < p4Var.getWidth() && y >= 0 && y < p4Var.getHeight()) {
                    handler.postDelayed(vqVar, 250L);
                } else if (action == 1) {
                    handler.removeCallbacks(vqVar);
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
