package com.google.android.material.behavior;

import a0.c;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
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
import t1.a;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
@Deprecated
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends c {

    /* renamed from: b, reason: collision with root package name */
    public int f907b;

    /* renamed from: c, reason: collision with root package name */
    public int f908c;
    public TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f909e;

    /* renamed from: g, reason: collision with root package name */
    public AccessibilityManager f911g;
    public a h;

    /* renamed from: k, reason: collision with root package name */
    public ViewPropertyAnimator f913k;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f906a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f910f = 0;
    public final boolean i = true;

    /* renamed from: j, reason: collision with root package name */
    public int f912j = 2;

    /* renamed from: l, reason: collision with root package name */
    public int f914l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f915m = 0;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // a0.c
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f910f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f907b = l.V(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f908c = l.V(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = l.W(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, r1.a.d);
        this.f909e = l.W(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, r1.a.f3207c);
        if (this.f911g == null) {
            this.f911g = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f911g;
        if (accessibilityManager == null || this.h != null) {
            return false;
        }
        a aVar = new a(this, view, 0);
        this.h = aVar;
        accessibilityManager.addTouchExplorationStateChangeListener(aVar);
        view.addOnAttachStateChangeListener(new p0(4, this));
        return false;
    }

    @Override // a0.c
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i5, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i <= 0) {
            if (i < 0) {
                r(view);
            }
        } else {
            if (this.f912j == 1) {
                return;
            }
            if (this.i && (accessibilityManager = this.f911g) != null && accessibilityManager.isTouchExplorationEnabled()) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f913k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            s(view, 1);
            this.f913k = view.animate().translationY(this.f910f).setInterpolator(this.f909e).setDuration(this.f908c).setListener(new j(this, view, 2));
        }
    }

    @Override // a0.c
    public boolean o(View view, int i, int i4) {
        return i == 2;
    }

    public final void r(View view) {
        if (this.f912j == 2) {
            return;
        }
        s(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.f913k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f913k = view.animate().translationY(0).setInterpolator(this.d).setDuration(this.f907b).setListener(new j(this, view, 2));
    }

    public final void s(View view, int i) {
        this.f912j = i;
        if (i == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.f914l = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.f915m = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else if (i == 2) {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.f914l);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.f915m);
            }
        }
        Iterator it = this.f906a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
