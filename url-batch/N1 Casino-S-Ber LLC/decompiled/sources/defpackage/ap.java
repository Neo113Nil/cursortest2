package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ap implements az {
    public final /* synthetic */ ep a;

    public ap(ep epVar) {
        this.a = epVar;
    }

    @Override // defpackage.az
    public final void a(MotionEvent motionEvent) {
        ep epVar = this.a;
        z6 z6Var = epVar.s;
        ((GestureDetector) epVar.x.g).onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = epVar.t;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (epVar.l == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int findPointerIndex = motionEvent.findPointerIndex(epVar.l);
        if (findPointerIndex >= 0) {
            epVar.h(actionMasked, findPointerIndex, motionEvent);
        }
        nz nzVar = epVar.c;
        if (nzVar == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (findPointerIndex >= 0) {
                    epVar.p(epVar.o, findPointerIndex, motionEvent);
                    epVar.n(nzVar);
                    epVar.r.removeCallbacks(z6Var);
                    z6Var.run();
                    epVar.r.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == epVar.l) {
                    epVar.l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    epVar.p(epVar.o, actionIndex, motionEvent);
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker2 = epVar.t;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        epVar.o(null, 0);
        epVar.l = -1;
    }

    @Override // defpackage.az
    public final boolean b(MotionEvent motionEvent) {
        int findPointerIndex;
        ep epVar = this.a;
        ((GestureDetector) epVar.x.g).onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        bp bpVar = null;
        if (actionMasked == 0) {
            epVar.l = motionEvent.getPointerId(0);
            epVar.d = motionEvent.getX();
            epVar.e = motionEvent.getY();
            VelocityTracker velocityTracker = epVar.t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            epVar.t = VelocityTracker.obtain();
            if (epVar.c == null) {
                ArrayList arrayList = epVar.p;
                if (!arrayList.isEmpty()) {
                    View k = epVar.k(motionEvent);
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        bp bpVar2 = (bp) arrayList.get(size);
                        if (bpVar2.e.a == k) {
                            bpVar = bpVar2;
                            break;
                        }
                        size--;
                    }
                }
                if (bpVar != null) {
                    nz nzVar = bpVar.e;
                    epVar.d -= bpVar.i;
                    epVar.e -= bpVar.j;
                    epVar.j(nzVar, true);
                    if (epVar.a.remove(nzVar.a)) {
                        epVar.m.getClass();
                        or.b(nzVar);
                    }
                    epVar.o(nzVar, bpVar.f);
                    epVar.p(epVar.o, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            epVar.l = -1;
            epVar.o(null, 0);
        } else {
            int i = epVar.l;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                epVar.h(actionMasked, findPointerIndex, motionEvent);
            }
        }
        VelocityTracker velocityTracker2 = epVar.t;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return epVar.c != null;
    }

    @Override // defpackage.az
    public final void c(boolean z) {
        if (z) {
            this.a.o(null, 0);
        }
    }
}
