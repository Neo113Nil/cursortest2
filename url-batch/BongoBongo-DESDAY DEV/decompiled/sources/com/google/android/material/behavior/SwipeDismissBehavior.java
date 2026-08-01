package com.google.android.material.behavior;

import L.T;
import U.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import m.C0202a0;
import t0.C0299a;
import y.AbstractC0317a;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC0317a {

    /* renamed from: a, reason: collision with root package name */
    public e f1754a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1755b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1756c;
    public int d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f1757e = RecyclerView.A0;

    /* renamed from: f, reason: collision with root package name */
    public float f1758f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final C0299a f1759g = new C0299a(this);

    @Override // y.AbstractC0317a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2 = this.f1755b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z2 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f1755b = z2;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1755b = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f1754a == null) {
            this.f1754a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f1759g);
        }
        return !this.f1756c && this.f1754a.p(motionEvent);
    }

    @Override // y.AbstractC0317a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = T.f490a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            T.i(view, 1048576);
            T.g(view, 0);
            if (r(view)) {
                T.j(view, M.e.f609j, new C0202a0(this));
            }
        }
        return false;
    }

    @Override // y.AbstractC0317a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f1754a == null) {
            return false;
        }
        if (this.f1756c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f1754a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
