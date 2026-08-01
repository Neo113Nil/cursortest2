package com.google.android.material.behavior;

import K.X;
import S.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import l.C0274n;
import q0.C0319a;
import x.AbstractC0361a;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC0361a {

    /* renamed from: a, reason: collision with root package name */
    public e f1747a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1748b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1749c;

    /* renamed from: d, reason: collision with root package name */
    public int f1750d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f1751e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f1752f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final C0319a f1753g = new C0319a(this);

    @Override // x.AbstractC0361a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2 = this.f1748b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z2 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f1748b = z2;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1748b = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f1747a == null) {
            this.f1747a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f1753g);
        }
        return !this.f1749c && this.f1747a.p(motionEvent);
    }

    @Override // x.AbstractC0361a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = X.f418a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            X.i(view, 1048576);
            X.g(view, 0);
            if (r(view)) {
                X.j(view, L.e.f657j, new C0274n(this));
            }
        }
        return false;
    }

    @Override // x.AbstractC0361a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f1747a == null) {
            return false;
        }
        if (this.f1749c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f1747a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
