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
import o0.AbstractC0278a;
import q0.AbstractC0290a;
import u1.d;
import x.AbstractC0332a;
import x.C0335d;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC0290a {

    /* renamed from: b, reason: collision with root package name */
    public final int f1584b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // x.AbstractC0332a
    public final void b(View view) {
    }

    @Override // x.AbstractC0332a
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC0332a abstractC0332a = ((C0335d) view2.getLayoutParams()).f4154a;
        if (abstractC0332a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) abstractC0332a).getClass();
            int i = this.f1584b;
            int m2 = bottom - (i == 0 ? 0 : d.m((int) (0.0f * i), 0, i));
            WeakHashMap weakHashMap = S.f369a;
            view.offsetTopAndBottom(m2);
        }
        return false;
    }

    @Override // x.AbstractC0332a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // x.AbstractC0332a
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // q0.AbstractC0290a
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0278a.f3351u);
        this.f1584b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
