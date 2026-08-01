package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.hg;
import defpackage.xn;
import defpackage.yn;
import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends hg {
    public int a = 0;

    public ExpandableBehavior() {
    }

    @Override // defpackage.hg
    public abstract boolean f(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hg
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object obj = (yn) view2;
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
        w((View) obj, view, z2, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hg
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        yn ynVar;
        if (!view.isLaidOut()) {
            ArrayList k = coordinatorLayout.k(view);
            int size = k.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    ynVar = null;
                    break;
                }
                View view2 = (View) k.get(i2);
                if (f(view, view2)) {
                    ynVar = (yn) view2;
                    break;
                }
                i2++;
            }
            if (ynVar != null) {
                boolean z = ((FloatingActionButton) ynVar).t.a;
                int i3 = this.a;
                if (!z ? i3 == 1 : !(i3 != 0 && i3 != 2)) {
                    int i4 = z ? 1 : 2;
                    this.a = i4;
                    view.getViewTreeObserver().addOnPreDrawListener(new xn(this, view, i4, ynVar));
                }
            }
        }
        return false;
    }

    public abstract void w(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
