package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b1.b;
import d3.a;
import q3.k0;
import r3.d;
import x3.c;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends a {

    /* renamed from: a, reason: collision with root package name */
    public c f1833a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1834b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1835c;

    /* renamed from: d, reason: collision with root package name */
    public int f1836d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f1837e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f1838f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final i5.c f1839g = new i5.c(this);

    @Override // d3.a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z3 = this.f1834b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z3 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f1834b = z3;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1834b = false;
        }
        if (z3) {
            if (this.f1833a == null) {
                this.f1833a = new c(coordinatorLayout.getContext(), coordinatorLayout, this.f1839g);
            }
            if (!this.f1835c && this.f1833a.p(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // d3.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            k0.h(view, 1048576);
            k0.f(view, 0);
            if (r(view)) {
                k0.i(view, d.f6547l, new b(14, this));
            }
        }
        return false;
    }

    @Override // d3.a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f1833a == null) {
            return false;
        }
        if (this.f1835c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f1833a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
