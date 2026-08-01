package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.oe;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends oe {
    public ExpandableBehavior() {
    }

    @Override // defpackage.oe
    public abstract boolean f(View view, View view2);

    @Override // defpackage.oe
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.oe
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (!view.isLaidOut()) {
            ArrayList j = coordinatorLayout.j(view);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                f(view, (View) j.get(i2));
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
