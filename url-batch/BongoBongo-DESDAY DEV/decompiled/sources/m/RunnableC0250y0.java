package m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: m.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0250y0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3213a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC0252z0 f3214b;

    public /* synthetic */ RunnableC0250y0(AbstractViewOnTouchListenerC0252z0 abstractViewOnTouchListenerC0252z0, int i) {
        this.f3213a = i;
        this.f3214b = abstractViewOnTouchListenerC0252z0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3213a) {
            case 0:
                ViewParent parent = this.f3214b.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC0252z0 abstractViewOnTouchListenerC0252z0 = this.f3214b;
                abstractViewOnTouchListenerC0252z0.a();
                View view = abstractViewOnTouchListenerC0252z0.d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0252z0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, RecyclerView.A0, RecyclerView.A0, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC0252z0.f3223g = true;
                    break;
                }
                break;
        }
    }
}
