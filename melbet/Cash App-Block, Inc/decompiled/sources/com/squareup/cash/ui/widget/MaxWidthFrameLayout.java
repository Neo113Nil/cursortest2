package com.squareup.cash.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.squareup.cash.common.ui.R$styleable;

/* loaded from: classes4.dex */
public class MaxWidthFrameLayout extends FrameLayout {
    public final int maxWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxWidthFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MaxWidthLinearLayout);
        obtainStyledAttributes.getClass();
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.maxWidth = dimensionPixelSize;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.maxWidth;
        if (1 <= i3 && i3 < size) {
            i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
