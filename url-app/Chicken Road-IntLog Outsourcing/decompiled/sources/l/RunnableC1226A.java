package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import k.ViewOnTouchListenerC1201a;

/* renamed from: l.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1226A implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10743a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewOnTouchListenerC1201a f10744b;

    public /* synthetic */ RunnableC1226A(ViewOnTouchListenerC1201a viewOnTouchListenerC1201a, int i2) {
        this.f10743a = i2;
        this.f10744b = viewOnTouchListenerC1201a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10743a) {
            case 0:
                ViewParent parent = this.f10744b.f10540d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                ViewOnTouchListenerC1201a viewOnTouchListenerC1201a = this.f10744b;
                viewOnTouchListenerC1201a.a();
                View view = viewOnTouchListenerC1201a.f10540d;
                if (view.isEnabled() && !view.isLongClickable() && viewOnTouchListenerC1201a.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    viewOnTouchListenerC1201a.f10543g = true;
                    break;
                }
                break;
        }
    }
}
