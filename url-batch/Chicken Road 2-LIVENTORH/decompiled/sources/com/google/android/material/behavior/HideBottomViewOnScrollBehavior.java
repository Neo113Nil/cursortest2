package com.google.android.material.behavior;

import a.y;
import a0.b;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.p0;
import com.oriondriftchasers.arordrft.R;
import j1.k;
import java.util.Iterator;
import java.util.LinkedHashSet;
import r1.a;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
@Deprecated
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends b {

    /* renamed from: b, reason: collision with root package name */
    public int f796b;

    /* renamed from: c, reason: collision with root package name */
    public int f797c;
    public TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f798e;

    /* renamed from: g, reason: collision with root package name */
    public AccessibilityManager f800g;

    /* renamed from: h, reason: collision with root package name */
    public a f801h;

    /* renamed from: k, reason: collision with root package name */
    public ViewPropertyAnimator f803k;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f795a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f799f = 0;
    public final boolean i = true;

    /* renamed from: j, reason: collision with root package name */
    public int f802j = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // a0.b
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f799f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f796b = y.R(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f797c = y.R(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = y.S(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, o1.a.d);
        this.f798e = y.S(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, o1.a.f2866c);
        if (this.f800g == null) {
            this.f800g = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f800g;
        if (accessibilityManager == null || this.f801h != null) {
            return false;
        }
        a aVar = new a(this, view, 0);
        this.f801h = aVar;
        accessibilityManager.addTouchExplorationStateChangeListener(aVar);
        view.addOnAttachStateChangeListener(new p0(4, this));
        return false;
    }

    @Override // a0.b
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i5, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i <= 0) {
            if (i < 0) {
                r(view);
                return;
            }
            return;
        }
        if (this.f802j == 1) {
            return;
        }
        if (this.i && (accessibilityManager = this.f800g) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f803k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f802j = 1;
        Iterator it = this.f795a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f803k = view.animate().translationY(this.f799f).setInterpolator(this.f798e).setDuration(this.f797c).setListener(new k(5, this));
    }

    @Override // a0.b
    public boolean o(View view, int i, int i4) {
        return i == 2;
    }

    public final void r(View view) {
        if (this.f802j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f803k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f802j = 2;
        Iterator it = this.f795a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f803k = view.animate().translationY(0).setInterpolator(this.d).setDuration(this.f796b).setListener(new k(5, this));
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
