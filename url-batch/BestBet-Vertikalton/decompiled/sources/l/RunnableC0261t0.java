package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: l.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0261t0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3470a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC0263u0 f3471b;

    public /* synthetic */ RunnableC0261t0(AbstractViewOnTouchListenerC0263u0 abstractViewOnTouchListenerC0263u0, int i) {
        this.f3470a = i;
        this.f3471b = abstractViewOnTouchListenerC0263u0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3470a) {
            case 0:
                ViewParent parent = this.f3471b.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC0263u0 abstractViewOnTouchListenerC0263u0 = this.f3471b;
                abstractViewOnTouchListenerC0263u0.a();
                View view = abstractViewOnTouchListenerC0263u0.d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0263u0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, RecyclerView.f1937A0, RecyclerView.f1937A0, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC0263u0.f3478g = true;
                    break;
                }
                break;
        }
    }
}
