package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.moontiko.really.admiralcasino.R;
import defpackage.aa;
import defpackage.g3;
import defpackage.g9;
import defpackage.kr;
import defpackage.np;
import defpackage.oe;
import defpackage.op;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
@Deprecated
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends oe {
    public int b;
    public int c;
    public TimeInterpolator d;
    public TimeInterpolator e;
    public AccessibilityManager g;
    public np h;
    public ViewPropertyAnimator k;
    public final LinkedHashSet a = new LinkedHashSet();
    public int f = 0;
    public final boolean i = true;
    public int j = 2;
    public int l = 0;
    public int m = 0;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // defpackage.oe
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.b = kr.W(view.getContext(), R.attr.motionDurationLong2, 225);
        this.c = kr.W(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = kr.X(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, g3.d);
        this.e = kr.X(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, g3.c);
        if (this.g == null) {
            this.g = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.g;
        if (accessibilityManager != null && this.h == null) {
            np npVar = new np(this, view, 0);
            this.h = npVar;
            accessibilityManager.addTouchExplorationStateChangeListener(npVar);
            view.addOnAttachStateChangeListener(new aa(3, this));
        }
        return false;
    }

    @Override // defpackage.oe
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i <= 0) {
            if (i < 0) {
                w(view);
            }
        } else {
            if (this.j == 1) {
                return;
            }
            if (this.i && (accessibilityManager = this.g) != null && accessibilityManager.isTouchExplorationEnabled()) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            x(view, 1);
            this.k = view.animate().translationY(this.f).setInterpolator(this.e).setDuration(this.c).setListener(new op(this, view, 0));
        }
    }

    @Override // defpackage.oe
    public boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public final void w(View view) {
        if (this.j == 2) {
            return;
        }
        x(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.k = view.animate().translationY(0.0f).setInterpolator(this.d).setDuration(this.b).setListener(new op(this, view, 0));
    }

    public final void x(View view, int i) {
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
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            g9.b();
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
