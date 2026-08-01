package com.google.android.material.behavior;

import K.S;
import S.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import l.C0229n;
import r0.C0289a;
import x.AbstractC0328a;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC0328a {

    /* renamed from: a, reason: collision with root package name */
    public e f1567a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1568b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1569c;
    public int d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f1570e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f1571f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final C0289a f1572g = new C0289a(this);

    @Override // x.AbstractC0328a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2 = this.f1568b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z2 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f1568b = z2;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1568b = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f1567a == null) {
            this.f1567a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f1572g);
        }
        return !this.f1569c && this.f1567a.p(motionEvent);
    }

    @Override // x.AbstractC0328a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = S.f362a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            S.i(view, 1048576);
            S.g(view, 0);
            if (r(view)) {
                S.j(view, L.e.f470j, new C0229n(this));
            }
        }
        return false;
    }

    @Override // x.AbstractC0328a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f1567a == null) {
            return false;
        }
        if (this.f1569c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f1567a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
