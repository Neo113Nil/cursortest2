package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class qp implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ rp g;

    public /* synthetic */ qp(rp rpVar, int i) {
        this.f = i;
        this.g = rpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        rp rpVar = this.g;
        switch (i) {
            case 0:
                ViewParent parent = rpVar.i.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                rpVar.a();
                View view = rpVar.i;
                if (view.isEnabled() && !view.isLongClickable() && rpVar.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    rpVar.l = true;
                    break;
                }
                break;
        }
    }
}
