package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class dp extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    public final /* synthetic */ ep b;

    public dp(ep epVar) {
        this.b = epVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View k;
        nz I;
        ep epVar = this.b;
        or orVar = epVar.m;
        if (!this.a || (k = epVar.k(motionEvent)) == null || (I = epVar.r.I(k)) == null) {
            return;
        }
        RecyclerView recyclerView = epVar.r;
        int g = orVar.g(recyclerView, I);
        WeakHashMap weakHashMap = x80.a;
        if ((or.c(g, recyclerView.getLayoutDirection()) & 16711680) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i = epVar.l;
            if (pointerId == i) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x = motionEvent.getX(findPointerIndex);
                float y = motionEvent.getY(findPointerIndex);
                epVar.d = x;
                epVar.e = y;
                epVar.i = 0.0f;
                epVar.h = 0.0f;
                orVar.getClass();
                epVar.o(I, 2);
            }
        }
    }
}
