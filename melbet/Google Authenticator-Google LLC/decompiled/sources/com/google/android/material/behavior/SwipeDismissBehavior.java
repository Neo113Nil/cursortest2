package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.aag;
import defpackage.abr;
import defpackage.abs;
import defpackage.fft;
import defpackage.ffu;
import defpackage.kee;
import defpackage.tw;
import defpackage.yq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SwipeDismissBehavior extends tw {
    public abs a;
    public boolean b;
    public kee f;
    private boolean g;
    public int c = 2;
    public float d = 0.0f;
    public float e = 0.5f;
    private final abr h = new fft(this);

    public static float K(float f) {
        return Math.min(Math.max(0.0f, f), 1.0f);
    }

    public boolean J(View view) {
        return true;
    }

    @Override // defpackage.tw
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.k(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.g = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        if (z) {
            abs absVar = this.a;
            if (absVar == null) {
                absVar = abs.b(coordinatorLayout, this.h);
                this.a = absVar;
            }
            if (!this.b && absVar.i(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tw
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() != 0) {
            return false;
        }
        view.setImportantForAccessibility(1);
        yq.j(view, 1048576);
        if (!J(view)) {
            return false;
        }
        yq.r(view, aag.f, new ffu(this));
        return false;
    }

    @Override // defpackage.tw
    public final boolean n(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (this.b && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.a.e(motionEvent);
        return true;
    }
}
