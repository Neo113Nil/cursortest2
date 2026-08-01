package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.ji;
import defpackage.ki;
import defpackage.rd;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends rd {
    public int a = 0;

    public ExpandableBehavior() {
    }

    public abstract void a(View view, View view2, boolean z, boolean z2);

    @Override // defpackage.rd
    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rd
    public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object obj = (ki) view2;
        boolean z = ((FloatingActionButton) obj).t.a;
        int i = this.a;
        if (z) {
            if (i != 0 && i != 2) {
                return false;
            }
        } else if (i != 1) {
            return false;
        }
        boolean z2 = ((FloatingActionButton) obj).t.a;
        this.a = z2 ? 1 : 2;
        a((View) obj, view, z2, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rd
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        ki kiVar;
        if (!view.isLaidOut()) {
            ArrayList j = coordinatorLayout.j(view);
            int size = j.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    kiVar = null;
                    break;
                }
                View view2 = (View) j.get(i2);
                if (layoutDependsOn(coordinatorLayout, view, view2)) {
                    kiVar = (ki) view2;
                    break;
                }
                i2++;
            }
            if (kiVar != null) {
                boolean z = ((FloatingActionButton) kiVar).t.a;
                int i3 = this.a;
                if (!z ? i3 == 1 : !(i3 != 0 && i3 != 2)) {
                    int i4 = z ? 1 : 2;
                    this.a = i4;
                    view.getViewTreeObserver().addOnPreDrawListener(new ji(this, view, i4, kiVar));
                }
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
