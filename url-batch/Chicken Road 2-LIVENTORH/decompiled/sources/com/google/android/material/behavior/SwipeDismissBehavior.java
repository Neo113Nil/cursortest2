package com.google.android.material.behavior;

import a0.a;
import a0.b;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import n0.l0;
import r1.c;
import t0.e;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends b {

    /* renamed from: a, reason: collision with root package name */
    public e f813a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f814b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f815c;
    public int d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f816e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f817f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final c f818g = new c(this);

    @Override // a0.b
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z3 = this.f814b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z3 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f814b = z3;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f814b = false;
        }
        if (z3) {
            if (this.f813a == null) {
                this.f813a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f818g);
            }
            if (!this.f815c && this.f813a.p(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // a0.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            l0.j(view, 1048576);
            l0.h(view, 0);
            if (r(view)) {
                l0.k(view, o0.c.f2854j, new a(28, this));
            }
        }
        return false;
    }

    @Override // a0.b
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f813a == null) {
            return false;
        }
        if (this.f815c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f813a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
