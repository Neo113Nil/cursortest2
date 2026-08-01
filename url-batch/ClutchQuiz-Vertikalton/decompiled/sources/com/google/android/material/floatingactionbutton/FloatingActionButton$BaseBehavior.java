package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import u0.AbstractC0361a;
import x.AbstractC0378b;
import x.C0381e;

/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends AbstractC0378b {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // x.AbstractC0378b
    public final boolean a(View view) {
        throw new ClassCastException();
    }

    @Override // x.AbstractC0378b
    public final void c(C0381e c0381e) {
        if (c0381e.h == 0) {
            c0381e.h = 80;
        }
    }

    @Override // x.AbstractC0378b
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // x.AbstractC0378b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0361a.f3733g);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
}
