package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import o2.f;
import q2.c;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final f h;

    public BaseTransientBottomBar$Behavior() {
        f fVar = new f(23);
        this.f929e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f930f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.d = 0;
        this.h = fVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, a0.c
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (o0.f.f2880b == null) {
                    o0.f.f2880b = new o0.f();
                }
                synchronized (o0.f.f2880b.f2881a) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (o0.f.f2880b == null) {
                o0.f.f2880b = new o0.f();
            }
            synchronized (o0.f.f2880b.f2881a) {
            }
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(View view) {
        this.h.getClass();
        return view instanceof c;
    }
}
