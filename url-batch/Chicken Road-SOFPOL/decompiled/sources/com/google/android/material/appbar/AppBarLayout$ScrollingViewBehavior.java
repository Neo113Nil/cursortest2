package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import d3.d;
import h5.a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import q3.k0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends a {

    /* renamed from: b, reason: collision with root package name */
    public final int f1810b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // d3.a
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (((d) view2.getLayoutParams()).f2226a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            int i = this.f1810b;
            int p7 = bottom - (i == 0 ? 0 : h0.a.p((int) (0.0f * i), 0, i));
            Field field = k0.f6120a;
            view.offsetTopAndBottom(p7);
        }
        return false;
    }

    @Override // d3.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i8, int i9) {
        int i10 = view.getLayoutParams().height;
        if (i10 != -1 && i10 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // d3.a
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // h5.a
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5.a.f2752r);
        this.f1810b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // d3.a
    public final void b(View view) {
    }
}
