package com.google.android.material.behavior;

import A1.m;
import L.C0003b0;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.winfour.winrandom.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import r0.AbstractC0292a;
import y.AbstractC0317a;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC0317a {

    /* renamed from: b, reason: collision with root package name */
    public int f1748b;

    /* renamed from: c, reason: collision with root package name */
    public int f1749c;
    public TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f1750e;

    /* renamed from: h, reason: collision with root package name */
    public ViewPropertyAnimator f1753h;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f1747a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f1751f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f1752g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // y.AbstractC0317a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f1751f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f1748b = m.Z(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f1749c = m.Z(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = m.a0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0292a.d);
        this.f1750e = m.a0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0292a.f3568c);
        return false;
    }

    @Override // y.AbstractC0317a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f1747a;
        if (i > 0) {
            if (this.f1752g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f1753h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f1752g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.f1753h = view.animate().translationY(this.f1751f).setInterpolator(this.f1750e).setDuration(this.f1749c).setListener(new C0003b0(5, this));
            return;
        }
        if (i >= 0 || this.f1752g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f1753h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f1752g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        this.f1753h = view.animate().translationY(0).setInterpolator(this.d).setDuration(this.f1748b).setListener(new C0003b0(5, this));
    }

    @Override // y.AbstractC0317a
    public boolean o(View view, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
