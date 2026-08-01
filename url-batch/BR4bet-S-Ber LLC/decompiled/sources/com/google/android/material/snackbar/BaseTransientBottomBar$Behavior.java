package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import defpackage.b8;
import defpackage.e8;
import defpackage.rc0;
import defpackage.rg;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final rc0 i;

    public BaseTransientBottomBar$Behavior() {
        rc0 rc0Var = new rc0(11, false);
        this.f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.e = 0;
        this.i = rc0Var;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.oe
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        rc0 rc0Var = this.i;
        rc0Var.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                rg.o().y((b8) rc0Var.g);
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            rg.o().w((b8) rc0Var.g);
        }
        return super.k(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean w(View view) {
        this.i.getClass();
        return view instanceof e8;
    }
}
