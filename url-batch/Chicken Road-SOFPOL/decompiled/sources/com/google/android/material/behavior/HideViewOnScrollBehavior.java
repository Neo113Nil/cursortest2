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
import c5.k;
import com.snovikpovik.vuevnxsj.R;
import d3.a;
import d3.d;
import f1.e;
import i5.b;
import java.util.Iterator;
import java.util.LinkedHashSet;
import r2.r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends a {

    /* renamed from: a, reason: collision with root package name */
    public h0.a f1823a;

    /* renamed from: b, reason: collision with root package name */
    public AccessibilityManager f1824b;

    /* renamed from: c, reason: collision with root package name */
    public i5.a f1825c;

    /* renamed from: e, reason: collision with root package name */
    public int f1827e;

    /* renamed from: f, reason: collision with root package name */
    public int f1828f;

    /* renamed from: g, reason: collision with root package name */
    public TimeInterpolator f1829g;

    /* renamed from: h, reason: collision with root package name */
    public TimeInterpolator f1830h;

    /* renamed from: k, reason: collision with root package name */
    public ViewPropertyAnimator f1832k;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f1826d = new LinkedHashSet();
    public int i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f1831j = 2;

    public HideViewOnScrollBehavior() {
    }

    @Override // d3.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (this.f1824b == null) {
            this.f1824b = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f1824b;
        if (accessibilityManager != null && this.f1825c == null) {
            i5.a aVar = new i5.a(this, view, 1);
            this.f1825c = aVar;
            accessibilityManager.addTouchExplorationStateChangeListener(aVar);
            view.addOnAttachStateChangeListener(new e(2, this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i8 = ((d) view.getLayoutParams()).f2228c;
        if (i8 == 80 || i8 == 81) {
            r(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i8, i);
            r((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.i = this.f1823a.H(view, marginLayoutParams);
        this.f1827e = r.Q(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f1828f = r.Q(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f1829g = r.R(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, g5.a.f3034d);
        this.f1830h = r.R(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, g5.a.f3033c);
        return false;
    }

    @Override // d3.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i8, int i9, int[] iArr) {
        if (i <= 0) {
            if (i < 0) {
                s(view);
                return;
            }
            return;
        }
        if (this.f1831j == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.f1824b;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f1832k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f1831j = 1;
            Iterator it = this.f1826d.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.f1832k = this.f1823a.J(view, this.i).setInterpolator(this.f1830h).setDuration(this.f1828f).setListener(new k(2, this));
        }
    }

    @Override // d3.a
    public final boolean o(View view, int i, int i8) {
        return i == 2;
    }

    public final void r(int i) {
        h0.a aVar = this.f1823a;
        if (aVar == null || aVar.I() != i) {
            if (i == 0) {
                this.f1823a = new b(2);
                return;
            }
            if (i == 1) {
                this.f1823a = new b(0);
            } else {
                if (i == 2) {
                    this.f1823a = new b(1);
                    return;
                }
                throw new IllegalArgumentException("Invalid view edge position value: " + i + ". Must be 0, 1 or 2.");
            }
        }
    }

    public final void s(View view) {
        if (this.f1831j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f1832k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f1831j = 2;
        Iterator it = this.f1826d.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f1823a.getClass();
        this.f1832k = this.f1823a.J(view, 0).setInterpolator(this.f1829g).setDuration(this.f1827e).setListener(new k(2, this));
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
