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
import androidx.fragment.app.p0;
import com.gglhk.bofio.fortunetiger.R;
import f1.j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k3.m;
import o1.b;
import x.a;
import x.d;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends a {

    /* renamed from: a, reason: collision with root package name */
    public m0.a f1179a;

    /* renamed from: b, reason: collision with root package name */
    public AccessibilityManager f1180b;
    public o1.a c;

    /* renamed from: e, reason: collision with root package name */
    public int f1182e;

    /* renamed from: f, reason: collision with root package name */
    public int f1183f;
    public TimeInterpolator g;
    public TimeInterpolator h;

    /* renamed from: k, reason: collision with root package name */
    public ViewPropertyAnimator f1186k;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f1181d = new LinkedHashSet();

    /* renamed from: i, reason: collision with root package name */
    public int f1184i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f1185j = 2;

    /* renamed from: l, reason: collision with root package name */
    public int f1187l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f1188m = 0;

    public HideViewOnScrollBehavior() {
    }

    @Override // x.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i4) {
        if (this.f1180b == null) {
            this.f1180b = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f1180b;
        if (accessibilityManager != null && this.c == null) {
            o1.a aVar = new o1.a(this, view, 1);
            this.c = aVar;
            accessibilityManager.addTouchExplorationStateChangeListener(aVar);
            view.addOnAttachStateChangeListener(new p0(5, this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = ((d) view.getLayoutParams()).c;
        if (i5 == 80 || i5 == 81) {
            r(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i5, i4);
            r((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.f1184i = this.f1179a.l(view, marginLayoutParams);
        this.f1182e = m.Q(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f1183f = m.Q(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.g = m.R(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, m1.a.f2907d);
        this.h = m.R(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, m1.a.c);
        return false;
    }

    @Override // x.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6, int[] iArr) {
        if (i4 <= 0) {
            if (i4 < 0) {
                s(view);
                return;
            }
            return;
        }
        if (this.f1185j == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.f1180b;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f1186k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            t(view, 1);
            this.f1186k = this.f1179a.o(view, this.f1184i).setInterpolator(this.h).setDuration(this.f1183f).setListener(new j(this, view, 3));
        }
    }

    @Override // x.a
    public final boolean o(View view, int i4, int i5) {
        return i4 == 2;
    }

    public final void r(int i4) {
        m0.a aVar = this.f1179a;
        if (aVar == null || aVar.n() != i4) {
            if (i4 == 0) {
                this.f1179a = new b(2);
                return;
            }
            if (i4 == 1) {
                this.f1179a = new b(0);
            } else {
                if (i4 == 2) {
                    this.f1179a = new b(1);
                    return;
                }
                throw new IllegalArgumentException("Invalid view edge position value: " + i4 + ". Must be 0, 1 or 2.");
            }
        }
    }

    public final void s(View view) {
        if (this.f1185j == 2) {
            return;
        }
        t(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.f1186k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f1179a.getClass();
        this.f1186k = this.f1179a.o(view, 0).setInterpolator(this.g).setDuration(this.f1182e).setListener(new j(this, view, 3));
    }

    public final void t(View view, int i4) {
        this.f1185j = i4;
        if (i4 == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.f1187l = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.f1188m = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else if (i4 == 2) {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.f1187l);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.f1188m);
            }
        }
        Iterator it = this.f1181d.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
