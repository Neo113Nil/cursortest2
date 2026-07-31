package i;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import h.ViewOnTouchListenerC0134a;

/* renamed from: i.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0149D implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2108e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ViewOnTouchListenerC0134a f2109f;

    public /* synthetic */ RunnableC0149D(ViewOnTouchListenerC0134a viewOnTouchListenerC0134a, int i2) {
        this.f2108e = i2;
        this.f2109f = viewOnTouchListenerC0134a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2108e) {
            case 0:
                ViewParent parent = this.f2109f.f1959d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                ViewOnTouchListenerC0134a viewOnTouchListenerC0134a = this.f2109f;
                viewOnTouchListenerC0134a.a();
                View view = viewOnTouchListenerC0134a.f1959d;
                if (view.isEnabled() && !view.isLongClickable() && viewOnTouchListenerC0134a.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    viewOnTouchListenerC0134a.f1962g = true;
                    break;
                }
                break;
        }
    }
}
