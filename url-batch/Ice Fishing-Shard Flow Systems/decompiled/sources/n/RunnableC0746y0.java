package n;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: n.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0746y0 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC0748z0 f6957e;

    public /* synthetic */ RunnableC0746y0(AbstractViewOnTouchListenerC0748z0 abstractViewOnTouchListenerC0748z0, int i2) {
        this.f6956d = i2;
        this.f6957e = abstractViewOnTouchListenerC0748z0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6956d) {
            case 0:
                ViewParent parent = this.f6957e.f6961l.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC0748z0 abstractViewOnTouchListenerC0748z0 = this.f6957e;
                abstractViewOnTouchListenerC0748z0.a();
                View view = abstractViewOnTouchListenerC0748z0.f6961l;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0748z0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC0748z0.f6964o = true;
                    break;
                }
                break;
        }
    }
}
