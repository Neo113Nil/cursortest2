package com.google.android.material.snackbar;

import D.g;
import K0.e;
import M0.c;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h, reason: collision with root package name */
    public final e f1977h;

    public BaseTransientBottomBar$Behavior() {
        e eVar = new e(5);
        this.f1757e = Math.min(Math.max(RecyclerView.A0, 0.1f), 1.0f);
        this.f1758f = Math.min(Math.max(RecyclerView.A0, 0.6f), 1.0f);
        this.d = 0;
        this.f1977h = eVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, y.AbstractC0317a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f1977h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (g.f120c == null) {
                    g.f120c = new g(8);
                }
                synchronized (g.f120c.f122b) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (g.f120c == null) {
                g.f120c = new g(8);
            }
            synchronized (g.f120c.f122b) {
            }
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(View view) {
        this.f1977h.getClass();
        return view instanceof c;
    }
}
