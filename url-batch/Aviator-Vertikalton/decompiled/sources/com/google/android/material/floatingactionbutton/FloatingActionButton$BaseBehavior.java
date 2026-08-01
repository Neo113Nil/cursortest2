package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import n0.AbstractC0303a;
import x.AbstractC0361a;
import x.C0364d;

/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends AbstractC0361a {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // x.AbstractC0361a
    public final boolean a(View view) {
        throw new ClassCastException();
    }

    @Override // x.AbstractC0361a
    public final void c(C0364d c0364d) {
        if (c0364d.h == 0) {
            c0364d.h = 80;
        }
    }

    @Override // x.AbstractC0361a
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // x.AbstractC0361a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0303a.f3636g);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
}
