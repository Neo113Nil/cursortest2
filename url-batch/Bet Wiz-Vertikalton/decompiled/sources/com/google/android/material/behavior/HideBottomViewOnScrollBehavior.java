package com.google.android.material.behavior;

import K.Y;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.neonpulse.gridlogic.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p0.AbstractC0280a;
import x.AbstractC0334a;
import x1.d;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC0334a {

    /* renamed from: b, reason: collision with root package name */
    public int f1629b;

    /* renamed from: c, reason: collision with root package name */
    public int f1630c;
    public TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f1631e;
    public ViewPropertyAnimator h;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f1628a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f1632f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f1633g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // x.AbstractC0334a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f1632f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f1629b = d.Z(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f1630c = d.Z(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = d.a0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0280a.d);
        this.f1631e = d.a0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0280a.f3288c);
        return false;
    }

    @Override // x.AbstractC0334a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f1628a;
        if (i > 0) {
            if (this.f1633g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f1633g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.h = view.animate().translationY(this.f1632f).setInterpolator(this.f1631e).setDuration(this.f1630c).setListener(new Y(5, this));
            return;
        }
        if (i >= 0 || this.f1633g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f1633g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        this.h = view.animate().translationY(0).setInterpolator(this.d).setDuration(this.f1629b).setListener(new Y(5, this));
    }

    @Override // x.AbstractC0334a
    public boolean o(View view, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
