package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.oe;
import defpackage.re;
import defpackage.y00;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends oe {
    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y00.k);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    @Override // defpackage.oe
    public final boolean e(View view) {
        throw new ClassCastException();
    }

    @Override // defpackage.oe
    public final void g(re reVar) {
        if (reVar.h == 0) {
            reVar.h = 80;
        }
    }

    @Override // defpackage.oe
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // defpackage.oe
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior() {
    }
}
