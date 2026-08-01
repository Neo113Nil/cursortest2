package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import t0.AbstractC0383a;
import z.AbstractC0427a;
import z.C0430d;

/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends AbstractC0427a {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // z.AbstractC0427a
    public final boolean e(View view) {
        throw new ClassCastException();
    }

    @Override // z.AbstractC0427a
    public final void g(C0430d c0430d) {
        if (c0430d.f4774h == 0) {
            c0430d.f4774h = 80;
        }
    }

    @Override // z.AbstractC0427a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // z.AbstractC0427a
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0383a.f4152g);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
}
