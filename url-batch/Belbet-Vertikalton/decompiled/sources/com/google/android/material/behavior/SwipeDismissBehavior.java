package com.google.android.material.behavior;

import M.P;
import N.d;
import U.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import n.C0288n;
import w0.C0409a;
import z.AbstractC0427a;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC0427a {

    /* renamed from: a, reason: collision with root package name */
    public e f2251a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2252b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2253c;

    /* renamed from: d, reason: collision with root package name */
    public int f2254d = 2;
    public float e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f2255f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final C0409a f2256g = new C0409a(this);

    @Override // z.AbstractC0427a
    public boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2 = this.f2252b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z2 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f2252b = z2;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2252b = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f2251a == null) {
            this.f2251a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f2256g);
        }
        return !this.f2253c && this.f2251a.p(motionEvent);
    }

    @Override // z.AbstractC0427a
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = P.f711a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            P.i(view, 1048576);
            P.g(view, 0);
            if (v(view)) {
                P.j(view, d.j, new C0288n(3, this));
            }
        }
        return false;
    }

    @Override // z.AbstractC0427a
    public final boolean u(View view, MotionEvent motionEvent) {
        if (this.f2251a == null) {
            return false;
        }
        if (this.f2253c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f2251a.j(motionEvent);
        return true;
    }

    public boolean v(View view) {
        return true;
    }
}
