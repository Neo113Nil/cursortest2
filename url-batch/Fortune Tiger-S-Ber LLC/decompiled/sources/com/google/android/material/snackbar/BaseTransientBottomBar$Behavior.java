package com.google.android.material.snackbar;

import a2.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import g2.f;
import i2.c;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final f h;

    public BaseTransientBottomBar$Behavior() {
        f fVar = new f(11);
        this.f1192e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f1193f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f1191d = 0;
        this.h = fVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, x.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (e.h == null) {
                    e.h = new e(16);
                }
                synchronized (e.h.g) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (e.h == null) {
                e.h = new e(16);
            }
            synchronized (e.h.g) {
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
