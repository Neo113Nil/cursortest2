package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ak implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ bk g;

    public /* synthetic */ ak(bk bkVar, int i) {
        this.f = i;
        this.g = bkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        bk bkVar = this.g;
        switch (i) {
            case 0:
                ViewParent parent = bkVar.i.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                bkVar.a();
                View view = bkVar.i;
                if (view.isEnabled() && !view.isLongClickable() && bkVar.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    bkVar.l = true;
                    break;
                }
                break;
        }
    }
}
