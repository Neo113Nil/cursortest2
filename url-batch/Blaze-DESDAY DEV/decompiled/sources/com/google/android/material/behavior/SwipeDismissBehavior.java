package com.google.android.material.behavior;

import K.T;
import T.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import r1.g;
import s0.C0297a;
import x.AbstractC0315a;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC0315a {

    /* renamed from: a, reason: collision with root package name */
    public e f1690a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1691b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1692c;
    public int d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f1693e = RecyclerView.f1559A0;

    /* renamed from: f, reason: collision with root package name */
    public float f1694f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final C0297a f1695g = new C0297a(this);

    @Override // x.AbstractC0315a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2 = this.f1691b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z2 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f1691b = z2;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1691b = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f1690a == null) {
            this.f1690a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f1695g);
        }
        return !this.f1692c && this.f1690a.p(motionEvent);
    }

    @Override // x.AbstractC0315a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = T.f440a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            T.i(view, 1048576);
            T.g(view, 0);
            if (r(view)) {
                T.j(view, L.e.f555j, new g(this));
            }
        }
        return false;
    }

    @Override // x.AbstractC0315a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f1690a == null) {
            return false;
        }
        if (this.f1692c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f1690a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
