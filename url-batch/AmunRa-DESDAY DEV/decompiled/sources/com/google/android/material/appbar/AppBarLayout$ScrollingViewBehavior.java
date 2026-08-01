package com.google.android.material.appbar;

import K.S;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o0.AbstractC0275a;
import q0.AbstractC0287a;
import s1.d;
import x.AbstractC0328a;
import x.C0331d;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC0287a {

    /* renamed from: b, reason: collision with root package name */
    public final int f1554b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // x.AbstractC0328a
    public final void b(View view) {
    }

    @Override // x.AbstractC0328a
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC0328a abstractC0328a = ((C0331d) view2.getLayoutParams()).f4146a;
        if (abstractC0328a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) abstractC0328a).getClass();
            int i = this.f1554b;
            int i2 = bottom - (i == 0 ? 0 : d.i((int) (0.0f * i), 0, i));
            WeakHashMap weakHashMap = S.f362a;
            view.offsetTopAndBottom(i2);
        }
        return false;
    }

    @Override // x.AbstractC0328a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // x.AbstractC0328a
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // q0.AbstractC0287a
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0275a.f3356u);
        this.f1554b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
