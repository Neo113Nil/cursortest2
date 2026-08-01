package com.google.android.material.behavior;

import a.y;
import a0.b;
import a0.e;
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
import com.oriondriftchasers.arordrft.R;
import h.a;
import j1.k;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends b {

    /* renamed from: a, reason: collision with root package name */
    public a f804a;

    /* renamed from: b, reason: collision with root package name */
    public AccessibilityManager f805b;

    /* renamed from: c, reason: collision with root package name */
    public r1.a f806c;

    /* renamed from: e, reason: collision with root package name */
    public int f807e;

    /* renamed from: f, reason: collision with root package name */
    public int f808f;

    /* renamed from: g, reason: collision with root package name */
    public TimeInterpolator f809g;

    /* renamed from: h, reason: collision with root package name */
    public TimeInterpolator f810h;

    /* renamed from: k, reason: collision with root package name */
    public ViewPropertyAnimator f812k;
    public final LinkedHashSet d = new LinkedHashSet();
    public int i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f811j = 2;

    public HideViewOnScrollBehavior() {
    }

    @Override // a0.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (this.f805b == null) {
            this.f805b = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f805b;
        if (accessibilityManager != null && this.f806c == null) {
            r1.a aVar = new r1.a(this, view, 1);
            this.f806c = aVar;
            accessibilityManager.addTouchExplorationStateChangeListener(aVar);
            view.addOnAttachStateChangeListener(new p0(5, this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i4 = ((e) view.getLayoutParams()).f85c;
        if (i4 == 80 || i4 == 81) {
            r(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
            r((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.i = this.f804a.G(view, marginLayoutParams);
        this.f807e = y.R(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f808f = y.R(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f809g = y.S(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, o1.a.d);
        this.f810h = y.S(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, o1.a.f2866c);
        return false;
    }

    @Override // a0.b
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i5, int[] iArr) {
        if (i <= 0) {
            if (i < 0) {
                s(view);
                return;
            }
            return;
        }
        if (this.f811j == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.f805b;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f812k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f811j = 1;
            Iterator it = this.d.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.f812k = this.f804a.L(view, this.i).setInterpolator(this.f810h).setDuration(this.f808f).setListener(new k(6, this));
        }
    }

    @Override // a0.b
    public final boolean o(View view, int i, int i4) {
        return i == 2;
    }

    public final void r(int i) {
        a aVar = this.f804a;
        if (aVar == null || aVar.K() != i) {
            if (i == 0) {
                this.f804a = new r1.b(2);
                return;
            }
            if (i == 1) {
                this.f804a = new r1.b(0);
            } else {
                if (i == 2) {
                    this.f804a = new r1.b(1);
                    return;
                }
                throw new IllegalArgumentException("Invalid view edge position value: " + i + ". Must be 0, 1 or 2.");
            }
        }
    }

    public final void s(View view) {
        if (this.f811j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f812k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f811j = 2;
        Iterator it = this.d.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f804a.getClass();
        this.f812k = this.f804a.L(view, 0).setInterpolator(this.f809g).setDuration(this.f807e).setListener(new k(6, this));
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
