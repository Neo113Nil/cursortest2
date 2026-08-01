package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.g9;
import defpackage.re;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public FabTransformationBehavior() {
        new Rect();
        new RectF();
        new RectF();
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, defpackage.oe
    public final boolean f(View view, View view2) {
        if (view.getVisibility() != 8) {
            return false;
        }
        g9.s("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        return false;
    }

    @Override // defpackage.oe
    public final void g(re reVar) {
        if (reVar.h == 0) {
            reVar.h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new RectF();
        new RectF();
    }
}
