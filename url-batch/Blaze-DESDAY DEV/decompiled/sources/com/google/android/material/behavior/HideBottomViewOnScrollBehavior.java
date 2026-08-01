package com.google.android.material.behavior;

import K.C0003b0;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.winworm.neongrid.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import q0.AbstractC0292a;
import x.AbstractC0315a;
import z1.d;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC0315a {

    /* renamed from: b, reason: collision with root package name */
    public int f1685b;

    /* renamed from: c, reason: collision with root package name */
    public int f1686c;
    public TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f1687e;
    public ViewPropertyAnimator h;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f1684a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f1688f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f1689g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // x.AbstractC0315a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f1688f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f1685b = d.h0(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f1686c = d.h0(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = d.i0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0292a.d);
        this.f1687e = d.i0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0292a.f3386c);
        return false;
    }

    @Override // x.AbstractC0315a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f1684a;
        if (i > 0) {
            if (this.f1689g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f1689g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.h = view.animate().translationY(this.f1688f).setInterpolator(this.f1687e).setDuration(this.f1686c).setListener(new C0003b0(5, this));
            return;
        }
        if (i >= 0 || this.f1689g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f1689g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        this.h = view.animate().translationY(0).setInterpolator(this.d).setDuration(this.f1685b).setListener(new C0003b0(5, this));
    }

    @Override // x.AbstractC0315a
    public boolean o(View view, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
