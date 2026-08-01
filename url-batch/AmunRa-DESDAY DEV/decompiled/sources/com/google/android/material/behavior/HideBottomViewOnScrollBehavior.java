package com.google.android.material.behavior;

import K.Y;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.visualfortune.eyerest.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p0.AbstractC0278a;
import s1.l;
import x.AbstractC0328a;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC0328a {

    /* renamed from: b, reason: collision with root package name */
    public int f1562b;

    /* renamed from: c, reason: collision with root package name */
    public int f1563c;
    public TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f1564e;
    public ViewPropertyAnimator h;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f1561a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f1565f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f1566g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // x.AbstractC0328a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f1565f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f1562b = l.U(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f1563c = l.U(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = l.V(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0278a.d);
        this.f1564e = l.V(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0278a.f3457c);
        return false;
    }

    @Override // x.AbstractC0328a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f1561a;
        if (i > 0) {
            if (this.f1566g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f1566g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.h = view.animate().translationY(this.f1565f).setInterpolator(this.f1564e).setDuration(this.f1563c).setListener(new Y(5, this));
            return;
        }
        if (i >= 0 || this.f1566g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f1566g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        this.h = view.animate().translationY(0).setInterpolator(this.d).setDuration(this.f1562b).setListener(new Y(5, this));
    }

    @Override // x.AbstractC0328a
    public boolean o(View view, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
