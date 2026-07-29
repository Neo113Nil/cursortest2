package com.google.android.material.behavior;

import K.T;
import S.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import l.C0242k;
import q0.C0292a;
import x.AbstractC0335a;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC0335a {

    /* renamed from: a, reason: collision with root package name */
    public e f1532a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1533b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1534c;
    public int d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f1535e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f1536f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final C0292a f1537g = new C0292a(this);

    @Override // x.AbstractC0335a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2 = this.f1533b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z2 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f1533b = z2;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1533b = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f1532a == null) {
            this.f1532a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f1537g);
        }
        return !this.f1534c && this.f1532a.p(motionEvent);
    }

    @Override // x.AbstractC0335a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = T.f381a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            T.i(view, 1048576);
            T.g(view, 0);
            if (r(view)) {
                T.j(view, L.e.f601j, new C0242k(this));
            }
        }
        return false;
    }

    @Override // x.AbstractC0335a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f1532a == null) {
            return false;
        }
        if (this.f1534c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f1532a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
