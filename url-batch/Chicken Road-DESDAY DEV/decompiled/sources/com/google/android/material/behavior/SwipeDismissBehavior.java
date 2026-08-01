package com.google.android.material.behavior;

import K.S;
import S.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import l.C0207a0;
import r0.C0292a;
import x.AbstractC0332a;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC0332a {

    /* renamed from: a, reason: collision with root package name */
    public e f1597a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1598b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1599c;
    public int d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f1600e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f1601f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final C0292a f1602g = new C0292a(this);

    @Override // x.AbstractC0332a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2 = this.f1598b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z2 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f1598b = z2;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1598b = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f1597a == null) {
            this.f1597a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f1602g);
        }
        return !this.f1599c && this.f1597a.p(motionEvent);
    }

    @Override // x.AbstractC0332a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = S.f369a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            S.i(view, 1048576);
            S.g(view, 0);
            if (r(view)) {
                S.j(view, L.e.f481j, new C0207a0(this));
            }
        }
        return false;
    }

    @Override // x.AbstractC0332a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f1597a == null) {
            return false;
        }
        if (this.f1599c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f1597a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
