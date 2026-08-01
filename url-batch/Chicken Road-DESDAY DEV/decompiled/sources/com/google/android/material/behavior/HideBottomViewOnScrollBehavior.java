package com.google.android.material.behavior;

import K.Y;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.playgen.securelock.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p0.AbstractC0281a;
import u1.l;
import x.AbstractC0332a;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC0332a {

    /* renamed from: b, reason: collision with root package name */
    public int f1592b;

    /* renamed from: c, reason: collision with root package name */
    public int f1593c;
    public TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f1594e;
    public ViewPropertyAnimator h;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f1591a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f1595f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f1596g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // x.AbstractC0332a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f1595f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f1592b = l.U(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f1593c = l.U(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = l.V(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0281a.d);
        this.f1594e = l.V(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0281a.f3382c);
        return false;
    }

    @Override // x.AbstractC0332a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f1591a;
        if (i > 0) {
            if (this.f1596g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f1596g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.h = view.animate().translationY(this.f1595f).setInterpolator(this.f1594e).setDuration(this.f1593c).setListener(new Y(5, this));
            return;
        }
        if (i >= 0 || this.f1596g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f1596g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        this.h = view.animate().translationY(0).setInterpolator(this.d).setDuration(this.f1592b).setListener(new Y(5, this));
    }

    @Override // x.AbstractC0332a
    public boolean o(View view, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
