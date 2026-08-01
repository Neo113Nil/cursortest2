package com.google.android.material.behavior;

import K.Z;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.shotwins.games.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o0.AbstractC0280a;
import q1.l;
import x.AbstractC0335a;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC0335a {

    /* renamed from: b, reason: collision with root package name */
    public int f1529b;

    /* renamed from: c, reason: collision with root package name */
    public int f1530c;
    public TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f1531e;
    public ViewPropertyAnimator h;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f1528a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f1532f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f1533g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // x.AbstractC0335a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f1532f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f1529b = l.Q(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f1530c = l.Q(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = l.R(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0280a.d);
        this.f1531e = l.R(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0280a.f3356c);
        return false;
    }

    @Override // x.AbstractC0335a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f1528a;
        if (i > 0) {
            if (this.f1533g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f1533g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.h = view.animate().translationY(this.f1532f).setInterpolator(this.f1531e).setDuration(this.f1530c).setListener(new Z(5, this));
            return;
        }
        if (i >= 0 || this.f1533g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f1533g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        this.h = view.animate().translationY(0).setInterpolator(this.d).setDuration(this.f1529b).setListener(new Z(5, this));
    }

    @Override // x.AbstractC0335a
    public boolean o(View view, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
