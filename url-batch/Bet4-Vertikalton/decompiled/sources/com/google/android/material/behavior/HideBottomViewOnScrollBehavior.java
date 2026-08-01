package com.google.android.material.behavior;

import K.C0003b0;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.playbag.tripgear.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import q0.AbstractC0289a;
import w1.d;
import x.AbstractC0313a;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC0313a {

    /* renamed from: b, reason: collision with root package name */
    public int f1654b;

    /* renamed from: c, reason: collision with root package name */
    public int f1655c;
    public TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f1656e;
    public ViewPropertyAnimator h;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f1653a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f1657f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f1658g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // x.AbstractC0313a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f1657f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f1654b = d.g0(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f1655c = d.g0(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = d.h0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0289a.d);
        this.f1656e = d.h0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0289a.f3500c);
        return false;
    }

    @Override // x.AbstractC0313a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f1653a;
        if (i > 0) {
            if (this.f1658g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f1658g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.h = view.animate().translationY(this.f1657f).setInterpolator(this.f1656e).setDuration(this.f1655c).setListener(new C0003b0(5, this));
            return;
        }
        if (i >= 0 || this.f1658g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f1658g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        this.h = view.animate().translationY(0).setInterpolator(this.d).setDuration(this.f1654b).setListener(new C0003b0(5, this));
    }

    @Override // x.AbstractC0313a
    public boolean o(View view, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
