package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class BaselineLayout extends ViewGroup {

    /* renamed from: f, reason: collision with root package name */
    public int f1362f;
    public boolean g;

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1362f = -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.f1362f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i6 - i4) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i9 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
                int baseline = (this.f1362f == -1 || childAt.getBaseline() == -1) ? paddingTop : (this.f1362f + paddingTop) - childAt.getBaseline();
                childAt.layout(i9, baseline, measuredWidth + i9, measuredHeight + baseline);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i4, i5);
                i6 = Math.max(i6, childAt.getMeasuredHeight());
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    i10 = Math.max(i10, baseline);
                    i11 = Math.max(i11, childAt.getMeasuredHeight() - baseline);
                }
                i8 = Math.max(i8, childAt.getMeasuredWidth());
                i7 = Math.max(i7, childAt.getMeasuredHeight());
                i9 = View.combineMeasuredStates(i9, childAt.getMeasuredState());
            }
        }
        if (i10 != -1) {
            if (this.g) {
                i7 = Math.max(i7, Math.max(i11, getPaddingBottom()) + i10);
            }
            this.f1362f = i10;
        }
        if (!this.g) {
            i7 = getPaddingBottom() + i6;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i8, getSuggestedMinimumWidth()), i4, i9), View.resolveSizeAndState(Math.max(i7, getSuggestedMinimumHeight()), i5, i9 << 16));
    }

    public void setMeasurePaddingFromBaseline(boolean z3) {
        this.g = z3;
    }
}
