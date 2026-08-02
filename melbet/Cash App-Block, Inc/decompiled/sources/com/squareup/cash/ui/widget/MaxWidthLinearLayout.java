package com.squareup.cash.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.squareup.cash.common.ui.R$styleable;

/* loaded from: classes7.dex */
public class MaxWidthLinearLayout extends LinearLayout {
    public int maxWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxWidthLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MaxWidthLinearLayout);
        obtainStyledAttributes.getClass();
        this.maxWidth = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.maxWidth;
        if (1 > i3 || i3 >= size) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
    }

    public final void setMaxWidth$ui(int i) {
        this.maxWidth = i;
    }
}
