package com.google.android.material.behavior;

import K.C0007d0;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.luckyarcade.spinthrow.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o0.AbstractC0307a;
import q1.l;
import x.AbstractC0363a;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC0363a {

    /* renamed from: b, reason: collision with root package name */
    public int f1719b;

    /* renamed from: c, reason: collision with root package name */
    public int f1720c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f1721d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f1722e;
    public ViewPropertyAnimator h;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f1718a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f1723f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f1724g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // x.AbstractC0363a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f1723f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f1719b = l.f0(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f1720c = l.f0(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f1721d = l.g0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0307a.f3719d);
        this.f1722e = l.g0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0307a.f3718c);
        return false;
    }

    @Override // x.AbstractC0363a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f1718a;
        if (i > 0) {
            if (this.f1724g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f1724g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.h = view.animate().translationY(this.f1723f).setInterpolator(this.f1722e).setDuration(this.f1720c).setListener(new C0007d0(5, this));
            return;
        }
        if (i >= 0 || this.f1724g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f1724g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        this.h = view.animate().translationY(0).setInterpolator(this.f1721d).setDuration(this.f1719b).setListener(new C0007d0(5, this));
    }

    @Override // x.AbstractC0363a
    public boolean o(View view, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
