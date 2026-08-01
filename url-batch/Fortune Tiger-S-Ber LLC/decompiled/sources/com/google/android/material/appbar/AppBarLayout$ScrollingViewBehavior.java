package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k0.j0;
import n1.a;
import x.d;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends a {

    /* renamed from: b, reason: collision with root package name */
    public final int f1164b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
        }
    }

    @Override // x.a
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (((d) view2.getLayoutParams()).f3590a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            int i4 = this.f1164b;
            int k4 = bottom - (i4 == 0 ? 0 : k3.d.k((int) (0.0f * i4), 0, i4));
            WeakHashMap weakHashMap = j0.f2752a;
            view.offsetTopAndBottom(k4);
        }
        return false;
    }

    @Override // x.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6) {
        int i7 = view.getLayoutParams().height;
        if (i7 != -1 && i7 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // x.a
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // n1.a
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i4) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i4);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l1.a.f2880z);
        this.f1164b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // x.a
    public final void b(View view) {
    }
}
