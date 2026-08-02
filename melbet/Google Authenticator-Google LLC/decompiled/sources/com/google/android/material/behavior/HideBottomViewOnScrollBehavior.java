package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.authenticator2.R;
import defpackage.fes;
import defpackage.ffj;
import defpackage.ffk;
import defpackage.ffo;
import defpackage.ffp;
import defpackage.fny;
import defpackage.tw;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior extends tw {
    public AccessibilityManager a;
    public AccessibilityManager.TouchExplorationStateChangeListener b;
    public int c;
    public ViewPropertyAnimator d;
    private final LinkedHashSet e;
    private int f;
    private int g;
    private TimeInterpolator h;
    private TimeInterpolator i;
    private int j;
    private int k;
    private int l;

    public HideBottomViewOnScrollBehavior() {
        this.e = new LinkedHashSet();
        this.j = 0;
        this.c = 2;
        this.k = 0;
        this.l = 0;
    }

    private final void L(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.d = view.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new ffj(this, view));
    }

    private final void M(View view, int i) {
        this.c = i;
        if (i == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.k = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.l = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.k);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.l);
            }
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((ffk) it.next()).a();
        }
    }

    public final boolean J() {
        return this.c == 1;
    }

    public final void K(View view) {
        if (this.c != 2) {
            M(view, 2);
            ViewPropertyAnimator viewPropertyAnimator = this.d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            L(view, 0, this.f, this.h);
        }
    }

    @Override // defpackage.tw
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.j = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f = fny.i(view.getContext(), R.attr.motionDurationLong2, 225);
        this.g = fny.i(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.h = fny.p(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, fes.d);
        this.i = fny.p(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, fes.c);
        AccessibilityManager accessibilityManager = this.a;
        if (accessibilityManager == null) {
            accessibilityManager = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
            this.a = accessibilityManager;
        }
        if (accessibilityManager == null || this.b != null) {
            return false;
        }
        ffo ffoVar = new ffo(this, view, 1);
        this.b = ffoVar;
        this.a.addTouchExplorationStateChangeListener(ffoVar);
        view.addOnAttachStateChangeListener(new ffp(this, 1));
        return false;
    }

    @Override // defpackage.tw
    public final void v(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i <= 0) {
            if (i < 0) {
                K(view);
            }
        } else {
            if (J()) {
                return;
            }
            AccessibilityManager accessibilityManager = this.a;
            if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                ViewPropertyAnimator viewPropertyAnimator = this.d;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                M(view, 1);
                L(view, this.j, this.g, this.i);
            }
        }
    }

    @Override // defpackage.tw
    public final boolean y(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new LinkedHashSet();
        this.j = 0;
        this.c = 2;
        this.k = 0;
        this.l = 0;
    }
}
