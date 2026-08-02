package k;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import j.ViewOnTouchListenerC1168a;

/* renamed from: k.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1178B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13898a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewOnTouchListenerC1168a f13899b;

    public /* synthetic */ RunnableC1178B(ViewOnTouchListenerC1168a viewOnTouchListenerC1168a, int i4) {
        this.f13898a = i4;
        this.f13899b = viewOnTouchListenerC1168a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13898a) {
            case 0:
                ViewParent parent = this.f13899b.f13601d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                ViewOnTouchListenerC1168a viewOnTouchListenerC1168a = this.f13899b;
                viewOnTouchListenerC1168a.a();
                View view = viewOnTouchListenerC1168a.f13601d;
                if (view.isEnabled() && !view.isLongClickable() && viewOnTouchListenerC1168a.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    viewOnTouchListenerC1168a.f13604g = true;
                    break;
                }
                break;
        }
    }
}
