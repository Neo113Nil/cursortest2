package k;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: k.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC1184H implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC1185I f13920a;

    public ViewOnTouchListenerC1184H(AbstractC1185I abstractC1185I) {
        this.f13920a = abstractC1185I;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1230q c1230q;
        AbstractC1185I abstractC1185I = this.f13920a;
        RunnableC1182F runnableC1182F = abstractC1185I.n;
        Handler handler = abstractC1185I.f13938r;
        int action = motionEvent.getAction();
        int x4 = (int) motionEvent.getX();
        int y4 = (int) motionEvent.getY();
        if (action == 0 && (c1230q = abstractC1185I.v) != null && c1230q.isShowing() && x4 >= 0 && x4 < abstractC1185I.v.getWidth() && y4 >= 0 && y4 < abstractC1185I.v.getHeight()) {
            handler.postDelayed(runnableC1182F, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(runnableC1182F);
        return false;
    }
}
