package com.google.android.material.behavior;

import B.b;
import D.y;
import D0.k;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.icefishing.icefishingliveapp.C5284R;
import j3.AbstractC4596a;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends b {

    /* renamed from: b, reason: collision with root package name */
    public int f35979b;

    /* renamed from: c, reason: collision with root package name */
    public int f35980c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f35981d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f35982e;

    /* renamed from: h, reason: collision with root package name */
    public ViewPropertyAnimator f35985h;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f35978a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f35983f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f35984g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // B.b
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f35983f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f35979b = K3.b.y(view.getContext(), C5284R.attr.motionDurationLong2, 225);
        this.f35980c = K3.b.y(view.getContext(), C5284R.attr.motionDurationMedium4, 175);
        this.f35981d = K3.b.z(view.getContext(), C5284R.attr.motionEasingEmphasizedInterpolator, AbstractC4596a.f38544d);
        this.f35982e = K3.b.z(view.getContext(), C5284R.attr.motionEasingEmphasizedInterpolator, AbstractC4596a.f38543c);
        return false;
    }

    @Override // B.b
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i9, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f35978a;
        if (i > 0) {
            if (this.f35984g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f35985h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f35984g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                throw y.h(it);
            }
            this.f35985h = view.animate().translationY(this.f35983f).setInterpolator(this.f35982e).setDuration(this.f35980c).setListener(new k(3, this));
            return;
        }
        if (i >= 0 || this.f35984g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f35985h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f35984g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            throw y.h(it2);
        }
        this.f35985h = view.animate().translationY(0).setInterpolator(this.f35981d).setDuration(this.f35979b).setListener(new k(3, this));
    }

    @Override // B.b
    public boolean o(int i, int i4, View view) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
