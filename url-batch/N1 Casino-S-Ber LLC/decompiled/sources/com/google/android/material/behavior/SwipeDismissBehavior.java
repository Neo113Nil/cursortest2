package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.c0;
import defpackage.mr;
import defpackage.n7;
import defpackage.nd;
import defpackage.v40;
import defpackage.x80;
import defpackage.z80;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends nd {
    public z80 a;
    public n7 b;
    public boolean c;
    public boolean d;
    public int e = 2;
    public float f = 0.0f;
    public float g = 0.5f;
    public final v40 h = new v40(this);

    @Override // defpackage.nd
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c = false;
        }
        if (z) {
            if (this.a == null) {
                this.a = new z80(coordinatorLayout.getContext(), coordinatorLayout, this.h);
            }
            if (!this.d && this.a.o(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.nd
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            x80.j(view, 1048576);
            x80.h(view, 0);
            if (w(view)) {
                x80.k(view, c0.i, new mr(this));
            }
        }
        return false;
    }

    @Override // defpackage.nd
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
