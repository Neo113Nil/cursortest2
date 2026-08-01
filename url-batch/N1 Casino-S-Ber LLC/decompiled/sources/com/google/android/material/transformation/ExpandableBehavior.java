package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.nd;
import defpackage.qi;
import defpackage.ri;
import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends nd {
    public int a = 0;

    public ExpandableBehavior() {
    }

    @Override // defpackage.nd
    public abstract boolean f(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nd
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object obj = (ri) view2;
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
    @Override // defpackage.nd
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        ri riVar;
        if (!view.isLaidOut()) {
            ArrayList k = coordinatorLayout.k(view);
            int size = k.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    riVar = null;
                    break;
                }
                View view2 = (View) k.get(i2);
                if (f(view, view2)) {
                    riVar = (ri) view2;
                    break;
                }
                i2++;
            }
            if (riVar != null) {
                boolean z = ((FloatingActionButton) riVar).t.a;
                int i3 = this.a;
                if (!z ? i3 == 1 : !(i3 != 0 && i3 != 2)) {
                    int i4 = z ? 1 : 2;
                    this.a = i4;
                    view.getViewTreeObserver().addOnPreDrawListener(new qi(this, view, i4, riVar));
                }
            }
        }
        return false;
    }

    public abstract void w(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
