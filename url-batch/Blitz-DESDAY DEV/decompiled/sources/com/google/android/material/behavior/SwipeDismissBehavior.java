package com.google.android.material.behavior;

import M.Q;
import U.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import l.C0176a0;
import t0.C0271a;
import z.AbstractC0318a;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC0318a {

    /* renamed from: a, reason: collision with root package name */
    public e f1738a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1739b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1740c;
    public int d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f1741e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f1742f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final C0271a f1743g = new C0271a(this);

    @Override // z.AbstractC0318a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2 = this.f1739b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z2 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f1739b = z2;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1739b = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f1738a == null) {
            this.f1738a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f1743g);
        }
        return !this.f1740c && this.f1738a.p(motionEvent);
    }

    @Override // z.AbstractC0318a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = Q.f513a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            Q.i(view, 1048576);
            Q.g(view, 0);
            if (r(view)) {
                Q.j(view, N.e.f624j, new C0176a0(this));
            }
        }
        return false;
    }

    @Override // z.AbstractC0318a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f1738a == null) {
            return false;
        }
        if (this.f1740c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f1738a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
