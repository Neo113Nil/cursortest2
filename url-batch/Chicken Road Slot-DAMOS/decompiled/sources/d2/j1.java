package d2;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j1 implements GestureDetector.OnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a8.l f3447a;

    public j1(a8.l lVar) {
        this.f3447a = lVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f3, float f10) {
        a8.l lVar = this.f3447a;
        s sVar = (s) lVar.f358c;
        if (!lVar.f356a) {
            int i3 = lVar.f357b;
            if (i3 == 1) {
                if (Math.abs(f3) > Math.abs(f10)) {
                    sVar.invoke(new i1.c(f3 > 0.0f ? 1 : 2));
                    return true;
                }
            } else if (i3 == 2 && Math.abs(f10) > Math.abs(f3)) {
                sVar.invoke(new i1.c(f10 > 0.0f ? 1 : 2));
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f3, float f10) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
