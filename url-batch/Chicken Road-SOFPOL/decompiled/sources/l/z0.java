package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class z0 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k.a f4457e;

    public /* synthetic */ z0(k.a aVar, int i) {
        this.f4456d = i;
        this.f4457e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4456d) {
            case 0:
                ViewParent parent = this.f4457e.f4025g.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                k.a aVar = this.f4457e;
                aVar.a();
                View view = aVar.f4025g;
                if (view.isEnabled() && !view.isLongClickable() && aVar.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    aVar.f4027j = true;
                    break;
                }
                break;
        }
    }
}
