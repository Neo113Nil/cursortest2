package com.google.android.material.behavior;

import K.Z;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.skydrop.fallring.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o0.AbstractC0281a;
import q1.l;
import x.AbstractC0336a;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC0336a {

    /* renamed from: b, reason: collision with root package name */
    public int f1532b;

    /* renamed from: c, reason: collision with root package name */
    public int f1533c;
    public TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f1534e;
    public ViewPropertyAnimator h;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f1531a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f1535f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f1536g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // x.AbstractC0336a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f1535f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f1532b = l.Q(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f1533c = l.Q(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = l.R(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0281a.d);
        this.f1534e = l.R(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0281a.f3340c);
        return false;
    }

    @Override // x.AbstractC0336a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f1531a;
        if (i > 0) {
            if (this.f1536g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f1536g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.h = view.animate().translationY(this.f1535f).setInterpolator(this.f1534e).setDuration(this.f1533c).setListener(new Z(5, this));
            return;
        }
        if (i >= 0 || this.f1536g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f1536g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        this.h = view.animate().translationY(0).setInterpolator(this.d).setDuration(this.f1532b).setListener(new Z(5, this));
    }

    @Override // x.AbstractC0336a
    public boolean o(View view, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
