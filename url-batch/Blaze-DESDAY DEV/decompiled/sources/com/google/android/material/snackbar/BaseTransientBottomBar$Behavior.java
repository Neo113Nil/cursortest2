package com.google.android.material.snackbar;

import C.g;
import J0.e;
import L0.c;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final e h;

    public BaseTransientBottomBar$Behavior() {
        e eVar = new e(4);
        this.f1693e = Math.min(Math.max(RecyclerView.f1559A0, 0.1f), 1.0f);
        this.f1694f = Math.min(Math.max(RecyclerView.f1559A0, 0.6f), 1.0f);
        this.d = 0;
        this.h = eVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, x.AbstractC0315a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (g.f78c == null) {
                    g.f78c = new g(8);
                }
                synchronized (g.f78c.f80b) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (g.f78c == null) {
                g.f78c = new g(8);
            }
            synchronized (g.f78c.f80b) {
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
