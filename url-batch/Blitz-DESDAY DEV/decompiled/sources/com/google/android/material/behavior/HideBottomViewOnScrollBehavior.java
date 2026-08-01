package com.google.android.material.behavior;

import M.X;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.winfour.neondrop.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import r0.AbstractC0260a;
import z.AbstractC0318a;
import z1.l;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC0318a {

    /* renamed from: b, reason: collision with root package name */
    public int f1733b;

    /* renamed from: c, reason: collision with root package name */
    public int f1734c;
    public TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f1735e;
    public ViewPropertyAnimator h;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f1732a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f1736f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f1737g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // z.AbstractC0318a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f1736f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f1733b = l.m0(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f1734c = l.m0(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = l.n0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0260a.d);
        this.f1735e = l.n0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0260a.f3422c);
        return false;
    }

    @Override // z.AbstractC0318a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f1732a;
        if (i > 0) {
            if (this.f1737g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f1737g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.h = view.animate().translationY(this.f1736f).setInterpolator(this.f1735e).setDuration(this.f1734c).setListener(new X(5, this));
            return;
        }
        if (i >= 0 || this.f1737g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f1737g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        this.h = view.animate().translationY(0).setInterpolator(this.d).setDuration(this.f1733b).setListener(new X(5, this));
    }

    @Override // z.AbstractC0318a
    public boolean o(View view, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
