package com.google.android.material.appbar;

import M.Q;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q0.AbstractC0257a;
import s0.AbstractC0269a;
import z.AbstractC0318a;
import z.C0321d;
import z1.d;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC0269a {

    /* renamed from: b, reason: collision with root package name */
    public final int f1725b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // z.AbstractC0318a
    public final void b(View view) {
    }

    @Override // z.AbstractC0318a
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC0318a abstractC0318a = ((C0321d) view2.getLayoutParams()).f4304a;
        if (abstractC0318a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) abstractC0318a).getClass();
            int i = this.f1725b;
            int g2 = bottom - (i == 0 ? 0 : d.g((int) (0.0f * i), 0, i));
            WeakHashMap weakHashMap = Q.f513a;
            view.offsetTopAndBottom(g2);
        }
        return false;
    }

    @Override // z.AbstractC0318a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // z.AbstractC0318a
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // s0.AbstractC0269a
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0257a.f3399w);
        this.f1725b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
