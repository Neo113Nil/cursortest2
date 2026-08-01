package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: l.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0237u0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC0239v0 f2996b;

    public /* synthetic */ RunnableC0237u0(AbstractViewOnTouchListenerC0239v0 abstractViewOnTouchListenerC0239v0, int i) {
        this.f2995a = i;
        this.f2996b = abstractViewOnTouchListenerC0239v0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2995a) {
            case 0:
                ViewParent parent = this.f2996b.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC0239v0 abstractViewOnTouchListenerC0239v0 = this.f2996b;
                abstractViewOnTouchListenerC0239v0.a();
                View view = abstractViewOnTouchListenerC0239v0.d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0239v0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, RecyclerView.f1530C0, RecyclerView.f1530C0, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC0239v0.f3007g = true;
                    break;
                }
                break;
        }
    }
}
