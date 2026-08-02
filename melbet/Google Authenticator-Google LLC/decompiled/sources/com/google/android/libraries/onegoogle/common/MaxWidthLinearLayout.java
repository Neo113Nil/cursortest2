package com.google.android.libraries.onegoogle.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.ecz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MaxWidthLinearLayout extends LinearLayout {
    private int a;

    public MaxWidthLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ecz.a);
        this.a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.a;
        if (i3 > 0 && i3 < size) {
            i = View.MeasureSpec.makeMeasureSpec(this.a, View.MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
    }

    public MaxWidthLinearLayout(Context context) {
        this(context, null);
    }
}
