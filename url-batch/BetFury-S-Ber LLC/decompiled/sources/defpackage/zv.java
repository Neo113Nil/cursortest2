package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class zv extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    public final /* synthetic */ aw b;

    public zv(aw awVar) {
        this.b = awVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View k;
        x80 I;
        aw awVar = this.b;
        nz nzVar = awVar.m;
        if (!this.a || (k = awVar.k(motionEvent)) == null || (I = awVar.r.I(k)) == null) {
            return;
        }
        RecyclerView recyclerView = awVar.r;
        nzVar.getClass();
        WeakHashMap weakHashMap = hm0.a;
        if ((nz.c(3084, recyclerView.getLayoutDirection()) & 16711680) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i = awVar.l;
            if (pointerId == i) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x = motionEvent.getX(findPointerIndex);
                float y = motionEvent.getY(findPointerIndex);
                awVar.d = x;
                awVar.e = y;
                awVar.i = 0.0f;
                awVar.h = 0.0f;
                nzVar.getClass();
                awVar.o(I, 2);
            }
        }
    }
}
