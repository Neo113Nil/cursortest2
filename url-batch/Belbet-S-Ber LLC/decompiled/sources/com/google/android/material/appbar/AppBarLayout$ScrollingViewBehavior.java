package com.google.android.material.appbar;

import a0.f;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b4.l;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n0.p0;
import s1.a;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends a {

    /* renamed from: b, reason: collision with root package name */
    public final int f901b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // a0.c
    public final boolean b(View view, View view2) {
        return false;
    }

    @Override // a0.c
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (((f) view2.getLayoutParams()).f81a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            int i = this.f901b;
            int i4 = bottom - (i == 0 ? 0 : l.i((int) (0.0f * i), 0, i));
            WeakHashMap weakHashMap = p0.f2816a;
            view.offsetTopAndBottom(i4);
        }
        return false;
    }

    @Override // a0.c
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i5) {
        int i6 = view.getLayoutParams().height;
        if (i6 != -1 && i6 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // a0.c
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // s1.a
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q1.a.E);
        this.f901b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
