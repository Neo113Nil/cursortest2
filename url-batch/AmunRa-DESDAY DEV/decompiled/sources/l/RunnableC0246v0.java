package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: l.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0246v0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3154a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC0248w0 f3155b;

    public /* synthetic */ RunnableC0246v0(AbstractViewOnTouchListenerC0248w0 abstractViewOnTouchListenerC0248w0, int i) {
        this.f3154a = i;
        this.f3155b = abstractViewOnTouchListenerC0248w0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3154a) {
            case 0:
                ViewParent parent = this.f3155b.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC0248w0 abstractViewOnTouchListenerC0248w0 = this.f3155b;
                abstractViewOnTouchListenerC0248w0.a();
                View view = abstractViewOnTouchListenerC0248w0.d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0248w0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC0248w0.f3162g = true;
                    break;
                }
                break;
        }
    }
}
