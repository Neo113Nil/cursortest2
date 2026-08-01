package com.google.android.material.appbar;

import a0.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n0.l0;
import p1.a;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends a {

    /* renamed from: b, reason: collision with root package name */
    public final int f790b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // a0.b
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (((e) view2.getLayoutParams()).f83a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            int i = this.f790b;
            int n4 = bottom - (i == 0 ? 0 : h.a.n((int) (0.0f * i), 0, i));
            WeakHashMap weakHashMap = l0.f2757a;
            view.offsetTopAndBottom(n4);
        }
        return false;
    }

    @Override // a0.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i5) {
        int i6 = view.getLayoutParams().height;
        if (i6 != -1 && i6 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // a0.b
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // p1.a
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n1.a.C);
        this.f790b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // a0.b
    public final void b(View view) {
    }
}
