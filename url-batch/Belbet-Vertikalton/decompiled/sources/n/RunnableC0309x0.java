package n;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: n.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0309x0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3736a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC0311y0 f3737b;

    public /* synthetic */ RunnableC0309x0(AbstractViewOnTouchListenerC0311y0 abstractViewOnTouchListenerC0311y0, int i) {
        this.f3736a = i;
        this.f3737b = abstractViewOnTouchListenerC0311y0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3736a) {
            case 0:
                ViewParent parent = this.f3737b.f3744d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC0311y0 abstractViewOnTouchListenerC0311y0 = this.f3737b;
                abstractViewOnTouchListenerC0311y0.a();
                View view = abstractViewOnTouchListenerC0311y0.f3744d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0311y0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC0311y0.f3746g = true;
                    break;
                }
                break;
        }
    }
}
