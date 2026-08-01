package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.trembin.nirefon.betfury.R;
import defpackage.d50;
import defpackage.et;
import defpackage.ft;
import defpackage.gt;
import defpackage.hg;
import defpackage.kg;
import defpackage.n9;
import defpackage.o3;
import defpackage.s9;
import defpackage.ta;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends hg {
    public n9 a;
    public AccessibilityManager b;
    public et c;
    public int e;
    public int f;
    public TimeInterpolator g;
    public TimeInterpolator h;
    public ViewPropertyAnimator k;
    public final LinkedHashSet d = new LinkedHashSet();
    public int i = 0;
    public int j = 2;
    public int l = 0;
    public int m = 0;

    public HideViewOnScrollBehavior() {
    }

    @Override // defpackage.hg
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (this.b == null) {
            this.b = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager != null && this.c == null) {
            et etVar = new et(this, view, 1);
            this.c = etVar;
            accessibilityManager.addTouchExplorationStateChangeListener(etVar);
            view.addOnAttachStateChangeListener(new ta(4, this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i2 = ((kg) view.getLayoutParams()).c;
        if (i2 == 80 || i2 == 81) {
            w(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i2, i);
            w((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.i = this.a.r(view, marginLayoutParams);
        this.e = d50.R(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f = d50.R(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.g = d50.S(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, o3.d);
        this.h = d50.S(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, o3.c);
        return false;
    }

    @Override // defpackage.hg
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i <= 0) {
            if (i < 0) {
                x(view);
                return;
            }
            return;
        }
        if (this.j == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            y(view, 1);
            this.k = this.a.w(view, this.i).setInterpolator(this.h).setDuration(this.f).setListener(new ft(this, view, 1));
        }
    }

    @Override // defpackage.hg
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public final void w(int i) {
        n9 n9Var = this.a;
        if (n9Var == null || n9Var.v() != i) {
            if (i == 0) {
                this.a = new gt(2);
                return;
            }
            if (i == 1) {
                this.a = new gt(0);
            } else if (i == 2) {
                this.a = new gt(1);
            } else {
                s9.d(i, ". Must be 0, 1 or 2.", "Invalid view edge position value: ");
            }
        }
    }

    public final void x(View view) {
        if (this.j == 2) {
            return;
        }
        y(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.a.getClass();
        this.k = this.a.w(view, 0).setInterpolator(this.g).setDuration(this.e).setListener(new ft(this, view, 1));
    }

    public final void y(View view, int i) {
        this.j = i;
        if (i == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.l = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.m = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else if (i == 2) {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.l);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.m);
            }
        }
        Iterator it = this.d.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            s9.c();
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
