package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: l.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0249v0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3008a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC0251w0 f3009b;

    public /* synthetic */ RunnableC0249v0(AbstractViewOnTouchListenerC0251w0 abstractViewOnTouchListenerC0251w0, int i) {
        this.f3008a = i;
        this.f3009b = abstractViewOnTouchListenerC0251w0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3008a) {
            case 0:
                ViewParent parent = this.f3009b.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC0251w0 abstractViewOnTouchListenerC0251w0 = this.f3009b;
                abstractViewOnTouchListenerC0251w0.a();
                View view = abstractViewOnTouchListenerC0251w0.d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0251w0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC0251w0.f3020g = true;
                    break;
                }
                break;
        }
    }
}
