package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.e0;
import defpackage.ic0;
import defpackage.kc0;
import defpackage.oe;
import defpackage.pw;
import defpackage.y70;
import defpackage.z7;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends oe {
    public kc0 a;
    public z7 b;
    public boolean c;
    public boolean d;
    public int e = 2;
    public float f = 0.0f;
    public float g = 0.5f;
    public final y70 h = new y70(this);

    @Override // defpackage.oe
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c = false;
        }
        if (z) {
            if (this.a == null) {
                this.a = new kc0(coordinatorLayout.getContext(), coordinatorLayout, this.h);
            }
            if (!this.d && this.a.o(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.oe
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            ic0.j(view, 1048576);
            ic0.h(view, 0);
            if (w(view)) {
                ic0.k(view, e0.i, new pw(this));
            }
        }
        return false;
    }

    @Override // defpackage.oe
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (this.d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.a.i(motionEvent);
        return true;
    }

    public boolean w(View view) {
        return true;
    }
}
