package com.google.android.material.transformation;

import K.S;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import x.AbstractC0378b;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends AbstractC0378b {
    public ExpandableBehavior() {
    }

    @Override // x.AbstractC0378b
    public abstract void b(View view);

    @Override // x.AbstractC0378b
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // x.AbstractC0378b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = S.f365a;
        if (!view.isLaidOut()) {
            ArrayList j2 = coordinatorLayout.j(view);
            int size = j2.size();
            for (int i2 = 0; i2 < size; i2++) {
                b(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
