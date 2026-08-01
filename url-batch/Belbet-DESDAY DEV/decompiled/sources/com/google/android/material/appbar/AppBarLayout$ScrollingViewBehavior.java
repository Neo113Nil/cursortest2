package com.google.android.material.appbar;

import K.T;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n0.AbstractC0278a;
import p0.AbstractC0283a;
import q1.l;
import x.AbstractC0335a;
import x.C0338d;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC0283a {

    /* renamed from: b, reason: collision with root package name */
    public final int f1522b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // x.AbstractC0335a
    public final void b(View view) {
    }

    @Override // x.AbstractC0335a
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC0335a abstractC0335a = ((C0338d) view2.getLayoutParams()).f4175a;
        if (abstractC0335a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) abstractC0335a).getClass();
            int i = this.f1522b;
            int l2 = bottom - (i == 0 ? 0 : l.l((int) (0.0f * i), 0, i));
            WeakHashMap weakHashMap = T.f381a;
            view.offsetTopAndBottom(l2);
        }
        return false;
    }

    @Override // x.AbstractC0335a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // x.AbstractC0335a
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // p0.AbstractC0283a
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0278a.f3300u);
        this.f1522b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
