package com.google.android.material.transformation;

import a0.f;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.emoji2.text.q;
import com.gdmhkmf.belbet.R;
import java.util.HashMap;
import r1.e;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
@Deprecated
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    public HashMap i;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public final void r(View view, View view2, boolean z4, boolean z5) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z4) {
                this.i = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z6 = (childAt.getLayoutParams() instanceof f) && (((f) childAt.getLayoutParams()).f81a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z6) {
                    if (z4) {
                        this.i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        childAt.setImportantForAccessibility(4);
                    } else {
                        HashMap hashMap = this.i;
                        if (hashMap != null && hashMap.containsKey(childAt)) {
                            childAt.setImportantForAccessibility(((Integer) this.i.get(childAt)).intValue());
                        }
                    }
                }
            }
            if (!z4) {
                this.i = null;
            }
        }
        super.r(view, view2, z4, z5);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public final q y(Context context, boolean z4) {
        int i = z4 ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        q qVar = new q(20, false);
        qVar.f466g = e.b(context, i);
        qVar.h = new o2.f(25);
        return qVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
