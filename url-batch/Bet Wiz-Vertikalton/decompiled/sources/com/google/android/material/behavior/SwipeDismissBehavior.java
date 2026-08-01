package com.google.android.material.behavior;

import K.S;
import S.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import p1.g;
import r0.C0289a;
import x.AbstractC0334a;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC0334a {

    /* renamed from: a, reason: collision with root package name */
    public e f1634a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1635b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1636c;
    public int d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f1637e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f1638f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final C0289a f1639g = new C0289a(this);

    @Override // x.AbstractC0334a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2 = this.f1635b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z2 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f1635b = z2;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1635b = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f1634a == null) {
            this.f1634a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f1639g);
        }
        return !this.f1636c && this.f1634a.p(motionEvent);
    }

    @Override // x.AbstractC0334a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = S.f422a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            S.i(view, 1048576);
            S.g(view, 0);
            if (r(view)) {
                S.j(view, L.e.f534j, new g(this));
            }
        }
        return false;
    }

    @Override // x.AbstractC0334a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f1634a == null) {
            return false;
        }
        if (this.f1636c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f1634a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
