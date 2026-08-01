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
        e eVar = new e(3);
        this.f1662e = Math.min(Math.max(RecyclerView.f1530C0, 0.1f), 1.0f);
        this.f1663f = Math.min(Math.max(RecyclerView.f1530C0, 0.6f), 1.0f);
        this.d = 0;
        this.h = eVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, x.AbstractC0313a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (g.f113c == null) {
                    g.f113c = new g(8);
                }
                synchronized (g.f113c.f115b) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (g.f113c == null) {
                g.f113c = new g(8);
            }
            synchronized (g.f113c.f115b) {
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
