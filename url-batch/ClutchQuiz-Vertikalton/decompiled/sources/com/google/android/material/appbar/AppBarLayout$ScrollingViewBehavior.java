package com.google.android.material.appbar;

import A.c;
import K.S;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import u0.AbstractC0361a;
import w0.AbstractC0376a;
import x.AbstractC0378b;
import x.C0381e;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC0376a {

    /* renamed from: b, reason: collision with root package name */
    public final int f1728b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // x.AbstractC0378b
    public final void b(View view) {
    }

    @Override // x.AbstractC0378b
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC0378b abstractC0378b = ((C0381e) view2.getLayoutParams()).f3995a;
        if (abstractC0378b instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) abstractC0378b).getClass();
            int i = this.f1728b;
            int m2 = bottom - (i == 0 ? 0 : c.m((int) (0.0f * i), 0, i));
            WeakHashMap weakHashMap = S.f365a;
            view.offsetTopAndBottom(m2);
        }
        return false;
    }

    @Override // x.AbstractC0378b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // x.AbstractC0378b
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // w0.AbstractC0376a
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0361a.f3745u);
        this.f1728b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
