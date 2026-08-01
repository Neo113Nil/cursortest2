package com.google.android.material.behavior;

import a0.c;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import n0.p0;
import q3.a;
import u0.e;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends c {

    /* renamed from: a, reason: collision with root package name */
    public e f926a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f927b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f928c;
    public int d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f929e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f930f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final t1.c f931g = new t1.c(this);

    @Override // a0.c
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z4 = this.f927b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z4 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f927b = z4;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f927b = false;
        }
        if (z4) {
            if (this.f926a == null) {
                this.f926a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f931g);
            }
            if (!this.f928c && this.f926a.o(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // a0.c
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            p0.j(view, 1048576);
            p0.h(view, 0);
            if (r(view)) {
                p0.k(view, o0.c.i, new a(this));
            }
        }
        return false;
    }

    @Override // a0.c
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f926a == null) {
            return false;
        }
        if (this.f928c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f926a.i(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
