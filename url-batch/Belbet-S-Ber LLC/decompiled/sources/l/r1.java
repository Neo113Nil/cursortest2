package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class r1 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2553f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s1 f2554g;

    public /* synthetic */ r1(s1 s1Var, int i) {
        this.f2553f = i;
        this.f2554g = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2553f) {
            case 0:
                ViewParent parent = this.f2554g.i.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                s1 s1Var = this.f2554g;
                s1Var.a();
                View view = s1Var.i;
                if (view.isEnabled() && !view.isLongClickable() && s1Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    s1Var.f2560l = true;
                    break;
                }
                break;
        }
    }
}
