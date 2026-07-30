package com.google.android.material.behavior;

import B.b;
import O.X;
import P.f;
import W.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.anythink.basead.exoplayer.h.o;
import g1.C4523c;
import java.util.WeakHashMap;
import l3.C4690a;

/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends b {

    /* renamed from: a, reason: collision with root package name */
    public e f35986a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f35987b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f35988c;

    /* renamed from: d, reason: collision with root package name */
    public int f35989d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f35990e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f35991f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final C4690a f35992g = new C4690a(this);

    @Override // B.b
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z8 = this.f35987b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z8 = coordinatorLayout.o((int) motionEvent.getX(), (int) motionEvent.getY(), view);
            this.f35987b = z8;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f35987b = false;
        }
        if (z8) {
            if (this.f35986a == null) {
                this.f35986a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f35992g);
            }
            if (!this.f35988c && this.f35986a.r(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // B.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = X.f2240a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            X.l(o.f7899d, view);
            X.i(0, view);
            if (r(view)) {
                X.m(view, f.f2666l, new C4523c(25, this));
            }
        }
        return false;
    }

    @Override // B.b
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f35986a == null) {
            return false;
        }
        if (this.f35988c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f35986a.k(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
