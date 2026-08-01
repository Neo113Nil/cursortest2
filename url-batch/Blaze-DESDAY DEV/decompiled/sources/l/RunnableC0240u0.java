package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: l.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0240u0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3024a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC0242v0 f3025b;

    public /* synthetic */ RunnableC0240u0(AbstractViewOnTouchListenerC0242v0 abstractViewOnTouchListenerC0242v0, int i) {
        this.f3024a = i;
        this.f3025b = abstractViewOnTouchListenerC0242v0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3024a) {
            case 0:
                ViewParent parent = this.f3025b.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC0242v0 abstractViewOnTouchListenerC0242v0 = this.f3025b;
                abstractViewOnTouchListenerC0242v0.a();
                View view = abstractViewOnTouchListenerC0242v0.d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0242v0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, RecyclerView.f1559A0, RecyclerView.f1559A0, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC0242v0.f3032g = true;
                    break;
                }
                break;
        }
    }
}
