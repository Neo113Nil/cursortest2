package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: l.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0240t0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3051a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC0242u0 f3052b;

    public /* synthetic */ RunnableC0240t0(AbstractViewOnTouchListenerC0242u0 abstractViewOnTouchListenerC0242u0, int i) {
        this.f3051a = i;
        this.f3052b = abstractViewOnTouchListenerC0242u0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3051a) {
            case 0:
                ViewParent parent = this.f3052b.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC0242u0 abstractViewOnTouchListenerC0242u0 = this.f3052b;
                abstractViewOnTouchListenerC0242u0.a();
                View view = abstractViewOnTouchListenerC0242u0.d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0242u0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC0242u0.f3059g = true;
                    break;
                }
                break;
        }
    }
}
