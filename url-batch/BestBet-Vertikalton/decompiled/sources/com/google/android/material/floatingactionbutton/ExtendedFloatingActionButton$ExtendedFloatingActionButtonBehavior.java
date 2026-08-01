package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import x.AbstractC0392a;
import x.d;
import x0.AbstractC0393a;

/* loaded from: classes.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T> extends AbstractC0392a {
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }

    @Override // x.AbstractC0392a
    public final /* synthetic */ boolean a(View view) {
        throw new ClassCastException();
    }

    @Override // x.AbstractC0392a
    public final void c(d dVar) {
        if (dVar.h == 0) {
            dVar.h = 80;
        }
    }

    @Override // x.AbstractC0392a
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // x.AbstractC0392a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0393a.f4547f);
        obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }
}
