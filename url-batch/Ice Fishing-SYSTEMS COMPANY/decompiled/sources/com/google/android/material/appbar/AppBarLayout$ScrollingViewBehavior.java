package com.google.android.material.appbar;

import B.b;
import B.e;
import O.X;
import U2.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import i3.AbstractC4576a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k3.AbstractC4645a;

/* loaded from: classes2.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC4645a {

    /* renamed from: b, reason: collision with root package name */
    public final int f35971b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // B.b
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        b bVar = ((e) view2.getLayoutParams()).f43a;
        if (bVar instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) bVar).getClass();
            int i = this.f35971b;
            int b9 = bottom - (i == 0 ? 0 : a.b((int) (0.0f * i), 0, i));
            WeakHashMap weakHashMap = X.f2240a;
            view.offsetTopAndBottom(b9);
        }
        return false;
    }

    @Override // B.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i9) {
        int i10 = view.getLayoutParams().height;
        if (i10 != -1 && i10 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // B.b
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // k3.AbstractC4645a
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(i, view);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4576a.f38311u);
        this.f35971b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // B.b
    public final void b(View view) {
    }
}
