package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import n0.AbstractC0278a;
import x.AbstractC0335a;
import x.C0338d;

/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends AbstractC0335a {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // x.AbstractC0335a
    public final boolean a(View view) {
        throw new ClassCastException();
    }

    @Override // x.AbstractC0335a
    public final void c(C0338d c0338d) {
        if (c0338d.h == 0) {
            c0338d.h = 80;
        }
    }

    @Override // x.AbstractC0335a
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // x.AbstractC0335a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0278a.f3287g);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
}
