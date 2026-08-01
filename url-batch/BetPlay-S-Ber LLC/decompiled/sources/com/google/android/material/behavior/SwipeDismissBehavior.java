package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.c0;
import defpackage.c50;
import defpackage.e90;
import defpackage.h90;
import defpackage.rd;
import defpackage.tx;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends rd {
    public h90 a;
    public boolean b;
    public boolean c;
    public int d = 2;
    public float e = 0.0f;
    public float f = 0.5f;
    public final c50 g = new c50(this);

    public boolean a(View view) {
        return true;
    }

    @Override // defpackage.rd
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.b = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.b = false;
        }
        if (z) {
            if (this.a == null) {
                this.a = new h90(coordinatorLayout.getContext(), coordinatorLayout, this.g);
            }
            if (!this.c && this.a.o(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rd
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            e90.j(view, 1048576);
            e90.h(view, 0);
            if (a(view)) {
                e90.k(view, c0.i, null, new tx(this));
            }
        }
        return false;
    }

    @Override // defpackage.rd
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (this.c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.a.i(motionEvent);
        return true;
    }
}
