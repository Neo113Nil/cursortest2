package com.google.android.material.appbar;

import K.T;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p0.AbstractC0282a;
import r0.AbstractC0293a;
import w1.l;
import x.AbstractC0313a;
import x.d;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC0293a {

    /* renamed from: b, reason: collision with root package name */
    public final int f1646b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // x.AbstractC0313a
    public final void b(View view) {
    }

    @Override // x.AbstractC0313a
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC0313a abstractC0313a = ((d) view2.getLayoutParams()).f4193a;
        if (abstractC0313a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) abstractC0313a).getClass();
            int i = this.f1646b;
            int j2 = bottom - (i == 0 ? 0 : l.j((int) (RecyclerView.f1530C0 * i), 0, i));
            WeakHashMap weakHashMap = T.f423a;
            view.offsetTopAndBottom(j2);
        }
        return false;
    }

    @Override // x.AbstractC0313a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // x.AbstractC0313a
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // r0.AbstractC0293a
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0282a.f3447u);
        this.f1646b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
