package com.google.android.material.behavior;

import K.X;
import S.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import l1.d;
import q0.C0321a;
import x.AbstractC0363a;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC0363a {

    /* renamed from: a, reason: collision with root package name */
    public e f1725a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1726b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1727c;

    /* renamed from: d, reason: collision with root package name */
    public int f1728d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f1729e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f1730f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final C0321a f1731g = new C0321a(this);

    @Override // x.AbstractC0363a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2 = this.f1726b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z2 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f1726b = z2;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1726b = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f1725a == null) {
            this.f1725a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f1731g);
        }
        return !this.f1727c && this.f1725a.p(motionEvent);
    }

    @Override // x.AbstractC0363a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = X.f419a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            X.i(view, 1048576);
            X.g(view, 0);
            if (r(view)) {
                X.j(view, L.e.f658j, new d(this));
            }
        }
        return false;
    }

    @Override // x.AbstractC0363a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f1725a == null) {
            return false;
        }
        if (this.f1727c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f1725a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
