package com.google.android.material.appbar;

import K.T;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p0.AbstractC0285a;
import r0.AbstractC0294a;
import x.AbstractC0315a;
import x.d;
import z1.l;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC0294a {

    /* renamed from: b, reason: collision with root package name */
    public final int f1677b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // x.AbstractC0315a
    public final void b(View view) {
    }

    @Override // x.AbstractC0315a
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC0315a abstractC0315a = ((d) view2.getLayoutParams()).f4105a;
        if (abstractC0315a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) abstractC0315a).getClass();
            int i = this.f1677b;
            int f2 = bottom - (i == 0 ? 0 : l.f((int) (RecyclerView.f1559A0 * i), 0, i));
            WeakHashMap weakHashMap = T.f440a;
            view.offsetTopAndBottom(f2);
        }
        return false;
    }

    @Override // x.AbstractC0315a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // x.AbstractC0315a
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // r0.AbstractC0294a
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0285a.f3340u);
        this.f1677b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
