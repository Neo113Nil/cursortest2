package com.google.android.material.snackbar;

import H0.e;
import J0.c;
import J0.f;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final e h;

    public BaseTransientBottomBar$Behavior() {
        e eVar = new e(2);
        this.f1729e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f1730f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f1728d = 0;
        this.h = eVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, x.AbstractC0363a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (f.f391b == null) {
                    f.f391b = new f();
                }
                synchronized (f.f391b.f392a) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (f.f391b == null) {
                f.f391b = new f();
            }
            synchronized (f.f391b.f392a) {
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
