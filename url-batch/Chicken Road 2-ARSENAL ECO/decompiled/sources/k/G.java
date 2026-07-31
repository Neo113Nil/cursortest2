package k;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import j.ViewOnTouchListenerC0431a;

/* loaded from: classes.dex */
public final class G implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4910f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ViewOnTouchListenerC0431a f4911g;

    public /* synthetic */ G(ViewOnTouchListenerC0431a viewOnTouchListenerC0431a, int i7) {
        this.f4910f = i7;
        this.f4911g = viewOnTouchListenerC0431a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4910f) {
            case 0:
                ViewParent parent = this.f4911g.f4744d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                ViewOnTouchListenerC0431a viewOnTouchListenerC0431a = this.f4911g;
                viewOnTouchListenerC0431a.a();
                View view = viewOnTouchListenerC0431a.f4744d;
                if (view.isEnabled() && !view.isLongClickable() && viewOnTouchListenerC0431a.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    viewOnTouchListenerC0431a.f4747g = true;
                    break;
                }
                break;
        }
    }
}
