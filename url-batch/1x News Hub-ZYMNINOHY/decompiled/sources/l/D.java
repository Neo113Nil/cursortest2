package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import k.ViewOnTouchListenerC1056a;

/* loaded from: classes.dex */
public final class D implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9708a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewOnTouchListenerC1056a f9709b;

    public /* synthetic */ D(ViewOnTouchListenerC1056a viewOnTouchListenerC1056a, int i3) {
        this.f9708a = i3;
        this.f9709b = viewOnTouchListenerC1056a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9708a) {
            case 0:
                ViewParent parent = this.f9709b.f9552d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                ViewOnTouchListenerC1056a viewOnTouchListenerC1056a = this.f9709b;
                viewOnTouchListenerC1056a.a();
                View view = viewOnTouchListenerC1056a.f9552d;
                if (view.isEnabled() && !view.isLongClickable() && viewOnTouchListenerC1056a.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    viewOnTouchListenerC1056a.f9554g = true;
                    break;
                }
                break;
        }
    }
}
