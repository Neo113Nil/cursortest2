package com.google.android.material.behavior;

import A0.a;
import H1.l;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.fortunequest.neontrack.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import x.AbstractC0392a;
import y0.AbstractC0395a;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC0392a {

    /* renamed from: b, reason: collision with root package name */
    public int f2134b;

    /* renamed from: c, reason: collision with root package name */
    public int f2135c;
    public TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f2136e;
    public ViewPropertyAnimator h;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f2133a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f2137f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f2138g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // x.AbstractC0392a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f2137f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f2134b = l.b0(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f2135c = l.b0(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = l.c0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0395a.d);
        this.f2136e = l.c0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0395a.f4572c);
        return false;
    }

    @Override // x.AbstractC0392a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f2133a;
        if (i > 0) {
            if (this.f2138g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f2138g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.h = view.animate().translationY(this.f2137f).setInterpolator(this.f2136e).setDuration(this.f2135c).setListener(new a(0, this));
            return;
        }
        if (i >= 0 || this.f2138g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f2138g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        this.h = view.animate().translationY(0).setInterpolator(this.d).setDuration(this.f2134b).setListener(new a(0, this));
    }

    @Override // x.AbstractC0392a
    public boolean o(View view, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
