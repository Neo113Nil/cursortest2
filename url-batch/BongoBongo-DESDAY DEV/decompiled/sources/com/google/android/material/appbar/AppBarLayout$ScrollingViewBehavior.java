package com.google.android.material.appbar;

import L.T;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q0.AbstractC0285a;
import s0.AbstractC0296a;
import y.AbstractC0317a;
import y.d;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC0296a {

    /* renamed from: b, reason: collision with root package name */
    public final int f1740b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // y.AbstractC0317a
    public final void b(View view) {
    }

    @Override // y.AbstractC0317a
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC0317a abstractC0317a = ((d) view2.getLayoutParams()).f4299a;
        if (abstractC0317a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) abstractC0317a).getClass();
            int i = this.f1740b;
            int n2 = bottom - (i == 0 ? 0 : A1.d.n((int) (RecyclerView.A0 * i), 0, i));
            WeakHashMap weakHashMap = T.f490a;
            view.offsetTopAndBottom(n2);
        }
        return false;
    }

    @Override // y.AbstractC0317a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // y.AbstractC0317a
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // s0.AbstractC0296a
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0285a.f3518u);
        this.f1740b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
