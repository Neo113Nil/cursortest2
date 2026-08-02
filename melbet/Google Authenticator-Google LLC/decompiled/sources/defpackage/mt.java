package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mt extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    final /* synthetic */ mw b;

    public mt(mw mwVar) {
        this.b = mwVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        mw mwVar;
        View e;
        lp g;
        if (!this.a || (e = (mwVar = this.b).e(motionEvent)) == null || (g = mwVar.p.g(e)) == null) {
            return;
        }
        mwVar.l.h(mwVar.p);
        int pointerId = motionEvent.getPointerId(0);
        int i = mwVar.k;
        if (pointerId == i) {
            int findPointerIndex = motionEvent.findPointerIndex(i);
            float x = motionEvent.getX(findPointerIndex);
            float y = motionEvent.getY(findPointerIndex);
            mwVar.c = x;
            mwVar.d = y;
            mwVar.h = 0.0f;
            mwVar.g = 0.0f;
            mwVar.l(g, 2);
        }
    }
}
