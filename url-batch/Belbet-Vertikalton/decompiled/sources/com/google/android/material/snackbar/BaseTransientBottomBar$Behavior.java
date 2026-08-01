package com.google.android.material.snackbar;

import C1.d;
import N0.e;
import P0.c;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h, reason: collision with root package name */
    public final e f2472h;

    public BaseTransientBottomBar$Behavior() {
        e eVar = new e(5);
        this.e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f2255f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f2254d = 0;
        this.f2472h = eVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, z.AbstractC0427a
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f2472h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (d.f143c == null) {
                    d.f143c = new d(10);
                }
                synchronized (d.f143c.f145b) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (d.f143c == null) {
                d.f143c = new d(10);
            }
            synchronized (d.f143c.f145b) {
            }
        }
        return super.j(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean v(View view) {
        this.f2472h.getClass();
        return view instanceof c;
    }
}
