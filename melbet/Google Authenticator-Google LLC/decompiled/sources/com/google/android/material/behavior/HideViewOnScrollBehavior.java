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
import com.google.android.apps.authenticator2.R;
import defpackage.fes;
import defpackage.ffl;
import defpackage.ffm;
import defpackage.ffn;
import defpackage.ffo;
import defpackage.ffp;
import defpackage.ffq;
import defpackage.ffr;
import defpackage.ffs;
import defpackage.fny;
import defpackage.tw;
import defpackage.tz;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class HideViewOnScrollBehavior extends tw {
    public AccessibilityManager a;
    public AccessibilityManager.TouchExplorationStateChangeListener b;
    public int c;
    public ViewPropertyAnimator d;
    private ffs e;
    private final LinkedHashSet f;
    private int g;
    private int h;
    private TimeInterpolator i;
    private TimeInterpolator j;
    private int k;
    private int l;
    private int m;

    public HideViewOnScrollBehavior() {
        this.f = new LinkedHashSet();
        this.k = 0;
        this.c = 2;
        this.l = 0;
        this.m = 0;
    }

    private final void L(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.d = this.e.c(view, i).setInterpolator(timeInterpolator).setDuration(j).setListener(new ffq(this, view));
    }

    private final void M(int i) {
        ffs ffsVar = this.e;
        if (ffsVar == null || ffsVar.b() != i) {
            this.e = i != 0 ? i != 1 ? new ffm() : new ffl() : new ffn();
        }
    }

    private final void N(View view, int i) {
        this.c = i;
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
        } else {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.l);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.m);
            }
        }
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((ffr) it.next()).a();
        }
    }

    public final boolean J() {
        return this.c == 1;
    }

    public final void K(View view) {
        if (this.c != 2) {
            N(view, 2);
            ViewPropertyAnimator viewPropertyAnimator = this.d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.e.d();
            L(view, 0, this.g, this.i);
        }
    }

    @Override // defpackage.tw
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        AccessibilityManager accessibilityManager = this.a;
        if (accessibilityManager == null) {
            accessibilityManager = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
            this.a = accessibilityManager;
        }
        int i2 = 0;
        if (accessibilityManager != null && this.b == null) {
            ffo ffoVar = new ffo(this, view, i2);
            this.b = ffoVar;
            this.a.addTouchExplorationStateChangeListener(ffoVar);
            view.addOnAttachStateChangeListener(new ffp(this, 0));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = ((tz) view.getLayoutParams()).c;
        if (i3 == 80 || i3 == 81) {
            M(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i3, i);
            int i4 = 2;
            if (absoluteGravity != 3 && absoluteGravity != 19) {
                i4 = 0;
            }
            M(i4);
        }
        this.k = this.e.a(view, marginLayoutParams);
        this.g = fny.i(view.getContext(), R.attr.motionDurationLong2, 225);
        this.h = fny.i(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.i = fny.p(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, fes.d);
        this.j = fny.p(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, fes.c);
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
                N(view, 1);
                L(view, this.k, this.h, this.j);
            }
        }
    }

    @Override // defpackage.tw
    public final boolean y(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new LinkedHashSet();
        this.k = 0;
        this.c = 2;
        this.l = 0;
        this.m = 0;
    }
}
