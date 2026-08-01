package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: l.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0293w0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3472a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC0295x0 f3473b;

    public /* synthetic */ RunnableC0293w0(AbstractViewOnTouchListenerC0295x0 abstractViewOnTouchListenerC0295x0, int i) {
        this.f3472a = i;
        this.f3473b = abstractViewOnTouchListenerC0295x0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3472a) {
            case 0:
                ViewParent parent = this.f3473b.f3478d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC0295x0 abstractViewOnTouchListenerC0295x0 = this.f3473b;
                abstractViewOnTouchListenerC0295x0.a();
                View view = abstractViewOnTouchListenerC0295x0.f3478d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0295x0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC0295x0.f3481g = true;
                    break;
                }
                break;
        }
    }
}
