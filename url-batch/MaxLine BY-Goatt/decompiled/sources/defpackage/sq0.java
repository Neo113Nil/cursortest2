package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sq0 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ tq0 n;

    public /* synthetic */ sq0(tq0 tq0Var, int i) {
        this.m = i;
        this.n = tq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        tq0 tq0Var = this.n;
        switch (i) {
            case 0:
                ViewParent parent = tq0Var.p.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                tq0Var.a();
                View view = tq0Var.p;
                if (view.isEnabled() && !view.isLongClickable() && tq0Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    tq0Var.s = true;
                    break;
                }
                break;
        }
    }
}
