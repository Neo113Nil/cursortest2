package i;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class J implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K f2132a;

    public J(K k2) {
        this.f2132a = k2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        r rVar;
        K k2 = this.f2132a;
        RunnableC0153H runnableC0153H = k2.f2148r;
        Handler handler = k2.f2151v;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        if (action == 0 && (rVar = k2.f2155z) != null && rVar.isShowing() && x2 >= 0 && x2 < k2.f2155z.getWidth() && y2 >= 0 && y2 < k2.f2155z.getHeight()) {
            handler.postDelayed(runnableC0153H, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(runnableC0153H);
        return false;
    }
}
