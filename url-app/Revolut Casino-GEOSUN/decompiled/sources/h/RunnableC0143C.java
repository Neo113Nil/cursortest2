package h;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import g.ViewOnTouchListenerC0129a;

/* renamed from: h.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0143C implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2078e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ViewOnTouchListenerC0129a f2079f;

    public /* synthetic */ RunnableC0143C(ViewOnTouchListenerC0129a viewOnTouchListenerC0129a, int i2) {
        this.f2078e = i2;
        this.f2079f = viewOnTouchListenerC0129a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2078e) {
            case 0:
                ViewParent parent = this.f2079f.f1926d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                ViewOnTouchListenerC0129a viewOnTouchListenerC0129a = this.f2079f;
                viewOnTouchListenerC0129a.a();
                View view = viewOnTouchListenerC0129a.f1926d;
                if (view.isEnabled() && !view.isLongClickable() && viewOnTouchListenerC0129a.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    viewOnTouchListenerC0129a.f1929g = true;
                    break;
                }
                break;
        }
    }
}
