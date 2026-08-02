package j;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import i.ViewOnTouchListenerC0203a;

/* loaded from: classes.dex */
public final class E implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2848e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ViewOnTouchListenerC0203a f2849f;

    public /* synthetic */ E(ViewOnTouchListenerC0203a viewOnTouchListenerC0203a, int i2) {
        this.f2848e = i2;
        this.f2849f = viewOnTouchListenerC0203a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2848e) {
            case 0:
                ViewParent parent = this.f2849f.f2362d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                ViewOnTouchListenerC0203a viewOnTouchListenerC0203a = this.f2849f;
                viewOnTouchListenerC0203a.a();
                View view = viewOnTouchListenerC0203a.f2362d;
                if (view.isEnabled() && !view.isLongClickable() && viewOnTouchListenerC0203a.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    viewOnTouchListenerC0203a.f2365g = true;
                    break;
                }
                break;
        }
    }
}
