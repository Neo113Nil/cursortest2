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
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T> extends AbstractC0335a {
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }

    @Override // x.AbstractC0335a
    public final /* synthetic */ boolean a(View view) {
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

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0278a.f3282f);
        obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }
}
