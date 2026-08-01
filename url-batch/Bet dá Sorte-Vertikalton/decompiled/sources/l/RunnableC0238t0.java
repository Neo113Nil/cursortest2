package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: l.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0238t0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3036a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC0240u0 f3037b;

    public /* synthetic */ RunnableC0238t0(AbstractViewOnTouchListenerC0240u0 abstractViewOnTouchListenerC0240u0, int i) {
        this.f3036a = i;
        this.f3037b = abstractViewOnTouchListenerC0240u0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3036a) {
            case 0:
                ViewParent parent = this.f3037b.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC0240u0 abstractViewOnTouchListenerC0240u0 = this.f3037b;
                abstractViewOnTouchListenerC0240u0.a();
                View view = abstractViewOnTouchListenerC0240u0.d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0240u0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC0240u0.f3044g = true;
                    break;
                }
                break;
        }
    }
}
