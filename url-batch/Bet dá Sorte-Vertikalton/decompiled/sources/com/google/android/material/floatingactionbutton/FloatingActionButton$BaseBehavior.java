package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import s0.AbstractC0283a;
import x.AbstractC0319a;
import x.C0322d;

/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends AbstractC0319a {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // x.AbstractC0319a
    public final boolean a(View view) {
        throw new ClassCastException();
    }

    @Override // x.AbstractC0319a
    public final void c(C0322d c0322d) {
        if (c0322d.h == 0) {
            c0322d.h = 80;
        }
    }

    @Override // x.AbstractC0319a
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // x.AbstractC0319a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0283a.f3748g);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
}
