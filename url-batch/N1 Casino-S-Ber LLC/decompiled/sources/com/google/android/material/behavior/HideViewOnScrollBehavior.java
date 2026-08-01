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
import com.derinko.gbini.n1casino.R;
import defpackage.bn;
import defpackage.cn;
import defpackage.dn;
import defpackage.jw;
import defpackage.n9;
import defpackage.nd;
import defpackage.o8;
import defpackage.qd;
import defpackage.t8;
import defpackage.w2;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends nd {
    public jw a;
    public AccessibilityManager b;
    public bn c;
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

    @Override // defpackage.nd
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (this.b == null) {
            this.b = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager != null && this.c == null) {
            bn bnVar = new bn(this, view, 1);
            this.c = bnVar;
            accessibilityManager.addTouchExplorationStateChangeListener(bnVar);
            view.addOnAttachStateChangeListener(new n9(4, this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i2 = ((qd) view.getLayoutParams()).c;
        if (i2 == 80 || i2 == 81) {
            w(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i2, i);
            w((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.i = this.a.A(view, marginLayoutParams);
        this.e = o8.i0(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f = o8.i0(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.g = o8.j0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, w2.d);
        this.h = o8.j0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, w2.c);
        return false;
    }

    @Override // defpackage.nd
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
            this.k = this.a.E(view, this.i).setInterpolator(this.h).setDuration(this.f).setListener(new cn(this, view, 1));
        }
    }

    @Override // defpackage.nd
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public final void w(int i) {
        jw jwVar = this.a;
        if (jwVar == null || jwVar.D() != i) {
            if (i == 0) {
                this.a = new dn(2);
                return;
            }
            if (i == 1) {
                this.a = new dn(0);
            } else if (i == 2) {
                this.a = new dn(1);
            } else {
                t8.d(i, ". Must be 0, 1 or 2.", "Invalid view edge position value: ");
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
        this.k = this.a.E(view, 0).setInterpolator(this.g).setDuration(this.e).setListener(new cn(this, view, 1));
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
            t8.c();
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
