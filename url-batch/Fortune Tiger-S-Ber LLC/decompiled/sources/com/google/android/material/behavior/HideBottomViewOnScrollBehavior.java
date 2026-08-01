package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.p0;
import com.gglhk.bofio.fortunetiger.R;
import f1.j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k3.m;
import x.a;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
@Deprecated
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends a {

    /* renamed from: b, reason: collision with root package name */
    public int f1170b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f1171d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f1172e;
    public AccessibilityManager g;
    public o1.a h;

    /* renamed from: k, reason: collision with root package name */
    public ViewPropertyAnimator f1176k;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f1169a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f1173f = 0;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1174i = true;

    /* renamed from: j, reason: collision with root package name */
    public int f1175j = 2;

    /* renamed from: l, reason: collision with root package name */
    public int f1177l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f1178m = 0;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // x.a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i4) {
        this.f1173f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f1170b = m.Q(view.getContext(), R.attr.motionDurationLong2, 225);
        this.c = m.Q(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f1171d = m.R(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, m1.a.f2907d);
        this.f1172e = m.R(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, m1.a.c);
        if (this.g == null) {
            this.g = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.g;
        if (accessibilityManager == null || this.h != null) {
            return false;
        }
        o1.a aVar = new o1.a(this, view, 0);
        this.h = aVar;
        accessibilityManager.addTouchExplorationStateChangeListener(aVar);
        view.addOnAttachStateChangeListener(new p0(4, this));
        return false;
    }

    @Override // x.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i4 <= 0) {
            if (i4 < 0) {
                r(view);
            }
        } else {
            if (this.f1175j == 1) {
                return;
            }
            if (this.f1174i && (accessibilityManager = this.g) != null && accessibilityManager.isTouchExplorationEnabled()) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f1176k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            s(view, 1);
            this.f1176k = view.animate().translationY(this.f1173f).setInterpolator(this.f1172e).setDuration(this.c).setListener(new j(this, view, 2));
        }
    }

    @Override // x.a
    public boolean o(View view, int i4, int i5) {
        return i4 == 2;
    }

    public final void r(View view) {
        if (this.f1175j == 2) {
            return;
        }
        s(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.f1176k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f1176k = view.animate().translationY(0).setInterpolator(this.f1171d).setDuration(this.f1170b).setListener(new j(this, view, 2));
    }

    public final void s(View view, int i4) {
        this.f1175j = i4;
        if (i4 == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.f1177l = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.f1178m = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else if (i4 == 2) {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.f1177l);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.f1178m);
            }
        }
        Iterator it = this.f1169a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
