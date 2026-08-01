package com.google.android.material.behavior;

import K.C0007d0;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.fortuneink.neonpad.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o0.AbstractC0305a;
import q1.l;
import x.AbstractC0361a;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC0361a {

    /* renamed from: b, reason: collision with root package name */
    public int f1741b;

    /* renamed from: c, reason: collision with root package name */
    public int f1742c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f1743d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f1744e;
    public ViewPropertyAnimator h;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f1740a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f1745f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f1746g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // x.AbstractC0361a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f1745f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f1741b = l.f0(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f1742c = l.f0(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f1743d = l.g0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0305a.f3715d);
        this.f1744e = l.g0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0305a.f3714c);
        return false;
    }

    @Override // x.AbstractC0361a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f1740a;
        if (i > 0) {
            if (this.f1746g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f1746g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.h = view.animate().translationY(this.f1745f).setInterpolator(this.f1744e).setDuration(this.f1742c).setListener(new C0007d0(5, this));
            return;
        }
        if (i >= 0 || this.f1746g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f1746g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        this.h = view.animate().translationY(0).setInterpolator(this.f1743d).setDuration(this.f1741b).setListener(new C0007d0(5, this));
    }

    @Override // x.AbstractC0361a
    public boolean o(View view, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
