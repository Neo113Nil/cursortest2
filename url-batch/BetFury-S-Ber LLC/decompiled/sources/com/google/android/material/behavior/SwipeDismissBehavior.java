package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.g0;
import defpackage.hg;
import defpackage.hm0;
import defpackage.jm0;
import defpackage.kz;
import defpackage.l8;
import defpackage.ug0;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends hg {
    public jm0 a;
    public l8 b;
    public boolean c;
    public boolean d;
    public int e = 2;
    public float f = 0.0f;
    public float g = 0.5f;
    public final ug0 h = new ug0(this);

    @Override // defpackage.hg
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
                this.a = new jm0(coordinatorLayout.getContext(), coordinatorLayout, this.h);
            }
            if (!this.d && this.a.o(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hg
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            hm0.j(view, 1048576);
            hm0.h(view, 0);
            if (w(view)) {
                hm0.k(view, g0.i, new kz(this));
            }
        }
        return false;
    }

    @Override // defpackage.hg
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
