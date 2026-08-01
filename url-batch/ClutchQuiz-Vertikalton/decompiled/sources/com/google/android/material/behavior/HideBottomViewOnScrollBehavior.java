package com.google.android.material.behavior;

import A.c;
import K.Y;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.clutchquizarena.app.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import v0.AbstractC0372a;
import x.AbstractC0378b;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC0378b {

    /* renamed from: b, reason: collision with root package name */
    public int f1736b;

    /* renamed from: c, reason: collision with root package name */
    public int f1737c;
    public TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f1738e;
    public ViewPropertyAnimator h;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f1735a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f1739f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f1740g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // x.AbstractC0378b
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f1739f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f1736b = c.w0(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f1737c = c.w0(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = c.x0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0372a.d);
        this.f1738e = c.x0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0372a.f3983c);
        return false;
    }

    @Override // x.AbstractC0378b
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f1735a;
        if (i > 0) {
            if (this.f1740g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f1740g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.h = view.animate().translationY(this.f1739f).setInterpolator(this.f1738e).setDuration(this.f1737c).setListener(new Y(5, this));
            return;
        }
        if (i >= 0 || this.f1740g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f1740g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        this.h = view.animate().translationY(0).setInterpolator(this.d).setDuration(this.f1736b).setListener(new Y(5, this));
    }

    @Override // x.AbstractC0378b
    public boolean o(View view, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
