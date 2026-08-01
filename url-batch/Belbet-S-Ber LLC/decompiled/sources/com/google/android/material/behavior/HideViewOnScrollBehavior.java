package com.google.android.material.behavior;

import a0.c;
import a0.f;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.p0;
import b4.l;
import com.gdmhkmf.belbet.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k1.j;
import s.a;
import t1.b;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends c {

    /* renamed from: a, reason: collision with root package name */
    public a f916a;

    /* renamed from: b, reason: collision with root package name */
    public AccessibilityManager f917b;

    /* renamed from: c, reason: collision with root package name */
    public t1.a f918c;

    /* renamed from: e, reason: collision with root package name */
    public int f919e;

    /* renamed from: f, reason: collision with root package name */
    public int f920f;

    /* renamed from: g, reason: collision with root package name */
    public TimeInterpolator f921g;
    public TimeInterpolator h;

    /* renamed from: k, reason: collision with root package name */
    public ViewPropertyAnimator f923k;
    public final LinkedHashSet d = new LinkedHashSet();
    public int i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f922j = 2;

    /* renamed from: l, reason: collision with root package name */
    public int f924l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f925m = 0;

    public HideViewOnScrollBehavior() {
    }

    @Override // a0.c
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (this.f917b == null) {
            this.f917b = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f917b;
        if (accessibilityManager != null && this.f918c == null) {
            t1.a aVar = new t1.a(this, view, 1);
            this.f918c = aVar;
            accessibilityManager.addTouchExplorationStateChangeListener(aVar);
            view.addOnAttachStateChangeListener(new p0(5, this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i4 = ((f) view.getLayoutParams()).f83c;
        if (i4 == 80 || i4 == 81) {
            r(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
            r((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.i = this.f916a.n(view, marginLayoutParams);
        this.f919e = l.V(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f920f = l.V(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f921g = l.W(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, r1.a.d);
        this.h = l.W(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, r1.a.f3207c);
        return false;
    }

    @Override // a0.c
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i5, int[] iArr) {
        if (i <= 0) {
            if (i < 0) {
                s(view);
                return;
            }
            return;
        }
        if (this.f922j == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.f917b;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f923k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            t(view, 1);
            this.f923k = this.f916a.p(view, this.i).setInterpolator(this.h).setDuration(this.f920f).setListener(new j(this, view, 3));
        }
    }

    @Override // a0.c
    public final boolean o(View view, int i, int i4) {
        return i == 2;
    }

    public final void r(int i) {
        a aVar = this.f916a;
        if (aVar == null || aVar.o() != i) {
            if (i == 0) {
                this.f916a = new b(2);
                return;
            }
            if (i == 1) {
                this.f916a = new b(0);
            } else {
                if (i == 2) {
                    this.f916a = new b(1);
                    return;
                }
                throw new IllegalArgumentException("Invalid view edge position value: " + i + ". Must be 0, 1 or 2.");
            }
        }
    }

    public final void s(View view) {
        if (this.f922j == 2) {
            return;
        }
        t(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.f923k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f916a.getClass();
        this.f923k = this.f916a.p(view, 0).setInterpolator(this.f921g).setDuration(this.f919e).setListener(new j(this, view, 3));
    }

    public final void t(View view, int i) {
        this.f922j = i;
        if (i == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.f924l = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.f925m = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else if (i == 2) {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.f924l);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.f925m);
            }
        }
        Iterator it = this.d.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
