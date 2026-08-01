package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: assets/audience_network.dex */
public final class P6 {
    public final int[] A00(View view, int i, int i2) {
        C02344d c02344d = (C02344d) view.getLayoutParams();
        int childHeightSpec = ViewGroup.getChildMeasureSpec(i, view.getPaddingLeft() + view.getPaddingRight(), c02344d.width);
        int childWidthSpec = view.getPaddingTop();
        view.measure(childHeightSpec, ViewGroup.getChildMeasureSpec(i2, childWidthSpec + view.getPaddingBottom(), c02344d.height));
        int childWidthSpec2 = view.getMeasuredWidth();
        int childWidthSpec3 = view.getMeasuredHeight();
        return new int[]{childWidthSpec2 + c02344d.leftMargin + c02344d.rightMargin, childWidthSpec3 + c02344d.bottomMargin + c02344d.topMargin};
    }
}
