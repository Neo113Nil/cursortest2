package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import k0.j0;
import l0.d;
import o1.c;
import q0.e;
import x.a;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends a {

    /* renamed from: a, reason: collision with root package name */
    public e f1189a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1190b;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public int f1191d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f1192e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f1193f = 0.5f;
    public final c g = new c(this);

    @Override // x.a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z3 = this.f1190b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z3 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f1190b = z3;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1190b = false;
        }
        if (z3) {
            if (this.f1189a == null) {
                this.f1189a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.g);
            }
            if (!this.c && this.f1189a.o(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // x.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i4) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            j0.j(view, 1048576);
            j0.h(view, 0);
            if (r(view)) {
                j0.k(view, d.f2849i, new a2.e(29, this));
            }
        }
        return false;
    }

    @Override // x.a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f1189a == null) {
            return false;
        }
        if (this.c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f1189a.i(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
