package com.google.android.material.behavior;

import K.S;
import S.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import m1.g;
import v0.C0316a;
import x.AbstractC0319a;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC0319a {

    /* renamed from: a, reason: collision with root package name */
    public e f1663a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1664b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1665c;
    public int d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f1666e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f1667f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final C0316a f1668g = new C0316a(this);

    @Override // x.AbstractC0319a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2 = this.f1664b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z2 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f1664b = z2;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1664b = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f1663a == null) {
            this.f1663a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f1668g);
        }
        return !this.f1665c && this.f1663a.p(motionEvent);
    }

    @Override // x.AbstractC0319a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = S.f351a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            S.i(view, 1048576);
            S.g(view, 0);
            if (r(view)) {
                S.j(view, L.e.f457j, new g(this));
            }
        }
        return false;
    }

    @Override // x.AbstractC0319a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f1663a == null) {
            return false;
        }
        if (this.f1665c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f1663a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
