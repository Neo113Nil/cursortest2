package defpackage;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mp implements lc {
    final /* synthetic */ mw a;

    public mp(mw mwVar) {
        this.a = mwVar;
    }

    @Override // defpackage.lc
    public final void d(boolean z) {
        if (z) {
            this.a.l(null, 0);
        }
    }

    @Override // defpackage.lc
    public final boolean k(MotionEvent motionEvent) {
        int findPointerIndex;
        mw mwVar = this.a;
        mwVar.v.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        mv mvVar = null;
        if (actionMasked == 0) {
            mwVar.k = motionEvent.getPointerId(0);
            mwVar.c = motionEvent.getX();
            mwVar.d = motionEvent.getY();
            VelocityTracker velocityTracker = mwVar.t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            mwVar.t = VelocityTracker.obtain();
            if (mwVar.b == null) {
                List list = mwVar.n;
                if (!list.isEmpty()) {
                    View e = mwVar.e(motionEvent);
                    int size = list.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        mv mvVar2 = (mv) list.get(size);
                        if (mvVar2.h.a == e) {
                            mvVar = mvVar2;
                            break;
                        }
                        size--;
                    }
                }
                if (mvVar != null) {
                    mwVar.c -= mvVar.l;
                    mwVar.d -= mvVar.m;
                    lp lpVar = mvVar.h;
                    mwVar.g(lpVar, true);
                    if (mwVar.a.remove(lpVar.a)) {
                        ms.d(lpVar);
                    }
                    mwVar.l(lpVar, mvVar.i);
                    mwVar.G(motionEvent, mwVar.m, 0);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            mwVar.k = -1;
            mwVar.l(null, 0);
        } else {
            int i = mwVar.k;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                mwVar.f(actionMasked, motionEvent, findPointerIndex);
            }
        }
        VelocityTracker velocityTracker2 = mwVar.t;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return mwVar.b != null;
    }

    @Override // defpackage.lc
    public final void l(MotionEvent motionEvent) {
        mw mwVar = this.a;
        mwVar.v.onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = mwVar.t;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (mwVar.k == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int findPointerIndex = motionEvent.findPointerIndex(mwVar.k);
        if (findPointerIndex >= 0) {
            mwVar.f(actionMasked, motionEvent, findPointerIndex);
        }
        lp lpVar = mwVar.b;
        if (lpVar != null) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (findPointerIndex >= 0) {
                        mwVar.G(motionEvent, mwVar.m, findPointerIndex);
                        mwVar.h(lpVar);
                        Runnable runnable = mwVar.q;
                        mwVar.p.removeCallbacks(runnable);
                        runnable.run();
                        mwVar.p.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == mwVar.k) {
                        mwVar.k = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        mwVar.G(motionEvent, mwVar.m, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = mwVar.t;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            mwVar.l(null, 0);
            mwVar.k = -1;
        }
    }
}
