package com.google.android.material.behavior;

import K.S;
import L.f;
import S.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import x.AbstractC0378b;
import x.C0377a;
import x0.C0385a;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC0378b {

    /* renamed from: a, reason: collision with root package name */
    public e f1741a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1742b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1743c;
    public int d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f1744e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f1745f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final C0385a f1746g = new C0385a(this);

    @Override // x.AbstractC0378b
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2 = this.f1742b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z2 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f1742b = z2;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1742b = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f1741a == null) {
            this.f1741a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f1746g);
        }
        return !this.f1743c && this.f1741a.p(motionEvent);
    }

    @Override // x.AbstractC0378b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = S.f365a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            S.i(view, 1048576);
            S.g(view, 0);
            if (r(view)) {
                S.j(view, f.f470j, new C0377a(this));
            }
        }
        return false;
    }

    @Override // x.AbstractC0378b
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f1741a == null) {
            return false;
        }
        if (this.f1743c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f1741a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
