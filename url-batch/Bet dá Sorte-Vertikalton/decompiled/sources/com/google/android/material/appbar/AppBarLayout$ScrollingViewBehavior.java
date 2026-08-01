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
import s0.AbstractC0283a;
import u0.AbstractC0305a;
import u1.d;
import x.AbstractC0319a;
import x.C0322d;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC0305a {

    /* renamed from: b, reason: collision with root package name */
    public final int f1650b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // x.AbstractC0319a
    public final void b(View view) {
    }

    @Override // x.AbstractC0319a
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC0319a abstractC0319a = ((C0322d) view2.getLayoutParams()).f4184a;
        if (abstractC0319a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) abstractC0319a).getClass();
            int i = this.f1650b;
            int j2 = bottom - (i == 0 ? 0 : d.j((int) (0.0f * i), 0, i));
            WeakHashMap weakHashMap = S.f351a;
            view.offsetTopAndBottom(j2);
        }
        return false;
    }

    @Override // x.AbstractC0319a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // x.AbstractC0319a
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // u0.AbstractC0305a
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0283a.f3760u);
        this.f1650b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
