package com.google.android.material.behavior;

import H1.l;
import I0.i;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.winpower.neonfit.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import u0.AbstractC0389a;
import z.AbstractC0427a;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC0427a {

    /* renamed from: b, reason: collision with root package name */
    public int f2245b;

    /* renamed from: c, reason: collision with root package name */
    public int f2246c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f2247d;
    public TimeInterpolator e;

    /* renamed from: h, reason: collision with root package name */
    public ViewPropertyAnimator f2250h;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f2244a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f2248f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f2249g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // z.AbstractC0427a
    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f2248f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f2245b = l.T(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f2246c = l.T(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f2247d = l.U(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0389a.f4372d);
        this.e = l.U(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0389a.f4371c);
        return false;
    }

    @Override // z.AbstractC0427a
    public final void o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f2244a;
        if (i > 0) {
            if (this.f2249g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f2250h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f2249g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.f2250h = view.animate().translationY(this.f2248f).setInterpolator(this.e).setDuration(this.f2246c).setListener(new i(7, this));
            return;
        }
        if (i >= 0 || this.f2249g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f2250h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f2249g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        this.f2250h = view.animate().translationY(0).setInterpolator(this.f2247d).setDuration(this.f2245b).setListener(new i(7, this));
    }

    @Override // z.AbstractC0427a
    public boolean s(View view, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
