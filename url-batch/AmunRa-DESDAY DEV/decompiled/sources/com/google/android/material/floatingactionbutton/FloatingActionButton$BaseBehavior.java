package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import o0.AbstractC0275a;
import x.AbstractC0328a;
import x.C0331d;

/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends AbstractC0328a {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // x.AbstractC0328a
    public final boolean a(View view) {
        throw new ClassCastException();
    }

    @Override // x.AbstractC0328a
    public final void c(C0331d c0331d) {
        if (c0331d.h == 0) {
            c0331d.h = 80;
        }
    }

    @Override // x.AbstractC0328a
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // x.AbstractC0328a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0275a.f3344g);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
}
