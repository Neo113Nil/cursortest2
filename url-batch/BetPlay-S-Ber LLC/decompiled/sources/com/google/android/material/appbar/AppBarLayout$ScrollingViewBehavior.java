package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.e90;
import defpackage.l70;
import defpackage.ly;
import defpackage.s90;
import defpackage.ud;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends s90 {
    public final int b;

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ly.E);
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public static void b(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // defpackage.s90
    public final void a(CoordinatorLayout coordinatorLayout, View view, int i) {
        b(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i);
    }

    @Override // defpackage.rd
    public final boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    @Override // defpackage.rd
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (((ud) view2.getLayoutParams()).a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            int i = this.b;
            int i2 = bottom - (i == 0 ? 0 : l70.i((int) (0.0f * i), 0, i));
            WeakHashMap weakHashMap = e90.a;
            view.offsetTopAndBottom(i2);
        }
        return false;
    }

    @Override // defpackage.rd
    public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        int i5 = view.getLayoutParams().height;
        if (i5 != -1 && i5 != -2) {
            return false;
        }
        b(coordinatorLayout.j(view));
        return false;
    }

    @Override // defpackage.rd
    public final boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        b(coordinatorLayout.j(view));
        return false;
    }

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    @Override // defpackage.rd
    public final void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }
}
