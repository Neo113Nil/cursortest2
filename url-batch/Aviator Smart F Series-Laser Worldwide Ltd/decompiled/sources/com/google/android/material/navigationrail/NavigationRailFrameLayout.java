package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class NavigationRailFrameLayout extends FrameLayout {
    int paddingTop;
    boolean scrollingEnabled;

    public NavigationRailFrameLayout(@NonNull Context context) {
        super(context);
        this.paddingTop = 0;
        this.scrollingEnabled = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        super.onLayout(z7, i8, i9, i10, i11);
        int childCount = getChildCount();
        int i12 = this.paddingTop;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int max = Math.max(i12, childAt.getTop()) + layoutParams.topMargin;
            childAt.layout(childAt.getLeft(), max, childAt.getRight(), childAt.getMeasuredHeight() + max);
            i12 = max + childAt.getMeasuredHeight() + layoutParams.bottomMargin;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        int childCount = getChildCount();
        int i10 = 0;
        View childAt = getChildAt(0);
        int size = View.MeasureSpec.getSize(i9);
        if (childCount > 1) {
            View childAt2 = getChildAt(0);
            measureChild(childAt2, i8, i9);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
            i10 = layoutParams.topMargin + childAt2.getMeasuredHeight() + layoutParams.bottomMargin;
            int i11 = (size - i10) - this.paddingTop;
            childAt = getChildAt(1);
            if (!this.scrollingEnabled) {
                i9 = View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
            }
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        measureChild(childAt, i8, i9);
        setMeasuredDimension(getMeasuredWidth(), Math.max(size, this.paddingTop + i10 + childAt.getMeasuredHeight() + layoutParams2.bottomMargin + layoutParams2.topMargin));
    }

    public void setPaddingTop(int i8) {
        this.paddingTop = i8;
    }

    public void setScrollingEnabled(boolean z7) {
        this.scrollingEnabled = z7;
    }
}
