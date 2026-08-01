package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class wv implements k80 {
    public final /* synthetic */ aw a;

    public wv(aw awVar) {
        this.a = awVar;
    }

    @Override // defpackage.k80
    public final void a(MotionEvent motionEvent) {
        aw awVar = this.a;
        v7 v7Var = awVar.s;
        ((GestureDetector) awVar.x.g).onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = awVar.t;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (awVar.l == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int findPointerIndex = motionEvent.findPointerIndex(awVar.l);
        if (findPointerIndex >= 0) {
            awVar.h(actionMasked, findPointerIndex, motionEvent);
        }
        x80 x80Var = awVar.c;
        if (x80Var == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (findPointerIndex >= 0) {
                    awVar.p(awVar.o, findPointerIndex, motionEvent);
                    awVar.n(x80Var);
                    awVar.r.removeCallbacks(v7Var);
                    v7Var.run();
                    awVar.r.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == awVar.l) {
                    awVar.l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    awVar.p(awVar.o, actionIndex, motionEvent);
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker2 = awVar.t;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        awVar.o(null, 0);
        awVar.l = -1;
    }

    @Override // defpackage.k80
    public final boolean b(MotionEvent motionEvent) {
        int findPointerIndex;
        aw awVar = this.a;
        ((GestureDetector) awVar.x.g).onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        xv xvVar = null;
        if (actionMasked == 0) {
            awVar.l = motionEvent.getPointerId(0);
            awVar.d = motionEvent.getX();
            awVar.e = motionEvent.getY();
            VelocityTracker velocityTracker = awVar.t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            awVar.t = VelocityTracker.obtain();
            if (awVar.c == null) {
                ArrayList arrayList = awVar.p;
                if (!arrayList.isEmpty()) {
                    View k = awVar.k(motionEvent);
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        xv xvVar2 = (xv) arrayList.get(size);
                        if (xvVar2.e.a == k) {
                            xvVar = xvVar2;
                            break;
                        }
                        size--;
                    }
                }
                if (xvVar != null) {
                    x80 x80Var = xvVar.e;
                    awVar.d -= xvVar.i;
                    awVar.e -= xvVar.j;
                    awVar.j(x80Var, true);
                    if (awVar.a.remove(x80Var.a)) {
                        awVar.m.getClass();
                        nz.b(x80Var);
                    }
                    awVar.o(x80Var, xvVar.f);
                    awVar.p(awVar.o, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            awVar.l = -1;
            awVar.o(null, 0);
        } else {
            int i = awVar.l;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                awVar.h(actionMasked, findPointerIndex, motionEvent);
            }
        }
        VelocityTracker velocityTracker2 = awVar.t;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return awVar.c != null;
    }

    @Override // defpackage.k80
    public final void c(boolean z) {
        if (z) {
            this.a.o(null, 0);
        }
    }
}
