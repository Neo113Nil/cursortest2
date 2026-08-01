package m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s0 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l.a f6179e;

    public /* synthetic */ s0(l.a aVar, int i3) {
        this.f6178d = i3;
        this.f6179e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6178d) {
            case 0:
                ViewParent parent = this.f6179e.f5632r.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                l.a aVar = this.f6179e;
                aVar.a();
                View view = aVar.f5632r;
                if (view.isEnabled() && !view.isLongClickable() && aVar.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    aVar.f5635u = true;
                    break;
                }
                break;
        }
    }
}
