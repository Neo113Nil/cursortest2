package k;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class r1 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2638f;
    public final /* synthetic */ s1 g;

    public /* synthetic */ r1(s1 s1Var, int i4) {
        this.f2638f = i4;
        this.g = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2638f) {
            case 0:
                ViewParent parent = this.g.f2643i.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                s1 s1Var = this.g;
                s1Var.a();
                View view = s1Var.f2643i;
                if (view.isEnabled() && !view.isLongClickable() && s1Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    s1Var.f2646l = true;
                    break;
                }
                break;
        }
    }
}
