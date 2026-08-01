package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class fk implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ gk g;

    public /* synthetic */ fk(gk gkVar, int i) {
        this.f = i;
        this.g = gkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        gk gkVar = this.g;
        switch (i) {
            case 0:
                ViewParent parent = gkVar.i.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                gkVar.a();
                View view = gkVar.i;
                if (view.isEnabled() && !view.isLongClickable() && gkVar.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    gkVar.l = true;
                    break;
                }
                break;
        }
    }
}
