package com.google.android.material.appbar;

import H1.d;
import M.P;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import t0.AbstractC0383a;
import v0.AbstractC0407a;
import z.AbstractC0427a;
import z.C0430d;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC0407a {

    /* renamed from: b, reason: collision with root package name */
    public final int f2237b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void w(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // z.AbstractC0427a
    public final void f(View view) {
    }

    @Override // z.AbstractC0427a
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC0427a abstractC0427a = ((C0430d) view2.getLayoutParams()).f4768a;
        if (abstractC0427a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) abstractC0427a).getClass();
            int i = this.f2237b;
            int n2 = bottom - (i == 0 ? 0 : d.n((int) (0.0f * i), 0, i));
            WeakHashMap weakHashMap = P.f711a;
            view.offsetTopAndBottom(n2);
        }
        return false;
    }

    @Override // z.AbstractC0427a
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        w(coordinatorLayout.j(view));
        return false;
    }

    @Override // z.AbstractC0427a
    public final void p(CoordinatorLayout coordinatorLayout, View view) {
        w(coordinatorLayout.j(view));
    }

    @Override // v0.AbstractC0407a
    public final void v(CoordinatorLayout coordinatorLayout, View view, int i) {
        w(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0383a.f4164u);
        this.f2237b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
