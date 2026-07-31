package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c5.k;
import com.snovikpovik.vuevnxsj.R;
import d3.a;
import f1.e;
import java.util.Iterator;
import java.util.LinkedHashSet;
import r2.r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
@Deprecated
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends a {

    /* renamed from: b, reason: collision with root package name */
    public int f1814b;

    /* renamed from: c, reason: collision with root package name */
    public int f1815c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f1816d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f1817e;

    /* renamed from: g, reason: collision with root package name */
    public AccessibilityManager f1819g;

    /* renamed from: h, reason: collision with root package name */
    public i5.a f1820h;

    /* renamed from: k, reason: collision with root package name */
    public ViewPropertyAnimator f1822k;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f1813a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f1818f = 0;
    public final boolean i = true;

    /* renamed from: j, reason: collision with root package name */
    public int f1821j = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // d3.a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f1818f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f1814b = r.Q(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f1815c = r.Q(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f1816d = r.R(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, g5.a.f3034d);
        this.f1817e = r.R(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, g5.a.f3033c);
        if (this.f1819g == null) {
            this.f1819g = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f1819g;
        if (accessibilityManager == null || this.f1820h != null) {
            return false;
        }
        i5.a aVar = new i5.a(this, view, 0);
        this.f1820h = aVar;
        accessibilityManager.addTouchExplorationStateChangeListener(aVar);
        view.addOnAttachStateChangeListener(new e(1, this));
        return false;
    }

    @Override // d3.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i8, int i9, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i <= 0) {
            if (i < 0) {
                r(view);
                return;
            }
            return;
        }
        if (this.f1821j == 1) {
            return;
        }
        if (this.i && (accessibilityManager = this.f1819g) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f1822k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f1821j = 1;
        Iterator it = this.f1813a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f1822k = view.animate().translationY(this.f1818f).setInterpolator(this.f1817e).setDuration(this.f1815c).setListener(new k(1, this));
    }

    @Override // d3.a
    public boolean o(View view, int i, int i8) {
        return i == 2;
    }

    public final void r(View view) {
        if (this.f1821j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f1822k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f1821j = 2;
        Iterator it = this.f1813a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f1822k = view.animate().translationY(0).setInterpolator(this.f1816d).setDuration(this.f1814b).setListener(new k(1, this));
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
