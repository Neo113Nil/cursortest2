package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import o0.AbstractC0278a;
import x.AbstractC0332a;
import x.C0335d;

/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends AbstractC0332a {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // x.AbstractC0332a
    public final boolean a(View view) {
        throw new ClassCastException();
    }

    @Override // x.AbstractC0332a
    public final void c(C0335d c0335d) {
        if (c0335d.h == 0) {
            c0335d.h = 80;
        }
    }

    @Override // x.AbstractC0332a
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // x.AbstractC0332a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0278a.f3339g);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
}
