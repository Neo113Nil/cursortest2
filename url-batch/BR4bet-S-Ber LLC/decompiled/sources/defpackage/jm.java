package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class jm implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ km g;

    public /* synthetic */ jm(km kmVar, int i) {
        this.f = i;
        this.g = kmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        km kmVar = this.g;
        switch (i) {
            case 0:
                ViewParent parent = kmVar.i.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                kmVar.a();
                View view = kmVar.i;
                if (view.isEnabled() && !view.isLongClickable() && kmVar.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    kmVar.l = true;
                    break;
                }
                break;
        }
    }
}
