package com.google.android.material.behavior;

import A0.b;
import A0.c;
import K.Q;
import T.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import x.AbstractC0392a;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC0392a {

    /* renamed from: a, reason: collision with root package name */
    public e f2139a;

    /* renamed from: b, reason: collision with root package name */
    public T0.e f2140b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2141c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public int f2142e = 2;

    /* renamed from: f, reason: collision with root package name */
    public float f2143f = RecyclerView.f1937A0;

    /* renamed from: g, reason: collision with root package name */
    public float f2144g = 0.5f;
    public final b h = new b(this);

    @Override // x.AbstractC0392a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2 = this.f2141c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z2 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f2141c = z2;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2141c = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f2139a == null) {
            this.f2139a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.h);
        }
        return !this.d && this.f2139a.p(motionEvent);
    }

    @Override // x.AbstractC0392a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2 = 0;
        WeakHashMap weakHashMap = Q.f578a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            Q.i(view, 1048576);
            Q.g(view, 0);
            if (r(view)) {
                Q.j(view, L.e.f690j, new c(i2, this));
            }
        }
        return false;
    }

    @Override // x.AbstractC0392a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f2139a == null) {
            return false;
        }
        if (this.d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f2139a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
