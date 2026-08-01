package com.google.android.material.behavior;

import K.T;
import T.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import l.Z;
import s0.C0296a;
import x.AbstractC0313a;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC0313a {

    /* renamed from: a, reason: collision with root package name */
    public e f1659a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1660b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1661c;
    public int d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f1662e = RecyclerView.f1530C0;

    /* renamed from: f, reason: collision with root package name */
    public float f1663f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final C0296a f1664g = new C0296a(this);

    @Override // x.AbstractC0313a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2 = this.f1660b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z2 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f1660b = z2;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1660b = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f1659a == null) {
            this.f1659a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f1664g);
        }
        return !this.f1661c && this.f1659a.p(motionEvent);
    }

    @Override // x.AbstractC0313a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = T.f423a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            T.i(view, 1048576);
            T.g(view, 0);
            if (r(view)) {
                T.j(view, L.e.f538j, new Z(this));
            }
        }
        return false;
    }

    @Override // x.AbstractC0313a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f1659a == null) {
            return false;
        }
        if (this.f1661c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f1659a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
