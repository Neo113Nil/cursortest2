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
import com.awerser.monnit.betplay.R;
import defpackage.i9;
import defpackage.j8;
import defpackage.o3;
import defpackage.o8;
import defpackage.qn;
import defpackage.rd;
import defpackage.rn;
import defpackage.sn;
import defpackage.ud;
import defpackage.vw;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends rd {
    public j8 a;
    public AccessibilityManager b;
    public qn c;
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

    public final void a(int i) {
        j8 j8Var = this.a;
        if (j8Var == null || j8Var.y() != i) {
            if (i == 0) {
                this.a = new sn(2);
                return;
            }
            if (i == 1) {
                this.a = new sn(0);
            } else if (i == 2) {
                this.a = new sn(1);
            } else {
                o8.d(i, ". Must be 0, 1 or 2.", "Invalid view edge position value: ");
            }
        }
    }

    public final void b(View view) {
        if (this.j == 2) {
            return;
        }
        c(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.a.getClass();
        this.k = this.a.z(view, 0).setInterpolator(this.g).setDuration(this.e).setListener(new rn(this, view, 1));
    }

    public final void c(View view, int i) {
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
            o8.c();
        }
    }

    @Override // defpackage.rd
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (this.b == null) {
            this.b = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager != null && this.c == null) {
            qn qnVar = new qn(this, view, 1);
            this.c = qnVar;
            accessibilityManager.addTouchExplorationStateChangeListener(qnVar);
            view.addOnAttachStateChangeListener(new i9(4, this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i2 = ((ud) view.getLayoutParams()).c;
        if (i2 == 80 || i2 == 81) {
            a(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i2, i);
            a((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.i = this.a.v(view, marginLayoutParams);
        this.e = vw.d0(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f = vw.d0(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.g = vw.e0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, o3.d);
        this.h = vw.e0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, o3.c);
        return false;
    }

    @Override // defpackage.rd
    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 <= 0) {
            if (i2 < 0) {
                b(view);
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
            c(view, 1);
            this.k = this.a.z(view, this.i).setInterpolator(this.h).setDuration(this.f).setListener(new rn(this, view, 1));
        }
    }

    @Override // defpackage.rd
    public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
