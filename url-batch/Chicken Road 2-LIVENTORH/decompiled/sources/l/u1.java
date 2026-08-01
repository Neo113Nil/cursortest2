package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class u1 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2471f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v1 f2472g;

    public /* synthetic */ u1(v1 v1Var, int i) {
        this.f2471f = i;
        this.f2472g = v1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2471f) {
            case 0:
                ViewParent parent = this.f2472g.i.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                v1 v1Var = this.f2472g;
                v1Var.a();
                View view = v1Var.i;
                if (view.isEnabled() && !view.isLongClickable() && v1Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    v1Var.f2479l = true;
                    break;
                }
                break;
        }
    }
}
