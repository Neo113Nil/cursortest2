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
import com.moontiko.really.admiralcasino.R;
import defpackage.aa;
import defpackage.g3;
import defpackage.g9;
import defpackage.kr;
import defpackage.mz;
import defpackage.np;
import defpackage.oe;
import defpackage.op;
import defpackage.pp;
import defpackage.re;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends oe {
    public mz a;
    public AccessibilityManager b;
    public np c;
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

    @Override // defpackage.oe
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (this.b == null) {
            this.b = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager != null && this.c == null) {
            np npVar = new np(this, view, 1);
            this.c = npVar;
            accessibilityManager.addTouchExplorationStateChangeListener(npVar);
            view.addOnAttachStateChangeListener(new aa(4, this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i2 = ((re) view.getLayoutParams()).c;
        if (i2 == 80 || i2 == 81) {
            w(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i2, i);
            w((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.i = this.a.q(view, marginLayoutParams);
        this.e = kr.W(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f = kr.W(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.g = kr.X(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, g3.d);
        this.h = kr.X(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, g3.c);
        return false;
    }

    @Override // defpackage.oe
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
            this.k = this.a.s(view, this.i).setInterpolator(this.h).setDuration(this.f).setListener(new op(this, view, 1));
        }
    }

    @Override // defpackage.oe
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public final void w(int i) {
        mz mzVar = this.a;
        if (mzVar == null || mzVar.r() != i) {
            if (i == 0) {
                this.a = new pp(2);
                return;
            }
            if (i == 1) {
                this.a = new pp(0);
            } else if (i == 2) {
                this.a = new pp(1);
            } else {
                g9.c(i, ". Must be 0, 1 or 2.", "Invalid view edge position value: ");
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
        this.k = this.a.s(view, 0).setInterpolator(this.g).setDuration(this.e).setListener(new op(this, view, 1));
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
            g9.b();
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
