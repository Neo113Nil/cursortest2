package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import o0.AbstractC0277a;
import x.AbstractC0334a;
import x.C0337d;

/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends AbstractC0334a {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // x.AbstractC0334a
    public final boolean a(View view) {
        throw new ClassCastException();
    }

    @Override // x.AbstractC0334a
    public final void c(C0337d c0337d) {
        if (c0337d.h == 0) {
            c0337d.h = 80;
        }
    }

    @Override // x.AbstractC0334a
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // x.AbstractC0334a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0277a.f3245g);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
}
