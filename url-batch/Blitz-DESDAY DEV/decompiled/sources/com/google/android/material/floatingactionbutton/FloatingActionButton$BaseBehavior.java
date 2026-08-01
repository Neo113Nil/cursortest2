package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import q0.AbstractC0257a;
import z.AbstractC0318a;
import z.C0321d;

/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends AbstractC0318a {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // z.AbstractC0318a
    public final boolean a(View view) {
        throw new ClassCastException();
    }

    @Override // z.AbstractC0318a
    public final void c(C0321d c0321d) {
        if (c0321d.h == 0) {
            c0321d.h = 80;
        }
    }

    @Override // z.AbstractC0318a
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // z.AbstractC0318a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0257a.h);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
}
