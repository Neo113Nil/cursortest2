package com.google.android.material.snackbar;

import A0.c;
import T0.f;
import T0.h;
import T0.m;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final c i;

    public BaseTransientBottomBar$Behavior() {
        c cVar = new c(15, false);
        this.f2143f = Math.min(Math.max(RecyclerView.f1937A0, 0.1f), 1.0f);
        this.f2144g = Math.min(Math.max(RecyclerView.f1937A0, 0.6f), 1.0f);
        this.f2142e = 0;
        this.i = cVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, x.AbstractC0392a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        c cVar = this.i;
        cVar.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                m.m().w((f) cVar.f6b);
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            m.m().u((f) cVar.f6b);
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(View view) {
        this.i.getClass();
        return view instanceof h;
    }
}
