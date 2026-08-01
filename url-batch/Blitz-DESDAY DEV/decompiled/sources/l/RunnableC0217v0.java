package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: l.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0217v0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC0219w0 f3082b;

    public /* synthetic */ RunnableC0217v0(AbstractViewOnTouchListenerC0219w0 abstractViewOnTouchListenerC0219w0, int i) {
        this.f3081a = i;
        this.f3082b = abstractViewOnTouchListenerC0219w0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3081a) {
            case 0:
                ViewParent parent = this.f3082b.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC0219w0 abstractViewOnTouchListenerC0219w0 = this.f3082b;
                abstractViewOnTouchListenerC0219w0.a();
                View view = abstractViewOnTouchListenerC0219w0.d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0219w0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC0219w0.f3093g = true;
                    break;
                }
                break;
        }
    }
}
