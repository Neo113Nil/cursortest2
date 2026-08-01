package com.google.android.material.appbar;

import K.X;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n0.AbstractC0303a;
import p0.AbstractC0310a;
import q1.l;
import x.AbstractC0361a;
import x.C0364d;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC0310a {

    /* renamed from: b, reason: collision with root package name */
    public final int f1733b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // x.AbstractC0361a
    public final void b(View view) {
    }

    @Override // x.AbstractC0361a
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC0361a abstractC0361a = ((C0364d) view2.getLayoutParams()).f4590a;
        if (abstractC0361a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) abstractC0361a).getClass();
            int i = this.f1733b;
            int h = bottom - (i == 0 ? 0 : l.h((int) (0.0f * i), 0, i));
            WeakHashMap weakHashMap = X.f418a;
            view.offsetTopAndBottom(h);
        }
        return false;
    }

    @Override // x.AbstractC0361a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // x.AbstractC0361a
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // p0.AbstractC0310a
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0303a.f3648u);
        this.f1733b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
