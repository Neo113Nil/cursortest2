package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import g2.e;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b, reason: collision with root package name */
    public AnimatorSet f1273b;

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public void r(View view, View view2, boolean z4, boolean z5) {
        AnimatorSet animatorSet = this.f1273b;
        boolean z6 = animatorSet != null;
        if (z6) {
            animatorSet.cancel();
        }
        AnimatorSet s3 = s(view, view2, z4, z6);
        this.f1273b = s3;
        s3.addListener(new e(7, this));
        this.f1273b.start();
        if (z5) {
            return;
        }
        this.f1273b.end();
    }

    public abstract AnimatorSet s(View view, View view2, boolean z4, boolean z5);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
