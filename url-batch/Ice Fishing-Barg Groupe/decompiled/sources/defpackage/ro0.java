package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ro0 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ ic PxuCJdSBwIXG;

    public ro0(ic icVar) {
        this.PxuCJdSBwIXG = icVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ic icVar = this.PxuCJdSBwIXG;
        l1 l1Var = (l1) icVar.Y1f8riQaR6yg;
        if (!icVar.TSizfFm2Yiuu) {
            int i = icVar.lS5Rgt96tfkO;
            do0.Companion.getClass();
            int i2 = 2;
            if (i == 1) {
                if (Math.abs(f) > Math.abs(f2)) {
                    if (f > 0.0f) {
                        ga0.Companion.getClass();
                        i2 = 1;
                    } else {
                        ga0.Companion.getClass();
                    }
                    ((qa0) l1Var.wdg6QnbFHrFF.getFocusOwner()).RAsUl2FVSrh6(i2, false);
                    return true;
                }
            } else if (icVar.lS5Rgt96tfkO == 2 && Math.abs(f2) > Math.abs(f)) {
                if (f2 > 0.0f) {
                    ga0.Companion.getClass();
                    i2 = 1;
                } else {
                    ga0.Companion.getClass();
                }
                ((qa0) l1Var.wdg6QnbFHrFF.getFocusOwner()).RAsUl2FVSrh6(i2, false);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
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
